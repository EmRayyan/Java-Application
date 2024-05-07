package event.management.system;
public class Welcome extends javax.swing.JFrame {

    public Welcome() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcome_bg = new javax.swing.JPanel();
        right = new javax.swing.JPanel();
        welcome_text = new javax.swing.JLabel();
        admin = new javax.swing.JButton();
        user = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        left = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(810, 530));

        welcome_bg.setBackground(new java.awt.Color(255, 255, 255));
        welcome_bg.setPreferredSize(new java.awt.Dimension(800, 500));
        welcome_bg.setLayout(null);

        right.setBackground(new java.awt.Color(255, 255, 255));
        right.setPreferredSize(new java.awt.Dimension(400, 500));

        welcome_text.setBackground(new java.awt.Color(255, 255, 255));
        welcome_text.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        welcome_text.setForeground(new java.awt.Color(34, 34, 34));
        welcome_text.setText("WELCOME");

        admin.setBackground(new java.awt.Color(34, 34, 34));
        admin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        admin.setForeground(new java.awt.Color(255, 255, 255));
        admin.setText("ADMIN");
        admin.setBorder(null);
        admin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        admin.setFocusable(false);
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });

        user.setBackground(new java.awt.Color(34, 34, 34));
        user.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setText("USER");
        user.setBorder(null);
        user.setFocusable(false);
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Copyright © reserved by OOP's Project Group ");

        javax.swing.GroupLayout rightLayout = new javax.swing.GroupLayout(right);
        right.setLayout(rightLayout);
        rightLayout.setHorizontalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightLayout.createSequentialGroup()
                .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(welcome_text))
                    .addGroup(rightLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightLayout.createSequentialGroup()
                .addGap(0, 59, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(58, 58, 58))
        );
        rightLayout.setVerticalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(welcome_text)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jLabel9)
                .addGap(20, 20, 20))
        );

        welcome_bg.add(right);
        right.setBounds(400, 0, 400, 500);

        left.setBackground(new java.awt.Color(34, 34, 34));
        left.setPreferredSize(new java.awt.Dimension(400, 500));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/Free_Sample_By_Wix.jpg"))); // NOI18N

        javax.swing.GroupLayout leftLayout = new javax.swing.GroupLayout(left);
        left.setLayout(leftLayout);
        leftLayout.setHorizontalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(logo)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        leftLayout.setVerticalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(logo)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        welcome_bg.add(left);
        left.setBounds(0, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(welcome_bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(welcome_bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        try{
            AdminLogin al = new AdminLogin();
            al.setVisible(true);
            al.pack();
            al.setLocationRelativeTo(null);
            dispose();
        }catch(Exception rg_error){
            System.out.println("page not found");
        }
    }//GEN-LAST:event_adminActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        try{
            LoginPage lp = new LoginPage();
            lp.setVisible(true);
            lp.pack();
            lp.setLocationRelativeTo(null);
            dispose();
        }catch(Exception lp_error){
            System.out.println("page not found");
        }
    }//GEN-LAST:event_userActionPerformed

    
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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Welcome welcomeframe = new Welcome();
                welcomeframe.setVisible(true);
                welcomeframe.pack();
                welcomeframe.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel left;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel right;
    private javax.swing.JButton user;
    private javax.swing.JPanel welcome_bg;
    private javax.swing.JLabel welcome_text;
    // End of variables declaration//GEN-END:variables
}
