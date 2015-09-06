/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudBd;

/**
 *
 * @author Leidy
 */


import Util.ConexionBd;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import logica.MetodosPerfil;

public class CrudAsignarPerfil {
    
    /**
     * Constructor para crear un objeto de la clase <code>Cliente</code> e inicializa la
     * variable <code>conection</code>con la conexion a la base de datos.
     * 
     */
    public CrudAsignarPerfil() {
       
    }
    
    
    /** Método que inserta un nuevo cliente a la base de datos.     
      * @param perfil  es una variable de tipo <code>Perfiles</code> que contiene todos los datos de un cliente
      * a registrar en la base de datos.
      * @throws NullPointerException <code>SQLException e</code> Esta excepción se da cuando no es posible hacer de manera
      * correcta la sentencia SQL.
      */
    public boolean asignarPerfil(MetodosPerfil perfil) {
        boolean resp =false;
        try {
            ConexionBd conexion = new ConexionBd();
            Connection conecion = conexion.crearConexion();
            PreparedStatement asignarSql
                    = conecion.prepareStatement("insert into asignar_perfil (id_asig_perf, documento, id_perfil, nombre_usua, contraseña, fecha)"
                            + " values(?, ?, ?, ?, ?, ?)");
            asignarSql.setInt(1, perfil.getIdPerfil());
            asignarSql.setInt(2, perfil.getNumDoc());
            asignarSql.setInt(3, perfil.getPerf());
            asignarSql.setString(4, perfil.getNombreUsu());
            asignarSql.setString(5, perfil.getContra());
            asignarSql.setDate(6, new Date(perfil.getFecha().getTime()));
            System.out.println("Perfil Asignado" + new Date(perfil.getFecha().getTime()));
            asignarSql.executeUpdate();
            System.out.println("Perfil Asignado"); 
            resp= true;
            conexion.cerrarConexion(conecion);
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return resp;
    }

    
    /** Método que elimina un clliente existente de la base de datos.     
      * @param idPerfil  es una variable de tipo <code>int</code> que contiene los datos del cliente a eliminar.
     * @throws NullPointerException <code>SQLException e</code> Esta excepción se da cuando no es posible hacer de manera
      * correcta la sentencia SQL.
      */
    
    public boolean eliminarPerfil(int idPerfil) {
        
        boolean resp=false;
        try {
            ConexionBd conexion = new ConexionBd();
            Connection conecion = conexion.crearConexion();
            PreparedStatement eliminarPerfil = conecion.prepareStatement("delete from asignar_perfil where DOCUMENTO=?");
            eliminarPerfil.setInt(1, idPerfil);
            eliminarPerfil.executeUpdate();
            System.out.println("Perfil Eliminado"); 
            conexion.cerrarConexion(conecion);
            resp= true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resp;
    }
    
    
     /** Método que actualiza un cliente ya existente de la base de datos.     
      * @param perfil  es una variable de tipo <code>Cliente</code> que contiene todos los datos a actualizar de un cliente.
      * @throws NullPointerException <code>SQLException e</code> Esta excepcióocn se da cuando no es posible hacerde manera
      * correcta la sentencia SQL.
     */
    public boolean actualizarPerfil(MetodosPerfil perfil) {
        boolean resp=false;
        try {
            ConexionBd conexion = new ConexionBd();
            Connection conecion = conexion.crearConexion();
            PreparedStatement actualizarSql
                    = conecion.prepareStatement("update asignar_perfil set \n"
                            + "id_perfil =?, \n"
                            + "nombre_usua =?, \n"
                            + "contraseña =?, \n"                            
                            + "fecha =?, \n"
                            + "where documento =?");
            
            actualizarSql.setInt(1, perfil.getIdPerfil());
            actualizarSql.setString(2, perfil.getNombreUsu());
            actualizarSql.setString(3, perfil.getConfContra());
            actualizarSql.setDate(4, new Date(perfil.getFecha().getTime()));           
            actualizarSql.setInt(5, perfil.getNumDoc());
            actualizarSql.executeUpdate();
            System.out.println("perfil actualizado");
            resp=true;
            conexion.cerrarConexion(conecion);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resp;
    }

     /** Método que trae los clientes registrados de la base de datos.     
      * @throws NullPointerException <code>SQLException e</code> Esta excepción se da cuando no es posible hacer de manera
      * correcta la sentencia SQL.
      * @return un <code>ArrayList</code> de tipo <code>Perfiles</code> con los datos de los clientes consultados.
      */
    public List<MetodosPerfil> cargarPerfil() {
        MetodosPerfil perfil;
        List<MetodosPerfil> listaPerfiles = new ArrayList<>();
        try {
            ConexionBd conexion = new ConexionBd();
            Connection conecion = conexion.crearConexion();            
            Statement consultaSql = conecion.createStatement();
            ResultSet rs = consultaSql.executeQuery("select * from asignar_perfil order by nombre_usuario ");
            while (rs.next()) {
                perfil = new MetodosPerfil();
                perfil.setPerf(rs.getInt("id_asig_perf"));
                perfil.setNumDoc(rs.getInt("documento"));
                perfil.setPerf(rs.getInt("id_perfil"));            
                perfil.setNombreUsu(rs.getString("nom_usuario"));
                perfil.setContra(rs.getString("contraseña"));
                perfil.setFecha(rs.getDate("fecha"));
                listaPerfiles.add(perfil);
            } 
            return listaPerfiles;            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }

        return listaPerfiles;
    }

    
     /** Método que consulta un cliente existente de la base de datos.     
      * @param idPerfil e es una variable de tipo <code>int</code> que contiene los datos del cliente a consultar.
      * @throws NullPointerException <code>SQLException e</code> Esta excepción se da cuando no es posible hacer de manera
      * correcta la sentencia SQL.
      * @return una variable <code>cliente</code> de tipo <code>Cliente</code> con los datos consultados
      * o una retorna <code>null</code> cuando el cliente no existe.
      */
    public MetodosPerfil consultarPerfil(int idPerfil) {
        MetodosPerfil perfil = null;
        try {
            ConexionBd conexion = new ConexionBd();
            Connection conecion = conexion.crearConexion();
            PreparedStatement consultaSql = conecion.
                    prepareStatement("select * from asignar_perfil where id_perfil=?");
            consultaSql.setInt(1, idPerfil);
            ResultSet rs = consultaSql.executeQuery();

            if (rs.next()) {
                perfil = new MetodosPerfil();
                perfil.setPerf(rs.getInt("id_asig_perf"));
                perfil.setNumDoc(rs.getInt("documento"));
                perfil.setPerf(rs.getInt("id_perfil"));                 
                perfil.setNombreUsu(rs.getString("nom_usuario"));
                perfil.setContra(rs.getString("contraseña"));
                perfil.setFecha(rs.getDate("fecha"));
            } 
            return perfil;            
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
    
    public MetodosPerfil consultarPerfilIngreso(String usuario, String pasworrd) {
        MetodosPerfil perfil = null;
        try {
            ConexionBd conexion = new ConexionBd();
            Connection conecion = conexion.crearConexion();
            PreparedStatement consultaSql = conecion.
                    prepareStatement("select * from asignar_perfil where NOMBRE_USUA = ? AND CONTRASEÑA = ?");
            consultaSql.setString(1, usuario);
            consultaSql.setString(2, pasworrd);
            ResultSet rs = consultaSql.executeQuery();

            if (rs.next()) {
                perfil = new MetodosPerfil();
                perfil.setPerf(rs.getInt("id_asig_perf"));
                perfil.setNumDoc(rs.getInt("documento"));
                perfil.setPerf(rs.getInt("id_perfil"));                 
                perfil.setNombreUsu(rs.getString("nombre_usua"));
                perfil.setContra(rs.getString("contraseña"));
                perfil.setFecha(rs.getDate("fecha"));
            }    
            conexion.cerrarConexion(conecion);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

            return perfil; 
    }
    
     public boolean siExiste(int idPerfil) {
         boolean resp= false;        
        try {
            ConexionBd conexion = new ConexionBd();
            Connection conecion = conexion.crearConexion();
            PreparedStatement consultaSql = conecion.
                    prepareStatement("select id_asig_perf from asignar_perfil where id_asig_perf=?");
            consultaSql.setInt(1, idPerfil);
            ResultSet rs = consultaSql.executeQuery();

            if (rs.next()) {
              resp=true;
            } 
            conexion.cerrarConexion(conecion);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resp;
    }
    
    
}
