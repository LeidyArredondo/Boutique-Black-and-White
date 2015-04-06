package listas;

import estructuranodo.NodoPerfil;
import logica.MetodosPerfil;

public class ListaPerfil {

    private NodoPerfil cabeza;

    public ListaPerfil() {
        cabeza = null;
    }

    public NodoPerfil getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoPerfil cabeza) {
        this.cabeza = cabeza;
    }

    public boolean guardarPerfil(MetodosPerfil perfil) {
        NodoPerfil nuevo, ultimo;

        nuevo = new NodoPerfil();
        nuevo.setPerfil(perfil);

        if (cabeza == null) {
            nuevo.setLiga(null);
            cabeza = nuevo;

        } else {
            ultimo = buscarUltimo(cabeza);
            nuevo.setLiga(ultimo.getLiga());
            ultimo.setLiga(nuevo);
        }
        return true;
    }

    public NodoPerfil buscarUltimo(NodoPerfil primero) {
        while (primero.getLiga() != null) {
            primero = primero.getLiga();

        }
        return primero;

    }

    public boolean guardarModificacionPerfil(MetodosPerfil perfil) {
        NodoPerfil auxiliar = cabeza;

        while (auxiliar != null) {
            if (auxiliar.getPerfil().getNumdoc().equals(perfil.getNumdoc())) {
                auxiliar.setPerfil(perfil);
                return true;
            } else {
                auxiliar = auxiliar.getLiga();

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
    
     public boolean siExisteUsuario(String usuario) {
        NodoPerfil auxiliar = cabeza;

        while (auxiliar != null) {
            if (auxiliar.getPerfil().getPerf().equals(usuario)) {
                return true;

            } else {
                auxiliar = auxiliar.getLiga();
            }
        }
        return false;
    }

     public boolean siExisteContra(String contraseña) {
        NodoPerfil auxiliar = cabeza;

        while (auxiliar != null) {
            if (auxiliar.getPerfil().getContra().equals(contraseña)) {
                return true;

            } else {
                auxiliar = auxiliar.getLiga();
            }
        }
        return false;
    }

    public boolean eliminarPerfil(String NumDoc) {
        NodoPerfil anterior, aux;

        if (cabeza == null) {

            return false;
        } else {
            if (cabeza.getPerfil().getNumdoc().equals(NumDoc)) {

                cabeza = cabeza.getLiga();

                return true;
            } else {
                anterior = buscarPerfil(cabeza, NumDoc);
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

    public MetodosPerfil BuscarPerfilNomUsuario(String usuario) {

        NodoPerfil auxi = cabeza;
        MetodosPerfil perfil = null;
        while (auxi != null) {

            if (auxi.getPerfil().getNombreusu().equals(usuario)) {

                perfil = auxi.getPerfil();
                return perfil;
            }
            auxi = auxi.getLiga();
        }
        return perfil;
    }

    public NodoPerfil buscarPerfil(NodoPerfil cabeza, String NumDoc) {
        NodoPerfil aux, anterior = null;
        aux = cabeza;
        while (aux != null) {
            if (aux.getPerfil().getNumdoc().equals(NumDoc)) {
                return anterior;
            } else {
                anterior = aux;
                aux = aux.getLiga();

            }
        }
        return null;
    }

    public MetodosPerfil confirmarDatosContra(String usuario, String pregunta, String respuesta) {

        NodoPerfil auxi = cabeza;
        MetodosPerfil perfil = null;
        while (auxi != null) {

            if (auxi.getPerfil().getNombreusu().equals(usuario) && auxi.getPerfil().getPregSec().equals(pregunta) && auxi.getPerfil().getResp().equals(respuesta)) {

                perfil = auxi.getPerfil();
                return perfil;
            }
            auxi = auxi.getLiga();
        }
        return perfil;
    }

}
