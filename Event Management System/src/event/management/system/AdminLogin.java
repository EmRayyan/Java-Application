package event.management.system;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AdminLogin extends javax.swing.JFrame {

    public AdminLogin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_bg = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        login = new javax.swing.JButton();
        admin_id = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        email_label = new javax.swing.JLabel();
        password_label = new javax.swing.JLabel();
        forgot_pass = new javax.swing.JButton();
        log_label = new javax.swing.JLabel();
        back_button = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setPreferredSize(new java.awt.Dimension(810, 530));

        login_bg.setBackground(new java.awt.Color(255, 255, 255));
        login_bg.setPreferredSize(new java.awt.Dimension(800, 500));
        login_bg.setLayout(null);

        Right.setBackground(new java.awt.Color(255, 255, 255));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        login.setBackground(new java.awt.Color(34, 34, 34));
        login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("LOGIN");
        login.setFocusable(false);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        admin_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        email_label.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        email_label.setText("ID:");

        password_label.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        password_label.setText("Password:");

        forgot_pass.setBackground(new java.awt.Color(255, 255, 255));
        forgot_pass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        forgot_pass.setForeground(new java.awt.Color(51, 102, 255));
        forgot_pass.setText("Forgot password?");
        forgot_pass.setFocusable(false);
        forgot_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgot_passActionPerformed(evt);
            }
        });

        log_label.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        log_label.setForeground(new java.awt.Color(34, 34, 34));
        log_label.setText("ADMIN LOGIN");

        back_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/back_arrow.png"))); // NOI18N
        back_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_buttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(forgot_pass)
                            .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(password_label)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(admin_id, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(email_label))))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(back_button))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(log_label)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(back_button)
                .addGap(22, 22, 22)
                .addComponent(log_label)
                .addGap(47, 47, 47)
                .addComponent(email_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(admin_id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(password_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(forgot_pass)
                .addGap(37, 37, 37)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        login_bg.add(Right);
        Right.setBounds(400, 0, 400, 500);

        Left.setBackground(new java.awt.Color(34, 34, 34));
        Left.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/Free_Sample_By_Wix.jpg"))); // NOI18N

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(110, 110, 110))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel1)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        login_bg.add(Left);
        Left.setBounds(0, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(login_bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(login_bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        if(admin_id.getText().trim().isEmpty() || password.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Input fields cannot be empty");
        }else{
            try{
                String id = admin_id.getText();
                if(isValidId(id)){
                    DB_Connectivity db = new DB_Connectivity();
                    ResultSet rs;
                    PreparedStatement st;
                    Connection con = db.con;
                    String sql_5 = "SELECT * FROM admins WHERE id=? AND password=?";
                    st = con.prepareStatement(sql_5);
                    st.setString(1, admin_id.getText());
                    st.setString(2, password.getText());
                    rs = st.executeQuery();
                    if(rs.next()){
                        adminDashboard adash = new adminDashboard(rs.getString("fullname"), rs.getString("id"), rs.getString("password"));
                        adash.setVisible(true);
                        adash.pack();
                        adash.setLocationRelativeTo(null);
                        dispose();
                        admin_id.setText("");
                        password.setText("");
                    }else{
                        String sql_6 = "SELECT * FROM admins WHERE id=?";
                        st = con.prepareStatement(sql_6);
                        st.setString(1, admin_id.getText());
                        rs = st.executeQuery();
                        if(rs.next()){
                            JOptionPane.showMessageDialog(this, "Incorrect Password", "Message", 1);
                        }else{
                            JOptionPane.showMessageDialog(this, "You are not an admin", "Account Not Found", 1);
                            password.setText("");
                        }
                    }    
                }else{
                    JOptionPane.showMessageDialog(this, "Invalid ID", "Incorrect credentials", 1);
                }
            }catch(SQLException s_ex){
                Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE,null,s_ex);
            }
        }
        
    }//GEN-LAST:event_loginActionPerformed

    private void forgot_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgot_passActionPerformed
        try{
            AdminForgotPassword afp = new AdminForgotPassword();
            afp.setVisible(true);
            afp.pack();
            afp.setLocationRelativeTo(null);
            dispose();
        }catch(Exception fp_error){
            System.out.println("page not found");
        }
    }//GEN-LAST:event_forgot_passActionPerformed

    private void back_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_buttonMouseClicked
        try{
            Welcome welcomeframe = new Welcome();
            welcomeframe.setVisible(true);
            welcomeframe.pack();
            welcomeframe.setLocationRelativeTo(null);
            dispose();
        }catch(Exception fp_error){
            System.out.println("page not found");
        }       
    }//GEN-LAST:event_back_buttonMouseClicked

    private static boolean isValidId(String id) {
        return id.contains("air-");
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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdminLogin al = new AdminLogin();
                al.setVisible(true);
                al.pack();
                al.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JTextField admin_id;
    private javax.swing.JLabel back_button;
    private javax.swing.JLabel email_label;
    private javax.swing.JButton forgot_pass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel log_label;
    private javax.swing.JButton login;
    private javax.swing.JPanel login_bg;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel password_label;
    // End of variables declaration//GEN-END:variables
}
