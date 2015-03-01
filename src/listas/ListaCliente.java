package listas;

import estructuranodo.NodoCliente;   // la clase nodocliente es la variable tipo apuntador 
import javax.swing.JOptionPane;
import logica.MetodosCliente;
import javax.swing.ImageIcon;

public class ListaCliente {

    private NodoCliente cabeza;   //variable de tipo nodocliente apuntador...solo direcciones.....no se nos pierda la cabeza
    ImageIcon imaInforma = new ImageIcon("C:\\Users\\leidy\\Documents\\NetBeansProjects\\Black&White\\src\\Imagenes\\iconoInfor.jpg");


    public ListaCliente() {    //constructor ...inicializamos la cabeza en null
        cabeza = null;

    }

    public NodoCliente getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoCliente cabeza) {
        this.cabeza = cabeza;
    }

    // realizamos los métodos para implementar el crud
    public void guardarCliente(MetodosCliente cliente) {  //procedimiento no devuelve nada ...por eso imprimimos ahii
        NodoCliente nuevo, ultimo;      //declarando las variables auxiliares

        nuevo = new NodoCliente();     // pedimos memoria 
        nuevo.setCliente(cliente);       // en la direccion (nuevo) lleveme los datos del cliente nuevo a guardar....lleno el dato

        if (cabeza == null) {

            nuevo.setLiga(null);            //se liga si es el primero y el último de la lista 
            cabeza = nuevo;

        } else {

            ultimo = buscarUltimo(cabeza);    //retorna la posición del último para ligar al final puesto que siempre vamos a insertar al final
            nuevo.setLiga(ultimo.getLiga());  //estamos ligando el ultimo
            ultimo.setLiga(nuevo);                 //ligamos el que era ultimo con el nuevo...que ya es ultimo
        }
         
          JOptionPane.showMessageDialog(null, "Se Guardó Correctamente", "Gestionar Pedido - S.I.C", JOptionPane.OK_OPTION,
                            imaInforma);
    }

    //realizamos el subprograma de buscar ultimo ...y recibimos en la variable primero la cabeza de la lista 
    public NodoCliente buscarUltimo(NodoCliente primero) {     //retorna en una funcion ....recibimos la direccion 

        while (primero.getLiga() != null) {      //mientras este no sea el ultimo ...avance
            primero = primero.getLiga();          //avanzo en la lista 
        }
        return primero;
    }

    // realizamos el subprograma de guardar las modificaciones ...recibimos los datos del cliente de tipo metodocliente
    public boolean guardarModificacionCliente(MetodosCliente cliente) {        //funcion...poreso retorna un tipo de variable

        NodoCliente auxiliar = cabeza;        //  copia a la cabeza

        while (auxiliar != null) {                 // se repite mientras la cabeza es diferente cero
            if (auxiliar.getCliente().getDocumen().equals(cliente.getDocumen())) {   //traemos los datos del cliente ya guardado y lo comparamos con el q nos llega modificado
                auxiliar.setCliente(cliente);        //guardamos la modificacion 
                return true;
            } else {
                auxiliar = auxiliar.getLiga();          //avanzamos en la lista 
            }
        }

        return false;
    } 

    public MetodosCliente buscarCliente(String cedula) {

        NodoCliente auxiliar = cabeza;

        while (auxiliar != null) {
            if (auxiliar.getCliente().getDocumen().equals(cedula)) {      //comparando la cedula que existe con la que me llega de consulta 

                return auxiliar.getCliente();
            } else {

                auxiliar = auxiliar.getLiga();
            }
        }
        return null;

    }

    public boolean siExiste(String cedula) {

        NodoCliente auxiliar = cabeza;

        while (auxiliar != null) {
            if (auxiliar.getCliente().getDocumen().equals(cedula)) {

                return true;
            } else {

                auxiliar = auxiliar.getLiga();
            }
        }
        return false;
    }

    public void eliminarCliente(String cedula) {

        NodoCliente anterior, eliminar;
        if (cabeza == null) {

            
            JOptionPane.showMessageDialog(null, "No existen datos para eliminar", "Gestionar Pedido - S.I.C", JOptionPane.OK_OPTION,
                            imaInforma);
        } else {
            if (cabeza.getCliente().getDocumen().equals(cedula)) {

                cabeza = cabeza.getLiga();                                                  //cambio la cabeza si es el primero 
              
                  JOptionPane.showMessageDialog(null, "El cliente ha sido eliminado correctamente", "Gestionar Pedido - S.I.C", JOptionPane.OK_OPTION,
                            imaInforma);
            } else {
                anterior = buscarDato(cabeza, cedula);
                if (anterior == null) {

                    JOptionPane.showMessageDialog(null, "El cliente no existe", "Gestionar Pedido - S.I.C", JOptionPane.OK_OPTION,
                            imaInforma);
                } else {
                    eliminar = anterior.getLiga();
                    anterior.setLiga(eliminar.getLiga());
                    
                    JOptionPane.showMessageDialog(null, "El cliente se eliminó correctamente", "Gestionar Pedido - S.I.C", JOptionPane.OK_OPTION,
                            imaInforma); 
            }

        }
    }
    }
        
    public NodoCliente buscarDato(NodoCliente cabeza, String cedula){
        NodoCliente aux, anterior = null;
        aux = cabeza;
        while (aux != null) {
            if (aux.getCliente().getDocumen().equals(cedula)) {       //si este nodo es igual al numero de la cedula...retorne anterior
                return anterior;
            } else {
                anterior = aux;                                                               //guarda la direccion anterior
                aux = aux.getLiga();                                                        //avanzamos en la lista 
            }

        }
        return null;
    }

}
