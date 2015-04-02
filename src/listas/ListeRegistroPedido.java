package listas;

import estructuranodo.NodoCliente;
import estructuranodo.NodoRegistroPedido;
import logica.MetodosRegistro;

public class ListeRegistroPedido {

    private NodoRegistroPedido cabeza;

    public ListeRegistroPedido() {
        cabeza = null;
    }

    public NodoRegistroPedido getcabeza() {
        return cabeza;
    }

    public void setcabeza(NodoRegistroPedido cabeza) {      //cambiamos la cabeza
        this.cabeza = cabeza;

    }

    //realizamos los métodos para implementar el crud
    public boolean GuardarRegistroPedido(MetodosRegistro pedido) {
        NodoRegistroPedido nuevo, ultimo;

        nuevo = new NodoRegistroPedido();
        nuevo.setPedido(pedido);

        if (cabeza == null) {

            nuevo.setLiga(null);
            cabeza = nuevo;

        } else {

            ultimo = buscarUltimo(cabeza);
            nuevo.setLiga(ultimo.getLiga());
            ultimo.setLiga(nuevo);

        }

        return true;

    }

//realizamos el subprograma de buscar ultimo ...y recibimos en la variable primero la cabeza de la lista
    public NodoRegistroPedido buscarUltimo(NodoRegistroPedido primero) {

        while (primero.getLiga() != null) {
            primero = primero.getLiga();
        }
        return primero;
    }

      //  realizamos el subprograma que guarda las modidificaciones....recibimos los datos del personal que son de tipo metodoregistropersonal
    public boolean guardarModificacionPedido(MetodosRegistro pedido) {

        NodoRegistroPedido auxiliar = cabeza;       //copia a la cabeza 

        while (auxiliar != null) {                                    //se repite mientras la cabeza sea diferente de cero
            if (auxiliar.getPedido().getCodCompr().equals(pedido.getCodCompr())) {
                auxiliar.setPedido(pedido);
                return true;
            } else {
                auxiliar = auxiliar.getLiga();
            }
        }
        return false;

    }

    public MetodosRegistro buscarPedido(String CodCompr) {

        NodoRegistroPedido auxiliar = cabeza;
        while (auxiliar != null) {
            if (auxiliar.getPedido().getCodCompr().equals(CodCompr)) {
                return auxiliar.getPedido();
            } else {

                auxiliar = auxiliar.getLiga();
            }

        }
        return null;

    }

    public boolean siExiste(String CodCompr) {

        NodoRegistroPedido auxiliar = cabeza;
        while (auxiliar != null) {
            if (auxiliar.getPedido().getCodCompr().equals(CodCompr)) {
                return true;
            } else {
                auxiliar = auxiliar.getLiga();
            }
        }
        return false;
    }

    public boolean eliminarPedido(String CodCompr) {
        NodoRegistroPedido aux, anterior;
        if (cabeza == null) {

            return false;
        } else {
            if (cabeza.getPedido().getCodCompr().equals(CodCompr)) {
                cabeza = cabeza.getLiga();

                return true;

            } else {
                anterior = buscarPedido(cabeza, CodCompr);
                if (anterior == null) {

                    return false;

                } else {
                    aux = anterior.getLiga();
                    anterior.setLiga(aux.getLiga());

                    return true;
                }

            }

        }
    }

    public NodoRegistroPedido buscarPedido(NodoRegistroPedido cabeza, String CodCompr) {
        NodoRegistroPedido aux, anterior = null;
        aux = cabeza;
        while (aux != null) {
            if (aux.getPedido().getCodCompr().equals(CodCompr)) {       //si este nodo es igual al numero de la cedula...retorne anterior
                return anterior;
            } else {
                anterior = aux;                                                               //guarda la direccion anterior
                aux = aux.getLiga();                                                        //avanzamos en la lista 
            }

        }
        return null;
    }

}
