/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudBd;

import Util.ConexionBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import logica.Metodos;
import logica.MetodosDependencias;

/**
 *
 * @author Leidy
 */
public class CrudEmpleados {
    
    public boolean ingresarDatosEmpleados(Metodos empleado) {
        boolean respuesta = false;
        try {
            ConexionBd conexion = new ConexionBd();
            Connection connection = conexion.crearConexion();

            PreparedStatement insertarDatos
                    = connection.prepareStatement("INSERT INTO EMPLEADOS (ID_EMPLEADO,ID_TIPO_DOCUMENTO,"
                            + "NOMBRE,PRIMER_APELLIDO, SEGUNDO_APELLIDO,DIRECCION,ID_MUNICIPIO, FECHA_NACI,"
                            + " ID_CONTRATO, TIPO_SANGRE,CARGO ,ESTADO, FACTOR_RH,"
                            + "CORREO,FECHA_CONTRAT, BARRIO,RUTA_IMAGEN)"
                            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?)");

            insertarDatos.setInt(1, empleado.getIdEmpleado());
            insertarDatos.setInt(2, empleado.getTipoDocumento());
            insertarDatos.setString(3, empleado.getNombre());
            insertarDatos.setString(4, empleado.getPrimerApelli());
            insertarDatos.setString(5, empleado.getSegundoApelli());
            insertarDatos.setString(6, empleado.getDireccion());
            insertarDatos.setInt(7, empleado.getMunicipio());
            insertarDatos.setDate(8, new java.sql.Date(empleado.getFechaNaci().getTime()));
            insertarDatos.setInt(9, empleado.getContrato());
            insertarDatos.setInt(10, empleado.getSangre());
            insertarDatos.setInt(11, empleado.getCargo());
            insertarDatos.setInt(12, empleado.getEstado());
            insertarDatos.setInt(13, empleado.getRh());
            insertarDatos.setString(14, empleado.getCorreo());
            insertarDatos.setDate(15, new java.sql.Date(empleado.getFechaContrat().getTime()));
            insertarDatos.setString(16, empleado.getBarrio());
            insertarDatos.setString(17, empleado.getRutaImagen());
            insertarDatos.executeUpdate();
            respuesta = true;
            conexion.cerrarConexion(connection);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No ha sido posible la conexión a la Base de Datos \n" + e.getMessage());
            return respuesta;
        }
        return respuesta;
    }

    /**
     * Método para modificar los datos existentes de un registro almacenado en
     * la base de datos de la empresa Oncaribean.
     *
     * @param modificarEmpleado recibe un objeto de tipo <code>Reservas</code>
     * con el contenido de los datos modificados para actualizar en la base de
     * datos.
     * @see <code>Reservas</code>
     */
    public boolean modificarDatosTablaPersonal(Metodos modificarEmpleado) {
        boolean respuesta = false;

        try {
            ConexionBd conexion = new ConexionBd();
            Connection connection = conexion.crearConexion();

            /**
             * Variable modificarSQL de tipo <code>String</code> en la cual se
             * cargara la petición a la base de datos para insertar los datos.
             */
            String modificarSQL;

            modificarSQL = ("UPDATE EMPLEADOS SET "
                    + "ID_TIPO_DOCUMENTO = " + modificarEmpleado.getTipoDocumento()+ ","
                    + "NOMBRE = '" + modificarEmpleado.getNombre() + "', "
                    + "PRIMER_APELLIDO = '" + modificarEmpleado.getPrimerApelli() + "', "
                    + "SEGUNDO_APELLIDO = '" + modificarEmpleado.getSegundoApelli() + "',"
                    + "DIRECCION = '" + modificarEmpleado.getDireccion() + "', "
                    + "ID_MUNICIPIO = " + modificarEmpleado.getMunicipio()+ ", "
                    + "FECHA_NACI = to_date('" + new java.sql.Date(modificarEmpleado.getFechaNaci().getTime()) + "','YYYY-MM-DD'),"
                    + "ID_CONTRATO = " + modificarEmpleado.getContrato()+ ", "
                    + "TIPO_SANGRE = " + modificarEmpleado.getSangre() + ", "
                    + "CARGO = " + modificarEmpleado.getCargo() + ", "
                    + "ESTADO = " + modificarEmpleado.getEstado() + ", "                    
                    + "FACTOR_RH = " + modificarEmpleado.getRh() + ", "
                    + "CORREO = '" + modificarEmpleado.getCorreo() + "', "
                    + "FECHA_CONTRAT = to_date('" + new java.sql.Date(modificarEmpleado.getFechaContrat().getTime()) + "','YYYY-MM-DD'),"
                    + "BARRIO = '" + modificarEmpleado.getBarrio() + "', "
                    + "RUTA_IMAGEN = '" + modificarEmpleado.getRutaImagen()+ "', "
                    + "WHERE ID_EMPLEADO = " + modificarEmpleado.getIdEmpleado());                   
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(modificarSQL);
            respuesta = true;
            conexion.cerrarConexion(connection);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No ha sido posible la conexión a la Base de Datos \n" + e);
            return respuesta;
        }
        return respuesta;
    }

    /**
     * Método para eliminar un registro especifico almacenado en la base de
     * datos de la empresa Oncaribean.
     *
     * @param  recibe un dato <code>int</code> con el número de la
     * reserva a eliminar de la base de datos.
     */
    public boolean eliminarEmpleado(int id_empleado) {
        boolean respuesta = false;
        try {
            ConexionBd conexion = new ConexionBd();
            Connection connection = conexion.crearConexion();

            /**
             * Variable eliminarSQL de tipo <code>String</code> en la cual se
             * cargara la petición para eliminar el registro.
             */
            String eliminarSQL;

            eliminarSQL = ("DELETE FROM EMPLEADOS WHERE ID_EMPLEADO = " + id_empleado);

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(eliminarSQL);
            System.out.println("se eliminó");
            respuesta = true;
            conexion.cerrarConexion(connection);

        } catch (Exception e) {
            respuesta = false;
            JOptionPane.showMessageDialog(null, "No ha sido posible la conexión a la Base de Datos \n" + e);
        }
        return respuesta;
    }

    public Metodos obtenerEmpleado(int id_empleado) {

        String sql;
        Metodos empleado;

        try {
            ConexionBd conexion = new ConexionBd();
            Connection connection = conexion.crearConexion();

            empleado = null;

            sql = ("SELECT * FROM EMPLEADOS WHERE ID_EMPLEADO = " + id_empleado);

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {

                empleado = new Metodos(
                        resultSet.getInt("ID_EMPLEADO"),
                        resultSet.getInt("ID_TIPO_DOCUMENTO"),
                        resultSet.getString("NOMBRE"),
                        resultSet.getString("PRIMER_APELLIDO"),
                        resultSet.getString("SEGUNDO_APELLIDO"),
                        resultSet.getString("DIRECCION"),
                        resultSet.getInt("ID_MUNICIPIO"),
                        resultSet.getDate("FECHA_NACI"),
                        resultSet.getInt("ID_CONTRATO"),
                        resultSet.getInt("TIPO_SANGRE"),
                        resultSet.getInt("CARGO"),
                        resultSet.getInt("ESTADO"),
                        resultSet.getInt("FACTOR_RH"),
                        resultSet.getString("CORREO"),
                        resultSet.getDate("FECHA_CONTRAT"),
                        resultSet.getString("BARRIO"),
                        resultSet.getString("RUTA_IMAGEN"));     
            }
            conexion.cerrarConexion(connection);
            return empleado;

        } catch (SQLException e) {

            Logger.getLogger(ConexionBd.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
        public Metodos obtenerEmpleadoCorreo(String correo) {

        String sql;
        Metodos empleado;

        try {
            ConexionBd conexion = new ConexionBd();
            Connection connection = conexion.crearConexion();

            empleado = null;

            sql = ("SELECT * FROM EMPLEADOS WHERE CORREO = '" + correo + "'");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {

               empleado = new Metodos(
                        resultSet.getInt("ID_EMPLEADO"),
                        resultSet.getInt("ID_TIPO_DOCUMENTO"),
                        resultSet.getString("NOMBRE"),
                        resultSet.getString("PRIMER_APELLIDO"),
                        resultSet.getString("SEGUNDO_APELLIDO"),
                        resultSet.getString("DIRECCION"),
                        resultSet.getInt("ID_MUNICIPIO"),
                        resultSet.getDate("FECHA_NACI"),
                        resultSet.getInt("ID_CONTRATO"),
                        resultSet.getInt("TIPO_SANGRE"),
                        resultSet.getInt("CARGO"),
                        resultSet.getInt("ESTADO"),
                        resultSet.getInt("FACTOR_RH"),
                        resultSet.getString("CORREO"),
                        resultSet.getDate("FECHA_CONTRAT"),
                        resultSet.getString("BARRIO"),
                        resultSet.getString("RUTA_IMAGEN"));  
            }
            conexion.cerrarConexion(connection);
            return empleado;

        } catch (SQLException e) {

            Logger.getLogger(ConexionBd.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public java.util.List<Metodos> cargarEmpleado() {
        java.util.List<Metodos> listaPersonal = new ArrayList<Metodos>();
        try {
            ConexionBd conexion = new ConexionBd();
            Connection connection = conexion.crearConexion();
            Metodos empleado;
            Statement statement = connection.createStatement();
            ResultSet respuesta = statement.executeQuery("SELECT EM.ID_EMPLEADO, TD.DESCRIPCION, EM.NOMBRE, EM.PRIMER_APELLIDO, "
                + "EM.SEGUNDO_APELLIDO, EM.DIRECCION, MN.NOMBRE, EM.FECHA_NACI, EM.CORREO, CA.NOM_CARGO, TC.TIPO_CONTRATO, "                
                + "EM.FECHA_CONTRAT FROM EMPLEADOS EM INNER JOIN TIPOS_DOCUMENTOS TD ON EM.ID_TIPO_DOCUMENTO = TD.ID_TIPO_DOCUM "
                + "INNER JOIN CARGOS CA ON EM.CARGO = CA.ID_CARGO "
                + "INNER JOIN CONTRATACIONES TC ON EM.TIPO_CONTRATO = TC.ID_CONTRATO INNER JOIN MUNICIPIOS MN OR EM.ID_MUNICIPIO = MN.ID_MUNICIPIO");
            while (respuesta.next()) {
                
                empleado = new Metodos(
                        respuesta.getInt("ID_EMPLEADO"),
                        respuesta.getInt("ID_TIPO_DOCUMENTO"),
                        respuesta.getString("NOMBRE"),
                        respuesta.getString("PRIMER_APELLIDO"),
                        respuesta.getString("SEGUNDO_APELLIDO"),
                        respuesta.getString("DIRECCION"),
                        respuesta.getInt("ID_MUNICIPIO"),
                        respuesta.getDate("FECHA_NACI"),
                        respuesta.getInt("ID_CONTRATO"),
                        respuesta.getInt("TIPO_SANGRE"),
                        respuesta.getInt("CARGO"),
                        respuesta.getInt("ESTADO"),
                        respuesta.getInt("FACTOR_RH"),
                        respuesta.getString("CORREO"),
                        respuesta.getDate("FECHA_CONTRAT"),
                        respuesta.getString("BARRIO"),
                        respuesta.getString("RUTA_IMAGEN"));
                listaPersonal.add(empleado);
            }
            conexion.cerrarConexion(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaPersonal;
    }

    public List obtenerDependencias(String tabla, String id, String nombre) {

        List<MetodosDependencias> listaDependencias = new ArrayList<MetodosDependencias>();
        try {
            ConexionBd conexion = new ConexionBd();
            Connection connection = conexion.crearConexion();
            MetodosDependencias dependencia;
            Statement statement = connection.createStatement();
            ResultSet respuesta = statement.executeQuery("SELECT * FROM " + tabla + " ORDER BY " + nombre);
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
    
    public boolean validarDocumento(int documento) {
        boolean respu = false;
        try {
           ConexionBd conexion = new ConexionBd();
            Connection connection = conexion.crearConexion();
            Statement statement = connection.createStatement();
            ResultSet respuesta = statement.executeQuery("SELECT * FROM EMPLEADOS WHERE ID_EMPLEADO = " + documento);
            while (respuesta.next()) {
                if (respuesta.getInt("ID_EMPLEADO") == documento){
                    respu = true;
                }
            }
            conexion.cerrarConexion(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return respu;
    }
    
    public boolean validarCorreo(String correo) {
        boolean respu = false;
        try {
            ConexionBd conexion = new ConexionBd();
            Connection connection = conexion.crearConexion();
            Statement statement = connection.createStatement();
            ResultSet respuesta = statement.executeQuery("SELECT * FROM EMPLEADOS WHERE CORREO = '" + correo + "'");
            while (respuesta.next()) {
                if (respuesta.getString("CORREO").equals(correo)){
                    respu = true;
                }
            }
            conexion.cerrarConexion(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return respu;
    }

    
}
