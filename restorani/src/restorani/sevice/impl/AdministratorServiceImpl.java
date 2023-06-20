package restorani.sevice.impl;

import java.util.List;
import restorani.domain.Administrator;
import restorani.repository.AdministratorRepository;
import restorani.repository.impl.AdministratorRepositoryImpl;
import restorani.sevice.AdministratorService;

/**
 *
 * @author something
 */
public class AdministratorServiceImpl implements AdministratorService{
    
  private final AdministratorRepository administratorRepository;

    public AdministratorServiceImpl() {
        this.administratorRepository = new AdministratorRepositoryImpl();
    }

  @Override
    public void add(Administrator administrator) throws Exception {
        administratorRepository.add(administrator);
    }

  @Override
    public void update(Administrator administrator) throws Exception {
        administratorRepository.update(administrator);
    }

  @Override
    public void delete(Administrator administrator) throws Exception {
        administratorRepository.delete(administrator);
    }

  @Override
    public List<Administrator> getAll() throws Exception {
        return administratorRepository.getAll();
    }

  @Override
    public Administrator findById(Long id) throws Exception {
        return administratorRepository.findById(id);
    }
    
    public Administrator login(String mail,String password) throws Exception{
        String query="SELECT id,email,sifra FROM administrator  WHERE email='" + mail +"';";
        List <Administrator> administrators=administratorRepository.findByQuery(query);
        if(administrators.isEmpty()){
            throw  new Exception("Administrator sa datim mailom ne postoji u sistemu!!!");
        }
        administrators.clear();
         query="SELECT id,email,sifra FROM administrator  WHERE email='" 
                 + mail +"' AND sifra = '" + password + "';";
         administrators= administratorRepository.findByQuery(query);
         if(administrators.isEmpty()){
             throw  new Exception("Uneli ste pogresnu lozinku!!!\n ");             
         }
         Administrator administrator= administrators.get(0);
        
        return administrator;
    }

    @Override
    public List<Administrator> findByQuery(String query) throws Exception {
         return administratorRepository.findByQuery(query);
    }
  
    
}
