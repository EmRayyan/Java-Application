package event.management.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class participants extends javax.swing.JFrame {

    public participants() {
        initComponents();
        try {
            DB_Connectivity db = new DB_Connectivity();
            ResultSet rs, rs1;
            PreparedStatement st, st1;
            Connection con = db.con;
            String sql = "SELECT * FROM participants";
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            DefaultTableModel tb = (DefaultTableModel)event_table.getModel();
            while(rs.next()){
                String ename = rs.getString("event_name");
                String sql_0 = "SELECT * FROM events WHERE event_name='"+ename+"'";
                st1 = con.prepareStatement(sql_0);
                rs1 = st1.executeQuery();
                if(rs1.next()){
                    String events[]={rs.getString("full_name"), rs.getString("email"), rs.getString("department"),
                        rs.getString("event_name"), rs1.getString("category")};
                    tb.addRow(events);
                }else{
                    JOptionPane.showMessageDialog(this, "Error", "Message", 1);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(manageEvents.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        title_bar = new javax.swing.JPanel();
        parti_label = new javax.swing.JLabel();
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

        email_label.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        email_label.setForeground(new java.awt.Color(255, 255, 255));
        email_label.setText("Email:");

        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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
        cancel_label1.setText("MANAGE");

        cancel_label2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        cancel_label2.setForeground(new java.awt.Color(255, 255, 255));
        cancel_label2.setText("PARTICIPANTS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(cancel_label2)
                .addGap(12, 12, 12))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(cancel_label1)
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

        add.setBackground(new java.awt.Color(255, 255, 255));
        add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(51, 102, 255));
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/icons8-add-22.png"))); // NOI18N
        add.setText("ADD");
        add.setBorder(null);
        add.setFocusable(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(255, 255, 255));
        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(0, 102, 0));
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/icons8-update-24.png"))); // NOI18N
        update.setText("UPDATE");
        update.setFocusable(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(153, 0, 0));
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/event/management/system/icons8-delete-24.png"))); // NOI18N
        delete.setText("DELETE");
        delete.setFocusable(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
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
                        .addGap(35, 35, 35)
                        .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(side_panelLayout.createSequentialGroup()
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(update))
                            .addGroup(side_panelLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(delete)))))
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
                .addGap(18, 18, 18)
                .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(side_panel);
        side_panel.setBounds(0, 0, 300, 570);

        title_bar.setBackground(new java.awt.Color(255, 255, 255));
        title_bar.setMinimumSize(new java.awt.Dimension(800, 70));
        title_bar.setPreferredSize(new java.awt.Dimension(1100, 60));

        parti_label.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        parti_label.setForeground(new java.awt.Color(34, 34, 34));
        parti_label.setText("PARTICIPANTS");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                .addComponent(parti_label)
                .addGap(270, 270, 270))
        );
        title_barLayout.setVerticalGroup(
            title_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addGroup(title_barLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(parti_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        search_icon.setBounds(740, 10, 30, 40);

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
                "Participant Name", "Email", "Department", "Event Name", "Category"
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
                PreparedStatement st, st1;
                ResultSet rs, rs1;
                Connection con = db.con;
                DefaultTableModel tb = (DefaultTableModel)event_table.getModel();
                tb.setRowCount(0);
                String sql = "SELECT * FROM participants";
                st = con.prepareStatement(sql);
                rs = st.executeQuery();
                while(rs.next()){
                    String ename = rs.getString("event_name");
                    String sql_0 = "SELECT * FROM events WHERE event_name='"+ename+"'";
                    st1 = con.prepareStatement(sql_0);
                    rs1 = st1.executeQuery();
                    if(rs1.next()){
                        String events[]={rs.getString("full_name"), rs.getString("email"), rs.getString("department"),
                            rs.getString("event_name"), rs1.getString("category")};
                        tb.addRow(events);
                    }else{
                        JOptionPane.showMessageDialog(this, "Error", "Message", 1);
                    }
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
                PreparedStatement st, st1;
                ResultSet rs, rs1;
                Connection con = db.con;
                DefaultTableModel tb = (DefaultTableModel)event_table.getModel();
                tb.setRowCount(0);
                String sql_00 = "SELECT * FROM participants";
                st = con.prepareStatement(sql_00);
                rs = st.executeQuery();
                while(rs.next()){
                String ename = rs.getString("event_name");
                String sql_0 = "SELECT * FROM events WHERE event_name='"+ename+"'";
                st1 = con.prepareStatement(sql_0);
                rs1 = st1.executeQuery();
                    if(rs1.next()){
                        String events[]={rs.getString("full_name"), rs.getString("email"), rs.getString("department"),
                            rs.getString("event_name"), rs1.getString("category")};
                        tb.addRow(events);
                    }else{
                        JOptionPane.showMessageDialog(this, "Error", "Message", 1);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(manageEvents.class.getName()).log(Level.SEVERE, null, ex);
            }
                                        
        }else{
            try{
                DB_Connectivity db = new DB_Connectivity();
                PreparedStatement st, st1;
                Connection con = db.con;
                String sql_22 = "SELECT * FROM participants WHERE full_name=? OR email=? OR department=? OR event_name=?";
                st = con.prepareStatement(sql_22);
                st.setString(1, search_bar.getText());
                st.setString(2, search_bar.getText());
                st.setString(3, search_bar.getText());
                st.setString(4, search_bar.getText());
                ResultSet rs, rs1;
                rs = st.executeQuery();
                DefaultTableModel tb = (DefaultTableModel)event_table.getModel();
                tb.setRowCount(0);
                  while(rs.next()){
                    String ename = rs.getString("event_name");
                    String sql_0 = "SELECT * FROM events WHERE event_name='"+ename+"'";
                    st1 = con.prepareStatement(sql_0);
                    rs1 = st1.executeQuery();
                        if(rs1.next()){
                            String events[]={rs.getString("full_name"), rs.getString("email"), rs.getString("department"),
                                rs.getString("event_name"), rs1.getString("category")};
                            tb.addRow(events);
                        }else{
                            JOptionPane.showMessageDialog(this, "Error", "Message", 1);
                        }
                  }
                  int i = tb.getRowCount();
                  if(i==0){
                        JOptionPane.showMessageDialog(this, "Incorrect Details\n\nElse: Cannot search by event category", "Message", 1);
                  }else{
                      
                  }
                con.close();
            }catch(SQLException s_ex){
                Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE,null,s_ex);
            }
        }
    }//GEN-LAST:event_search_iconMouseClicked

    private void back_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_buttonMouseClicked
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
    }//GEN-LAST:event_back_buttonMouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if(fullname.getText().trim().isEmpty() || email.getText().trim().isEmpty() || dept.getText().trim().isEmpty() || 
                eve_name.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Input fields are empty");
        }else{
            try{
                DB_Connectivity db = new DB_Connectivity();
                ResultSet rs;
                PreparedStatement st, st1;
                Connection con = db.con;
                String sql_005 = "SELECT * FROM accounts WHERE email=?";
                st = con.prepareStatement(sql_005);
                st.setString(1, email.getText());
                rs = st.executeQuery();
                if(rs.next()){
                    String fname = rs.getString("first_name");
                    String lname = rs.getString("last_name");
                    fullname.setText(fname+" "+lname);
                    String sql_05 = "SELECT * FROM events WHERE event_name=?";
                    st = con.prepareStatement(sql_05);
                    st.setString(1, eve_name.getText());
                    rs = st.executeQuery();
                    if(rs.next()){
                        String sql_5 = "SELECT * FROM participants WHERE email=? AND event_name=?";
                        st = con.prepareStatement(sql_5);
                        st.setString(1, email.getText());
                        st.setString(2, eve_name.getText());
                        rs = st.executeQuery();
                        if(rs.next()){
                            JOptionPane.showMessageDialog(this, "The user is already registered for this event", "Message", 1);
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
                                    try {
                                        ResultSet rs1;
                                        String sql = "SELECT * FROM participants";
                                        st = con.prepareStatement(sql);
                                        rs = st.executeQuery();
                                        DefaultTableModel tb = (DefaultTableModel)event_table.getModel();
                                        tb.setRowCount(0);
                                        while(rs.next()){
                                            String e_name = rs.getString("event_name");
                                            String sql_0 = "SELECT * FROM events WHERE event_name='"+e_name+"'";
                                            st1 = con.prepareStatement(sql_0);
                                            rs1 = st1.executeQuery();
                                            if(rs1.next()){
                                                String events[]={rs.getString("full_name"), rs.getString("email"), rs.getString("department"),
                                                    rs.getString("event_name"), rs1.getString("category")};
                                                tb.addRow(events);
                                            }else{
                                                JOptionPane.showMessageDialog(this, "Error", "Message", 1);
                                            }
                                        }
                                    } catch (SQLException ex) {
                                        Logger.getLogger(manageEvents.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    fullname.setText("");
                                    email.setText("");
                                    dept.setText("");
                                    eve_name.setText("");
                                    fullname.requestFocus();
                                }else{
                                    JOptionPane.showMessageDialog(this, "Error", "Message", 1);
                                }
                            }else{
                                JOptionPane.showMessageDialog(this, "Registration Unsuccesful", "Message", 1);
                            }
                        } 
                    }else{
                        JOptionPane.showMessageDialog(this, "Event Not Found", "Message", 1);
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "This user doesn't have an account,\nso cannot be registered for events", "Message", 1);
                }    
            }catch(SQLException s_ex){
                Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE,null,s_ex);
            }
        }
    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if(fullname.getText().trim().isEmpty() || email.getText().trim().isEmpty() || dept.getText().trim().isEmpty() ||
            eve_name.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Input fields are empty");
        }else{
            try{
                DB_Connectivity db = new DB_Connectivity();
                ResultSet rs;
                PreparedStatement st, st1;
                Connection con = db.con;
                String sql_005 = "SELECT * FROM accounts WHERE email=?";
                st = con.prepareStatement(sql_005);
                st.setString(1, email.getText());
                rs = st.executeQuery();
              if(rs.next()){
               String fname = rs.getString("first_name");
               String lname = rs.getString("last_name");
               fullname.setText(fname+" "+lname);
               String sql_0005 = "SELECT * FROM events WHERE event_name=?";
               st = con.prepareStatement(sql_0005);
               st.setString(1, eve_name.getText());
               rs = st.executeQuery(); 
               if(rs.next()){
                String sql_05 = "SELECT * FROM your_events WHERE event_name=? AND email=?";
                st = con.prepareStatement(sql_05);
                st.setString(1, eve_name.getText());
                st.setString(2, email.getText());
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
                        JOptionPane.showMessageDialog(this, "New details are same as the previous ones", "Message", 1);
                    }else{
                        String sql_1 = "UPDATE participants SET department=? WHERE email=? AND event_name=?;";
                        st = con.prepareStatement(sql_1);
                        st.setString(1, dept.getText());
                        st.setString(2, email.getText());
                        st.setString(3, eve_name.getText());
                        int ans = st.executeUpdate();
                        if(ans>0){
                                JOptionPane.showMessageDialog(this, "Updated Successful", "Message", 1);
                                try {
                                    ResultSet rs1;
                                        String sql = "SELECT * FROM participants";
                                        st = con.prepareStatement(sql);
                                        rs = st.executeQuery();
                                        DefaultTableModel tb = (DefaultTableModel)event_table.getModel();
                                        tb.setRowCount(0);
                                        while(rs.next()){
                                            String e_name = rs.getString("event_name");
                                            String sql_0 = "SELECT * FROM events WHERE event_name='"+e_name+"'";
                                            st1 = con.prepareStatement(sql_0);
                                            rs1 = st1.executeQuery();
                                            if(rs1.next()){
                                                String events[]={rs.getString("full_name"), rs.getString("email"), rs.getString("department"),
                                                    rs.getString("event_name"), rs1.getString("category")};
                                                tb.addRow(events);
                                            }else{
                                                JOptionPane.showMessageDialog(this, "Error", "Message", 1);
                                            }
                                        }
                                } catch (SQLException ex) {
                                    Logger.getLogger(manageEvents.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                fullname.setText("");
                                email.setText("");
                                dept.setText("");
                                eve_name.setText("");
                                fullname.requestFocus();
                        }else{
                            JOptionPane.showMessageDialog(this, "Update Failed", "Message", 1);
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "The user is not registered for this event", "Incorrect Credentials", 1);
                }
               }else{
                   JOptionPane.showMessageDialog(rootPane, "Event Not Found");
               }
              }else{
                  JOptionPane.showMessageDialog(rootPane, "Incorrect email");
              }
            }catch(SQLException s_ex){
                Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE,null,s_ex);
            }
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if(fullname.getText().trim().isEmpty() || email.getText().trim().isEmpty() || dept.getText().trim().isEmpty() ||
            eve_name.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Input fields are empty");
        }else{
            try{
                DB_Connectivity db = new DB_Connectivity();
                ResultSet rs;
                PreparedStatement st, st1;
                Connection con = db.con;
                String sql_05 = "SELECT * FROM your_events WHERE event_name=? AND email=?";
                st = con.prepareStatement(sql_05);
                st.setString(1, eve_name.getText());
                st.setString(2, email.getText());
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
                        String sql_1 = "DELETE FROM participants WHERE email=? AND event_name=?;";
                        st = con.prepareStatement(sql_1);
                        st.setString(1, email.getText());
                        st.setString(2, eve_name.getText());
                        int ans = st.executeUpdate();
                        String sql_01 ="SELECT * FROM events WHERE event_name=?";
                        st1 = con.prepareStatement(sql_01);
                        st1.setString(1, eve_name.getText());
                        rs = st1.executeQuery();
                        if(ans>0 && rs.next()){
                            String ename = rs.getString("event_name");
                            String sql_001 = "DELETE FROM your_events WHERE email=? AND event_name=?;";
                            st1 = con.prepareStatement(sql_001);
                            st1.setString(1, email.getText());
                            st1.setString(2, ename);
                            int ans2= st1.executeUpdate();
                            if(ans2>0){
                                JOptionPane.showMessageDialog(this, "Registration Cancelled", "Message", 1);
                                try {
                                    ResultSet rs1;
                                        String sql = "SELECT * FROM participants";
                                        st = con.prepareStatement(sql);
                                        rs = st.executeQuery();
                                        DefaultTableModel tb = (DefaultTableModel)event_table.getModel();
                                        tb.setRowCount(0);
                                        while(rs.next()){
                                            String e_name = rs.getString("event_name");
                                            String sql_0 = "SELECT * FROM events WHERE event_name='"+e_name+"'";
                                            st1 = con.prepareStatement(sql_0);
                                            rs1 = st1.executeQuery();
                                            if(rs1.next()){
                                                String events[]={rs.getString("full_name"), rs.getString("email"), rs.getString("department"),
                                                    rs.getString("event_name"), rs1.getString("category")};
                                                tb.addRow(events);
                                            }else{
                                                JOptionPane.showMessageDialog(this, "Error", "Message", 1);
                                            }
                                        }
                                } catch (SQLException ex) {
                                    Logger.getLogger(manageEvents.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                fullname.setText("");
                                email.setText("");
                                dept.setText("");
                                eve_name.setText("");
                                fullname.requestFocus();
                            }else{
                                JOptionPane.showMessageDialog(this, "Error", "Message", 1);
                            }
                        }else{
                            JOptionPane.showMessageDialog(this, "Failed To Cancel Registration", "Message", 1);
                        }
                    }else{
                        JOptionPane.showMessageDialog(this, "Incorrect Details", "Alert", 1);
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "User with these credentials is not registered for this event", "Messages", 1);
                }
            }catch(SQLException s_ex){
                Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE,null,s_ex);
            }
        }
    }//GEN-LAST:event_deleteActionPerformed


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
                participants parti = new participants();
                parti.setVisible(true);
                parti.pack();
                parti.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel back_button;
    private javax.swing.JPanel body;
    private javax.swing.JLabel cancel_label1;
    private javax.swing.JLabel cancel_label2;
    private javax.swing.JButton delete;
    private javax.swing.JTextField dept;
    private javax.swing.JLabel dept_label1;
    private javax.swing.JTextField email;
    private javax.swing.JLabel email_label;
    private javax.swing.JTextField eve_name;
    private javax.swing.JLabel event_label1;
    private javax.swing.JTable event_table;
    private javax.swing.JTextField fullname;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel name_labell1;
    private javax.swing.JLabel parti_label;
    private javax.swing.JTextField search_bar;
    private javax.swing.JLabel search_icon;
    private javax.swing.JPanel side_panel;
    private javax.swing.JPanel title_bar;
    private javax.swing.JButton update;
    private javax.swing.JLabel your_events1;
    // End of variables declaration//GEN-END:variables
}
