package by.it.vshelukhin.jd03_03.connection;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnect implements MySet {


    static Connection connection;

    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()){
            synchronized (MyConnect.class){
                if (connection == null || connection.isClosed()){
                    connection = DriverManager.getConnection(URL_DB,USER_DB, PASSWORD_DB);
                }
            }
        }
        return connection;
    }
}
