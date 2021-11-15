package com.mycompany.practica9diu;

import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;


/**
 *
 * @author marti
 */
public class Practica9 extends javax.swing.JFrame {


    DefaultListModel modeloTabla= new DefaultListModel();
    DefaultListModel modeloCampos= new DefaultListModel();
    int n=1;
    private EnterDB entradaDB;
    private final String serverName="I7-lab5.dis.ulpgc.es";;
    private final String databaseName="DIU_BD";
    private final String usuarioCorrecto="estudiante-DIU";
    private final String claveCorrecta="Diu_2021_22";
    private String user,pass;


    public Practica9() {
        initComponents();
        setLocationRelativeTo(null);
        passField.setEchoChar('*');
        tablasLista.setModel(modeloTabla);
        camposLista.setModel(modeloCampos);
        tablasLista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        conExitoLabel.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBtn = new javax.swing.ButtonGroup();
        passField = new javax.swing.JPasswordField();
        passLabel = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        simpleSelectBtn = new javax.swing.JToggleButton();
        unicIntervalBtn = new javax.swing.JToggleButton();
        multIntervalBtn = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablasLista = new javax.swing.JList<>();
        addBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        showBtn = new javax.swing.JButton();
        usuarioLabel = new javax.swing.JLabel();
        usuarioField = new javax.swing.JTextField();
        selectModeLabel = new javax.swing.JLabel();
        deselectBtn = new javax.swing.JButton();
        JScrollPane2 = new javax.swing.JScrollPane();
        camposLista = new javax.swing.JList<>();
        tablasLabel = new javax.swing.JLabel();
        tituloLabel = new javax.swing.JLabel();
        camposLabel = new javax.swing.JLabel();
        conExitoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        passLabel.setText("Introducir contraseña");

        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        grupoBtn.add(simpleSelectBtn);
        simpleSelectBtn.setText("Simple");
        simpleSelectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpleSelectBtnActionPerformed(evt);
            }
        });

        grupoBtn.add(unicIntervalBtn);
        unicIntervalBtn.setText("Intervalo único");
        unicIntervalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unicIntervalBtnActionPerformed(evt);
            }
        });

        grupoBtn.add(multIntervalBtn);
        multIntervalBtn.setSelected(true);
        multIntervalBtn.setText("Intervalo múltiple");
        multIntervalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multIntervalBtnActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(tablasLista);

        addBtn.setText("Añade n");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        delBtn.setText("Eliminar n");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        showBtn.setText("Ver campos");
        showBtn.setToolTipText("Campos de las tablas seleccionadas");
        showBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBtnActionPerformed(evt);
            }
        });

        usuarioLabel.setText("Introducir usuario");

        selectModeLabel.setText("Elegir modo de selección:");

        deselectBtn.setText("Eliminar selección");
        deselectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deselectBtnActionPerformed(evt);
            }
        });

        JScrollPane2.setViewportView(camposLista);

        tablasLabel.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        tablasLabel.setText("Tablas en la base de datos");

        tituloLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloLabel.setText("Visualizador Base de Datos");

        camposLabel.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        camposLabel.setText("Campos");

        conExitoLabel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        conExitoLabel.setForeground(new java.awt.Color(51, 255, 0));
        conExitoLabel.setText("¡Conectado correctamente!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(camposLabel)
                .addGap(295, 295, 295))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(simpleSelectBtn)
                            .addComponent(multIntervalBtn)
                            .addComponent(unicIntervalBtn)))
                    .addComponent(selectModeLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deselectBtn)
                    .addComponent(tablasLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(showBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(JScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(passLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(usuarioLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(usuarioField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tituloLabel))
                .addGap(18, 18, 18)
                .addComponent(loginBtn)
                .addGap(18, 18, 18)
                .addComponent(conExitoLabel)
                .addGap(179, 179, 179)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBtn)
                    .addComponent(delBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(tituloLabel)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(delBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usuarioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usuarioLabel))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loginBtn)
                            .addComponent(conExitoLabel))))
                .addGap(24, 24, 24)
                .addComponent(camposLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tablasLabel)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(selectModeLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(simpleSelectBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(unicIntervalBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(multIntervalBtn))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(showBtn)))
                        .addGap(53, 53, 53)
                        .addComponent(deselectBtn))
                    .addComponent(JScrollPane2))
                .addGap(18, 30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void loadTables(){
        try{
            ArrayList<String> tables= entradaDB.getTables();
            Iterator iter = tables.iterator();
             while(iter.hasNext()){
                modeloTabla.addElement(iter.next());
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Error al acceder al servidor"
                        , "AYUDA", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void loadFields(String[]tablasSeleccionadas){
        try {
            ArrayList<String> fields = entradaDB.getFields(tablasSeleccionadas);
            Iterator iter = fields.iterator();
            while(iter.hasNext()){
                modeloCampos.addElement(iter.next());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error al enviar la consulta"
                        , "AYUDA", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        try{
            char[] passC= passField.getPassword();
            pass=String.valueOf(passC);
            user=usuarioField.getText();
            System.out.println("Usuario: " + user +   " Contraseña: "+ String.valueOf(passC));
            entradaDB = new EnterDB(serverName, databaseName, user, pass);
            entradaDB.connectDB();
            conExitoLabel.setVisible(true);
            loadTables();
            
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(rootPane, "Error b1231312x2131241",
                     "ERROR", JOptionPane.ERROR_MESSAGE);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "El usuario o la contraseña son incorrectos.\n"
                    + "Asegúrate de que son correctos.",
                     "Error de autenticación", JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_loginBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String elemento= "Elemento" + n;
        n++;
        modeloTabla.addElement(elemento);
        modeloCampos.addElement(elemento);
    }//GEN-LAST:event_addBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        if(modeloTabla.getSize()>0){
            modeloTabla.remove(0);
        }
        
    }//GEN-LAST:event_delBtnActionPerformed

    private void showBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBtnActionPerformed
        int [] selected=tablasLista.getSelectedIndices();
        System.out.println("Posiciones seleccionadas: " + Arrays.toString(selected));
        String[] tablasSeleccionadas = new String[selected.length];
        
        for(int i=0;i<selected.length;i++){
            tablasSeleccionadas[i] = (String) modeloTabla.getElementAt(selected[i]);
        }
        //tablasLista.clearSelection();
        loadFields(tablasSeleccionadas);
    }//GEN-LAST:event_showBtnActionPerformed

    private void simpleSelectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpleSelectBtnActionPerformed
        System.out.println("Selección simple");
        tablasLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }//GEN-LAST:event_simpleSelectBtnActionPerformed

    private void unicIntervalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unicIntervalBtnActionPerformed
        System.out.println("Selección intervalo único");
        tablasLista.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

    }//GEN-LAST:event_unicIntervalBtnActionPerformed

    private void multIntervalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multIntervalBtnActionPerformed
        System.out.println("Selección intervalo múltiple");
        tablasLista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

    }//GEN-LAST:event_multIntervalBtnActionPerformed

    private void deselectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deselectBtnActionPerformed
        tablasLista.clearSelection();
        modeloCampos.removeAllElements();
    }//GEN-LAST:event_deselectBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Practica9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practica9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practica9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practica9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practica9().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPane2;
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel camposLabel;
    private javax.swing.JList<String> camposLista;
    private javax.swing.JLabel conExitoLabel;
    private javax.swing.JButton delBtn;
    private javax.swing.JButton deselectBtn;
    private javax.swing.ButtonGroup grupoBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JToggleButton multIntervalBtn;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel selectModeLabel;
    private javax.swing.JButton showBtn;
    private javax.swing.JToggleButton simpleSelectBtn;
    private javax.swing.JLabel tablasLabel;
    private javax.swing.JList<String> tablasLista;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JToggleButton unicIntervalBtn;
    private javax.swing.JTextField usuarioField;
    private javax.swing.JLabel usuarioLabel;
    // End of variables declaration//GEN-END:variables
}
