package black.white;

import listas.*;
import logica.*;

public class BlackWhite {

    public static ListaCliente listaCliente;
    public static ListaPerfil listaPerfil;
    public static ListeRegistroPedido listaPedido;
    public static ListaRegistroPersonal listaPersonal;    //estas variables van a contener todos los metodos de la clase de cada lista 
    public static MetodosPerfil perfil, perfil1, perfil2;

    public static void main(String[] args) {

        listaCliente = new ListaCliente();   // estamos creando la lista
        listaPedido = new ListeRegistroPedido();
        listaPersonal = new ListaRegistroPersonal();
        listaPerfil = new ListaPerfil();    //instanciamos cada una de las variables y se convierte en objeto ...para pasar por referencia 

        perfil = new MetodosPerfil();
        perfil.setNumdoc("43902759");
        perfil.setPerf("ADMINISTRADOR");
        perfil.setNombreusu("leidy");
        perfil.setContra("Leidy.123");
        perfil.setConfContra("Leidy.123");
        perfil.setCorreo("leidyarredondo81@gmail.com");
        perfil.setPregSec("Nombre de Mascota");
        perfil.setResp("Ninguna");
        listaPerfil.guardarPerfil(perfil);

        perfil1 = new MetodosPerfil();
        perfil1.setNumdoc("1214732318");
        perfil1.setPerf("VENDEDOR");
        perfil1.setNombreusu("marcela");
        perfil1.setContra("Marcela.456");
        perfil1.setConfContra("Marcela.456");
        perfil1.setCorreo("marcez2611@gmail.com");
        perfil1.setPregSec("Mejor Amigo de la Infancia");
        perfil1.setResp("Estefany");
        listaPerfil.guardarPerfil(perfil1);

        perfil2 = new MetodosPerfil();
        perfil2.setNumdoc("95112620355");
        perfil2.setPerf("EMPLEADO");
        perfil2.setNombreusu("sara");
        perfil2.setContra("456");
        perfil2.setConfContra("456");
        perfil2.setCorreo("jfcorho@gmail.com");
        perfil2.setPregSec("Color Preferido");
        perfil2.setResp("Azul");
        listaPerfil.guardarPerfil(perfil2);

        LogIn l = new LogIn(listaCliente, listaPedido, listaPerfil, listaPersonal);

    }

}
