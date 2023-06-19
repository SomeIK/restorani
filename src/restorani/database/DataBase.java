package restorani.database;

import java.sql.*;
import restorani.util.DBUtil;

/**
 *
 * @author something
 */
public class DataBase {
    
    private static final DataBase instance= new DataBase();
    private Connection connection; 

    public DataBase() {
    }

    private static DataBase getInstance(){
        return instance;
    }
    
    public void connectDataBase() throws  Exception{
        String  url=DBUtil.getInstance().getUrl();
        String user=DBUtil.getInstance().getUser();
        String password = DBUtil.getInstance().getPassword();
        try{
            connection=DriverManager.getConnection(url, user, password);
            connection.setAutoCommit(false);
        }catch(SQLException e){
            e.printStackTrace();
            throw  new Exception("Dogodila se gresk prilikom konekcije na bazu!!!");
        }
        
    }
            
    
    
}
