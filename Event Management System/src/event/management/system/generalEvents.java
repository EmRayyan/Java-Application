package event.management.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class generalEvents extends javax.swing.JFrame {

    public generalEvents() {
        initComponents();
    }
    
    public generalEvents(String Email, String fName, String userName) {
        initComponents();
        try {
            DB_Connectivity db = new DB_Connectivity();
            ResultSet rs;
            PreparedStatement st;
            Connection con = db.con;
            String sql = "SELECT * FROM events WHERE category='General'";
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            DefaultTableModel tb = (DefaultTableModel)event_table.getModel();
            while(rs.next()){
                String events[]={rs.getString("event_name"), rs.getString("day"), rs.getString("date"),
                    rs.getString("time"), rs.getString("category"), rs.getString("venue")};
                tb.addRow(events);
            }
        } catch (SQLException ex) {
            Logger.getLogger(manageEvents.class.getName()).log(Level.SEVERE, null, ex);
        }
        email.setText(Email);
        fullname.setText(fName+" "+userName);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        side_panel = new javax.swing.JPanel();
        name_labell1 = new javax.swing.JLabel();
        fullname = new javax.swing.JTextField();
        email_label = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        dept_label1 = new javax.swing.JLabel();
        dept = new javax.swing.JTextField();
        event_label1 = new javax.swing.JLabel();
        eve_name = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        cancel_label1 = new javax.swing.JLabel();
        cancel_label2 = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        title_bar = new javax.swing.JPanel();
        gen_eve_label = new javax.swing.JLabel();
        back_button = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        search_icon = new javax.swing.JLabel();
        search_bar = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        event_table = new javax.swing.JTable();
        your_events1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1115, 605));
        getContentPane().setLayout(null);

        side_panel.setBackground(new java.awt.Color(34, 34, 34));
        side_panel.setPreferredSize(new java.awt.Dimension(300, 570));

        name_labell1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        name_labell1.setForeground(new java.awt.Color(255, 255, 255));
        name_labell1.setText("Full Name:");

        fullname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fullname.setFocusable(false);

        email_label.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        email_label.setForeground(new java.awt.Color(255, 255, 255));
        email_label.setText("Email:");

        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email.setFocusable(false);

        dept_label1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dept_label1.setForeground(new java.awt.Color(255, 255, 255));
        dept_label1.setText("Department:");

        dept.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        event_label1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        event_label1.setForeground(new java.awt.Color(255, 255, 255));
        event_label1.setText("Event Name:");

        eve_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(34, 34, 34));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        cancel_label1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        cancel_label1.setForeground(new java.awt.Color(255, 255, 255));
        cancel_label1.setText("REGISTRATION");

        cancel_label2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        cancel_label2.setForeground(new java.awt.Color(255, 255, 255));
        cancel_label2.setText("FORM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cancel_label1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(cancel_label2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(cancel_label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancel_label2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        register.setBackground(new java.awt.Color(255, 255, 255));
        register.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        register.setForeground(new java.awt.Color(24, 165, 88));
        register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/icons8-register-24.png"))); // NOI18N
        register.setText("REGISTER");
        register.setBorder(null);
        register.setFocusable(false);
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout side_panelLayout = new javax.swing.GroupLayout(side_panel);
        side_panel.setLayout(side_panelLayout);
        side_panelLayout.setHorizontalGroup(
            side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, side_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(side_panelLayout.createSequentialGroup()
                .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(side_panelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name_labell1)
                            .addComponent(email_label)
                            .addComponent(dept_label1)
                            .addComponent(event_label1)
                            .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(eve_name, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dept, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fullname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(side_panelLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        side_panelLayout.setVerticalGroup(
            side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(side_panelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(name_labell1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dept_label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(event_label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eve_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        getContentPane().add(side_panel);
        side_panel.setBounds(0, 0, 300, 570);

        title_bar.setBackground(new java.awt.Color(255, 255, 255));
        title_bar.setMinimumSize(new java.awt.Dimension(800, 70));
        title_bar.setPreferredSize(new java.awt.Dimension(1100, 60));

        gen_eve_label.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        gen_eve_label.setForeground(new java.awt.Color(34, 34, 34));
        gen_eve_label.setText("GENERAL EVENTS");

        back_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/back_arrow.png"))); // NOI18N
        back_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_buttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout title_barLayout = new javax.swing.GroupLayout(title_bar);
        title_bar.setLayout(title_barLayout);
        title_barLayout.setHorizontalGroup(
            title_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title_barLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(back_button)
                .addGap(236, 236, 236)
                .addComponent(gen_eve_label)
                .addContainerGap())
        );
        title_barLayout.setVerticalGroup(
            title_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title_barLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gen_eve_label)
                .addContainerGap(22, Short.MAX_VALUE))
            .addComponent(back_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(title_bar);
        title_bar.setBounds(300, 0, 800, 60);

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setPreferredSize(new java.awt.Dimension(800, 600));
        body.setLayout(null);

        search_icon.setForeground(new java.awt.Color(204, 204, 204));
        search_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/search_01.jpg"))); // NOI18N
        search_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_iconMouseClicked(evt);
            }
        });
        body.add(search_icon);
        search_icon.setBounds(740, 10, 24, 40);

        search_bar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        search_bar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_barMouseClicked(evt);
            }
        });
        body.add(search_bar);
        search_bar.setBounds(350, 10, 380, 40);

        event_table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        event_table.setForeground(new java.awt.Color(34, 34, 34));
        event_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event Name", "Day", "Date", "Time", "Venue"
            }
        ));
        jScrollPane3.setViewportView(event_table);

        body.add(jScrollPane3);
        jScrollPane3.setBounds(20, 60, 760, 430);

        your_events1.setBackground(new java.awt.Color(34, 34, 34));
        your_events1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        your_events1.setForeground(new java.awt.Color(34, 34, 34));
        your_events1.setText("SEARCH:");
        body.add(your_events1);
        your_events1.setBounds(260, 10, 90, 40);

        getContentPane().add(body);
        body.setBounds(300, 60, 800, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_barMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_barMouseClicked
        if(search_bar.getText().trim().isEmpty()){
            try {
                DB_Connectivity db = new DB_Connectivity();
                PreparedStatement st;
                Connection con = db.con;
                DefaultTableModel tb = (DefaultTableModel)event_table.getModel();
                tb.setRowCount(0);
                String sql_00 = "SELECT * FROM events WHERE category='General'";
                st = con.prepareStatement(sql_00);
                ResultSet rs = st.executeQuery();
                    while(rs.next()){
                        String events[]={rs.getString("event_name"), rs.getString("day"), rs.getString("date"),
                            rs.getString("time"), rs.getString("category"), rs.getString("venue")};
                        tb.addRow(events);
                    }
            } catch (SQLException ex) {
                Logger.getLogger(manageEvents.class.getName()).log(Level.SEVERE, null, ex);
            }

        }else{
            
        }
    }//GEN-LAST:event_search_barMouseClicked

    private void search_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_iconMouseClicked
        if(search_bar.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "No records found", "Message", 1);
            try {
                DB_Connectivity db = new DB_Connectivity();
                PreparedStatement st;
                Connection con = db.con;
                DefaultTableModel tb = (DefaultTableModel)event_table.getModel();
                tb.setRowCount(0);
                String sql_00 = "SELECT * FROM events WHERE category='General'";
                st = con.prepareStatement(sql_00);
                ResultSet rs = st.executeQuery();
                    while(rs.next()){
                        String events[]={rs.getString("event_name"), rs.getString("day"), rs.getString("date"),
                            rs.getString("time"), rs.getString("category"), rs.getString("venue")};
                        tb.addRow(events);
                    }
            } catch (SQLException ex) {
                Logger.getLogger(manageEvents.class.getName()).log(Level.SEVERE, null, ex);
            }

        }else{
            try{
                DB_Connectivity db = new DB_Connectivity();
                PreparedStatement st;
                Connection con = db.con;
                String sql_22 = "SELECT * FROM events WHERE category='General' AND event_name=? OR day=? OR date=?"
                + "OR time=? OR venue=?";
                st = con.prepareStatement(sql_22);
                st.setString(1, search_bar.getText());
                st.setString(2, search_bar.getText());
                st.setString(3, search_bar.getText());
                st.setString(4, search_bar.getText());
                st.setString(5, search_bar.getText());
                ResultSet rs = st.executeQuery();
                DefaultTableModel tb = (DefaultTableModel)event_table.getModel();
                tb.setRowCount(0);
                while(rs.next()){
                    String events[]={rs.getString("event_name"), rs.getString("day"), rs.getString("date"),
                        rs.getString("time"), rs.getString("category"), rs.getString("venue")};
                    tb.addRow(events);
                }
                con.close();
            }catch(SQLException s_ex){
                Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE,null,s_ex);
            }
        }
    }//GEN-LAST:event_search_iconMouseClicked

    private void back_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_buttonMouseClicked
        try{
            String fName = dashboard.getfName();
            String userName = dashboard.getUserName();
            String Email = dashboard.getEmail();
            String Password = dashboard.getPassword();
            dashboard dash = new dashboard(fName, userName, Email, Password);
            dash.setVisible(true);
            dash.pack();
            dash.setLocationRelativeTo(null);
            dispose();
        }catch(Exception fp_error){
            System.out.println("page not found");
        }
    }//GEN-LAST:event_back_buttonMouseClicked

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        if(fullname.getText().trim().isEmpty() || email.getText().trim().isEmpty() || dept.getText().trim().isEmpty() || 
                eve_name.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Input fields are empty");
        }else{
            try{
                    DB_Connectivity db = new DB_Connectivity();
                    ResultSet rs;
                    PreparedStatement st, st1;
                    Connection con = db.con;
                    String sql_05 = "SELECT * FROM events WHERE event_name=? AND category='General'";
                    st = con.prepareStatement(sql_05);
                    st.setString(1, eve_name.getText());
                    rs = st.executeQuery();
                    if(rs.next()){
                        String sql_5 = "SELECT * FROM participants WHERE full_name=? AND email=? AND department=? AND event_name=?";
                        st = con.prepareStatement(sql_5);
                        st.setString(1, fullname.getText());
                        st.setString(2, email.getText());
                        st.setString(3, dept.getText());
                        st.setString(4, eve_name.getText());
                        rs = st.executeQuery();
                        if(rs.next()){
                            JOptionPane.showMessageDialog(this, "You are already registered for this event", "Message", 1);
                        }else{
                            String sql_1 = "INSERT INTO participants (full_name, email, department, event_name) VALUES (?, ?, ?, ?);";
                            st = con.prepareStatement(sql_1);
                            st.setString(1, fullname.getText());
                            st.setString(2, email.getText());
                            st.setString(3, dept.getText());
                            st.setString(4, eve_name.getText());
                            int ans = st.executeUpdate();
                            String sql_01 ="SELECT * FROM events WHERE event_name=?";
                            st1 = con.prepareStatement(sql_01);
                            st1.setString(1, eve_name.getText());
                            rs = st1.executeQuery();
                            if(ans>0 && rs.next()){
                                String ename = rs.getString("event_name");
                                String eday = rs.getString("day");
                                String edate = rs.getString("date");
                                String etime = rs.getString("time");
                                String ecat = rs.getString("category");
                                String evenue = rs.getString("venue");
                                String sql_001 = "INSERT INTO your_events (email, event_name, day, date, time, category, venue)"
                                        + "VALUES (?, ?, ?, ?, ?, ?, ?);";
                                st1 = con.prepareStatement(sql_001);
                                st1.setString(1, email.getText());
                                st1.setString(2, ename);
                                st1.setString(3, eday);
                                st1.setString(4, edate);
                                st1.setString(5, etime);
                                st1.setString(6, ecat);
                                st1.setString(7, evenue);
                                int ans2= st1.executeUpdate();
                                if(ans2>0){
                                    JOptionPane.showMessageDialog(this, "Registration Successful", "Message", 1);
                                    dept.setText("");
                                    eve_name.setText("");
                                    dept.requestFocus();
                                }else{
                                    JOptionPane.showMessageDialog(this, "Error", "Message", 1);
                                }
                            }else{
                                JOptionPane.showMessageDialog(this, "Registration Unsuccesful", "Message", 1);
                            }
                        } 
                    }else{
                        JOptionPane.showMessageDialog(this, "Event Not Found", "Messages", 1);
                    }
            }catch(SQLException s_ex){
                Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE,null,s_ex);
            }
        }
    }//GEN-LAST:event_registerActionPerformed


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
                generalEvents gen_eve = new generalEvents();
                gen_eve.setVisible(true);
                gen_eve.pack();
                gen_eve.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back_button;
    private javax.swing.JPanel body;
    private javax.swing.JLabel cancel_label1;
    private javax.swing.JLabel cancel_label2;
    private javax.swing.JTextField dept;
    private javax.swing.JLabel dept_label1;
    private javax.swing.JTextField email;
    private javax.swing.JLabel email_label;
    private javax.swing.JTextField eve_name;
    private javax.swing.JLabel event_label1;
    private javax.swing.JTable event_table;
    private javax.swing.JTextField fullname;
    private javax.swing.JLabel gen_eve_label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel name_labell1;
    private javax.swing.JButton register;
    private javax.swing.JTextField search_bar;
    private javax.swing.JLabel search_icon;
    private javax.swing.JPanel side_panel;
    private javax.swing.JPanel title_bar;
    private javax.swing.JLabel your_events1;
    // End of variables declaration//GEN-END:variables
}
