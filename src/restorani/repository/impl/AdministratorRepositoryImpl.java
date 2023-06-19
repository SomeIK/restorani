package restorani.repository.impl;

import java.util.List;
import restorani.database.DataBase;
import restorani.domain.Administrator;
import restorani.repository.AdministratroRepository;
import java.sql.*;

/**
 *
 * @author something
 */
public class AdministratorRepositoryImpl implements AdministratroRepository {

    private final DataBase db = DataBase.getInstance();

    @Override
    public void add(Administrator administrator) throws Exception {

        try {
            String query = "INSERT INTO administrator (Mail,Sifra) VALUES( ?,?);";
            PreparedStatement ps = db.getConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, administrator.getMail());
            ps.setString(2, administrator.getPassword());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                administrator.setId(rs.getLong(1));
            }
            rs.close();
            ps.close();
            db.confirmTransaction();
        } catch (SQLException e) {
            e.printStackTrace();
            db.cancelTransakction();
            throw new Exception("Doslo je do greske prilikom dodavanja administratora!!!\n" + e.getMessage());
        }

    }

    @Override
    public void update(Administrator administrator) throws Exception {
//        try{
//            String query= " UPDATE administrator "
//        }
    }

    @Override
    public void delete(Administrator administrator) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Administrator> findByQuery(String query) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Administrator> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Administrator findById(Long Id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
