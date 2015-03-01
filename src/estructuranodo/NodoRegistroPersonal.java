package estructuranodo;


import logica.Metodos;
        
public class NodoRegistroPersonal {
    
    private Metodos personal;           //se crea un campo de tipometodo registro para guardar toda la informacion del personal
    private NodoRegistroPersonal liga;          // se crea un campo de tipo nodoregistro personal para tener la direccion del nodo siguiente 
    
    public NodoRegistroPersonal(){           // se crea el constructor vacio....sin parametros
    }

    public Metodos getPersonal() {
        return personal;
    }

    public void setPersonal(Metodos personal) {
        this.personal = personal;
    }

    public NodoRegistroPersonal getLiga() {
        return liga;
    }

    public void setLiga(NodoRegistroPersonal liga) {
        this.liga = liga;
    }
    
  
    
      
    
  }
