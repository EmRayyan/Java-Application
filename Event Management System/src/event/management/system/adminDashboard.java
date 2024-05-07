package event.management.system;
public class adminDashboard extends javax.swing.JFrame {

    public adminDashboard() {
        initComponents();
    }
    
    private static String id;
    private static String userName;
    private static String Password;
    
    public adminDashboard(String name, String id, String pass) {
        initComponents();
        setUserName(name);
        setId(id);
        setPassword(pass);
        NAME.setText(getUserName());
        ID.setText(getId());
    }
    
    public static String getPassword() {
        return Password;
    }

    private static void setPassword(String password) {
        Password = password;
    }
    
    public static String getId() {
        return id;
    }

    private static void setId(String ID) {
        id = ID;
    }
    
    public static String getUserName() {
        return userName;
    }

    private static void setUserName(String firstName) {
        userName = firstName;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        side_panel = new javax.swing.JPanel();
        cont_ad = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NAME = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        adminaccedit = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        title_bar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        news_upd = new javax.swing.JButton();
        event_label = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        manage_eve1 = new javax.swing.JButton();
        parti = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1115, 605));
        getContentPane().setLayout(null);

        side_panel.setBackground(new java.awt.Color(34, 34, 34));
        side_panel.setPreferredSize(new java.awt.Dimension(300, 570));

        cont_ad.setBackground(new java.awt.Color(34, 34, 34));
        cont_ad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/A.I.R.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Company LTD.");

        javax.swing.GroupLayout cont_adLayout = new javax.swing.GroupLayout(cont_ad);
        cont_ad.setLayout(cont_adLayout);
        cont_adLayout.setHorizontalGroup(
            cont_adLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_adLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel7)
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_adLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(80, 80, 80))
        );
        cont_adLayout.setVerticalGroup(
            cont_adLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_adLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/icons8-user-100.png"))); // NOI18N

        NAME.setBackground(new java.awt.Color(24, 165, 88));
        NAME.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        NAME.setForeground(new java.awt.Color(255, 255, 255));
        NAME.setText("USER");

        ID.setBackground(new java.awt.Color(24, 165, 88));
        ID.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ID.setForeground(new java.awt.Color(255, 255, 255));
        ID.setText("ID");

        adminaccedit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adminaccedit.setForeground(new java.awt.Color(51, 154, 240));
        adminaccedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/icons8-edit-26.png"))); // NOI18N
        adminaccedit.setText("Edit");
        adminaccedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminacceditMouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/Free_Sample_By_Wix.jpg"))); // NOI18N

        javax.swing.GroupLayout side_panelLayout = new javax.swing.GroupLayout(side_panel);
        side_panel.setLayout(side_panelLayout);
        side_panelLayout.setHorizontalGroup(
            side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(side_panelLayout.createSequentialGroup()
                .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(side_panelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(side_panelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NAME)
                                    .addComponent(ID)
                                    .addComponent(adminaccedit)))
                            .addComponent(cont_ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(side_panelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel6)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        side_panelLayout.setVerticalGroup(
            side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, side_panelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, side_panelLayout.createSequentialGroup()
                        .addComponent(NAME)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adminaccedit)))
                .addGap(18, 18, 18)
                .addComponent(cont_ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(side_panel);
        side_panel.setBounds(800, 0, 300, 570);

        title_bar.setBackground(new java.awt.Color(34, 34, 34));
        title_bar.setMinimumSize(new java.awt.Dimension(800, 70));
        title_bar.setPreferredSize(new java.awt.Dimension(1100, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/icons8-home-28.png"))); // NOI18N

        javax.swing.GroupLayout title_barLayout = new javax.swing.GroupLayout(title_bar);
        title_bar.setLayout(title_barLayout);
        title_barLayout.setHorizontalGroup(
            title_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title_barLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(834, 834, 834))
        );
        title_barLayout.setVerticalGroup(
            title_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title_barLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(522, Short.MAX_VALUE))
        );

        getContentPane().add(title_bar);
        title_bar.setBounds(0, 0, 80, 570);

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setPreferredSize(new java.awt.Dimension(800, 600));

        news_upd.setBackground(new java.awt.Color(255, 255, 255));
        news_upd.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        news_upd.setForeground(new java.awt.Color(34, 34, 34));
        news_upd.setText("ADD NEWS");
        news_upd.setActionCommand("");
        news_upd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(34, 34, 34), 2, true));
        news_upd.setFocusable(false);
        news_upd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                news_updActionPerformed(evt);
            }
        });

        event_label.setBackground(new java.awt.Color(34, 34, 34));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/icons8-admin-32.png"))); // NOI18N
        jLabel4.setText(" ADMIN PANEL");

        javax.swing.GroupLayout event_labelLayout = new javax.swing.GroupLayout(event_label);
        event_label.setLayout(event_labelLayout);
        event_labelLayout.setHorizontalGroup(
            event_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(event_labelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        event_labelLayout.setVerticalGroup(
            event_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, event_labelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(15, 15, 15))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 34, 34));
        jLabel1.setText("DASHBOARD");

        manage_eve1.setBackground(new java.awt.Color(255, 255, 255));
        manage_eve1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        manage_eve1.setForeground(new java.awt.Color(34, 34, 34));
        manage_eve1.setText("MANAGE EVENTS");
        manage_eve1.setActionCommand("");
        manage_eve1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(34, 34, 34), 2, true));
        manage_eve1.setFocusable(false);
        manage_eve1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manage_eve1ActionPerformed(evt);
            }
        });

        parti.setBackground(new java.awt.Color(255, 255, 255));
        parti.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        parti.setForeground(new java.awt.Color(34, 34, 34));
        parti.setText("PARTICIPANTS");
        parti.setActionCommand("");
        parti.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(34, 34, 34), 2, true));
        parti.setFocusable(false);
        parti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partiActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Copyright © reserved by OOP's Project Group ");

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(262, 262, 262))
            .addGroup(bodyLayout.createSequentialGroup()
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(event_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addComponent(manage_eve1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(news_upd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(parti, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(event_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(news_upd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manage_eve1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parti, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(22, 22, 22))
        );

        getContentPane().add(body);
        body.setBounds(80, 0, 720, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void news_updActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_news_updActionPerformed
        try{
            newsUpdate nu = new newsUpdate();
            nu.setVisible(true);
            nu.pack();
            nu.setLocationRelativeTo(null);
            dispose();
        }catch(Exception fp_error){
            System.out.println("page not found");
        }
    }//GEN-LAST:event_news_updActionPerformed

    private void manage_eve1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manage_eve1ActionPerformed
        try{
            manageEvents man_eve = new manageEvents();
            man_eve.setVisible(true);
            man_eve.pack();
            man_eve.setLocationRelativeTo(null);
            dispose();
        }catch(Exception fp_error){
            System.out.println("page not found");
        }
    }//GEN-LAST:event_manage_eve1ActionPerformed

    private void partiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partiActionPerformed
        try{
            participants party = new participants();
            party.setVisible(true);
            party.pack();
            party.setLocationRelativeTo(null);
            dispose();
        }catch(Exception fp_error){
            System.out.println("page not found");
        }
    }//GEN-LAST:event_partiActionPerformed

    private void adminacceditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminacceditMouseClicked
        try{
            adminAccount aacc = new adminAccount(id, userName, Password);
            aacc.setVisible(true);
            aacc.pack();
            aacc.setLocationRelativeTo(null);
            dispose();
        }catch(Exception fp_error){
            System.out.println("page not found");
        }
    }//GEN-LAST:event_adminacceditMouseClicked


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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                adminDashboard adash = new adminDashboard();
                adash.setVisible(true);
                adash.pack();
                adash.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JLabel NAME;
    private javax.swing.JLabel adminaccedit;
    private javax.swing.JPanel body;
    private javax.swing.JPanel cont_ad;
    private javax.swing.JPanel event_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton manage_eve1;
    private javax.swing.JButton news_upd;
    private javax.swing.JButton parti;
    private javax.swing.JPanel side_panel;
    private javax.swing.JPanel title_bar;
    // End of variables declaration//GEN-END:variables
}
