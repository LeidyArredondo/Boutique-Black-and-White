
package logica;

/**
 *
 * @author WINDOWS
 * 
 */
import java.util.Date;

public class MetodosPerfil {
    private String Numdoc, Perf, Nombreusu,Contra,ConfContra,Correo, PregSec,Resp  ;

    public String getNumdoc() {
        return Numdoc;
    }

    public void setNumdoc(String Numdoc) {
        this.Numdoc = Numdoc;
    }

    public String getPerf() {
        return Perf;
    }

    public void setPerf(String Perf) {
        this.Perf = Perf;
    }

    public String getNombreusu() {
        return Nombreusu;
    }

    public void setNombreusu(String Nombreusu) {
        this.Nombreusu = Nombreusu;
    }

    public String getContra() {
        return Contra;
    }

    public void setContra(String Contra) {
        this.Contra = Contra;
    }

    public String getConfContra() {
        return ConfContra;
    }

    public void setConfContra(String ConfContra) {
        this.ConfContra = ConfContra;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getPregSec() {
        return PregSec;
    }

    public void setPregSec(String PregSec) {
        this.PregSec = PregSec;
    }

    public String getResp() {
        return Resp;
    }

    public void setResp(String Resp) {
        this.Resp = Resp;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    private Date Fecha ;
    
}
