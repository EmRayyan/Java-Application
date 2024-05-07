package event.management.system;
public class dashboard extends javax.swing.JFrame {

    public dashboard() {
        initComponents();
    }
    
    private static String fName;
    private static String userName;
    private static String Email;
    private static String Password;
    
    public dashboard(String fname, String name, String email, String pass) {
        initComponents();
        setfName(fname);
        setUserName(name);
        setEmail(email);
        setPassword(pass);
        NAME.setText(getUserName());
    }
    
    public static String getPassword() {
        return Password;
    }

    private static void setPassword(String password) {
        Password = password;
    }
    
    public static String getfName() {
        return fName;
    }

    private static void setfName(String fname) {
        fName = fname;
    }
    
    public static String getEmail() {
        return Email;
    }

    private static void setEmail(String email) {
        Email = email;
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
        your_eve_cont = new javax.swing.JPanel();
        your_events = new javax.swing.JLabel();
        news_upd_cont = new javax.swing.JPanel();
        news_update = new javax.swing.JLabel();
        cont_ad = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        title_bar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        homeicon = new javax.swing.JLabel();
        my_account = new javax.swing.JLabel();
        NAME = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        community_event = new javax.swing.JButton();
        cultural_events = new javax.swing.JButton();
        science_events = new javax.swing.JButton();
        sports_events = new javax.swing.JButton();
        general_events = new javax.swing.JButton();
        event_label = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1115, 605));
        getContentPane().setLayout(null);

        side_panel.setBackground(new java.awt.Color(34, 34, 34));
        side_panel.setPreferredSize(new java.awt.Dimension(300, 570));

        your_eve_cont.setBackground(new java.awt.Color(34, 34, 34));
        your_eve_cont.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        your_events.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        your_events.setForeground(new java.awt.Color(255, 255, 255));
        your_events.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/icons8-events2-28.png"))); // NOI18N
        your_events.setText(" YOUR EVENTS");
        your_events.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                your_eventsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout your_eve_contLayout = new javax.swing.GroupLayout(your_eve_cont);
        your_eve_cont.setLayout(your_eve_contLayout);
        your_eve_contLayout.setHorizontalGroup(
            your_eve_contLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(your_eve_contLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(your_events)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        your_eve_contLayout.setVerticalGroup(
            your_eve_contLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(your_eve_contLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(your_events)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        news_upd_cont.setBackground(new java.awt.Color(34, 34, 34));
        news_upd_cont.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        news_update.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        news_update.setForeground(new java.awt.Color(255, 255, 255));
        news_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/icons8-news-28.png"))); // NOI18N
        news_update.setText(" NEWS UPDATE");
        news_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                news_updateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout news_upd_contLayout = new javax.swing.GroupLayout(news_upd_cont);
        news_upd_cont.setLayout(news_upd_contLayout);
        news_upd_contLayout.setHorizontalGroup(
            news_upd_contLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(news_upd_contLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(news_update)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        news_upd_contLayout.setVerticalGroup(
            news_upd_contLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(news_upd_contLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(news_update)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        cont_ad.setBackground(new java.awt.Color(34, 34, 34));
        cont_ad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/A.I.R.png"))); // NOI18N

        javax.swing.GroupLayout cont_adLayout = new javax.swing.GroupLayout(cont_ad);
        cont_ad.setLayout(cont_adLayout);
        cont_adLayout.setHorizontalGroup(
            cont_adLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_adLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cont_adLayout.setVerticalGroup(
            cont_adLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_adLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/Free_Sample_By_Wix.jpg"))); // NOI18N

        javax.swing.GroupLayout side_panelLayout = new javax.swing.GroupLayout(side_panel);
        side_panel.setLayout(side_panelLayout);
        side_panelLayout.setHorizontalGroup(
            side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(side_panelLayout.createSequentialGroup()
                .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(side_panelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(your_eve_cont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cont_ad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(news_upd_cont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(side_panelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        side_panelLayout.setVerticalGroup(
            side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, side_panelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(your_eve_cont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(news_upd_cont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(cont_ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        getContentPane().add(side_panel);
        side_panel.setBounds(0, 0, 300, 570);

        title_bar.setBackground(new java.awt.Color(255, 255, 255));
        title_bar.setMinimumSize(new java.awt.Dimension(800, 70));
        title_bar.setPreferredSize(new java.awt.Dimension(1100, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 34, 34));
        jLabel1.setText("DASHBOARD");

        homeicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/icons8-home-26.png"))); // NOI18N

        my_account.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/user.png"))); // NOI18N
        my_account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                my_accountMouseClicked(evt);
            }
        });

        NAME.setBackground(new java.awt.Color(24, 165, 88));
        NAME.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NAME.setForeground(new java.awt.Color(34, 34, 34));
        NAME.setText("USER");

        javax.swing.GroupLayout title_barLayout = new javax.swing.GroupLayout(title_bar);
        title_bar.setLayout(title_barLayout);
        title_barLayout.setHorizontalGroup(
            title_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title_barLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(homeicon)
                .addGap(244, 244, 244)
                .addComponent(jLabel1)
                .addGap(160, 160, 160)
                .addComponent(my_account)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NAME)
                .addContainerGap())
        );
        title_barLayout.setVerticalGroup(
            title_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title_barLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(title_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(my_account, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(title_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(homeicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(title_bar);
        title_bar.setBounds(300, 0, 800, 60);

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setPreferredSize(new java.awt.Dimension(800, 600));

        community_event.setBackground(new java.awt.Color(255, 255, 255));
        community_event.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        community_event.setForeground(new java.awt.Color(34, 34, 34));
        community_event.setText("COMMUNITY EVENTS");
        community_event.setActionCommand("");
        community_event.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(34, 34, 34), 2, true));
        community_event.setFocusable(false);
        community_event.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                community_eventActionPerformed(evt);
            }
        });

        cultural_events.setBackground(new java.awt.Color(255, 255, 255));
        cultural_events.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cultural_events.setForeground(new java.awt.Color(34, 34, 34));
        cultural_events.setText("CULTURAL EVENTS");
        cultural_events.setActionCommand("");
        cultural_events.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(34, 34, 34), 2, true));
        cultural_events.setFocusable(false);
        cultural_events.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cultural_eventsActionPerformed(evt);
            }
        });

        science_events.setBackground(new java.awt.Color(255, 255, 255));
        science_events.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        science_events.setForeground(new java.awt.Color(34, 34, 34));
        science_events.setText("SCIENCE EVENTS");
        science_events.setActionCommand("");
        science_events.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(34, 34, 34), 2, true));
        science_events.setFocusable(false);
        science_events.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                science_eventsActionPerformed(evt);
            }
        });

        sports_events.setBackground(new java.awt.Color(255, 255, 255));
        sports_events.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        sports_events.setForeground(new java.awt.Color(34, 34, 34));
        sports_events.setText("SPORTS EVENTS");
        sports_events.setActionCommand("");
        sports_events.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(34, 34, 34), 2, true));
        sports_events.setFocusable(false);
        sports_events.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sports_eventsActionPerformed(evt);
            }
        });

        general_events.setBackground(new java.awt.Color(255, 255, 255));
        general_events.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        general_events.setForeground(new java.awt.Color(34, 34, 34));
        general_events.setText("GENERAL EVENTS");
        general_events.setActionCommand("");
        general_events.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(34, 34, 34), 2, true));
        general_events.setFocusable(false);
        general_events.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                general_eventsActionPerformed(evt);
            }
        });

        event_label.setBackground(new java.awt.Color(34, 34, 34));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/icons8-events-28.png"))); // NOI18N
        jLabel4.setText(" EVENTS");

        javax.swing.GroupLayout event_labelLayout = new javax.swing.GroupLayout(event_label);
        event_label.setLayout(event_labelLayout);
        event_labelLayout.setHorizontalGroup(
            event_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(event_labelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        event_labelLayout.setVerticalGroup(
            event_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, event_labelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(15, 15, 15))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Copyright © reserved by OOP's Project Group ");

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(sports_events, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(general_events, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addComponent(community_event, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(event_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cultural_events, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(science_events, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(event_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(community_event, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cultural_events, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(science_events, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sports_events, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(general_events, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(22, 22, 22))
        );

        getContentPane().add(body);
        body.setBounds(300, 60, 800, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void community_eventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_community_eventActionPerformed
        try{
            communityEvents com_eve = new communityEvents(Email, fName, userName);
            com_eve.setVisible(true);
            com_eve.pack();
            com_eve.setLocationRelativeTo(null);
            dispose();
        }catch(Exception fp_error){
            System.out.println("page not found");
        }
    }//GEN-LAST:event_community_eventActionPerformed

    private void cultural_eventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cultural_eventsActionPerformed
        try{
            culturalEvents cul_eve = new culturalEvents(Email, fName, userName);
            cul_eve.setVisible(true);
            cul_eve.pack();
            cul_eve.setLocationRelativeTo(null);
            dispose();
        }catch(Exception fp_error){
            System.out.println("page not found");
        }
    }//GEN-LAST:event_cultural_eventsActionPerformed

    private void science_eventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_science_eventsActionPerformed
        try{
            scienceEvents scn_eve = new scienceEvents(Email, fName, userName);
            scn_eve.setVisible(true);
            scn_eve.pack();
            scn_eve.setLocationRelativeTo(null);
            dispose();
        }catch(Exception fp_error){
            System.out.println("page not found");
        }
    }//GEN-LAST:event_science_eventsActionPerformed

    private void sports_eventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sports_eventsActionPerformed
        try{
            sportsEvents spt_eve = new sportsEvents(Email, fName, userName);
            spt_eve.setVisible(true);
            spt_eve.pack();
            spt_eve.setLocationRelativeTo(null);
            dispose();
        }catch(Exception fp_error){
            System.out.println("page not found");
        }
    }//GEN-LAST:event_sports_eventsActionPerformed

    private void general_eventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_general_eventsActionPerformed
        try{
            generalEvents gen_eve = new generalEvents(Email, fName, userName);
            gen_eve.setVisible(true);
            gen_eve.pack();
            gen_eve.setLocationRelativeTo(null);
            dispose();
        }catch(Exception fp_error){
            System.out.println("page not found");
        }
    }//GEN-LAST:event_general_eventsActionPerformed

    private void your_eventsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_your_eventsMouseClicked
        try{
                yourEvents you_eve = new yourEvents(Email, fName, userName);
                you_eve.setVisible(true);
                you_eve.pack();
                you_eve.setLocationRelativeTo(null);
            dispose();
        }catch(Exception fp_error){
            System.out.println("page not found");
        }
    }//GEN-LAST:event_your_eventsMouseClicked

    private void news_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_news_updateMouseClicked
        try{
            viewNews vnews = new viewNews();
            vnews.setVisible(true);
            vnews.pack();
            vnews.setLocationRelativeTo(null);
            dispose();
        }catch(Exception fp_error){
            System.out.println("page not found");
        }
    }//GEN-LAST:event_news_updateMouseClicked

    private void my_accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_my_accountMouseClicked
        try{
            myAccount macc = new myAccount(Email, fName, userName, Password);
            macc.setVisible(true);
            macc.pack();
            macc.setLocationRelativeTo(null);
            dispose();
        }catch(Exception fp_error){
            System.out.println("page not found");
        }
    }//GEN-LAST:event_my_accountMouseClicked


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
                dashboard dash = new dashboard();
                dash.setVisible(true);
                dash.pack();
                dash.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NAME;
    private javax.swing.JPanel body;
    private javax.swing.JButton community_event;
    private javax.swing.JPanel cont_ad;
    private javax.swing.JButton cultural_events;
    private javax.swing.JPanel event_label;
    private javax.swing.JButton general_events;
    private javax.swing.JLabel homeicon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel my_account;
    private javax.swing.JPanel news_upd_cont;
    private javax.swing.JLabel news_update;
    private javax.swing.JButton science_events;
    private javax.swing.JPanel side_panel;
    private javax.swing.JButton sports_events;
    private javax.swing.JPanel title_bar;
    private javax.swing.JPanel your_eve_cont;
    private javax.swing.JLabel your_events;
    // End of variables declaration//GEN-END:variables
}
