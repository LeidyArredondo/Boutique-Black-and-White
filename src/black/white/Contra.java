package black.white;

import Utilidades.*;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logica.MetodosPerfil;
import Utilidades.ValidacionesCampos;
import listas.*;

public class Contra extends javax.swing.JFrame {

    String tipoMensaje = "Recuperar contraseña";
    String mensaje = "Se envió un mensaje a su correo ";
    EnviarEmail email;
    MetodosPerfil perfil;
    ListaPerfil listaPer;
    ListaRegistroPersonal listaPerso;
    ListaCliente listaCliente;
    ListeRegistroPedido listaPedido;
    String correo, nombre, usuario, clave;
    int sw = 0;
    ValidacionesCampos v = new ValidacionesCampos();
     ImageIcon imaPregunta = new ImageIcon("C:\\Boutique\\src\\Imagenes\\pregun.jpg");
    ImageIcon imaInforma = new ImageIcon("C:\\Boutique\\src\\Imagenes\\iconoInfor.jpg");
    

    public Contra(ListaCliente listaClien, ListeRegistroPedido listaRegistroPedi, ListaPerfil listaPerf, ListaRegistroPersonal listaRegistroPerso) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        //   setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono-recuperar-clave.jpg")).getImage());
        this.listaPer = listaPerf;
        this.listaPerso = listaRegistroPerso;
        this.listaCliente = listaClien;
        this.listaPedido = listaRegistroPedi;
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono-recuperar-clave.png")).getImage() );
    }

    private Contra() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labNombreUsuario = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        labReCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        labPregunta = new javax.swing.JLabel();
        cmbPregunta = new javax.swing.JComboBox();
        labRespuesta = new javax.swing.JLabel();
        txtRespuesta = new javax.swing.JTextField();
        labObli = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recuperar Contraseña");

        labNombreUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labNombreUsuario.setText("Nombre de Usuario(*):");

        txtNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioActionPerformed(evt);
            }
        });

        labReCorreo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labReCorreo.setText("Correo Electrónico(*):");

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCorreoKeyPressed(evt);
            }
        });

        labPregunta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labPregunta.setText("Pregunta Secreta (*):");

        cmbPregunta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbPregunta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Color Favorito", "Nombre de Mascota", "Mejor Amigo de la Infancia" }));

        labRespuesta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labRespuesta.setText("Respuesta (*):");

        txtRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRespuestaActionPerformed(evt);
            }
        });

        labObli.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labObli.setForeground(new java.awt.Color(255, 0, 0));
        labObli.setText("Los Campos marcados con (*) son Obligatorios");

        btnAceptar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceptar.jpg"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.jpg"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labObli)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labReCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombreUsuario)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRespuesta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(labObli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labReCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUsuarioActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRespuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespuestaActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        if (evt.getSource() == btnAceptar) {

            String pregu = (String) cmbPregunta.getSelectedItem();
            perfil = listaPer.confirmarDatosContra(txtNombreUsuario.getText(), pregu, txtRespuesta.getText());
            this.llenarDatosCorreo(perfil);
            if (sw == 1) {

                email = new EnviarEmail(correo, nombre, usuario, clave, tipoMensaje, mensaje);
                sw = 0;
            }
        }

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        int opc;
        opc = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir ?",
                "Salir.  Sistema Integral Comercial - S.I.C.", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, imaPregunta);
        if (opc == 0) {
            this.dispose();
            LogIn l = new LogIn(listaCliente, listaPedido, listaPer, listaPerso);

        }

// TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtCorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyPressed

        if (evt.getSource() == txtCorreo && evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (!v.validarEmail(txtCorreo.getText())) {

                JOptionPane.showMessageDialog(null, "No corresponde a un correo electrónico", "Recuperar Contraseña - S.I.C.", 
                                                                         JOptionPane.OK_OPTION, imaInforma);
                txtCorreo.requestFocus();
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Contra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cmbPregunta;
    private javax.swing.JLabel labNombreUsuario;
    private javax.swing.JLabel labObli;
    private javax.swing.JLabel labPregunta;
    private javax.swing.JLabel labReCorreo;
    private javax.swing.JLabel labRespuesta;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtRespuesta;
    // End of variables declaration//GEN-END:variables

    public void llenarDatosCorreo(MetodosPerfil perfi) {

        if (perfi != null) {

            this.correo = perfi.getCorreo();
            this.nombre = listaPerso.capturarNombre(perfi.getNumdoc());
            this.usuario = perfi.getNombreusu();
            this.clave = perfi.getContra();
            sw = 1;
        } else {

            JOptionPane.showMessageDialog(null, "Datos incorrectos", "Recuperar Contraseña - S.I.C.",
                                                                    JOptionPane.OK_OPTION, imaInforma);
            txtNombreUsuario.requestFocus();
        }
    }

}
