package com.mycompany.practica9diu;

import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;


/**
 *
 * @author marti
 */
public class Practica9 extends javax.swing.JFrame {


    DefaultListModel modeloTabla= new DefaultListModel();
    DefaultListModel modeloCampos= new DefaultListModel();
    int n=1;
    public Practica9() {
        initComponents();
        setLocationRelativeTo(null);
        passField.setEchoChar('*');
        tablasLista.setModel(modeloTabla);
        camposLista.setModel(modeloCampos);
        tablasLista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
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
        usuariofield = new javax.swing.JTextField();
        selectModeLabel = new javax.swing.JLabel();
        deselectBtn = new javax.swing.JButton();
        JScrollPane2 = new javax.swing.JScrollPane();
        camposLista = new javax.swing.JList<>();
        tablasLabel = new javax.swing.JLabel();
        tituloLabel = new javax.swing.JLabel();
        camposLabel = new javax.swing.JLabel();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(usuariofield, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tituloLabel))
                        .addGap(18, 18, 18)
                        .addComponent(loginBtn))
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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(showBtn))
                            .addComponent(deselectBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(tablasLabel)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(JScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(camposLabel)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBtn)
                    .addComponent(delBtn))
                .addContainerGap(92, Short.MAX_VALUE))
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
                            .addComponent(usuariofield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usuarioLabel))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(loginBtn)))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tablasLabel)
                    .addComponent(camposLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(showBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(selectModeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(simpleSelectBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(unicIntervalBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(multIntervalBtn))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                .addComponent(JScrollPane2)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deselectBtn)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        char[] pass= passField.getPassword();
        System.out.println("Contraseña: "+ String.valueOf(pass));
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
        tablasLista.clearSelection();
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
    private javax.swing.JLabel usuarioLabel;
    private javax.swing.JTextField usuariofield;
    // End of variables declaration//GEN-END:variables
}
