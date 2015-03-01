

package Utilidades;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import estructuranodo.NodoRegistroPersonal;

/**
 *
 * @author leidy
 */
public class ReportePersonal  extends JFrame{
             
    JTable tablaPersonal;//tabla

    JScrollPane scroll;
    
        public ReportePersonal(NodoRegistroPersonal cabeza) {
        super("Reporte de Personal"); 
        DefaultTableModel modeloPersonal = null;
        String Identificadores[] = new String[16];
        String datosPersonal[] = new String[16];
        int i = 0;
        
            Identificadores[0] = "Tipo de Documento ";
            Identificadores[1] = "Número Documento ";
            Identificadores[2] = "Nombre y Apellido";
            Identificadores[3] = "Fecha Nacimiento";
            Identificadores[4] = "Departamento";
            Identificadores[5] = "Municipio";
            Identificadores[6] = "Tipo de Sangre";
            Identificadores[7] = "Tipo RH";
            Identificadores[8] = "Dirección ";
            Identificadores[9] = "Barrio";
            Identificadores[10] = "Teléfono Fijo";
            Identificadores[11] = "Teléfono Móvil";
            Identificadores[12] = "Correo Electrónico";
            Identificadores[13] = "Cargo";
            Identificadores[14] = "Fecha Contratación";
            Identificadores[15] = "Tipo de contrato";
            

        //modelo 
        modeloPersonal= new DefaultTableModel();//inicializa
        for (int j = 0; j <7; j++) //añaden columnas
        {
            modeloPersonal .addColumn(Identificadores[j]);
        }
    
            while ( cabeza != null) {

                datosPersonal[0] = cabeza.getPersonal().getTipodeDocumento();
                datosPersonal[1] = cabeza.getPersonal().getDocumento();
                datosPersonal[2] = cabeza.getPersonal().getNombreCompleto();
                datosPersonal[3] = cabeza.getPersonal().getFechadeNacimiento().toString();
                datosPersonal[4] = cabeza.getPersonal().getDepartamento();
                datosPersonal[5] = cabeza.getPersonal().getCiudaddeNacimiento();
                datosPersonal[6] = cabeza.getPersonal().getTipodeSangre();
                datosPersonal[7] = cabeza.getPersonal().getFactorRH();
                datosPersonal[8] = cabeza.getPersonal().getDirecciondeResidencia();
                datosPersonal[9] = cabeza.getPersonal().getBarrio();
                datosPersonal[10] = cabeza.getPersonal().getTelefonoFijo();
                datosPersonal[11] = cabeza.getPersonal().getTelefonoMovil();
                datosPersonal[12] = cabeza.getPersonal().getCorreoElectronico().toString();
                datosPersonal[13] = cabeza.getPersonal().getCargo();
                datosPersonal[14] = cabeza.getPersonal().getFecha_Contra().toString();
                datosPersonal[15] = cabeza.getPersonal().getTipodeContrato();

             
            
            modeloPersonal.addRow(datosPersonal);//se añade el registro al modelo
            i++;
            
            cabeza=cabeza.getLiga();

        }
            
        tablaPersonal = new JTable(modeloPersonal);//se añade el modelo a la tabla

        scroll= new JScrollPane(tablaPersonal);//se añade la tabla al scroll (contenedor)
        scroll.reshape(50, 50, 800, 170);//dimensiones
        getContentPane().add(scroll);//se añade el scroll(caja) al contenedor principal(ventana)

        this.setSize(1700, 325);
        this.setVisible(true);
        repaint();
    
    
}
}
