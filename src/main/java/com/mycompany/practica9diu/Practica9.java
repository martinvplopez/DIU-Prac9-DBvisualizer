package com.mycompany.practica9diu;

import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
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
    private JFrame login;
    public Practica9(JFrame login, EnterDB entradaDB, String user) {
        initComponents();
        this.setVisible(true);
        setLocationRelativeTo(null);
        this.entradaDB=entradaDB;
        labelUsuarioConectado.setText("Conectado como: "+ user );
        this.login=login;
        tablasLista.setModel(modeloTabla);
        camposLista.setModel(modeloCampos);
        tablasLista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        loadTables();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBtn = new javax.swing.ButtonGroup();
        simpleSelectBtn = new javax.swing.JToggleButton();
        unicIntervalBtn = new javax.swing.JToggleButton();
        multIntervalBtn = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablasLista = new javax.swing.JList<>();
        showBtn = new javax.swing.JButton();
        selectModeLabel = new javax.swing.JLabel();
        deselectBtn = new javax.swing.JButton();
        JScrollPane2 = new javax.swing.JScrollPane();
        camposLista = new javax.swing.JList<>();
        tablasLabel = new javax.swing.JLabel();
        tituloLabel = new javax.swing.JLabel();
        camposLabel = new javax.swing.JLabel();
        labelUsuarioConectado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        showBtn.setText("Ver campos");
        showBtn.setToolTipText("Campos de las tablas seleccionadas");
        showBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBtnActionPerformed(evt);
            }
        });

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

        labelUsuarioConectado.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(tituloLabel)
                        .addGap(114, 114, 114)
                        .addComponent(labelUsuarioConectado, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(tablasLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(simpleSelectBtn)
                                            .addComponent(multIntervalBtn)
                                            .addComponent(unicIntervalBtn)))
                                    .addComponent(selectModeLabel))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(showBtn))
                                    .addComponent(deselectBtn))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(camposLabel)
                .addGap(166, 166, 166))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(tituloLabel)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(tablasLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(selectModeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(simpleSelectBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(unicIntervalBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(multIntervalBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deselectBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(labelUsuarioConectado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(showBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(camposLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(29, Short.MAX_VALUE))
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


 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPane2;
    private javax.swing.JLabel camposLabel;
    private javax.swing.JList<String> camposLista;
    private javax.swing.JButton deselectBtn;
    private javax.swing.ButtonGroup grupoBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelUsuarioConectado;
    private javax.swing.JToggleButton multIntervalBtn;
    private javax.swing.JLabel selectModeLabel;
    private javax.swing.JButton showBtn;
    private javax.swing.JToggleButton simpleSelectBtn;
    private javax.swing.JLabel tablasLabel;
    private javax.swing.JList<String> tablasLista;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JToggleButton unicIntervalBtn;
    // End of variables declaration//GEN-END:variables
}
