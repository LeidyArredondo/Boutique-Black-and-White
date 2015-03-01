

package Utilidades;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import estructuranodo.NodoRegistroPedido;

/**
 *
 * @author leidy
 */
public class ReportePedido extends JFrame{
     
    JTable tablaPedido;
    JScrollPane scroll; // para movernos en la tabla 
      
     public ReportePedido(NodoRegistroPedido cabeza) {
        super("Reporte de Pedido"); 
        DefaultTableModel modeloPedido = null;
        String Identificadores[] = new String[12];
        String datosPedido[] = new String[12];
        int i = 0;
        Identificadores[0] = "Código Compra";
        Identificadores[1] = "Factura Compra";
        Identificadores[2] = "Fecha";
        Identificadores[3] = "Proveedor";
        Identificadores[4] = "Rut";
        Identificadores[5] = "Teléfono";
        Identificadores[6] = "Dirección";
        Identificadores[7] = "Celular";
        Identificadores[8] = "Contacto";
        Identificadores[9] = "Código Artículo";
        Identificadores[10] = "Cantidad";
        Identificadores[11] = "Valor Unitario";
        
       
        //modelo 
        modeloPedido= new DefaultTableModel();//inicializa
        for (int j = 0; j <7; j++) //añaden columnas
        {
            modeloPedido .addColumn(Identificadores[j]);
        }
        
         while ( cabeza != null) {

             datosPedido[0] = cabeza.getPedido().getCodCompr();
             datosPedido[1] = cabeza.getPedido().getFactCompra();
             datosPedido[2] = cabeza.getPedido().getFecha().toString();
             datosPedido[3] = cabeza.getPedido().getProveedor();
             datosPedido[4] = cabeza.getPedido().getRut();
             datosPedido[5] = cabeza.getPedido().getNumTel();
             datosPedido[6] = cabeza.getPedido().getDirec();
             datosPedido[7] = cabeza.getPedido().getNumMovil();
             datosPedido[8] = cabeza.getPedido().getContacto();
             datosPedido[9] = cabeza.getPedido().getCodArt();
             datosPedido[10] = cabeza.getPedido().getCantidad();
             datosPedido[11] = cabeza.getPedido().getValorUnit();
            
            modeloPedido.addRow(datosPedido);//se añade el registro al modelo
            i++;
            
            cabeza=cabeza.getLiga();

        }
         tablaPedido = new JTable(modeloPedido);//se añade el modelo a la tabla

        scroll= new JScrollPane(tablaPedido);//se añade la tabla al scroll (contenedor)
        scroll.reshape(50, 50, 800, 170);//dimensiones
        getContentPane().add(scroll);//se añade el scroll(caja) al contenedor principal(ventana)

        this.setSize(1700, 325);
        this.setVisible(true);
        repaint();
        
     }
}
     
      
      
    
    

