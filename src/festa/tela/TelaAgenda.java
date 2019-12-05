/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package festa.tela;

import festa.dao.FestaDAO;
import festa.entidade.Festa;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class TelaAgenda extends javax.swing.JFrame {

    DefaultTableModel modelo;

    /**
     * Creates new form TelaAgenda
     */
    public TelaAgenda() {
        initComponents();
        modelo = (DefaultTableModel) jTable1.getModel();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Agenda");
        
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(65);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dia", "ID Festa", "Cliente", "Tema", "Valor", "Status"
            }
        ));
        jTable1.setToolTipText("");
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTable1.setRowHeight(28);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jToolBar1.setRollover(true);

        jButton5.setText("   Limpar   ");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jButton1.setText("   Sair     ");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Ano");

        jLabel2.setText("Mês");

        jButton2.setText("<< Mês Anterior");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Mês Posterior >>");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Consultar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(35, 35, 35)
                .addComponent(jButton3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // BOTÃO MÊS POSTERIOR
        try {
            LocalDate localDate;
            String ano = jFormattedTextField1.getText().trim();
            String mes = jFormattedTextField2.getText().trim();
            if (ano.isEmpty() || mes.isEmpty()) {
                localDate = LocalDate.now();
                jFormattedTextField1.setValue(localDate.getYear());
                jFormattedTextField2.setValue(localDate.getMonthValue());
            } else {
                localDate = LocalDate.of(Integer.parseInt(ano), Integer.parseInt(mes), 1);
                localDate = localDate.plusMonths(1);
                jFormattedTextField1.setValue(localDate.getYear());
                jFormattedTextField2.setValue(localDate.getMonthValue());
            }
            pesquisa(localDate);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data inexistente");
            jFormattedTextField1.setValue(null);
            jFormattedTextField2.setValue(null);
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // BOTÃO CONSULTAR
        try {
            LocalDate localDate;
            String ano = jFormattedTextField1.getText().trim();
            String mes = jFormattedTextField2.getText().trim();
            if (ano.isEmpty() || mes.isEmpty()) {
                localDate = LocalDate.now();
                jFormattedTextField1.setValue(localDate.getYear());
                jFormattedTextField2.setValue(localDate.getMonthValue());
            } else {
                localDate = LocalDate.of(Integer.parseInt(ano), Integer.parseInt(mes), 1);
            }
            pesquisa(localDate);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data inexistente" + e.getMessage());
            jFormattedTextField1.setValue(null);
            jFormattedTextField2.setValue(null);
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // BOTÃO MÊS ANTERIOR
        try {
            String ano = jFormattedTextField1.getText().trim();
            String mes = jFormattedTextField2.getText().trim();
            LocalDate localDate;
            if (ano.isEmpty() || mes.isEmpty()) {
                localDate = LocalDate.now();
                jFormattedTextField1.setValue(localDate.getYear());
                jFormattedTextField2.setValue(localDate.getMonthValue());
            } else {
                localDate = LocalDate.of(Integer.parseInt(ano), Integer.parseInt(mes), 1);
                localDate = localDate.minusMonths(1);
                jFormattedTextField1.setValue(localDate.getYear());
                jFormattedTextField2.setValue(localDate.getMonthValue());
            }
            pesquisa(localDate);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data inexistente");
            jFormattedTextField1.setValue(null);
            jFormattedTextField2.setValue(null);
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // CLICK TABELA
        String id = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 1));
        if (!id.trim().isEmpty()) {
            Festa festa = new FestaDAO().getFesta(Integer.parseInt(id));
            new TelaConsulta(festa).setVisible(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void pesquisa(LocalDate localDate) {
        modelo.setNumRows(0);
        FestaDAO dao = new FestaDAO();
        ArrayList<Festa> festas = dao.consultarFestasPorData(localDate);
        for (int i = 1; i <= localDate.lengthOfMonth(); i++) {
            Object[] dados = {"  " + i + "  " + String.valueOf(localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH)).substring(0, 3),
                "", "", "", ""};
            modelo.addRow(dados);

            for (Festa festa : festas) {
                String diaFesta = String.valueOf(festa.getDataFesta()).substring(8);
                if (Integer.parseInt(diaFesta) == localDate.getDayOfMonth()) {
                    String status = "";
                    switch (festa.getStatus()){
                        case 1:
                            status = "Aberto";
                            break;
                        case 2:
                            status = "Pago";
                            break;
                        case 3:
                            status = "Entregue";
                            break;
                        case 4:
                            status = "Finalizado";
                            break;
                        case 5:
                            status = "Cancelado";
                            break;
                    }
                    Object[] dados2 = {"        --->", festa.getIdFesta(), festa.getCliente().getNome(),
                        festa.getTema().getNome(), festa.getValor(), status};
                    modelo.addRow(dados2);
                }
            }
            localDate = localDate.plusDays(1);
        }
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // BOTÃO LIMPAR
        modelo.setNumRows(0);
        jFormattedTextField1.setValue(null);
        jFormattedTextField2.setValue(null);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // BOTÃO SAIR
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}