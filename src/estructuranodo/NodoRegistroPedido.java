
package estructuranodo;


import logica.MetodosRegistro;

public class NodoRegistroPedido {
    
    private MetodosRegistro pedido;                                       //se crea un campo de tipometodo registro pedido para guardar toda la informacion del pedido
    private NodoRegistroPedido liga;                                    // // se crea un campo de tipo nodoregistro pedido para tener la direccion del nodo siguiente 
    
    public  NodoRegistroPedido(){                                       //secrea el constructor vacio ....sin parametros
    }

    public MetodosRegistro getPedido() {
        return pedido;
    }

    public void setPedido(MetodosRegistro pedido) {
        this.pedido = pedido;
    }

    public NodoRegistroPedido getLiga() {
        return liga;
    }

    public void setLiga(NodoRegistroPedido  liga) {
        this.liga = liga;
    }
      
 }
