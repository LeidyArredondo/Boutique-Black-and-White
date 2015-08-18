/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;

import java.util.Date;
public class Metodos {
    
    int idEmpleado, TipoDocumento, municipio,contrato, sangre, estado, rh, cargo,departamento;

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }
    String nombre,primerApelli, segundoApelli,direccion,barrio,correo;
    Date fechaNaci,fechaContrat;
    private String rutaImagen, nombreImg; 

    public Metodos() {
    }

    public Metodos(int idEmpleado, int TipoDocumento, String nombre, String primerApelli, String segundoApelli,String direccion, int municipio, Date fechaNaci, int contrato, int sangre,  int cargo, int estado, int rh,  String correo,  Date fechaContrat,  String barrio, String rutaImagen) {
        this.idEmpleado = idEmpleado;
        this.TipoDocumento = TipoDocumento;
        this.municipio = municipio;
        this.contrato = contrato;
        this.sangre = sangre;
        this.estado = estado;
        this.rh = rh;
        this.cargo = cargo;
        this.nombre = nombre;
        this.primerApelli = primerApelli;
        this.segundoApelli = segundoApelli;
        this.direccion = direccion;
        this.barrio = barrio;
        this.correo = correo;
        this.fechaNaci = fechaNaci;
        this.fechaContrat = fechaContrat;
        this.rutaImagen = rutaImagen;
    }

    
    
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(int TipoDocumento) {
        this.TipoDocumento = TipoDocumento;
    }

    public int getMunicipio() {
        return municipio;
    }

    public void setMunicipio(int municipio) {
        this.municipio = municipio;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public int getSangre() {
        return sangre;
    }

    public void setSangre(int sangre) {
        this.sangre = sangre;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getRh() {
        return rh;
    }

    public void setRh(int rh) {
        this.rh = rh;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApelli() {
        return primerApelli;
    }

    public void setPrimerApelli(String primerApelli) {
        this.primerApelli = primerApelli;
    }

    public String getSegundoApelli() {
        return segundoApelli;
    }

    public void setSegundoApelli(String segundoApelli) {
        this.segundoApelli = segundoApelli;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaNaci() {
        return fechaNaci;
    }

    public void setFechaNaci(Date fechaNaci) {
        this.fechaNaci = fechaNaci;
    }

    public Date getFechaContrat() {
        return fechaContrat;
    }

    public void setFechaContrat(Date fechaContrat) {
        this.fechaContrat = fechaContrat;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public String getNombreImg() {
        return nombreImg;
    }

    public void setNombreImg(String nombreImg) {
        this.nombreImg = nombreImg;
    }   
}
