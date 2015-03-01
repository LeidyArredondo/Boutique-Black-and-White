

package Utilidades;


import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import estructuranodo.NodoPerfil;
/**
 *
 * @author WINDOWS
 */
public class ReportePerfil extends JFrame{
    
    
    JTable tablaCliente;//tabla

    JScrollPane scroll;
    
     public ReportePerfil(NodoPerfil cabeza) {
        super("Reporte de Perfiles"); 
        DefaultTableModel modeloPerfil = null;
        String Identificadores[] = new String[8];
        String datosPerfil[] = new String[8];
        int i = 0;
        Identificadores[0] = "Número de Documento";
        Identificadores[1] = "Perfil";
        Identificadores[2] = "Nombre de Usuario";
        Identificadores[3] = "Contraseña";
        Identificadores[4] = "Confirmar Contraseña";
        Identificadores[5] = "Correo";
        Identificadores[6] = "Pregunta Secreta";
        Identificadores[7] = "Respuesta";
       
        //modelo 
        modeloPerfil= new DefaultTableModel();//inicializa
        for (int j = 0; j <7; j++) //añaden columnas
        {
            modeloPerfil .addColumn(Identificadores[j]);
        }

        while ( cabeza != null) {

            datosPerfil[0] = cabeza.getPerfil().getNumdoc();
            datosPerfil[1] = cabeza.getPerfil().getPerf();
            datosPerfil[2] = cabeza.getPerfil().getNombreusu();
            datosPerfil[3] = cabeza.getPerfil().getContra();
            datosPerfil[4] = cabeza.getPerfil().getConfContra();
            datosPerfil[5] = cabeza.getPerfil().getCorreo().toString();
            datosPerfil[6] = cabeza.getPerfil().getPregSec();
            datosPerfil[7] = cabeza.getPerfil().getResp();
            
            modeloPerfil.addRow(datosPerfil);//se añade el registro al modelo
            i++;
            
            cabeza=cabeza.getLiga();

        }
        tablaCliente = new JTable(modeloPerfil);//se añade el modelo a la tabla

        scroll= new JScrollPane(tablaCliente);//se añade la tabla al scroll (contenedor)
        scroll.reshape(50, 50, 800, 170);//dimensiones
        getContentPane().add(scroll);//se añade el scroll(caja) al contenedor principal(ventana)

        this.setSize(1700, 325);
        this.setVisible(true);
        repaint();
    }
    
}

