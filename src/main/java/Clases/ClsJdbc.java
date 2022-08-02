package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Pedro Padilla Rabace
 */
public class ClsJdbc {
    
    String driver = "com.mysql.cj.jdbc.Driver";
    String usuario = "root";
    String contraseña = "";
    String bd = "bd_elecciones_g10";
    String url = "jdbc:mysql://localhost:3306/" + this.bd;
    
    public Connection  conexion;
    
    public void CrearConexion(){
        
        try {
            
            Class.forName(driver);
            this.conexion = DriverManager.getConnection(url, usuario, contraseña);
            
            if(this.conexion != null){
                System.out.println("Conexion Exitosa");
            }
            
        } catch (Exception error) {
            
            System.out.println("Uy Ocurrio un Error: "+ error.getMessage());             
        }
        
        
        
    }
    
}
