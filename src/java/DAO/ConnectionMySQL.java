package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionMySQL {

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://circularphonedb.csmv1hcyzwv4.eu-west-3.rds.amazonaws.com:3306/circularphone_db?useSSL=false", "admin", "circularphonepassword");
            //Connection conn = DriverManager.getConnection("jdbc:mysql://circularphone-distance.cxmngcvxg3nb.us-east-2.rds.amazonaws.com:3306/circularphone_db?useSSL=false", "admin", "Passw*rd");
            

            return conn;
        } catch (SQLException e) {
            e.printStackTrace();    
            return null;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionMySQL.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 

    }
}
