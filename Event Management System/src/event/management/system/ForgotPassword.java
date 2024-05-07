package event.management.system;

import java.sql.*;
import java.util.logging.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class ForgotPassword extends javax.swing.JFrame {

    
    public ForgotPassword() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_container = new javax.swing.JPanel();
        forgotp_container = new javax.swing.JPanel();
        change_p = new javax.swing.JButton();
        email = new javax.swing.JTextField();
        change_password = new javax.swing.JPasswordField();
        email_label = new javax.swing.JLabel();
        password_label = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        back_button = new javax.swing.JLabel();
        left = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(810, 530));

        main_container.setBackground(new java.awt.Color(255, 255, 255));
        main_container.setPreferredSize(new java.awt.Dimension(800, 500));
        main_container.setLayout(null);

        forgotp_container.setBackground(new java.awt.Color(255, 255, 255));
        forgotp_container.setPreferredSize(new java.awt.Dimension(400, 500));

        change_p.setBackground(new java.awt.Color(255, 255, 255));
        change_p.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        change_p.setForeground(new java.awt.Color(34, 34, 34));
        change_p.setText("Change");
        change_p.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34)));
        change_p.setFocusable(false);
        change_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_pActionPerformed(evt);
            }
        });

        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        change_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        email_label.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        email_label.setText("Email:");

        password_label.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        password_label.setText("New Password:");

        login.setBackground(new java.awt.Color(34, 34, 34));
        login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        login.setFocusable(false);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 34, 34));
        jLabel1.setText("FORGOT PASSWORD?");

        back_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/back_arrow.png"))); // NOI18N
        back_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_buttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout forgotp_containerLayout = new javax.swing.GroupLayout(forgotp_container);
        forgotp_container.setLayout(forgotp_containerLayout);
        forgotp_containerLayout.setHorizontalGroup(
            forgotp_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forgotp_containerLayout.createSequentialGroup()
                .addGroup(forgotp_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(forgotp_containerLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(forgotp_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(change_password, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email_label, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password_label, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(forgotp_containerLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(back_button))
                    .addGroup(forgotp_containerLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(forgotp_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(change_p, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(forgotp_containerLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        forgotp_containerLayout.setVerticalGroup(
            forgotp_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forgotp_containerLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(back_button)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(email_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(password_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(change_password, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(change_p, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        main_container.add(forgotp_container);
        forgotp_container.setBounds(400, 0, 400, 500);

        left.setBackground(new java.awt.Color(34, 34, 34));
        left.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/Free_Sample_By_Wix.jpg"))); // NOI18N

        javax.swing.GroupLayout leftLayout = new javax.swing.GroupLayout(left);
        left.setLayout(leftLayout);
        leftLayout.setHorizontalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftLayout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(110, 110, 110))
        );
        leftLayout.setVerticalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel2)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        main_container.add(left);
        left.setBounds(0, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main_container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main_container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void change_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_pActionPerformed
        ResultSet rs;
        PreparedStatement st;
        if(email.getText().trim().isEmpty() || change_password.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Input fields cannot be empty");
        }else{
            try{
                DB_Connectivity db = new DB_Connectivity();
                Connection con = db.con;
                String sql_2 = "SELECT * FROM accounts WHERE email=? AND password=?";
                st = con.prepareStatement(sql_2);
                st.setString(1, email.getText());
                st.setString(2, change_password.getText());
                rs = st.executeQuery();
                if(rs.next()){
                    JOptionPane.showMessageDialog(this, "New password cannot be same as the old password", 
                        "Message", 1);
                }else{
                    String sql_7 = "SELECT * FROM accounts WHERE email=?";
                    st = con.prepareStatement(sql_7);
                    st.setString(1, email.getText());
                    rs = st.executeQuery();
                    if(rs.next()){
                        String password = change_password.getText();
                        if(isValidPassword(password)){
                            String sql_3 = "UPDATE accounts SET password = ? WHERE email = ?";
                            st = con.prepareStatement(sql_3);
                            st.setString(1, change_password.getText());
                            st.setString(2, email.getText());
                            int ans = st.executeUpdate();
                            if(ans>0){
                                JOptionPane.showMessageDialog(this, "Password updated successfully. Go back to login", "Message", 1); 
                                email.setText("");
                                change_password.setText("");
                                email.requestFocus();
                            }else{
                                JOptionPane.showMessageDialog(this, "Password update failed", "Message", 1);
                                change_password.setText("");
                            }  
                        }else{
                            JOptionPane.showMessageDialog(this, "Password must be of 8-15 characters\nIt must contain special characters", "Incorrect credentials", 1);
                        }                        
                    }else{
                        JOptionPane.showMessageDialog(this, "Incorrect email", "Message", 1);
                        change_password.setText("");
                    }
                    
                    con.close();
                }
                }catch(SQLException s_ex){
                    Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE,null,s_ex);
                }
        }
        
    }//GEN-LAST:event_change_pActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        LoginPage lp = new LoginPage();
        lp.setVisible(true);
        lp.pack();
        lp.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_loginActionPerformed

    private void back_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_buttonMouseClicked
        try{
            LoginPage log = new LoginPage();
            log.setVisible(true);
            log.pack();
            log.setLocationRelativeTo(null);
            dispose();
        }catch(Exception fp_error){
            System.out.println("page not found");
        }
    }//GEN-LAST:event_back_buttonMouseClicked
    
    private static boolean isValidPassword(String password) {
        String characters = "[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]+";
        Pattern pattern = Pattern.compile(characters);
        Matcher spc = pattern.matcher(password);
        return password.length() >= 8 && password.length() <= 15 && spc.find();   
    }
    
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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ForgotPassword fp = new ForgotPassword();
                fp.setVisible(true);
                fp.pack();
                fp.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back_button;
    private javax.swing.JButton change_p;
    private javax.swing.JPasswordField change_password;
    private javax.swing.JTextField email;
    private javax.swing.JLabel email_label;
    private javax.swing.JPanel forgotp_container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel left;
    private javax.swing.JButton login;
    private javax.swing.JPanel main_container;
    private javax.swing.JLabel password_label;
    // End of variables declaration//GEN-END:variables
}
