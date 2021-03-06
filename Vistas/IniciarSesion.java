package Vistas;

import Controladores.ControladorConec;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author miguelhernandez
 */
public class IniciarSesion extends javax.swing.JFrame {

    /**
     * Creates new form IniciarSesion
     */
    public IniciarSesion() {
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color (224,255,255));
           
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_IniciarSesion = new javax.swing.JLabel();
        lbl_Usuario = new javax.swing.JLabel();
        lbl_Contraseña = new javax.swing.JLabel();
        btn_Entrar = new javax.swing.JButton();
        txt_Usuario = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        btn_Canselar = new javax.swing.JButton();
        img_Logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_IniciarSesion.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lbl_IniciarSesion.setText("Iniciar Sesión");
        getContentPane().add(lbl_IniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        lbl_Usuario.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lbl_Usuario.setText("Usuario:");
        getContentPane().add(lbl_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, 50));

        lbl_Contraseña.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lbl_Contraseña.setText("Contraseña:");
        getContentPane().add(lbl_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, 50));

        btn_Entrar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_Entrar.setText("Entrar");
        btn_Entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_EntrarMouseClicked(evt);
            }
        });
        btn_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 170, 50));

        txt_Usuario.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txt_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 300, 50));

        Password.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 300, 50));

        btn_Canselar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_Canselar.setText("Cancelar");
        btn_Canselar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CanselarMouseClicked(evt);
            }
        });
        btn_Canselar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CanselarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Canselar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 170, 50));

        img_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        getContentPane().add(img_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UsuarioActionPerformed

    private void btn_EntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EntrarMouseClicked
        
        String Usuario = txt_Usuario.getText();
        String Contraseña = new String (Password.getPassword());
        
        try{
            
            ControladorConec.getConec().establecerConexion(Usuario, Contraseña);
            Statement s = ControladorConec.getConec().getConexion().createStatement();
            s.execute( "use Veterinaria;" );//falta validar si existe la bases de datos
            //Ventana GestionNominaPciGerente GN = new
            EligeOpcion ElijeO = new EligeOpcion();
            //ventana visible
            ElijeO.setVisible(true);
            dispose();
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(this,"Usuario / Contraseña incorrecta");
        }
        catch( ClassNotFoundException e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btn_EntrarMouseClicked

    private void btn_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EntrarActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void btn_CanselarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CanselarMouseClicked
        Inicio ini = new Inicio();
        ini.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_CanselarMouseClicked

    private void btn_CanselarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CanselarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CanselarActionPerformed

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
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton btn_Canselar;
    private javax.swing.JButton btn_Entrar;
    private javax.swing.JLabel img_Logo;
    private javax.swing.JLabel lbl_Contraseña;
    private javax.swing.JLabel lbl_IniciarSesion;
    private javax.swing.JLabel lbl_Usuario;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
