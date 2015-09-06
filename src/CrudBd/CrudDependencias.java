/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudBd;

import logica.MetodosDependencias;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Util.ConexionBd;

/**
 *
 * @author ivan
 */
public class CrudDependencias {

    public CrudDependencias() {
    }

    public boolean insertarDependencia(String tabla, String id, String nombre, MetodosDependencias dependencia) {
        boolean respuesta = false;
        try {
            ConexionBd conexion = new ConexionBd();
            Connection connection = conexion.crearConexion();
            PreparedStatement insertar = connection.prepareStatement("INSERT INTO " + tabla + " (" + id + ", " + nombre + ") "
                    + "VALUES (?, ?)");
            insertar.setInt(1, dependencia.getId());
            insertar.setString(2, dependencia.getNombre());
            insertar.executeQuery();
            respuesta = true;
            conexion.cerrarConexion(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CrudDependencias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    public boolean modificarDependencia(String tabla, String id, String nombre, MetodosDependencias dependencia) {
        boolean respuesta = false;
        try {
            ConexionBd conexion = new ConexionBd();
            Connection connection = conexion.crearConexion();
            PreparedStatement insertar = connection.prepareStatement("UPDATE " + tabla + " SET " + nombre + " = ? WHERE " + id + " = ? ");
            insertar.setString(1, dependencia.getNombre());
            insertar.setInt(2, dependencia.getId());
            insertar.executeQuery();
            respuesta = true;
            conexion.cerrarConexion(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CrudDependencias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    public boolean eliminarDependencia(String tabla, String id, int cod) {
        boolean respuesta = false;
        try {
            ConexionBd conexion = new ConexionBd();
            Connection connection = conexion.crearConexion();
            PreparedStatement insertar = connection.prepareStatement("DELETE FROM " + tabla + " WHERE " + id + " = ? ");
            insertar.setInt(1, cod);
            insertar.executeQuery();
            respuesta = true;
            conexion.cerrarConexion(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CrudDependencias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    public boolean validarDependencia(String tabla, String id, int cod) {
        boolean respuesta = false;
        try {
            ConexionBd conexion = new ConexionBd();
            Connection connection = conexion.crearConexion();
            PreparedStatement insertar = connection.prepareStatement("SELECT * FROM " + tabla + " WHERE " + id + " = ? ");
            insertar.setInt(1, cod);
            ResultSet res = insertar.executeQuery();
            if (res.next()) {
                respuesta = true;
            }
            conexion.cerrarConexion(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CrudDependencias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    public MetodosDependencias consultarDependencia(String tabla, String id, String nombre, int cod) {
        MetodosDependencias dependencia = null;
        try {
            ConexionBd conexion = new ConexionBd();
            Connection connection = conexion.crearConexion();
            PreparedStatement insertar = connection.prepareStatement("SELECT * FROM " + tabla + " WHERE " + id + " = ? ");
            insertar.setInt(1, cod);
            ResultSet respu = insertar.executeQuery();
            if (respu.next()) {
                dependencia = new MetodosDependencias();
                dependencia.setId(respu.getInt(id));
                dependencia.setNombre(respu.getString(nombre));
            }
            conexion.cerrarConexion(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CrudDependencias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dependencia;
    }

    public List<MetodosDependencias> cargarDependencia(String tabla, String id, String nombre) {
        MetodosDependencias dependencia = null;
        List<MetodosDependencias> listaDependencia = new ArrayList<>();
        try {
            ConexionBd conexion = new ConexionBd();
            Connection connection = conexion.crearConexion();
            String consulta = "SELECT * FROM " + tabla + " ORDER BY " + nombre;
            Statement insertar = connection.createStatement();
            ResultSet respu = insertar.executeQuery(consulta);
            while (respu.next()) {
                dependencia = new MetodosDependencias();
                dependencia.setId(respu.getInt(id));
                dependencia.setNombre(respu.getString(nombre));
                listaDependencia.add(dependencia);
            }
            conexion.cerrarConexion(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CrudDependencias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaDependencia;
    }
    
    public List obtenerMunicipios(int index, String id, String nombre) {

        List<MetodosDependencias> listaDependencias = new ArrayList<MetodosDependencias>();
        try {
            ConexionBd conexion = new ConexionBd();
            Connection connection = conexion.crearConexion();
            MetodosDependencias dependencia;
            Statement statement = connection.createStatement();
            ResultSet respuesta = statement.executeQuery("SELECT * FROM MUNICIPIOS WHERE ID_DEPARTAMENTO = " + index + 
                                                         " ORDER BY NOMBRE");
            while (respuesta.next()) {
                dependencia = new MetodosDependencias();
                dependencia.setId(respuesta.getInt(id));
                dependencia.setNombre(respuesta.getString(nombre));
                listaDependencias.add(dependencia);
            }
            conexion.cerrarConexion(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaDependencias;
    }

}
