package event.management.system;

import java.sql.*;
import javax.swing.JOptionPane;
import java.util.logging.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class adminAccount extends javax.swing.JFrame {

    public adminAccount() {
        initComponents();
    }
    
    private static String id;
    
    public adminAccount(String id,String userName, String Password) {
        initComponents();
        setId(id);
        ID.setText(id);        
        NAME.setText(userName);
        password.setText(Password);
        fullname.setText(userName);
    }
    
    public static String getId() {
        return id;
    }

    private static void setId(String ID) {
        id = ID;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        side_panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        deleteacc = new javax.swing.JButton();
        NAME = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        edit_email1 = new javax.swing.JPanel();
        password_label = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        newpass_label = new javax.swing.JLabel();
        newpassword = new javax.swing.JTextField();
        conpass_label = new javax.swing.JLabel();
        conpassword = new javax.swing.JTextField();
        changepassword = new javax.swing.JButton();
        edit_email2 = new javax.swing.JPanel();
        fullname_label = new javax.swing.JLabel();
        fullname = new javax.swing.JTextField();
        fname_label = new javax.swing.JLabel();
        newname = new javax.swing.JTextField();
        conname = new javax.swing.JTextField();
        lname_label1 = new javax.swing.JLabel();
        changename = new javax.swing.JButton();
        event_label = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        title_bar = new javax.swing.JPanel();
        homebutton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1115, 605));
        getContentPane().setLayout(null);

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setPreferredSize(new java.awt.Dimension(800, 600));
        body.setLayout(null);

        side_panel.setBackground(new java.awt.Color(34, 34, 34));
        side_panel.setPreferredSize(new java.awt.Dimension(300, 570));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/icons8-user-100.png"))); // NOI18N

        ID.setBackground(new java.awt.Color(24, 165, 88));
        ID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ID.setForeground(new java.awt.Color(255, 255, 255));
        ID.setText("ID");

        deleteacc.setBackground(new java.awt.Color(34, 34, 34));
        deleteacc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteacc.setForeground(new java.awt.Color(255, 34, 34));
        deleteacc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/icons8-deleteacc-26.png"))); // NOI18N
        deleteacc.setText("DELETE ACCOUNT");
        deleteacc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));
        deleteacc.setFocusable(false);
        deleteacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteaccActionPerformed(evt);
            }
        });

        NAME.setBackground(new java.awt.Color(24, 165, 88));
        NAME.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NAME.setForeground(new java.awt.Color(255, 255, 255));
        NAME.setText("NAME");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/Free_Sample_By_Wix.jpg"))); // NOI18N

        javax.swing.GroupLayout side_panelLayout = new javax.swing.GroupLayout(side_panel);
        side_panel.setLayout(side_panelLayout);
        side_panelLayout.setHorizontalGroup(
            side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(side_panelLayout.createSequentialGroup()
                .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(side_panelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(side_panelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ID)
                                    .addComponent(NAME)))))
                    .addGroup(side_panelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel5))
                    .addGroup(side_panelLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(deleteacc, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        side_panelLayout.setVerticalGroup(
            side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, side_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(70, 70, 70)
                .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(side_panelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel3))
                    .addGroup(side_panelLayout.createSequentialGroup()
                        .addComponent(ID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NAME)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(deleteacc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );

        body.add(side_panel);
        side_panel.setBounds(0, -60, 300, 630);

        edit_email1.setBackground(new java.awt.Color(255, 255, 255));
        edit_email1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        password_label.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        password_label.setForeground(new java.awt.Color(34, 34, 34));
        password_label.setText("Password:");

        password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        password.setFocusable(false);

        newpass_label.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        newpass_label.setForeground(new java.awt.Color(34, 34, 34));
        newpass_label.setText("New Password:");

        newpassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        conpass_label.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        conpass_label.setForeground(new java.awt.Color(34, 34, 34));
        conpass_label.setText("Confirm Password:");

        conpassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        changepassword.setBackground(new java.awt.Color(34, 34, 34));
        changepassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        changepassword.setForeground(new java.awt.Color(255, 255, 255));
        changepassword.setText("CHANGE");
        changepassword.setFocusable(false);
        changepassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout edit_email1Layout = new javax.swing.GroupLayout(edit_email1);
        edit_email1.setLayout(edit_email1Layout);
        edit_email1Layout.setHorizontalGroup(
            edit_email1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_email1Layout.createSequentialGroup()
                .addGroup(edit_email1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(edit_email1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(edit_email1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password_label)
                            .addComponent(newpass_label)
                            .addGroup(edit_email1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(newpassword, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(conpassword, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(conpass_label)))
                    .addGroup(edit_email1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(changepassword, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        edit_email1Layout.setVerticalGroup(
            edit_email1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_email1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(password_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newpass_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conpass_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(changepassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        body.add(edit_email1);
        edit_email1.setBounds(410, 110, 274, 309);

        edit_email2.setBackground(new java.awt.Color(255, 255, 255));
        edit_email2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 2));

        fullname_label.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        fullname_label.setForeground(new java.awt.Color(34, 34, 34));
        fullname_label.setText("Full Name:");

        fullname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fullname.setFocusable(false);

        fname_label.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        fname_label.setForeground(new java.awt.Color(34, 34, 34));
        fname_label.setText("New Name:");

        newname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        conname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lname_label1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lname_label1.setForeground(new java.awt.Color(34, 34, 34));
        lname_label1.setText("Confirm Name:");

        changename.setBackground(new java.awt.Color(34, 34, 34));
        changename.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        changename.setForeground(new java.awt.Color(255, 255, 255));
        changename.setText("CHANGE");
        changename.setFocusable(false);
        changename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changenameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout edit_email2Layout = new javax.swing.GroupLayout(edit_email2);
        edit_email2.setLayout(edit_email2Layout);
        edit_email2Layout.setHorizontalGroup(
            edit_email2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_email2Layout.createSequentialGroup()
                .addGroup(edit_email2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(edit_email2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(edit_email2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fullname_label)
                            .addComponent(fname_label)
                            .addGroup(edit_email2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(newname, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fullname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(conname, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(lname_label1)))
                    .addGroup(edit_email2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(changename, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        edit_email2Layout.setVerticalGroup(
            edit_email2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_email2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(fullname_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fname_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lname_label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(changename, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        body.add(edit_email2);
        edit_email2.setBounds(720, 110, 274, 309);

        event_label.setBackground(new java.awt.Color(34, 34, 34));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/icons8-edit2-26.png"))); // NOI18N
        jLabel4.setText("EDIT DETAILS");

        javax.swing.GroupLayout event_labelLayout = new javax.swing.GroupLayout(event_label);
        event_label.setLayout(event_labelLayout);
        event_labelLayout.setHorizontalGroup(
            event_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(event_labelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        event_labelLayout.setVerticalGroup(
            event_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, event_labelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(15, 15, 15))
        );

        body.add(event_label);
        event_label.setBounds(570, 30, 270, 50);

        getContentPane().add(body);
        body.setBounds(0, 60, 1120, 510);

        title_bar.setBackground(new java.awt.Color(34, 34, 34));
        title_bar.setMinimumSize(new java.awt.Dimension(800, 70));
        title_bar.setPreferredSize(new java.awt.Dimension(1100, 60));

        homebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/icons8-homeempty-26.png"))); // NOI18N
        homebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homebuttonMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" MY ACCOUNT");

        logout.setBackground(new java.awt.Color(34, 34, 34));
        logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(51, 154, 240));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/icons8-logout2-28.png"))); // NOI18N
        logout.setText("LOGOUT");
        logout.setBorder(null);
        logout.setFocusable(false);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout title_barLayout = new javax.swing.GroupLayout(title_bar);
        title_bar.setLayout(title_barLayout);
        title_barLayout.setHorizontalGroup(
            title_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title_barLayout.createSequentialGroup()
                .addContainerGap(458, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(257, 257, 257)
                .addComponent(homebutton)
                .addGap(13, 13, 13)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        title_barLayout.setVerticalGroup(
            title_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title_barLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(title_barLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(title_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(homebutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(title_bar);
        title_bar.setBounds(0, 0, 1120, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changepasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepasswordActionPerformed
        if(password.getText().trim().isEmpty() || newpassword.getText().trim().isEmpty() || conpassword.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Input fields cannot be empty");
        }else{
            try{
                DB_Connectivity db = new DB_Connectivity();
                Connection con = db.con;
                ResultSet rs;
                PreparedStatement st;
                String sql_2 = "SELECT * FROM admins WHERE id=? AND password=?";
                st = con.prepareStatement(sql_2);
                st.setString(1, ID.getText());
                st.setString(2, newpassword.getText());
                rs = st.executeQuery();
                if(rs.next()){
                    JOptionPane.showMessageDialog(this, "New password cannot be same as the old password", 
                        "Message", 1);
                }else{
                    String sql_7 = "SELECT * FROM admins WHERE id=?";
                    st = con.prepareStatement(sql_7);
                    st.setString(1, ID.getText());
                    rs = st.executeQuery();
                    if(rs.next()){
                        String new_Password = newpassword.getText();
                        if(isValidPassword(new_Password)){
                          if(validateConfirmPassword(new_Password)){
                            String sql_3 = "UPDATE admins SET password = ? WHERE id = ?";
                            st = con.prepareStatement(sql_3);
                            st.setString(1, newpassword.getText());
                            st.setString(2, ID.getText());
                            int ans = st.executeUpdate();
                            if(ans>0){
                                JOptionPane.showMessageDialog(this, "Password updated successfully", "Message", 1); 
                                String sql_0001 = "SELECT * FROM admins WHERE id=?;";
                                st = con.prepareStatement(sql_0001);
                                st.setString(1, ID.getText());
                                rs = st.executeQuery();
                                String nPass = "";
                                if(rs.next()){
                                    nPass = rs.getString("password");
                                }
                                String userName = adminDashboard.getUserName();
                                String Id = adminDashboard.getId();
                                String Password = nPass;
                                adminDashboard adash = new adminDashboard(userName, Id, Password);
                                password.setText(nPass);
                                newpassword.setText("");
                                conpassword.setText("");
                                newpassword.requestFocus();
                            }else{
                                JOptionPane.showMessageDialog(this, "Password update failed", "Message", 1);
                                conpassword.setText("");
                                newpassword.requestFocus();
                            }
                          }else{
                              JOptionPane.showMessageDialog(this, "Confirm password does not match the new password", "Incorrect credentials", 1);
                          }
                        }else{
                            JOptionPane.showMessageDialog(this, "Password must be of 8-15 characters\nIt must contain special characters", "Incorrect credentials", 1);
                        }                        
                    }else{
                        
                    }
                    
                    con.close();
                }
                }catch(SQLException s_ex){
                    Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE,null,s_ex);
                }
        }
    }//GEN-LAST:event_changepasswordActionPerformed

    private void changenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changenameActionPerformed
        if(fullname.getText().trim().isEmpty() || newname.getText().trim().isEmpty() ||
            conname.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Input fields cannot be empty");
        }else{
            try{
                DB_Connectivity db = new DB_Connectivity();
                Connection con = db.con;
                PreparedStatement st;
                String sql_4 = "SELECT * FROM admins WHERE id=? AND fullname=?";
                st = con.prepareStatement(sql_4);
                st.setString(1, ID.getText());
                st.setString(2, newname.getText());
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    JOptionPane.showMessageDialog(this, "New name is same as the previous one", "Registration Alert", 1);
                }
                else{
                    String new_name = newname.getText();
                    if(validateConfirmName(new_name)){
                            String sql_1 = "UPDATE admins SET fullname=? WHERE id=?;";
                            st = con.prepareStatement(sql_1);
                            st.setString(1, newname.getText());
                            st.setString(2, ID.getText());
                            int ans = st.executeUpdate();
                            if(ans>0){
                                        JOptionPane.showMessageDialog(this, "Name successfully updated", "Message", 1);
                                        String sql_0001 = "SELECT * FROM admins WHERE id=?;";
                                        st = con.prepareStatement(sql_0001);
                                        st.setString(1, ID.getText());
                                        rs = st.executeQuery();
                                        String nName = "";
                                        if(rs.next()){
                                            nName = rs.getString("fullname");
                                        }
                                        String userName = nName;
                                        String Id = adminDashboard.getId();
                                        String Password = adminDashboard.getPassword();
                                        adminDashboard adash = new adminDashboard(userName, Id, Password);
                                        NAME.setText(nName);
                                        fullname.setText(nName);
                                        newname.setText("");
                                        conname.setText("");
                                        newpassword.requestFocus();
                            }else{
                                JOptionPane.showMessageDialog(this, "Update Failed", "Alert", 1);
                            }
                        }else{
                        JOptionPane.showMessageDialog(this, "Confirm name does not match the new name", "Alert", 1);
                    }
                }
                con.close();
            }catch(SQLException s_ex){
                Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE,null,s_ex);
            }
        }
    }//GEN-LAST:event_changenameActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        try{
            Object[] options = {"YES", "NO"};
            int choice = JOptionPane.showOptionDialog(
                null,
                "Are you sure you want to logout?",
                "Message",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
            if (choice == JOptionPane.YES_OPTION) {
                Welcome welcomeframe = new Welcome();
                welcomeframe.setVisible(true);
                welcomeframe.pack();
                welcomeframe.setLocationRelativeTo(null);
                disposeWindow();
            } else if (choice == JOptionPane.NO_OPTION) {
                
            } else {
                
            }
        }catch(Exception fp_error){
            System.out.println("page not found");
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void deleteaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteaccActionPerformed
        try{
            Object[] options = {"YES", "NO"};
            int choice = JOptionPane.showOptionDialog(
                null,
                "Are you sure you want to delete your account?",
                "Alert",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
            if (choice == JOptionPane.YES_OPTION) {
                Object[] options1 = {"YES", "NO"};
                int choice1 = JOptionPane.showOptionDialog(
                    null,
                    "Deleting your account will permenantly\ndelete all your data and cannot\nbe recovered afterwards",
                    "WARNING!",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options1,
                    options1[0]);
                if (choice1 == JOptionPane.YES_OPTION) {
                    DB_Connectivity db = new DB_Connectivity();
                    Connection con = db.con;
                    PreparedStatement st0, st, st1, st2;
                    ResultSet rs;
                    String sql_1 = "SELECT * FROM admins WHERE id='"+id+"'";
                    st0 = con.prepareStatement(sql_1);
                    rs = st0.executeQuery();
                    if(rs.next()){
                        String sql_0 = "DELETE FROM admins WHERE id='"+id+"'";
                        st = con.prepareStatement(sql_0);
                        int ans = st.executeUpdate();
                        if(ans>0){
                            JOptionPane.showMessageDialog(this, "Your account has been deleted", "Message", 1);
                            Welcome welcomeframe = new Welcome();
                            welcomeframe.setVisible(true);
                            welcomeframe.pack();
                            welcomeframe.setLocationRelativeTo(null);
                            disposeWindow();
                        }else{
                            JOptionPane.showMessageDialog(this, "Error", "Message", 1);
                        }
                    }else{
                       JOptionPane.showMessageDialog(this, "Error", "Alert", 1); 
                    }
                } else if (choice1 == JOptionPane.NO_OPTION) {
                
                } else {
                
                }
            } else if (choice == JOptionPane.NO_OPTION) {
                
            } else {
                
            }
        }catch(Exception fp_error){
            System.out.println(fp_error);
        }
    }//GEN-LAST:event_deleteaccActionPerformed

    private void homebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebuttonMouseClicked
        try{
            String userName = adminDashboard.getUserName();
            String userId = adminDashboard.getId();
            String Password = adminDashboard.getPassword();
            adminDashboard adash = new adminDashboard(userName, userId, Password);
            adash.setVisible(true);
            adash.pack();
            adash.setLocationRelativeTo(null);
            dispose();
        }catch(Exception fp_error){
            System.out.println("page not found");
        }
    }//GEN-LAST:event_homebuttonMouseClicked


    private static boolean isValidPassword(String password) {
        String characters = "[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]+";
        Pattern pattern = Pattern.compile(characters);
        Matcher spc = pattern.matcher(password);
        return password.length() >= 8 && password.length() <= 15 && spc.find();   
    }
    
    private static boolean isValidEmail(String email) {
        return email.length() >=16 && email.contains("@gmail.com") || email.contains("@hotmail.com");
    }
    
    private boolean validateConfirmName(String nname){
        String con_name = conname.getText();
        return con_name.equals(nname);
    }
    
    private boolean validateConfirmPassword(String npassword){
        String con_password = conpassword.getText();
        return con_password.equals(npassword);
    }
    
    public void disposeWindow(){
        this.dispose();
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
                adminAccount aacc = new adminAccount();
                aacc.setVisible(true);
                aacc.pack();
                aacc.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JLabel NAME;
    private javax.swing.JPanel body;
    private javax.swing.JButton changename;
    private javax.swing.JButton changepassword;
    private javax.swing.JTextField conname;
    private javax.swing.JLabel conpass_label;
    private javax.swing.JTextField conpassword;
    private javax.swing.JButton deleteacc;
    private javax.swing.JPanel edit_email1;
    private javax.swing.JPanel edit_email2;
    private javax.swing.JPanel event_label;
    private javax.swing.JLabel fname_label;
    private javax.swing.JTextField fullname;
    private javax.swing.JLabel fullname_label;
    private javax.swing.JLabel homebutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lname_label1;
    private javax.swing.JButton logout;
    private javax.swing.JTextField newname;
    private javax.swing.JLabel newpass_label;
    private javax.swing.JTextField newpassword;
    private javax.swing.JTextField password;
    private javax.swing.JLabel password_label;
    private javax.swing.JPanel side_panel;
    private javax.swing.JPanel title_bar;
    // End of variables declaration//GEN-END:variables
}
