
package estructuranodo;

import logica.MetodosCliente;       //importamos del paquete logica los metodos
        

public class NodoCliente {        //estamos creando la estructura del nodo
    
    private MetodosCliente cliente;    //se crea un campo de tipo metodoscliente para guardar toda la informacion del cliente
    private NodoCliente liga;             // se crea un campo de tipo nodocliente para tener la direccion del nodo siguiente
    
        public NodoCliente(){    //constructor sin parametros 
    
    }

    public MetodosCliente getCliente() {   // se crea el get y set de cada variable ...set guardar un empleado...get para consultar
        return cliente;
    }

    public void setCliente(MetodosCliente cliente) {
        this.cliente = cliente;
    }

    public NodoCliente getLiga() {
        return liga;
    }

    public void setLiga(NodoCliente liga) {
        this.liga = liga;
    }
    

    
}
