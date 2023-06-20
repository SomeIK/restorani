package restorani.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author something
 */
public class DBUtil {

    private static final DBUtil instance = new DBUtil();
    private Properties properties;

    private DBUtil() {

        try {
            properties = new Properties();
            properties.load(new FileInputStream("db.properties"));

        } catch (IOException ioe) {
            ioe.printStackTrace();

        }
    }

    public static DBUtil getInstance() {
        return instance;

    }

    public String getUrl() {
        String curentDB = properties.getProperty("curentDB");
        return properties.getProperty(curentDB + "url");
    }

    public String getUser() {
        String curentDB = properties.getProperty("curentDB");
        return properties.getProperty(curentDB + "user");
    }

    public String getPassword() {
        String curentDB = properties.getProperty("curentDB");
        return properties.getProperty(curentDB + "password");
    }
}
