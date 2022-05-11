package ConexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SqlConexion {

    String bd = "sistemainventario";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String password = "admin";
    String driver = "com.mysql.cj.jdbc.Driver";

    Connection conectar = null;

    public Connection conexion(){
        try {
            Class.forName(driver);
            conectar=(Connection) DriverManager.getConnection(url,user,password);
            System.out.println("conectado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion "+ e.getMessage());
        }
        
        return conectar;
    }
    
    


    
   
}
