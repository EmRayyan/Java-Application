package event.management.system;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginPage extends javax.swing.JFrame {

    public LoginPage() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_bg = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        login = new javax.swing.JButton();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        email_label = new javax.swing.JLabel();
        password_label = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        forgot_pass = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        back_button = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

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

        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        email_label.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        email_label.setText("Email:");

        password_label.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        password_label.setText("Password:");

        text.setBackground(new java.awt.Color(255, 255, 255));
        text.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        text.setText("Don't have an account?");

        register.setBackground(new java.awt.Color(255, 255, 255));
        register.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        register.setForeground(new java.awt.Color(51, 102, 255));
        register.setText("Register");
        register.setFocusable(false);
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 34, 34));
        jLabel1.setText("USER LOGIN");

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
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(RightLayout.createSequentialGroup()
                                        .addComponent(text)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(password_label)
                                    .addComponent(email_label)
                                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(back_button))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(back_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(email_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(password_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(forgot_pass)
                .addGap(18, 18, 18)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text)
                    .addComponent(register))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        login_bg.add(Right);
        Right.setBounds(400, 0, 400, 500);

        Left.setBackground(new java.awt.Color(34, 34, 34));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));
        Left.setPreferredSize(new java.awt.Dimension(405, 515));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/Free_Sample_By_Wix.jpg"))); // NOI18N

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel2)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel2)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        login_bg.add(Left);
        Left.setBounds(0, 0, 405, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        if(email.getText().trim().isEmpty() || password.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Input fields cannot be empty");
        }else{
            try{
                String Email = email.getText();
                if(isValidEmail(Email)){
                    DB_Connectivity db = new DB_Connectivity();
                    ResultSet rs;
                    PreparedStatement st;
                    Connection con = db.con;
                    String sql_5 = "SELECT * FROM accounts WHERE email=? AND password=?";
                    st = con.prepareStatement(sql_5);
                    st.setString(1, email.getText());
                    st.setString(2, password.getText());
                    rs = st.executeQuery();
                    if(rs.next()){
//                        String detail[]={rs.getString("first_name"), rs.getString("last_name"), rs.getString("email"), rs.getString("password")};
                        dashboard dash = new dashboard(rs.getString("first_name"), rs.getString("last_name"), rs.getString("email"), rs.getString("password"));
                        dash.setVisible(true);
                        dash.pack();
                        dash.setLocationRelativeTo(null);
                        dispose();
                        email.setText("");
                        password.setText("");
                    }else{
                        String sql_6 = "SELECT * FROM accounts WHERE email=?";
                        st = con.prepareStatement(sql_6);
                        st.setString(1, email.getText());
                        rs = st.executeQuery();
                        if(rs.next()){
                            JOptionPane.showMessageDialog(this, "Incorrect Password", "Message", 1);
                        }else{
                            JOptionPane.showMessageDialog(this, "Please register yourself", "Account Not Found", 1);
                            password.setText("");
                        }
                    }    
                }else{
                    JOptionPane.showMessageDialog(this, "Email is invalid\n\nHint: wxyz@domain.com", "Incorrect credentials", 1);
                }
            }catch(SQLException s_ex){
                Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE,null,s_ex);
            }
        }
        
    }//GEN-LAST:event_loginActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        try{
            Register rg = new Register();
            rg.setVisible(true);
            rg.pack();
            rg.setLocationRelativeTo(null);
            dispose();
        }catch(Exception rg_error){
            System.out.println("page not found");
        }
    }//GEN-LAST:event_registerActionPerformed

    private void forgot_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgot_passActionPerformed
        try{
            ForgotPassword fp = new ForgotPassword();
            fp.setVisible(true);
            fp.pack();
            fp.setLocationRelativeTo(null);
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

    private static boolean isValidEmail(String email) {
        return email.length() >=14 && email.contains("@gmail.com") || email.contains("@hotmail.com");
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
                LoginPage lp = new LoginPage();
                lp.setVisible(true);
                lp.pack();
                lp.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JLabel back_button;
    private javax.swing.JTextField email;
    private javax.swing.JLabel email_label;
    private javax.swing.JButton forgot_pass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton login;
    private javax.swing.JPanel login_bg;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel password_label;
    private javax.swing.JButton register;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
