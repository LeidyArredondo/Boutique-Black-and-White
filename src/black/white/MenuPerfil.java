
package black.white;

import listas.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import listas.*;
import javax.swing.ImageIcon;
import Utilidades.ReportePerfiles;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;


public class MenuPerfil extends JFrame implements ActionListener {

    JMenuBar MenuBarPPal;
    JMenu menuRegistrol, menuVentas, menuAyudas,menuReportes;
    JMenuItem menItemPersonal, menItemPerfil, menItemModContra, menItemCliente, menItemSalir, menItemPedidos, menItemOrdenVenta, menItemGesFactura;
    JMenuItem menItemAcercade, menItemGesPedido, menuItemGesDevu, menItemManual, menuItemReporte;
    ImageIcon imaPregunta = new ImageIcon("C:\\Users\\leidy\\Documents\\NetBeansProjects\\Black&White\\src\\Imagenes\\pregun.jpg");
    Image icoCabecera;
    ImageIcon iconFondo;
    JLabel labelFondo;
    int sw = 0, control;
    ListaCliente listaCliente;
    ListaPerfil listaPerfil;
    ListaRegistroPersonal listaRegistroPersonal;   //declaramos unas variables globales de la clase
    ListeRegistroPedido listeRegistroPedido;
    private LogIn LogIn;
    ReportePerfiles reportes;

    public MenuPerfil(ListaCliente listaClien, ListeRegistroPedido listeRegistroPedi, ListaPerfil listaPerf, ListaRegistroPersonal listaRegistroPerso, String perfil) {

        super("Menú " + perfil);
        this.setBounds(10, 10, 1350, 710);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//DETENER LA EJECUCIÓN CUANDO CIERRE
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/simbolo del sistema.jpg")).getImage());
        this.setResizable(false);
        //  this.setIconImage(icoCabecera);
        this.setVisible(true);

        iconFondo = new ImageIcon("C:\\Users\\leidy\\Documents\\NetBeansProjects\\Black&White\\src\\Imagenes\\FondoBou_1.jpg");
        ImageIcon imagenClie = new ImageIcon("C:\\Users\\leidy\\Documents\\NetBeansProjects\\Black&White\\src\\Imagenes\\clientes.jpg");
        ImageIcon imagenPer = new ImageIcon("C:\\Users\\leidy\\Documents\\NetBeansProjects\\Black&White\\src\\Imagenes\\iconopersonal.jpg");
        ImageIcon imagenAsigPer = new ImageIcon("C:\\Users\\leidy\\Documents\\NetBeansProjects\\Black&White\\src\\Imagenes\\cliente.jpg");
        ImageIcon imagenPedi = new ImageIcon("C:\\Users\\leidy\\Documents\\NetBeansProjects\\Black&White\\src\\Imagenes\\pedidos.jpg");
        ImageIcon imagenReg = new ImageIcon("C:\\Users\\leidy\\Documents\\NetBeansProjects\\Black&White\\src\\Imagenes\\Registro.jpg");
        ImageIcon imagenSa = new ImageIcon("C:\\Users\\leidy\\Documents\\NetBeansProjects\\Black&White\\src\\Imagenes\\salir.jpg");
        ImageIcon imagenModC = new ImageIcon("C:\\Users\\leidy\\Documents\\NetBeansProjects\\Black&White\\src\\Imagenes\\modificarCon.jpg");
        ImageIcon imagenGesV = new ImageIcon("C:\\Users\\leidy\\Documents\\NetBeansProjects\\Black&White\\src\\Imagenes\\iconoventas.jpg");
        ImageIcon imagenFac = new ImageIcon("C:\\Users\\leidy\\Documents\\NetBeansProjects\\Black&White\\src\\Imagenes\\iconofactura.jpg");
        ImageIcon imagenOrden = new ImageIcon("C:\\Users\\leidy\\Documents\\NetBeansProjects\\Black&White\\src\\Imagenes\\iconoordenv.jpg");
        ImageIcon imagenDev = new ImageIcon("C:\\Users\\leidy\\Documents\\NetBeansProjects\\Black&White\\src\\Imagenes\\iconodev.jpg");
        ImageIcon imagenAyud = new ImageIcon("C:\\Users\\leidy\\Documents\\NetBeansProjects\\Black&White\\src\\Imagenes\\iconoayuda.jpg");
        ImageIcon imagenAcer = new ImageIcon("C:\\Users\\leidy\\Documents\\NetBeansProjects\\Black&White\\src\\Imagenes\\iconoacercade.jpg");
        ImageIcon imagenMan = new ImageIcon("C:\\Users\\leidy\\Documents\\NetBeansProjects\\Black&White\\src\\Imagenes\\iconomanual.jpg");
        ImageIcon imagenRep = new ImageIcon("C:\\Users\\leidy\\Documents\\NetBeansProjects\\Black&White\\src\\Imagenes\\iconoreporte.jpg");

        labelFondo = new JLabel(iconFondo);
        labelFondo.setBounds(0, 0, 1350, 700);
        this.getContentPane().add(labelFondo);
        labelFondo.setVisible(true);

        MenuBarPPal = new JMenuBar();
        this.setJMenuBar(MenuBarPPal);

        if (perfil.equals("ADMINISTRADOR")) {

            control = 1;
        } else {

            if (perfil.equals("VENDEDOR")) {

                control = 2;
            } else {

                control = 3;
            }
        }

        switch (control) {

            case 1:
                menuRegistrol = new JMenu("Gestionar Registros");
                menuRegistrol.setIcon(imagenReg);
                MenuBarPPal.add(menuRegistrol);
                menItemPersonal = new JMenuItem("Registrar Personal");
                menItemPersonal.setIcon(imagenPer);
                menuRegistrol.add(menItemPersonal);
                menItemPersonal.addActionListener(this);
                menItemPerfil = new JMenuItem("Asignar Perfil");
                menItemPerfil.setIcon(imagenAsigPer);
                menuRegistrol.add(menItemPerfil);
                menItemPerfil.addActionListener(this);
                menItemCliente = new JMenuItem("Registrar Cliente");
                menItemCliente.setIcon(imagenClie);
                menuRegistrol.add(menItemCliente);
                menItemCliente.addActionListener(this);
                menItemModContra = new JMenuItem("Modificar Contraseña");
                menItemModContra.setIcon(imagenModC);
                menuRegistrol.add(menItemModContra);
                menItemModContra.addActionListener(this);
                menItemSalir = new JMenuItem("Salir");
                menItemSalir.setIcon(imagenSa);
                menuRegistrol.add(menItemSalir);
                menItemSalir.addActionListener(this);

                menuVentas = new JMenu("Gestionar Ventas");
                menuVentas.setIcon(imagenGesV);
                MenuBarPPal.add(menuVentas);
                menItemGesPedido = new JMenuItem("Gestionar Pedidos");
                menItemGesPedido.setIcon(imagenPedi);
                menuVentas.add(menItemGesPedido);
                menItemGesPedido.addActionListener(this);

                menItemGesFactura = new JMenuItem("Gestionar Factura");
                menItemGesFactura.setIcon(imagenFac);
                menuVentas.add(menItemGesFactura);
                menItemGesFactura.addActionListener(this);
                menItemOrdenVenta = new JMenuItem("Orden deVenta");
                menItemOrdenVenta.setIcon(imagenOrden);
                menuVentas.add(menItemOrdenVenta);
                menItemOrdenVenta.addActionListener(this);
                menuItemGesDevu = new JMenuItem("Gestionar Devoluciones");
                menuItemGesDevu.setIcon(imagenDev);
                menuVentas.add(menuItemGesDevu);
                menuItemGesDevu.addActionListener(this);
                
                menuReportes = new JMenu("Reportes");
                menuReportes.setIcon(imagenRep);
                MenuBarPPal.add(menuReportes);
                menuItemReporte = new JMenuItem("Reporte");
                menuItemReporte.setIcon(imagenRep);
                menuReportes.add(menuItemReporte);
                menuItemReporte.addActionListener(this);

                menuAyudas = new JMenu("Ayuda");
                menuAyudas.setIcon(imagenAyud);
                MenuBarPPal.add(menuAyudas);
                menItemManual = new JMenuItem("Manual de Usuario");
                menItemManual.setIcon(imagenMan);
                menItemManual.addActionListener(this);
                menuAyudas.add(menItemManual);
                menItemAcercade = new JMenuItem("Acerca de");
                menItemAcercade.setIcon(imagenAcer);
                menItemAcercade.addActionListener(this);
                menuAyudas.add(menItemAcercade);
                
                break;
            case 2:

                menuRegistrol = new JMenu("Gestionar Registros");
                menuRegistrol.setIcon(imagenReg);
                MenuBarPPal.add(menuRegistrol);
                menItemSalir = new JMenuItem("Salir");
                menItemSalir.setIcon(imagenSa);
                menuRegistrol.add(menItemSalir);
                menItemSalir.addActionListener(this);

                menuVentas = new JMenu("Gestionar Ventas");
                menuVentas.setIcon(imagenGesV);
                MenuBarPPal.add(menuVentas);
                menItemGesPedido = new JMenuItem("Gestionar Pedidos");
                menItemGesPedido.setIcon(imagenPedi);
                menuVentas.add(menItemGesPedido);
                menItemGesPedido.addActionListener(this);

                menItemGesFactura = new JMenuItem("Gestionar Factura");
                menItemGesFactura.setIcon(imagenFac);
                menuVentas.add(menItemGesFactura);
                menItemGesFactura.addActionListener(this);
                menItemOrdenVenta = new JMenuItem("Orden de Venta");
                menItemOrdenVenta.setIcon(imagenOrden);
                menuVentas.add(menItemOrdenVenta);
                menItemOrdenVenta.addActionListener(this);
                menuItemGesDevu = new JMenuItem("Gestionar Devoluciones");
                menuItemGesDevu.setIcon(imagenDev);
                menuVentas.add(menuItemGesDevu);
                menuItemGesDevu.addActionListener(this);

                menuAyudas = new JMenu("Ayuda");
                menuAyudas.setIcon(imagenAyud);
                MenuBarPPal.add(menuAyudas);
                menItemManual = new JMenuItem("Manual de Usuario");
                menItemManual.setIcon(imagenMan);
                menItemManual.addActionListener(this);
                menuAyudas.add(menItemManual);
                menItemAcercade = new JMenuItem("Acerca de");
                menItemAcercade.setIcon(imagenAcer);
                menItemAcercade.addActionListener(this);
                menuAyudas.add(menItemAcercade);
                break;
            case 3:

                menuAyudas = new JMenu("Ayuda");
                menuAyudas.setIcon(imagenAyud);
                MenuBarPPal.add(menuAyudas);
                menItemManual = new JMenuItem("Manual de Usuario");
                menItemManual.setIcon(imagenMan);
                menItemManual.addActionListener(this);
                menuAyudas.add(menItemManual);
                break;

        }

        this.listaCliente = listaClien;
        this.listeRegistroPedido = listeRegistroPedi;
        this.listaPerfil = listaPerf;
        this.listaRegistroPersonal = listaRegistroPerso;
        reportes= new ReportePerfiles();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == menItemPersonal) {

            GestionarPersonal GPe = new GestionarPersonal(listaRegistroPersonal);

        }

        if (e.getSource() == menItemPerfil) {

            GestionarPerfil gPer = new GestionarPerfil(listaPerfil, listaRegistroPersonal);

        }

        if (e.getSource() == menItemCliente) {

            Clientes c = new Clientes(listaCliente);

        }

        if (e.getSource() == menItemGesPedido) {

            Pedido p = new Pedido(listeRegistroPedido);

        }

        if (e.getSource() == menItemAcercade) { 

            Acerca a = new Acerca();

        }
        
          if (e.getSource() == menuItemReporte) {

            String TablaR = "Perfiles";
            String Campo = "Registro";
            reportes.crearInformeTabla(TablaR, Campo, listaPerfil);

        }

             if (e.getSource() == menItemManual) {

         try {

         File path = new File("src\\Manual de Usuario.pdf");

         Desktop.getDesktop().open(path);
         //Ventana.hide();

         } catch (IOException ex) {

         JOptionPane.showMessageDialog(null, "No fué posible cargar el manual");
         }
         }
             
        if (e.getSource() == menItemSalir) {
            int opc;
            opc = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir del menú principal?",
                    "Salir.  Sistema Integral Comercial - S.I.C.", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, imaPregunta);
            if (opc == 0) {
                this.dispose();
                LogIn = new LogIn(listaCliente, listeRegistroPedido, listaPerfil, listaRegistroPersonal);

            }
        }

        /*       if (e.getSource() == menItemAcerca) {

         AcercaDe Ad = new AcercaDe();
         }*/
    }

}
