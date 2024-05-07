package event.management.system;

import java.sql.*;
import java.util.logging.*;
import java.util.regex.*;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

    
    public Register() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_container = new javax.swing.JPanel();
        right = new javax.swing.JPanel();
        register = new javax.swing.JButton();
        newemail = new javax.swing.JTextField();
        newpassword = new javax.swing.JPasswordField();
        email_label = new javax.swing.JLabel();
        password_label = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        ln_label = new javax.swing.JLabel();
        fn_label = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
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

        right.setBackground(new java.awt.Color(255, 255, 255));
        right.setPreferredSize(new java.awt.Dimension(400, 500));

        register.setBackground(new java.awt.Color(34, 34, 34));
        register.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.setText("Register");
        register.setFocusable(false);
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        newemail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        newpassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        email_label.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        email_label.setText("Email:");

        password_label.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        password_label.setText("Password:");

        text.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        text.setText("Already have an account?");

        lastname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ln_label.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ln_label.setText("Last Name:");

        fn_label.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        fn_label.setText("First Name:");

        firstname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(51, 102, 255));
        login.setText("Login");
        login.setFocusable(false);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 34, 34));
        jLabel1.setText("REGISTER");

        back_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/back_arrow.png"))); // NOI18N
        back_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_buttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout rightLayout = new javax.swing.GroupLayout(right);
        right.setLayout(rightLayout);
        rightLayout.setHorizontalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightLayout.createSequentialGroup()
                .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ln_label, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(rightLayout.createSequentialGroup()
                                    .addComponent(fn_label)
                                    .addGap(208, 208, 208)))
                            .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, rightLayout.createSequentialGroup()
                                    .addComponent(text)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(password_label, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(email_label, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(firstname, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lastname, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(newemail, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(newpassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(rightLayout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(rightLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(back_button))
                    .addGroup(rightLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        rightLayout.setVerticalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(back_button)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fn_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ln_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(email_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newemail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login)
                    .addComponent(text))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        main_container.add(right);
        right.setBounds(400, 0, 400, 500);

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
                .addGap(0, 90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main_container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        try{
            LoginPage log = new LoginPage();
            log.setVisible(true);
            log.pack();
            log.setLocationRelativeTo(null);
            dispose();
        }catch(Exception log_error){
            System.out.println("page not found");
        }
    }//GEN-LAST:event_loginActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        if(firstname.getText().trim().isEmpty() || lastname.getText().trim().isEmpty() || 
                newemail.getText().trim().isEmpty() || newpassword.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Input fields cannot be empty");
        }else{
            try{
                DB_Connectivity db = new DB_Connectivity();
                Connection con = db.con;
                PreparedStatement st;
                String sql_4 = "SELECT * FROM accounts WHERE email=? ";
                st = con.prepareStatement(sql_4);
                st.setString(1, newemail.getText());
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    JOptionPane.showMessageDialog(this, "An account with this email already exist", "Registration Alert", 1);
                }
                else{
                    String email = newemail.getText();
                    String password = newpassword.getText();
                    if(isValidEmail(email)){
                        if(isValidPassword(password)){
                            String sql_1 = "INSERT INTO accounts (first_name, last_name, email, password) VALUES (?, ?, ?, ?);";
                            st = con.prepareStatement(sql_1);
                            st.setString(1, firstname.getText());
                            st.setString(2, lastname.getText());
                            st.setString(3, newemail.getText());
                            st.setString(4, newpassword.getText());
                            int ans = st.executeUpdate();
                            if(ans>0){
                                JOptionPane.showMessageDialog(this, "Registration Successful. Go to login", "Registration Alert", 1);
                                firstname.setText("");
                                lastname.setText("");
                                newemail.setText("");
                                newpassword.setText("");
                                firstname.requestFocus();
                            }else{
                                JOptionPane.showMessageDialog(this, "Registration Unsuccesful", "Registration Alert", 1);
                            }
                        }else{
                            JOptionPane.showMessageDialog(this, "Password must be of 8-15 characters\nIt must contain special characters", "Incorrect credentials", 1);
                        }                     
                    }else{
                        JOptionPane.showMessageDialog(this, "Email is invalid\n\nHint: abcxyz@domain.com", "Incorrect credentials", 1);
                    }
                }
                con.close();
            }catch(SQLException s_ex){
                Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE,null,s_ex);
            }
        }
    }//GEN-LAST:event_registerActionPerformed

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

    private static boolean isValidEmail(String email) {
        return email.length() >=14 && email.contains("@gmail.com") || email.contains("@hotmail.com");
    }
    
    private static boolean isValidPassword(String password) {
        String characters = "[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]+";
//        String numbers = "0123456789";
//        String upperalpha = "QWERTYUIOPASDFGHJKLZXCVBNM";
//        String loweralpha = "qwertyuiopasdfghjklzxcvbnm";
        Pattern pattern = Pattern.compile(characters);
//        Pattern pattern2 = Pattern.compile(numbers);
//        Pattern pattern3 = Pattern.compile(upperalpha);
//        Pattern pattern4 = Pattern.compile(loweralpha);
        Matcher spc = pattern.matcher(password);
//        Matcher num = pattern2.matcher(password);
//        Matcher upA = pattern3.matcher(password);
//        Matcher loA = pattern4.matcher(password);
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Register rg = new Register();
                rg.setVisible(true);
                rg.pack();
                rg.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back_button;
    private javax.swing.JLabel email_label;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel fn_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField lastname;
    private javax.swing.JPanel left;
    private javax.swing.JLabel ln_label;
    private javax.swing.JButton login;
    private javax.swing.JPanel main_container;
    private javax.swing.JTextField newemail;
    private javax.swing.JPasswordField newpassword;
    private javax.swing.JLabel password_label;
    private javax.swing.JButton register;
    private javax.swing.JPanel right;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
