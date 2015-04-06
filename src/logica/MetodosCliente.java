/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;
import java.util.Date;

public class MetodosCliente {
  
   private String documen,tipo, nombre, apellido,genero,departa, munici,direc,tele,cel, correo;
   private Date fechaNac;
   private String rutaImagen, nombreImg;// get y set son para acceder y llevar informacion a las variables de clase metodos cliente

    public String getRutaImagen() { //trae la informacion que tiene la variable rutaimagen
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {  //lleva la informacion a la variable rutaimagen de lo que le llego por parametros
        this.rutaImagen = rutaImagen;
    }

    public String getNombreImg() {     //public y tipo de variable es funcion...retorna un string
        return nombreImg;
    }

    public void setNombreImg(String nombreImg) { //void...es un procedimiento...no retorna nada
        this.nombreImg = nombreImg;
    }
    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
   
   
    public String getDocumen() {
        return documen;
    }

    public void setDocumen(String documen) {
        this.documen = documen;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDeparta() {
        return departa;
    }

    public void setDeparta(String departa) {
        this.departa = departa;
    }

    public String getMunici() {
        return munici;
    }

    public void setMunici(String munici) {
        this.munici = munici;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
   
    
    
    
    
}
