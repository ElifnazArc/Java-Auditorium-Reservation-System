package com.mycompany.project;

public class Main_Frame extends javax.swing.JFrame {

    String email;

    public Main_Frame() {
        initComponents();
    }

    public Main_Frame(String mail) {
        initComponents();
        email = mail;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        yellowAuditorium = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        blueAuditorium = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        redAuditorium = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_other_projects = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menu_new_res = new javax.swing.JMenu();
        menu_item_maviSalon = new javax.swing.JMenuItem();
        menu_item_sarıSalon = new javax.swing.JMenuItem();
        menu_Item_kırmızsalon = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        yellowAuditorium.setBackground(new java.awt.Color(51, 51, 51));
        yellowAuditorium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yellowAuditoriumMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/yellow.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sarı Konferans Salonu");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Kapasite : 200 Kişi");

        javax.swing.GroupLayout yellowAuditoriumLayout = new javax.swing.GroupLayout(yellowAuditorium);
        yellowAuditorium.setLayout(yellowAuditoriumLayout);
        yellowAuditoriumLayout.setHorizontalGroup(
            yellowAuditoriumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yellowAuditoriumLayout.createSequentialGroup()
                .addGroup(yellowAuditoriumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, yellowAuditoriumLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(yellowAuditoriumLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(yellowAuditoriumLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        yellowAuditoriumLayout.setVerticalGroup(
            yellowAuditoriumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yellowAuditoriumLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        blueAuditorium.setBackground(new java.awt.Color(51, 51, 51));
        blueAuditorium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blueAuditoriumMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blue.png"))); // NOI18N

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Kapasite : 100 Kişi");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mavi Konferans Salonu");

        javax.swing.GroupLayout blueAuditoriumLayout = new javax.swing.GroupLayout(blueAuditorium);
        blueAuditorium.setLayout(blueAuditoriumLayout);
        blueAuditoriumLayout.setHorizontalGroup(
            blueAuditoriumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blueAuditoriumLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blueAuditoriumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(blueAuditoriumLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blueAuditoriumLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(30, 30, 30))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blueAuditoriumLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(62, 62, 62))
        );
        blueAuditoriumLayout.setVerticalGroup(
            blueAuditoriumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blueAuditoriumLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        redAuditorium.setBackground(new java.awt.Color(51, 51, 51));
        redAuditorium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redAuditoriumMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/red.png"))); // NOI18N

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Kapasite : 300 Kişi");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Kırmızı Konferans Salonu");

        javax.swing.GroupLayout redAuditoriumLayout = new javax.swing.GroupLayout(redAuditorium);
        redAuditorium.setLayout(redAuditoriumLayout);
        redAuditoriumLayout.setHorizontalGroup(
            redAuditoriumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, redAuditoriumLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(redAuditoriumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(redAuditoriumLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(redAuditoriumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, redAuditoriumLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addGap(32, 32, 32))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        redAuditoriumLayout.setVerticalGroup(
            redAuditoriumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redAuditoriumLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Konferans Salonları");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(yellowAuditorium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(redAuditorium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blueAuditorium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(272, 272, 272))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blueAuditorium, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yellowAuditorium, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(redAuditorium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        menu_other_projects.setText("Rezervasyon İşlemlerim");

        jMenuItem1.setText("İşlemler");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menu_other_projects.add(jMenuItem1);

        jMenuBar1.add(menu_other_projects);

        menu_new_res.setText("Yeni Rezervasyon");

        menu_item_maviSalon.setText("Mavi Salon");
        menu_item_maviSalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_maviSalonActionPerformed(evt);
            }
        });
        menu_new_res.add(menu_item_maviSalon);

        menu_item_sarıSalon.setText("Sarı Salon");
        menu_item_sarıSalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_sarıSalonActionPerformed(evt);
            }
        });
        menu_new_res.add(menu_item_sarıSalon);

        menu_Item_kırmızsalon.setText("Kırmızı Salon");
        menu_Item_kırmızsalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_Item_kırmızsalonActionPerformed(evt);
            }
        });
        menu_new_res.add(menu_Item_kırmızsalon);

        jMenuBar1.add(menu_new_res);

        setJMenuBar(jMenuBar1);

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


    // Buradaki bütün metodlar diğer sınıflara gitmeye yarıyor.

    
    private void menu_Item_kırmızsalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_Item_kırmızsalonActionPerformed

        Red_Auditorium reAu = new Red_Auditorium(email);
        reAu.setLocationRelativeTo(null);
        reAu.setVisible(true);

    }//GEN-LAST:event_menu_Item_kırmızsalonActionPerformed
    
    private void menu_item_sarıSalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_sarıSalonActionPerformed

        Yellow_Auditorium yelAu = new Yellow_Auditorium(email);
        yelAu.setLocationRelativeTo(null);
        yelAu.setVisible(true);

    }//GEN-LAST:event_menu_item_sarıSalonActionPerformed

    private void menu_item_maviSalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_maviSalonActionPerformed

        Blue_Auditorium blueAu = new Blue_Auditorium(email);
        blueAu.setLocationRelativeTo(null);
        blueAu.setVisible(true);

    }//GEN-LAST:event_menu_item_maviSalonActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        Reservation_Process rsp = new Reservation_Process(email);
        rsp.setVisible(true);
        rsp.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void blueAuditoriumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blueAuditoriumMouseClicked

        Blue_Auditorium blueAu = new Blue_Auditorium(email);
        blueAu.setLocationRelativeTo(null);
        blueAu.setVisible(true);

    }//GEN-LAST:event_blueAuditoriumMouseClicked

    private void yellowAuditoriumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yellowAuditoriumMouseClicked

        Yellow_Auditorium yelAu = new Yellow_Auditorium(email);
        yelAu.setLocationRelativeTo(null);
        yelAu.setVisible(true);

    }//GEN-LAST:event_yellowAuditoriumMouseClicked

    private void redAuditoriumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redAuditoriumMouseClicked

        Red_Auditorium reAu = new Red_Auditorium(email);
        reAu.setLocationRelativeTo(null);
        reAu.setVisible(true);

    }//GEN-LAST:event_redAuditoriumMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel blueAuditorium;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menu_Item_kırmızsalon;
    private javax.swing.JMenuItem menu_item_maviSalon;
    private javax.swing.JMenuItem menu_item_sarıSalon;
    private javax.swing.JMenu menu_new_res;
    private javax.swing.JMenu menu_other_projects;
    private javax.swing.JPanel redAuditorium;
    private javax.swing.JPanel yellowAuditorium;
    // End of variables declaration//GEN-END:variables
}
