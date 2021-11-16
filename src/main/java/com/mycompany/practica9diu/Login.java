package com.mycompany.practica9diu;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author marti
 */
public class Login extends javax.swing.JFrame {
        private EnterDB entradaDB;
        private Practica9 main;
        private final String serverName="I7-lab5.dis.ulpgc.es";;
        private final String databaseName="DIU_BD";
        private final String usuarioCorrecto="estudiante-DIU";
        private final String claveCorrecta="Diu_2021_22";
        private String user,pass;
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        passField.setEchoChar('*');
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloLabel = new javax.swing.JLabel();
        usuarioLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        usuarioField = new javax.swing.JTextField();
        passField = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloLabel.setText("Visualizador Base de Datos");

        usuarioLabel.setText("Introducir usuario");

        passLabel.setText("Introducir contraseña");

        loginBtn.setText("Conectar con el servidor");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usuarioField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(usuarioLabel)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(passLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loginBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(tituloLabel)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(tituloLabel)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usuarioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usuarioLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(loginBtn)))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        try{
            char[] passC= passField.getPassword();
            pass=String.valueOf(passC);
            user=usuarioField.getText();
            System.out.println("Usuario: " + user +   " Contraseña: "+ String.valueOf(passC));
            entradaDB = new EnterDB(serverName, databaseName, user, pass);
            entradaDB.connectDB();
            main=new Practica9(this, entradaDB, user);
            this.setVisible(false);
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(rootPane, "Error b1231312x2131241",
                "ERROR", JOptionPane.ERROR_MESSAGE);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "El usuario o la contraseña son incorrectos.\n"
                + "Asegúrate de que son correctos.",
                "Error de autenticación", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_loginBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JTextField usuarioField;
    private javax.swing.JLabel usuarioLabel;
    // End of variables declaration//GEN-END:variables
}
