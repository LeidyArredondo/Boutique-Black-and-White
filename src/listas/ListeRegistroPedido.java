package listas;

import estructuranodo.NodoCliente;
import estructuranodo.NodoRegistroPedido;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logica.MetodosRegistro;


public class ListeRegistroPedido {

    private NodoRegistroPedido cabeza;
     ImageIcon imaInforma = new ImageIcon("C:\\Users\\leidy\\Documents\\NetBeansProjects\\Black&White\\src\\Imagenes\\iconoInfor.jpg");


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
    public void GuardarRegistroPedido(MetodosRegistro pedido) {
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
       
         JOptionPane.showMessageDialog(null, "Se Guardó Correctamente", "Gestionar Pedido - S.I.C", JOptionPane.OK_OPTION,
                            imaInforma);
    
    }

//realizamos el subprograma de buscar ultimo ...y recibimos en la variable primero la cabeza de la lista
    public NodoRegistroPedido buscarUltimo(NodoRegistroPedido primero) {

        while (primero.getLiga() != null) {
            primero = primero.getLiga();
        }
        return primero;
    }

    
      //  realizamos el subprograma que guarda las modidificaciones....recibimos los datos del personal que son de tipo metodoregistropersonal

   public boolean guardarModificacionPedido(MetodosRegistro pedido){
       
       NodoRegistroPedido auxiliar =cabeza;       //copia a la cabeza 
       
        while (auxiliar != null){                                    //se repite mientras la cabeza sea diferente de cero
           if (auxiliar.getPedido().getCodCompr().equals(pedido.getCodCompr())){
               auxiliar.setPedido(pedido);
               return true;
           }else{
               auxiliar=auxiliar.getLiga();
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
    
    
    public void eliminarPedido ( String CodCompr){
        NodoRegistroPedido aux,anterior;
        if(cabeza==null){
            
            JOptionPane.showMessageDialog(null, "No existe el código ha eliminar", "Gestionar Pedido - S.I.C", JOptionPane.OK_OPTION,
                            imaInforma);
        }else{
            if(cabeza.getPedido().getCodCompr().equals(CodCompr)){
            cabeza = cabeza.getLiga();
            
            JOptionPane.showMessageDialog(null, "El pedido ha sido eliminado correctamente", "Gestionar Pedido - S.I.C", JOptionPane.OK_OPTION,
                            imaInforma);
            
            }else{
            anterior = buscarPedido (cabeza,CodCompr);
            if (anterior==null){
                
                
                JOptionPane.showMessageDialog(null, "El cliente no existe", "Gestionar Pedido - S.I.C", JOptionPane.OK_OPTION,
                            imaInforma);
               
            }else{
                aux = anterior.getLiga();
                    anterior.setLiga(aux.getLiga());
                    
                    JOptionPane.showMessageDialog(null, "El cliente se eliminó correctamente ", "Gestionar Pedido - S.I.C", JOptionPane.OK_OPTION,
                            imaInforma);
            }
            
            
            }
        
        }
    }
    
    
    
     public NodoRegistroPedido buscarPedido(NodoRegistroPedido cabeza, String CodCompr){
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



                                                                             