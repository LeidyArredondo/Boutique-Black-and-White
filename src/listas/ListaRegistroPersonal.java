package listas;

import estructuranodo.NodoRegistroPersonal;             //la clase nodoregistro es la variable de tipo apuntador
import logica.Metodos;

public class ListaRegistroPersonal {

    private NodoRegistroPersonal cabeza; //la variable de tipo nodoregistropersonal ...es solo de direccion 

    public ListaRegistroPersonal() {                           //creo el constructor sin parametros 
        cabeza = null;
    }

    public NodoRegistroPersonal getCabeza() {           //capturar el primero 
        return cabeza;
    }

    public void setCabeza(NodoRegistroPersonal cabeza) {    //cambiar la cabeza
        this.cabeza = cabeza;
    }

    //realizamos los métodos para implementar el crud 
    public boolean guardarRegistro(Metodos personal) {
        NodoRegistroPersonal nuevo, ultimo;                       //declaramos las variables auxiliares

        nuevo = new NodoRegistroPersonal();                     //pedimos memoria 
        nuevo.setPersonal(personal);                           //en la direccion (nuevo)traigame los datos de personal...lleno el dato

        if (cabeza == null) {

            nuevo.setLiga(null);                               //se liga si es el primero y el último de la lista
            cabeza = nuevo;

        } else {

            ultimo = buscarUltimo(cabeza);                     //retorna la posición del último para ligar al final puesto que siempre vamos a insertar al final
            nuevo.setLiga(ultimo.getLiga());                 //estamos ligando el ultimo
            ultimo.setLiga(nuevo);                           //ligamos el que era ultimo con el nuevo...que ya es ultimo
        }

        return true;

    }

            //realizamos el subprograma de buscar ultimo ...y recibimos en la variable primero la cabeza de la lista 
    public NodoRegistroPersonal buscarUltimo(NodoRegistroPersonal primero) {      //retorna en una funcion ....recibimos la direccion 

        while (primero.getLiga() != null) {                                                        //mientras este no sea el útimo avance...
            primero = primero.getLiga();                                                          //avanzo en la lista 
        }
        return primero;        //cambiar la variable a ultimo................ojooo
    }

          //  realizamos el subprograma que guarda las modidificaciones....recibimos los datos del personal que son de tipo metodoregistropersonal
    public boolean guardarModificacionPersonal(Metodos personal) {

        NodoRegistroPersonal auxiliar = cabeza;       //copia a la cabeza 

        while (auxiliar != null) {                                    //se repite mientras la cabeza sea diferente de cero
            if (auxiliar.getPersonal().getDocumento().equals(personal.getDocumento())) {
                auxiliar.setPersonal(personal);
                return true;
            } else {
                auxiliar = auxiliar.getLiga();
            }
        }
        return false;
    }

    public Metodos buscarPersonal(String cedula) {

        NodoRegistroPersonal auxiliar = cabeza;

        while (auxiliar != null) {
            if (auxiliar.getPersonal().getDocumento().equals(cedula)) {

                return auxiliar.getPersonal();
            } else {

                auxiliar = auxiliar.getLiga();
            }

        }
        return null;

    }

    public boolean siExiste(String cedula) {

        NodoRegistroPersonal auxiliar = cabeza;

        while (auxiliar != null) {
            if (auxiliar.getPersonal().getDocumento().equals(cedula)) {

                return true;
            } else {
                auxiliar = auxiliar.getLiga();

            }

        }
        return false;
    }

    public boolean eliminarPersonal(String cedula) {
        NodoRegistroPersonal anterior, aux;

        if (cabeza == null) {

            return false;
        } else {
            if (cabeza.getPersonal().getDocumento().equals(cedula)) {

                cabeza = cabeza.getLiga();

                return true;

            } else {
                anterior = buscarPersonal(cabeza, cedula);
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

    public NodoRegistroPersonal buscarPersonal(NodoRegistroPersonal cabeza, String cedula) {
        NodoRegistroPersonal aux, anterior = null;
        aux = cabeza;
        while (aux != null) {
            if (aux.getPersonal().getDocumento().equals(cedula)) {
                return anterior;

            } else {
                anterior = aux;
                aux = aux.getLiga();

            }
        }
        return null;

    }

    public String capturarNombre(String doc) {

        NodoRegistroPersonal auxi = cabeza;
        while (auxi != null) {

            if (auxi.getPersonal().getDocumento().equals(doc)) {

                return auxi.getPersonal().getNombreCompleto();
            }
        }
        return "";
    }

}
