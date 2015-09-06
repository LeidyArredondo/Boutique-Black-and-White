
package black.white;

import CrudBd.CrudAsignarPerfil;
import CrudBd.CrudDependencias;
import logica.*;
import java.awt.Graphics;
import java.awt.image.AffineTransformOp;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import listas.*;
import estructuranodo.NodoPerfil;
import java.util.List;

public class LogIn extends javax.swing.JFrame {
//Prueba de git
    List<MetodosDependencias> listaPerfil;
    CrudAsignarPerfil basePerfil;
    String perfil;
    ImageIcon imaPregunta = new ImageIcon("C:\\Boutique\\src\\Imagenes\\pregun.jpg");
    ImageIcon imaInforma = new ImageIcon("C:\\Boutique\\src\\Imagenes\\iconoInfor.jpg");
    MetodosPerfil perfilValido;
    
    public LogIn() {

        initComponents();// sacamos copia a las variables q recibimos como parametros 
        this.setVisible(true);
        basePerfil = new CrudAsignarPerfil();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/simbolo del sistema.jpg")).getImage());
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labBienvenido = new javax.swing.JLabel();
        labUsuario = new javax.swing.JLabel();
        labContra = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnRecuperar = new javax.swing.JButton();
        jPasswContrase = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingreso al Sistema");
        setBackground(new java.awt.Color(255, 255, 255));

        labBienvenido.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labBienvenido.setText("BIENVENIDO A LA BOUTIQUE BLACK & WHITE");

        labUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labUsuario.setText("Usuario:");

        labContra.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labContra.setText("Contraseña:");

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(204, 204, 204));
        btnSalir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.jpg"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnAceptar.setBackground(new java.awt.Color(204, 204, 204));
        btnAceptar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceptar.jpg"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setMaximumSize(new java.awt.Dimension(90, 40));
        btnAceptar.setMinimumSize(new java.awt.Dimension(90, 40));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnRecuperar.setBackground(new java.awt.Color(204, 204, 204));
        btnRecuperar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnRecuperar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono-recuperar-clave.png"))); // NOI18N
        btnRecuperar.setText("Recuperar Contraseña");
        btnRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperarActionPerformed(evt);
            }
        });

        jPasswContrase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswContraseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labContra, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labUsuario)
                                .addGap(16, 16, 16)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(jPasswContrase)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(labBienvenido))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btnRecuperar)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPasswContrase, txtUsuario});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labContra, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPasswContrase)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRecuperar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAceptar, btnSalir});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPasswContrase, txtUsuario});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed


    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        String usuario = txtUsuario.getText();
        String pasword = new String(jPasswContrase.getPassword());
        //String Pasword=txtContra;
        if (ValidacionesCampo(usuario, pasword)) {
            MenuPerfil mP = new MenuPerfil("ADMINISTRADOR");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Este usuario no esta registrado", "Login - S.I.C.",
                JOptionPane.QUESTION_MESSAGE, imaInforma);
        }


    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        int opc;
        opc = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir ?",
                "Salir.  Sistema Integral Comercial - S.I.C", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, imaPregunta);
        if (opc == 0) {
            this.setVisible(false);

        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarActionPerformed

        this.dispose();
        new Contra();

// TODO add your handling code here:
    }//GEN-LAST:event_btnRecuperarActionPerformed

    private void jPasswContraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswContraseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswContraseActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnRecuperar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPasswordField jPasswContrase;
    private javax.swing.JLabel labBienvenido;
    private javax.swing.JLabel labContra;
    private javax.swing.JLabel labUsuario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    public boolean ValidacionesCampo(String Usuario, String Pasword) {
        boolean respuesta =false;
        perfilValido = basePerfil.consultarPerfilIngreso(Usuario, Pasword);
        if ( perfilValido != null){
            respuesta = true;
        }

        return respuesta;
    }

}
