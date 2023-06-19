package restorani.repository;

import java.util.List;
import restorani.domain.Administrator;

/**
 *
 * @author something
 */
public interface AdministratorRepository {

    void add(Administrator administrator) throws Exception;

    void update(Administrator administrator) throws Exception;

    void delete(Administrator administrator) throws Exception;

    List<Administrator> findByQuery(String query) throws Exception;

    List<Administrator> getAll() throws Exception;

    Administrator findById(Long Id) throws Exception;

}
