package black.white;

import java.util.Date;
import listas.*;
import logica.*;

public class BlackWhite {

    public static ListaCliente listaCliente;
    public static ListaPerfil listaPerfil;
    public static ListeRegistroPedido listaPedido;
    public static ListaRegistroPersonal listaPersonal;    //estas variables van a contener todos los metodos de la clase de cada lista 
    public static MetodosPerfil perfil, perfil1, perfil2;
    public static Metodos persona, persona1,persona2;
    public static String ruta,ruta1,ruta2;

    public static void main(String[] args) {

        listaCliente = new ListaCliente();   // estamos creando la lista
        listaPedido = new ListeRegistroPedido();
        listaPersonal = new ListaRegistroPersonal();
        listaPerfil = new ListaPerfil();    //instanciamos cada una de las variables y se convierte en objeto ...para pasar por referencia 
        ruta = "C:\\Boutique\\src\\Imagenes\\cliente.jpg";
        ruta1 = "C:\\Boutique\\src\\Imagenes\\clientes.jpg";
        ruta2 = "C:\\Boutique\\src\\Imagenes\\iconoventas.jpg";
        
        persona = new Metodos();
        persona.setTipodeDocumento("Cédula de ciudadania");
        persona.setDocumento("43902759");
        persona.setNombreCompleto("Leidy Arredondo");
        persona.setCiudaddeNacimiento("Medellín");
        persona.setDepartamento("Antioquia");
        persona.setTipodeSangre("O");
        persona.setFactorRH("+");
        persona.setCargo("Administrador");
        persona.setTipodeContrato("Fijo");
        persona.setDirecciondeResidencia("Calle 104");
        persona.setBarrio("Belen");
        persona.setRutaImagen(ruta);
        persona.setNombreImg(ruta);
        persona.setTelefonoFijo("4352343");
        persona.setTelefonoMovil("3214567890");
        persona.setCorreoElectronico("leidyarredondo81@gmail.com");
        persona.setEstado("Activo");
        persona.setFechadeNacimiento(new Date (78,15,05));
        persona.setFecha_Contra(new Date (113,15,05));
        persona.setRutaImagen("C:\\Boutique\\src\\Imagenes");
        listaPersonal.guardarRegistro(persona);
        
        persona1 = new Metodos();
        persona1.setTipodeDocumento("Cédula de ciudadania");
        persona1.setDocumento("1214732318");
        persona1.setNombreCompleto("Marcela Alzate");
        persona1.setCiudaddeNacimiento("Medellín");
        persona1.setDepartamento("Antioquia");
        persona1.setTipodeSangre("O");
        persona1.setFactorRH("+");
        persona1.setRutaImagen(ruta1);
        persona1.setNombreImg(ruta1);
        persona1.setCargo("Vendedor");
        persona1.setTipodeContrato("Fijo");
        persona1.setDirecciondeResidencia("Calle 105");
        persona1.setBarrio("Belen");
        persona1.setTelefonoFijo("4226228");
        persona1.setTelefonoMovil("3214564890");
        persona1.setCorreoElectronico("marcez2611@gmail.com");
        persona1.setEstado("Activo");
        persona1.setFechadeNacimiento(new Date (78,15,05));
        persona1.setFecha_Contra(new Date (113,15,05));
        persona1.setRutaImagen("C:\\Boutique\\src\\Imagenes");
        listaPersonal.guardarRegistro(persona1);
        
        persona2 = new Metodos();
        persona2.setTipodeDocumento("Cédula de ciudadania");
        persona2.setDocumento("1152702377");
        persona2.setNombreCompleto("Veronica Velez");
        persona2.setCiudaddeNacimiento("Medellín");
        persona2.setDepartamento("Antioquia");
        persona2.setTipodeSangre("O");
        persona2.setFactorRH("+");
        persona2.setCargo("Empleado");
        persona2.setTipodeContrato("Fijo");
        persona2.setDirecciondeResidencia("Calle 106");
        persona2.setBarrio("Belen");
        persona2.setTelefonoFijo("4226227");
        persona2.setRutaImagen(ruta2);
        persona2.setNombreImg(ruta2);
        persona2.setTelefonoMovil("321456489");
        persona2.setCorreoElectronico("verovelez1706@gmail.com");
        persona2.setEstado("Activo");
        persona2.setFechadeNacimiento(new Date (78,15,05));
        persona2.setFecha_Contra(new Date (113,15,05));
        persona2.setRutaImagen("C:\\Boutique\\src\\Imagenes");
        listaPersonal.guardarRegistro(persona2);
        
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
        perfil2.setNumdoc("1152702377");
        perfil2.setPerf("EMPLEADO");
        perfil2.setNombreusu("veronica");
        perfil2.setContra("Vero.456");
        perfil2.setConfContra("Vero.456");
        perfil2.setCorreo("verovelez1706@gmail.com");
        perfil2.setPregSec("Color Preferido");
        perfil2.setResp("Azul");
        listaPerfil.guardarPerfil(perfil2);

        LogIn l = new LogIn(listaCliente, listaPedido, listaPerfil, listaPersonal);

    }

}
