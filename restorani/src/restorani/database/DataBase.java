package restorani.database;

import java.sql.*;
import restorani.util.DBUtil;

/**
 *
 * @author something
 */
public class DataBase {

    private static final DataBase instance = new DataBase();
    private Connection connection;

    public DataBase() {
    }

    public static DataBase getInstance() {
        return instance;
    }

    public void connectDataBase() throws Exception {
        String url = DBUtil.getInstance().getUrl();
        String user = DBUtil.getInstance().getUser();
        String password = DBUtil.getInstance().getPassword();
        try {
            connection = DriverManager.getConnection(url, user, password);
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new Exception("Dogodila se gresk prilikom konekcije na bazu!!!");
        }

    }

    public void disconnectBase() throws Exception {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new Exception("Dogodila se greska prilikom raskida konekcije!!!\n" + e.getMessage());
        }

    }
    public void confirmTransaction()throws  Exception{
        try{
            connection.commit();
        }catch(SQLException e){
            e.printStackTrace();
            throw  new Exception("Dogodila se greska prilikom potvrdjivanja transakcije!!!\n"+ e.getMessage());
        }
        
    }
    
    public void cancelTransakction() throws Exception{
        try{
            connection.rollback();
            
        }catch(Exception e){
            e.printStackTrace();
            throw new Exception("DOgodila se greska prilikom ponistavanja transakcije!!!\n" + e.getMessage());
            
        }
    }
    public Connection getConnection() {
        return connection;
    }

}
