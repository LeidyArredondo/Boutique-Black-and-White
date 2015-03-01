

package estructuranodo;

/**
 *
 * @author WINDOWS
 */
import logica.MetodosPerfil;

public class NodoPerfil {
    private MetodosPerfil Perfil;
     private NodoPerfil Liga;
    
    public NodoPerfil(){
    
    }

    public MetodosPerfil getPerfil() {
        return Perfil;
    }

    public void setPerfil(MetodosPerfil Perfil) {
        this.Perfil = Perfil;
    }

    public NodoPerfil getLiga() {
        return Liga;
    }

    public void setLiga(NodoPerfil Liga) {
        this.Liga = Liga;
    }
    
   
    
    
    
    
    
}
