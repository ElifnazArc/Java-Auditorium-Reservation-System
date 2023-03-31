package com.mycompany.project;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Register_Frame extends javax.swing.JFrame {

    DataBase_class dtbs = new DataBase_class();
    methodsClass myM = new methodsClass();

    public Register_Frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_surname = new javax.swing.JTextField();
        Register_Button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_mail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_phoneNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("Kullanıcı Kayıt Sayfası");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Ad :");

        txt_name.setBackground(new java.awt.Color(51, 51, 51));
        txt_name.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_name.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Soyad :");

        txt_surname.setBackground(new java.awt.Color(51, 51, 51));
        txt_surname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_surname.setForeground(new java.awt.Color(255, 255, 255));

        Register_Button.setBackground(new java.awt.Color(51, 51, 51));
        Register_Button.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Register_Button.setForeground(new java.awt.Color(255, 255, 255));
        Register_Button.setText("KAYDOL");
        Register_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register_ButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Mail : ");

        txt_mail.setBackground(new java.awt.Color(51, 51, 51));
        txt_mail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_mail.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Telefon No :");

        txt_phoneNumber.setBackground(new java.awt.Color(51, 51, 51));
        txt_phoneNumber.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_phoneNumber.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("+90");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Şifre : ");

        txt_password.setBackground(new java.awt.Color(51, 51, 51));
        txt_password.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_password.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Register_Button)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_mail)
                                    .addComponent(txt_surname)
                                    .addComponent(txt_name)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(39, 39, 39)
                                .addComponent(txt_password)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(Register_Button)
                .addContainerGap(33, Short.MAX_VALUE))
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

    
    
    //Burada, user adlı database'e kullanıcı bilgilerini gerekli regex işlemlerini 
    // sağlıyorsa kaydediyorum.
    private void Register_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Register_ButtonActionPerformed
        String ad = txt_name.getText();
        String soyad = txt_surname.getText();
        String mail = txt_mail.getText();
        String telefon = txt_phoneNumber.getText();
        String sifre = String.valueOf(txt_password.getPassword());

        if (myM.mailRegexControl(mail) && myM.textRegexControl(ad) && myM.textRegexControl(soyad) && myM.phoneRegexControl(telefon)) {

            String x = JOptionPane.showInputDialog("Şifreyi tekrar giriniz : ");

            if (x.equals(sifre)) {
                JOptionPane.showMessageDialog(this, "Kaydınız başarıyla gerçekleşti");
                try {
                    dtbs.addUser(ad, soyad, telefon, mail, sifre);
                } catch (SQLException ex) {
                    Logger.getLogger(Register_Frame.class.getName()).log(Level.SEVERE, null, ex);
                }

                Main_Frame mainF = new Main_Frame(mail);
                mainF.setLocationRelativeTo(null);
                mainF.setVisible(true);

            }
            while (!x.equals(sifre)) {

                x = JOptionPane.showInputDialog("Şifreyi tekrar giriniz : ");
                if (x.equals(sifre)) {

                    try {
                        dtbs.addUser(ad, soyad, telefon, mail, sifre);
                    } catch (SQLException ex) {
                        Logger.getLogger(Register_Frame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(this, "Kaydınız başarıyla gerçekleşti");

                    Main_Frame mainF = new Main_Frame();
                    mainF.setLocationRelativeTo(null);
                    mainF.setVisible(true);
                }

            }

        } else {

            JOptionPane.showMessageDialog(this, "Girdiğiniz bilgileri kontrol ediniz");

        }

    }//GEN-LAST:event_Register_ButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Register_Frame().setVisible(true);
            }
        });
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Register_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_name;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_phoneNumber;
    private javax.swing.JTextField txt_surname;
    // End of variables declaration//GEN-END:variables
}
