
package listas;



import estructuranodo.NodoPerfil;
import javax.swing.JOptionPane;
import logica.MetodosPerfil;
import javax.swing.ImageIcon;

public class ListaPerfil {
   private NodoPerfil cabeza;    
   ImageIcon imaInforma = new ImageIcon("C:\\Users\\leidy\\Documents\\NetBeansProjects\\Black&White\\src\\Imagenes\\iconoInfor.jpg");

   
   
   public ListaPerfil(){
   cabeza = null;
   }

    public NodoPerfil getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoPerfil cabeza) {
        this.cabeza = cabeza;
    }
   
    public boolean guardarPerfil (MetodosPerfil perfil){
    NodoPerfil nuevo, ultimo;
    
    nuevo= new NodoPerfil();
    nuevo.setPerfil(perfil);
    
    if (cabeza==null){
    nuevo.setLiga(null);
    cabeza= nuevo;
    
    }else{
    ultimo= buscarUltimo(cabeza);
    nuevo.setLiga(ultimo.getLiga());
    ultimo.setLiga(nuevo);
    }
    return true;
    }
    
    public NodoPerfil buscarUltimo(NodoPerfil primero){
        while(primero.getLiga() != null){
        primero = primero.getLiga();
        
        }
        return primero;
    
    }
    
    public boolean guardarModificacionPerfil(MetodosPerfil perfil){
    NodoPerfil auxiliar = cabeza;
    
    while (auxiliar != null){
        if (auxiliar.getPerfil().getNumdoc().equals(perfil.getNumdoc())){
        auxiliar.setPerfil(perfil);
        return true;
        }else{
        auxiliar=auxiliar.getLiga();
        
        }
    
    }   
    return false;
    
    }
    
    public MetodosPerfil buscarPerfil(String NumDoc) {

        NodoPerfil auxiliar = cabeza;
        MetodosPerfil perf = null;
        while (auxiliar != null) {
            if (auxiliar.getPerfil().getNumdoc().equals(NumDoc)) {
                
                perf = auxiliar.getPerfil();
                return perf;
            } else {
                auxiliar = auxiliar.getLiga();
            }

        }
        return perf;
    }
    
    public boolean siExiste(String NumDoc) {
        NodoPerfil auxiliar = cabeza;

        while (auxiliar != null) {
            if (auxiliar.getPerfil().getNumdoc().equals(NumDoc)) {
                return true;

            } else {
                auxiliar = auxiliar.getLiga();
            }
        }
        return false;
    }
    
    public void eliminarPerfil(String NumDoc) {
        NodoPerfil anterior, aux;

        if (cabeza == null) {
            
             JOptionPane.showMessageDialog(null, "No existe el perfil ha eliminar", "Gestionar Pedido - S.I.C", JOptionPane.OK_OPTION,
                            imaInforma);
        } else {
            if (cabeza.getPerfil().getNumdoc().equals(NumDoc)) {

                cabeza = cabeza.getLiga();

              
                 JOptionPane.showMessageDialog(null, "El perfil ha sido eliminado correctamente", "Gestionar Pedido - S.I.C", JOptionPane.OK_OPTION,
                            imaInforma);
            } else {
                anterior = buscarPerfil(cabeza, NumDoc);
                if (anterior == null) {
                    
                     JOptionPane.showMessageDialog(null, "El perfil no existe", "Gestionar Pedido - S.I.C", JOptionPane.OK_OPTION,
                            imaInforma);

                } else {
                    aux = anterior.getLiga();
                    anterior.setLiga(aux.getLiga());
                   
                    JOptionPane.showMessageDialog(null, "El perfil ha sido eliminado correctamente", "Gestionar Pedido - S.I.C", JOptionPane.OK_OPTION,
                            imaInforma);
                }

            }
        }

    }
    
    public MetodosPerfil BuscarPerfilNomUsuario(String usuario){
    	
    	NodoPerfil auxi=cabeza;
    	MetodosPerfil perfil=null;
    	while (auxi !=null){
    		
    		if (auxi.getPerfil().getNombreusu().equals(usuario)){
    			
    			perfil = auxi.getPerfil();
    			return perfil;
    		}
    		auxi=auxi.getLiga();
    	}
    	return perfil;
    }
    
    public NodoPerfil buscarPerfil(NodoPerfil cabeza,String NumDoc){
        NodoPerfil aux, anterior = null;
        aux = cabeza;
        while (aux != null){
            if(aux.getPerfil().getNumdoc().equals(NumDoc)){
                return anterior;
            }else{
            anterior= aux;
            aux =aux.getLiga();
            
            }
        }
        return null;
    }
    
    public MetodosPerfil confirmarDatosContra(String usuario, String pregunta,String respuesta){
    	
    	NodoPerfil auxi = cabeza;
    	MetodosPerfil perfil=null;
    	while (auxi != null){
    		
    		if (auxi.getPerfil().getNombreusu().equals(usuario) && auxi.getPerfil().getPregSec().equals(pregunta) && auxi.getPerfil().getResp().equals(respuesta)){
    			
    			perfil = auxi.getPerfil();
    			return perfil;
    		}
    		auxi = auxi.getLiga();
    	}
    	return perfil;
    }
    
    }

    

