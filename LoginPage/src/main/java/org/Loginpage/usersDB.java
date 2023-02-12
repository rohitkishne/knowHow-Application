package org.Loginpage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class usersDB {
    static Connection connection = null;
    public static Connection getConnection(){
        if(connection != null)
        {
            return connection;
        }

        String db = "loginpage";
        String user = "root";
        String pwd = "Panthera123@";

        return getConnection(db,user,pwd);
    }
    private static Connection getConnection(String db, String user, String pwd)
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/"+db+"?user="+user+"&password="+pwd);
        }
        catch (ClassNotFoundException | SQLException exception)
        {
            exception.printStackTrace();
        }
        return connection;
    }
}
