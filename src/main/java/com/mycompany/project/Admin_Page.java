package com.mycompany.project;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Admin_Page extends javax.swing.JFrame {

    // Burada üç jTable için üç farklı model tanımlıyorum. Böylece bu tablolarda
    // işlemleri daha kolay yapabilirim.
    
    String[] columns = {"İsim", "Soyisim", "Mail", "Telefon No"};
    String[][] data = new String[100][4];
    DefaultTableModel userTableModel = new DefaultTableModel(data, columns);

    String[] columns1 = {"Email", "Konferans Salonu", "Ay", "Gün", "Saat"};
    String[][] data1 = new String[100][5];
    DefaultTableModel reservationsTableModel = new DefaultTableModel(data1, columns1);

    String[] columns2 = {"ID", "Email", "Konferans Salonu", "Ay", "Gün", "Saat"};
    String[][] data2 = new String[100][5];
    DefaultTableModel notConfirmedReservationsModel = new DefaultTableModel(data2, columns2);


    DataBase_class dtbs = new DataBase_class();

    public Admin_Page() {
        initComponents();

        confirmedReservationsJTable.setModel(reservationsTableModel);
        transactionsTable.setModel(notConfirmedReservationsModel);
        userJTable.setModel(userTableModel);

        updateTables();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tabbedPane = new javax.swing.JTabbedPane();
        userPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        userJTable = new javax.swing.JTable();
        resPanel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        confirmedReservationsJTable = new javax.swing.JTable();
        processPanel = new javax.swing.JPanel();
        traansactionPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        transactionsTable = new javax.swing.JTable();
        acceptRandevous = new javax.swing.JButton();
        rejectRandevous = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user (1).png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("Admin ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search (2).png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Konferans Salonu Rezervasyon Sistemi");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 969, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(searchField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "İsim", "Soyisim", "Mail", "Telefon No"
            }
        ));
        jScrollPane4.setViewportView(userJTable);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1129, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Kullanıcılar", userPanel);

        resPanel.setLayout(new javax.swing.BoxLayout(resPanel, javax.swing.BoxLayout.LINE_AXIS));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        confirmedReservationsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mail", "Salon İsmi", "Ay", "Gün", "Saat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(confirmedReservationsJTable);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1129, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addContainerGap())
        );

        resPanel.add(jPanel7);

        tabbedPane.addTab("Rezervasyonlar", resPanel);

        processPanel.setLayout(new javax.swing.BoxLayout(processPanel, javax.swing.BoxLayout.LINE_AXIS));

        traansactionPanel.setBackground(new java.awt.Color(255, 255, 255));

        transactionsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "İsim", "Soyisim", "Mail", "Salon İsmi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(transactionsTable);

        acceptRandevous.setText("Randevuyu Onayla");
        acceptRandevous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptRandevousActionPerformed(evt);
            }
        });

        rejectRandevous.setText("Randevuyu Reddet");
        rejectRandevous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectRandevousActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout traansactionPanelLayout = new javax.swing.GroupLayout(traansactionPanel);
        traansactionPanel.setLayout(traansactionPanelLayout);
        traansactionPanelLayout.setHorizontalGroup(
            traansactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(traansactionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(traansactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1129, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, traansactionPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(acceptRandevous)
                        .addGap(18, 18, 18)
                        .addComponent(rejectRandevous)
                        .addGap(31, 31, 31)))
                .addContainerGap())
        );
        traansactionPanelLayout.setVerticalGroup(
            traansactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, traansactionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(traansactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rejectRandevous)
                    .addComponent(acceptRandevous))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addContainerGap())
        );

        processPanel.add(traansactionPanel);

        tabbedPane.addTab("İşlemler", processPanel);

        jSplitPane1.setRightComponent(tabbedPane);

        getContentPane().add(jSplitPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
    public void updateTables() {
        dtbs.getReservations(reservationsTableModel);
        dtbs.dbToTable(userTableModel);
        dtbs.getNotConfirmedReservations(notConfirmedReservationsModel);
    }

    // Burada yapılan randevu işlemlerini onaylayıp asıl onaylanmış randevular 
    // kısmına ekliyorum

    private void acceptRandevousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptRandevousActionPerformed
        
        int id = (int) notConfirmedReservationsModel.getValueAt(transactionsTable.getSelectedRow(), 0);
        dtbs.addReservation(id);
        notConfirmedReservationsModel.removeRow(transactionsTable.getSelectedRow());

        updateTables();

    }//GEN-LAST:event_acceptRandevousActionPerformed

    // Burada reddedilen randevuları siliyorum.
    
    private void rejectRandevousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectRandevousActionPerformed
        
        int id = (int) notConfirmedReservationsModel.getValueAt(transactionsTable.getSelectedRow(), 0);
        dtbs.deleteReservation(id);
        notConfirmedReservationsModel.removeRow(transactionsTable.getSelectedRow());

        updateTables();

    }//GEN-LAST:event_rejectRandevousActionPerformed

    // Burada, o sırada açık olan tabloya bağlı olarak herhangi bir kelimeyi ya da
    // sayıyı arayıp istediği bilgiyi daha kolay bulmasını sağlıyorum.
    
    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        
        String searchingText = searchField.getText();

        if (tabbedPane.getSelectedIndex() == 0) {
            TableRowSorter<DefaultTableModel> userTableRowSorter = new TableRowSorter(userTableModel);
            userJTable.setRowSorter(userTableRowSorter);
            userTableRowSorter.setRowFilter(RowFilter.regexFilter(searchingText));
        } else if (tabbedPane.getSelectedIndex() == 1) {
            TableRowSorter<DefaultTableModel> reservationsTableSorter = new TableRowSorter(reservationsTableModel);
            confirmedReservationsJTable.setRowSorter(reservationsTableSorter);
            reservationsTableSorter.setRowFilter(RowFilter.regexFilter(searchingText));
        } else if (tabbedPane.getSelectedIndex() == 2) {
            TableRowSorter<DefaultTableModel> notConfirmedTableSorter = new TableRowSorter(notConfirmedReservationsModel);
            transactionsTable.setRowSorter(notConfirmedTableSorter);
            notConfirmedTableSorter.setRowFilter(RowFilter.regexFilter(searchingText));
        }

    }//GEN-LAST:event_searchFieldKeyReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Admin_Page().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptRandevous;
    private javax.swing.JTable confirmedReservationsJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel processPanel;
    private javax.swing.JButton rejectRandevous;
    private javax.swing.JPanel resPanel;
    private javax.swing.JTextField searchField;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JPanel traansactionPanel;
    private javax.swing.JTable transactionsTable;
    private javax.swing.JTable userJTable;
    private javax.swing.JPanel userPanel;
    // End of variables declaration//GEN-END:variables
}
