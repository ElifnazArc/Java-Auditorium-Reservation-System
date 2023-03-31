
package com.mycompany.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class Reservation_Process extends javax.swing.JFrame {
    String email = "";
    DataBase_class db = new DataBase_class();
    DefaultListModel listModel = new DefaultListModel();
    methodsClass myM = new methodsClass();

    public Reservation_Process() {
        initComponents();
    }

    public Reservation_Process(String mail) {
        initComponents();
        email = mail;
        isim_soyisim_label.setText(db.getFullNameFromDB(email));
        reservationsList.setModel(listModel);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        deleteUserMenuItem = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reservationsList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        isim_soyisim_label = new javax.swing.JLabel();
        cancelRadioButton = new javax.swing.JRadioButton();
        showReservationsRadioButton = new javax.swing.JRadioButton();
        applyButton = new javax.swing.JButton();

        deleteUserMenuItem.setLabel("Hesabı Kalıcı Olarak Sil");
        deleteUserMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserMenuItemActionPerformed(evt);
            }
        });
        jPopupMenu1.add(deleteUserMenuItem);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jScrollPane1.setViewportView(reservationsList);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Rezervasyon İşlemlerim");

        welcomeLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setText("Hoşgeldiniz");

        isim_soyisim_label.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        isim_soyisim_label.setForeground(new java.awt.Color(255, 255, 255));

        cancelRadioButton.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(cancelRadioButton);
        cancelRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelRadioButton.setText("İptal Et");

        showReservationsRadioButton.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(showReservationsRadioButton);
        showReservationsRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        showReservationsRadioButton.setSelected(true);
        showReservationsRadioButton.setText("Rezervasyonlarımı göster");

        applyButton.setBackground(new java.awt.Color(204, 204, 204));
        applyButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        applyButton.setForeground(new java.awt.Color(255, 0, 0));
        applyButton.setText("UYGULA");
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(54, 54, 54))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showReservationsRadioButton)
                    .addComponent(cancelRadioButton)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(isim_soyisim_label, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(applyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(welcomeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isim_soyisim_label, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(showReservationsRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(applyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void showPopUpMenu(MouseEvent evt, JPopupMenu popupMenu) {
        popupMenu.show(this, evt.getX(), evt.getY());
    }

    // Grafiğin çizim talimatları
    void drawRect(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setBackground(Color.pink);
        BasicStroke stroke = new BasicStroke(6, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
        g2d.setStroke(stroke);
        g2d.drawRect(20, 20, 30, 30);
    }

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        if (evt.isPopupTrigger()) {
            showPopUpMenu(evt, jPopupMenu1);
        }
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        if (evt.isPopupTrigger()) {
            showPopUpMenu(evt, jPopupMenu1);
        }
    }//GEN-LAST:event_formMouseReleased
    
    // Burada eklediğim popup menu ile kullanıcı dilerse kendisini dilebiliyor
    private void deleteUserMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserMenuItemActionPerformed
        int r = JOptionPane.showConfirmDialog(rootPane, "Hesabınızı Kalıcı Olarak Silmek İstediğinizden Emin Misiniz?");
        if (r == 0) {
            db.deleteUser(email);
            JOptionPane.showMessageDialog(rootPane, "Kullanıcı Silindi...");
            System.exit(0);
        }

    }//GEN-LAST:event_deleteUserMenuItemActionPerformed

    // Burada seçilen radioButton'a göre, uygula butonuna tıklandığında
    // işlem yapılıyor. Ayrıca görsel amaçlı bir graphic de çiziyor.
    private void applyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyButtonActionPerformed
        drawRect(jPanel1.getGraphics());

        if (showReservationsRadioButton.isSelected()) {
            listModel.clear();
            db.getReservations(listModel, email);

        }
        if (cancelRadioButton.isSelected()) {
            String id = "";
            String selectedText = reservationsList.getSelectedValue();
            for (int i = 0; i < selectedText.length(); i++) {

                if (selectedText.charAt(i) != ':') {
                    id += selectedText.charAt(i);

                } else {
                    break;

                }

            }
            db.deleteReservation(Integer.parseInt(id));
            listModel.removeElementAt(reservationsList.getSelectedIndex());

        }


    }//GEN-LAST:event_applyButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservation_Process().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cancelRadioButton;
    private javax.swing.JMenuItem deleteUserMenuItem;
    private javax.swing.JLabel isim_soyisim_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> reservationsList;
    private javax.swing.JRadioButton showReservationsRadioButton;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
