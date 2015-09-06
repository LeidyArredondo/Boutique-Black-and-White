

package Utilidades;

import CrudBd.CrudEmpleados;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import estructuranodo.NodoRegistroPersonal;
import java.util.List;
import logica.Metodos;

/**
 *
 * @author leidy
 */
public class ReportePersonal  extends JFrame{
             
    JTable tablaPersonal;//tabla

    JScrollPane scroll;
    List<Metodos> listaEmpleados;
    CrudEmpleados baseEmpleado;
    
        public ReportePersonal() {
        super("Reporte de Personal"); 
        DefaultTableModel modeloPersonal = null;
        String Identificadores[] = new String[16];
        String datosPersonal[] = new String[16];
        int i = 0;
        baseEmpleado = new CrudEmpleados();
        
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
        for (int j = 0; j <15; j++) //añaden columnas
        {
            modeloPersonal .addColumn(Identificadores[j]);
        }
    
        listaEmpleados = baseEmpleado.cargarEmpleado();
        
            for (Metodos empleado : listaEmpleados) {
                datosPersonal[0] = String.valueOf(empleado.getTipoDocumento());
                datosPersonal[1] = String.valueOf(empleado.getIdEmpleado());
                datosPersonal[2] = empleado.getNombre();
                datosPersonal[3] = empleado.getFechaNaci().toString();
                datosPersonal[4] = String.valueOf(empleado.getDepartamento());
                datosPersonal[5] = String.valueOf(empleado.getMunicipio());
                datosPersonal[6] = String.valueOf(empleado.getSangre());
                datosPersonal[7] = String.valueOf(empleado.getRh());
                datosPersonal[8] = empleado.getDireccion();
                datosPersonal[9] = empleado.getBarrio();
                datosPersonal[10] = empleado.getPrimerApelli();
                datosPersonal[11] = empleado.getSegundoApelli();
                datosPersonal[12] = empleado.getCorreo();
                datosPersonal[13] = String.valueOf(empleado.getCargo());
                datosPersonal[14] = empleado.getFechaContrat().toString();
                datosPersonal[15] = String.valueOf(empleado.getContrato());
                
                modeloPersonal.addRow(datosPersonal);//se añade el registro al modelo
            i++;
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
