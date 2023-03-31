package com.mycompany.project;

import java.awt.*;
import javax.swing.*;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        adminButton = new javax.swing.JButton();
        userButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Button = new javax.swing.JMenu();
        ThemeColor = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));

        adminButton.setBackground(new java.awt.Color(51, 51, 51));
        adminButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        adminButton.setForeground(new java.awt.Color(255, 255, 255));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("com/mycompany/project/Bundle"); // NOI18N
        adminButton.setText(bundle.getString("Login.adminButton.text")); // NOI18N
        adminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButtonActionPerformed(evt);
            }
        });

        userButton.setBackground(new java.awt.Color(51, 51, 51));
        userButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        userButton.setForeground(new java.awt.Color(255, 255, 255));
        userButton.setText(bundle.getString("Login.userButton.text")); // NOI18N
        userButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userButtonActionPerformed(evt);
            }
        });

        registerButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        registerButton.setText(bundle.getString("Login.registerButton.text")); // NOI18N
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText(bundle.getString("Login.jLabel1.text")); // NOI18N

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userButton, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addGap(34, 34, 34))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(adminButton)
                .addGap(18, 18, 18)
                .addComponent(userButton)
                .addGap(18, 18, 18)
                .addComponent(registerButton)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(loginPanel);

        Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu-button-of-three-horizontal-lines (1).png"))); // NOI18N

        ThemeColor.setText(bundle.getString("Login.ThemeColor.text")); // NOI18N
        ThemeColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemeColorActionPerformed(evt);
            }
        });
        Button.add(ThemeColor);

        Exit.setText(bundle.getString("Login.Exit.text")); // NOI18N
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        Button.add(Exit);

        jMenuBar1.add(Button);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButtonActionPerformed

        Admin_Frame admn = new Admin_Frame();
        admn.setLocationRelativeTo(null);
        admn.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_adminButtonActionPerformed

    // Kullanıcı girişi penceresine gidiyor.
    private void userButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userButtonActionPerformed

        User_Frame usr = new User_Frame();
        usr.setLocationRelativeTo(null);
        usr.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_userButtonActionPerformed

    
    // Kayıt penceresine gidiyor.
    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed

        Register_Frame rgs = new Register_Frame();
        rgs.setLocationRelativeTo(null);
        rgs.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_registerButtonActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    // Arka plan rengini değiştiriyor.
    private void ThemeColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemeColorActionPerformed

        JColorChooser colorChooser = new JColorChooser();

        try {
            Color themeColor = JColorChooser.showDialog(null, "Tema Rengi Seçin", Color.black);
            loginPanel.setBackground(themeColor);
            loginPanel.validate();
            loginPanel.repaint();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_ThemeColorActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                Login log = new Login();
                log.setLocationRelativeTo(null);
                log.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Button;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem ThemeColor;
    private javax.swing.JButton adminButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton userButton;
    // End of variables declaration//GEN-END:variables
}
