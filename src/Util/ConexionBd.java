/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leidy
 */
public class ConexionBd {
    
    public  Connection conection;
    
    public ConexionBd(){
        conection = null;
    }
    
    public Connection crearConexion(){
        if ( conection != null){
            return conection;
        }else{
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                String username = "BASEDATOSPPI";
                String password = "4321";
                String url = "jdbc:oracle:thin:@localhost:1521:XE";
                conection = DriverManager.getConnection(url, username, password);
                System.out.println("Conectado");
            } catch (Exception e) {
                System.out.println("Desconectado");
                System.out.println(e.getMessage());
            }
            return conection;
        }
    }
    
    public void cerrarConexion(Connection conexion)    {
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
