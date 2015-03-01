/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;
import java.util.Date;

public class MetodosCliente {
  
   private String Documen,Tipo, Nombre, Apellido,Genero,Departa, Munici,Direc,Tele,Cel, Correo;
   private Date FechaNac;
   private String RutaImagen, NombreImg;// get y set son para acceder y llevar informacion a las variables de clase metodos cliente

    public String getRutaImagen() { //trae la informacion que tiene la variable rutaimagen
        return RutaImagen;
    }

    public void setRutaImagen(String RutaImagen) {  //lleva la informacion a la variable rutaimagen de lo que le llego por parametros
        this.RutaImagen = RutaImagen;
    }

    public String getNombreImg() {     //public y tipo de variable es funcion...retorna un string
        return NombreImg;
    }

    public void setNombreImg(String NombreImg) { //void...es un procedimiento...no retorna nada
        this.NombreImg = NombreImg;
    }
    public Date getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(Date FechaNac) {
        this.FechaNac = FechaNac;
    }
   
   
    public String getDocumen() {
        return Documen;
    }

    public void setDocumen(String Documen) {
        this.Documen = Documen;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getDeparta() {
        return Departa;
    }

    public void setDeparta(String Departa) {
        this.Departa = Departa;
    }

    public String getMunici() {
        return Munici;
    }

    public void setMunici(String Munici) {
        this.Munici = Munici;
    }

    public String getDirec() {
        return Direc;
    }

    public void setDirec(String Direc) {
        this.Direc = Direc;
    }

    public String getTele() {
        return Tele;
    }

    public void setTele(String Tele) {
        this.Tele = Tele;
    }

    public String getCel() {
        return Cel;
    }

    public void setCel(String Cel) {
        this.Cel = Cel;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
   
    
    
    
    
}
