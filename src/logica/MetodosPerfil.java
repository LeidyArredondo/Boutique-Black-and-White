
package logica;

/**
 *
 * @author WINDOWS
 * 
 */
import java.util.Date;

public class MetodosPerfil {
    private String numDoc, perf, nombreUsu,contra,confContra,correo, pregSec,resp  ;

    public String getNumdoc() {
        return numDoc;
    }

    public void setNumdoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getPerf() {
        return perf;
    }

    public void setPerf(String perf) {
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
