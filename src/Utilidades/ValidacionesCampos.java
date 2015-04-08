package Utilidades;

import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ValidacionesCampos {
    
    ImageIcon imaInforma = new ImageIcon("C:\\Boutique\\src\\Imagenes\\iconoInfor.jpg");    
    int[] controlContra = new int[4];

    public void validarLongitud(int l, JTextField j, java.awt.event.KeyEvent e) {

        if (j.getText().length() == l) {
            e.consume();
        }

    }

    public void soloNumeros(JTextField j, java.awt.event.KeyEvent e) {
        char caracter = e.getKeyChar();//lee el caracter presionado
        int numero = (int) (caracter);
        if (numero == 10)//para activar letra enter
        {
            j.requestFocus();
        }
        if (((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE) && (numero != 32)) {
            e.consume();  // ignorar el evento de teclado
        }
    }

    public void soloLetras(JTextField j, java.awt.event.KeyEvent e) {
        char caracter = e.getKeyChar(); // para leer el caracter correspondiente a la tecla
        int numero = (int) (caracter);
        if (numero == 10)// PARA LA TECLA ENTER
        {
            j.requestFocus();
        }
        if (((caracter < 'A') || (caracter > 'Z')) && ((caracter < 'a') || (caracter > 'z')) && (caracter != KeyEvent.VK_BACK_SPACE) && (numero != 32)) {
            e.consume();  // ignorar el evento de teclado
        }
    }

    public void Obligatorios(JTextField j, java.awt.event.KeyEvent e) {
        char caracter = e.getKeyChar();
        int num = (int) (caracter);
        if (num == KeyEvent.VK_ENTER) {
            if (j.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Este Campo es Obligatorio");
                j.requestFocus();
            }
        }
    }
    
    public void validarObligatorios(JTextField validar, String ventana){
        
        if(validar.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Este campo es obligatorio",ventana,JOptionPane.YES_OPTION,imaInforma);
            validar.requestFocusInWindow();
        }
    }
    
     public void validarObligatoriosPass(JPasswordField validar, String ventana){
        
        if(validar.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Este campo es obligatorio",ventana,JOptionPane.YES_OPTION,imaInforma);
            validar.requestFocusInWindow();
        }
    }

    public boolean validarContraseñ(String contra) {    //recibimos en una variable la contra y un vector para guardar las validaciones
        
        int sum = 0, j, i;    //
        int numero, tama = contra.length();
        this.inicializarVector(controlContra);
        for (j = 0; j < (tama - 1); j++) {
            numero = (int) (contra.charAt(j));
            if ((numero > 32 && numero < 40) || (numero > 41 && numero < 48) || (numero > 57 && numero < 65)) {//validamos q contenga 1 caracter especial

                controlContra[0] = 1;
            } else {
                if ((numero > 47 && numero < 58)) {  //validamos q contenga 1 numero

                    controlContra[1] = 2;
                } else {

                    if ((numero > 64 && numero < 91)) {  //validamos q contenga una mayuscula

                        controlContra[2] = 3;
                    } else {
                        if ((numero > 96 && numero < 123)) {  //validamos que contenga una minuscula

                            controlContra[3] = 4;
                        }
                    }
                }
            }
        }
        for (i = 0; i < 4; i++) {

            sum = sum + controlContra[i];
        }
        if (sum == 10 && tama > 7) {

            return true;
        } else {

            return false;
        }
    }
    
    public void inicializarVector(int[] controlV) {    //inicializamos el vector que nos controla la validacion de la contraseña en 0

        for (int j = 0; j < controlV.length; j++) {
            controlV[j] = 0;
        }
    }

    public boolean validaFecha(JDateChooser fecha) {

        if (fecha.getDate().after(new Date())) {
            return true;
        }
        return false;
    }

    public  boolean validarEmail(String email) {

        // Establecer el patron
        Pattern p = Pattern.compile("[-\\w\\.]+@\\w+\\.\\w+");

        // Asociar el string al patron
        Matcher m = p.matcher(email);

        // Comprobar si encaja
        return m.matches();

    }

}
