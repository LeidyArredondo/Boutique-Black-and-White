
package logica;

/**
 *
 * @author WINDOWS
 * 
 */
import java.util.Date;

public class MetodosPerfil {
    private String  nombreUsu,contra,confContra,correo, pregSec,resp  ;
    private int numDoc, perf, idPerfil;

    public String getNombreUsu() {
        return nombreUsu;
    }

    public void setNombreUsu(String nombreUsu) {
        this.nombreUsu = nombreUsu;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    
    
    public int getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(int numDoc) {
        this.numDoc = numDoc;
    }

    public int getPerf() {
        return perf;
    }

    public void setPerf(int perf) {
        this.perf = perf;
    }

    public String getNombreusu() {
        return nombreUsu;
    }

    public void setNombreusu(String nombreUsu) {
        this.nombreUsu = nombreUsu;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getConfContra() {
        return confContra;
    }

    public void setConfContra(String confContra) {
        this.confContra = confContra;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPregSec() {
        return pregSec;
    }

    public void setPregSec(String pregSec) {
        this.pregSec = pregSec;
    }

    public String getResp() {
        return resp;
    }

    public void setResp(String resp) {
        this.resp = resp;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    private Date fecha ;
    
}
