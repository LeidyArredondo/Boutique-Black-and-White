

package Utilidades;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import estructuranodo.NodoCliente;
/**
 *
 * @author leidy
 */
public class ReporteCliente extends JFrame{
    
    JTable tablaCliente;//tabla

    JScrollPane scroll;

    public ReporteCliente(NodoCliente cabeza) {
        super("Reporte de Clientes"); 
        DefaultTableModel modeloCliente = null;
        String Identificadores[] = new String[13];
        String datosCliente[] = new String[13];
        int i = 0;
        Identificadores[0] = "Tipo Documento";
        Identificadores[1] = "Número Documento";
        Identificadores[2] = "Nombre";
        Identificadores[3] = "Apellido";
        Identificadores[4] = "Género";
        Identificadores[5] = "Fecha Nacimiento";
        Identificadores[6] = "Departamento";
        Identificadores[7] = "Municipio";
        Identificadores[8] = "Dirección";
        Identificadores[9] = "Teléfono Fijo";
        Identificadores[10] = "Correo Electrónico";
        Identificadores[11] = "Móvil";
        Identificadores[12] = "Ruta Imagen";

        //modelo 
        modeloCliente= new DefaultTableModel();//inicializa
        for (int j = 0; j <12; j++) //añaden columnas
        {
            modeloCliente.addColumn(Identificadores[j]);
        }

        while ( cabeza != null) {

            datosCliente[0] = cabeza.getCliente().getTipo();
            datosCliente[1] = cabeza.getCliente().getDocumen();
            datosCliente[2] = cabeza.getCliente().getNombre();
            datosCliente[3] = cabeza.getCliente().getApellido();
            datosCliente[4] = cabeza.getCliente().getGenero();
            datosCliente[5] = cabeza.getCliente().getFechaNac().toString();
            datosCliente[6] = cabeza.getCliente().getDeparta();
            datosCliente[7] = cabeza.getCliente().getMunici();
            datosCliente[8] = cabeza.getCliente().getDirec();
            datosCliente[9] = cabeza.getCliente().getTele();
            datosCliente[10] = cabeza.getCliente().getCorreo();
            datosCliente[11] = cabeza.getCliente().getCel();
            datosCliente[12] = cabeza.getCliente().getRutaImagen();

            modeloCliente.addRow(datosCliente);//se añade el registro al modelo
            i++;
            
            cabeza=cabeza.getLiga();

        }
        tablaCliente = new JTable(modeloCliente);//se añade el modelo a la tabla

        scroll= new JScrollPane(tablaCliente);//se añade la tabla al scroll (contenedor)
        scroll.reshape(50, 50, 1100, 170);//dimensiones
        getContentPane().add(scroll);//se añade el scroll(caja) al contenedor principal(ventana)

        this.setSize(1700, 325);
        this.setVisible(true);
        repaint();
    }
    
}
