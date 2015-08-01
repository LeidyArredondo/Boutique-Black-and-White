/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Utilidades.DepartamentosMunicipios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leidy
 */
public class Test {
    
    public static void main(String[] agrs){
                
        int conse= 0;
        DepartamentosMunicipios depar = new DepartamentosMunicipios();
        String[][] dep = depar.getDeparMuni();
        ConexionBd co = new ConexionBd();
        Connection cone = co.crearConexion();
       for (int i = 0; i < 33; i++) {
            try {
                PreparedStatement departa
                        = cone.prepareStatement("INSERT INTO DEPARTAMENTOS(ID_DEPARTAMENTO, NOMBRE, ID_PAIS) VALUES(?, ?, ?)");
                departa.setInt(1, i + 1);
                departa.setString(2, dep[i][0]);
                departa.setInt(3, 1);
                departa.executeUpdate();
                System.out.println("departamento " + dep[i][0] + " insertado");
            } catch (SQLException ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       co.cerrarConexion(cone);
        PreparedStatement departa;
        for (int i = 0; i < 33; i++) {
        co = new ConexionBd();
        Connection cone1 = co.crearConexion();
            for (int j = 1; j < 125; j++) {
                if (dep[i][j] == null) {
                    j = 127;
                } else {
                    conse = conse + 1;
                    try {
                        departa = cone1.prepareStatement("INSERT INTO MUNICIPIOS (ID_MUNICIPIO, NOMBRE, ID_DEPARTAMENTO) VALUES(?, ?, ?)");
                        departa.setInt(1, conse);
                        departa.setString(2, dep[i][j]);
                        departa.setInt(3, i+1);
                        departa.executeUpdate();
                        System.out.println("ciudad " + dep[i][j] + " insertado");
                    } catch (SQLException ex) {
                        Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            System.out.println("\n");
            System.out.println("\n");
            co.cerrarConexion(cone);
        
    }
    
   }
    
}
