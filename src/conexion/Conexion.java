/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author GerardoG
 */


/*°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°
    Clase para conectarse con la base de datos (SQL Developer) 
    y con una interfaz en Java NetBeans.
°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°*/

public class Conexion {

    public static void main(String[] args) {
     
        /* Llamar al método (Close) para cerrar la base de datos */
        close(getConnection());
        
    }
    
    
    /*°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°
            Método para ingresar a la base de datos
                Usuario: AlquilerAutos
                Clave: 1234
    °°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°*/
    public static Connection getConnection() {
        try {
        	Class.forName("oracle.jdbc.driver.OracleDriver");  
        	Connection con = DriverManager.getConnection(  
                    "jdbc:oracle:thin:@localhost:1521:orcl", "AlquilerAutos","1234");  
        	System.out.println("Conectado");
            return con;
           
        } catch (Exception ex) {
            System.out.println("Database.getConnection() Error -->" + ex.getMessage());
            return null;
        }
    }
 
    /*°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°
        Método que se usa para cerrar la base datos para prevenir 
        el colapso de información. 
    °°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°*/
    public static void close(Connection con) {
        try {
            con.close();
            System.out.println("Cerrado");
        } catch (Exception ex) {
        }
    }
    
}
