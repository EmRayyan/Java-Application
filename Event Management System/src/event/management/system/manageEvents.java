package event.management.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class manageEvents extends javax.swing.JFrame {

    public manageEvents() {
        initComponents();
        try {
            DB_Connectivity db = new DB_Connectivity();
            ResultSet rs;
            PreparedStatement st;
            Connection con = db.con;
            String sql = "SELECT * FROM events";
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
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        side_panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        cancel_label1 = new javax.swing.JLabel();
        cancel_label2 = new javax.swing.JLabel();
        evename_label = new javax.swing.JLabel();
        event_name = new javax.swing.JTextField();
        day_label = new javax.swing.JLabel();
        date_label1 = new javax.swing.JLabel();
        yyyymmdd = new javax.swing.JLabel();
        day = new javax.swing.JComboBox<>();
        date = new javax.swing.JTextField();
        time = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        eve_cat_label = new javax.swing.JLabel();
        eve_time = new javax.swing.JTextField();
        event_cat = new javax.swing.JComboBox<>();
        venue = new javax.swing.JLabel();
        eve_venue = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        title_bar = new javax.swing.JPanel();
        manage_eve_label = new javax.swing.JLabel();
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

        jPanel1.setBackground(new java.awt.Color(34, 34, 34));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        cancel_label1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        cancel_label1.setForeground(new java.awt.Color(255, 255, 255));
        cancel_label1.setText("EVENT");

        cancel_label2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        cancel_label2.setForeground(new java.awt.Color(255, 255, 255));
        cancel_label2.setText("MANAGEMENT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(cancel_label2)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(cancel_label1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancel_label1)
                .addGap(5, 5, 5)
                .addComponent(cancel_label2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        evename_label.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        evename_label.setForeground(new java.awt.Color(255, 255, 255));
        evename_label.setText("Event Name:");

        event_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        day_label.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        day_label.setForeground(new java.awt.Color(255, 255, 255));
        day_label.setText("Day:");

        date_label1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        date_label1.setForeground(new java.awt.Color(255, 255, 255));
        date_label1.setText("Date:");

        yyyymmdd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        yyyymmdd.setForeground(new java.awt.Color(204, 204, 204));
        yyyymmdd.setText("yyyy-mm-dd");

        day.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));
        day.setFocusable(false);

        date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        time.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setText("Time:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("00:00:00");

        eve_cat_label.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        eve_cat_label.setForeground(new java.awt.Color(255, 255, 255));
        eve_cat_label.setText("Category:");

        eve_time.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        event_cat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        event_cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category", "Community", "Culture", "Sports", "Science", "General" }));
        event_cat.setFocusable(false);

        venue.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        venue.setForeground(new java.awt.Color(255, 255, 255));
        venue.setText("Venue:");

        eve_venue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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
                        .addGap(20, 20, 20)
                        .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(evename_label)
                            .addComponent(venue)
                            .addGroup(side_panelLayout.createSequentialGroup()
                                .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(eve_time, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(day_label, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(day, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(side_panelLayout.createSequentialGroup()
                                        .addComponent(time)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)))
                                .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(side_panelLayout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(eve_cat_label)
                                            .addGroup(side_panelLayout.createSequentialGroup()
                                                .addComponent(date_label1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(yyyymmdd)))
                                        .addGap(20, 28, Short.MAX_VALUE))
                                    .addGroup(side_panelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(event_cat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(side_panelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(date))))
                            .addComponent(eve_venue)
                            .addComponent(event_name)))
                    .addGroup(side_panelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(update))
                    .addGroup(side_panelLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(delete)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        side_panelLayout.setVerticalGroup(
            side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(side_panelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(evename_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(event_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(day_label)
                    .addComponent(date_label1)
                    .addComponent(yyyymmdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eve_cat_label, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(time)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eve_time, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(event_cat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(venue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eve_venue, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(side_panel);
        side_panel.setBounds(0, 0, 300, 570);

        title_bar.setBackground(new java.awt.Color(255, 255, 255));
        title_bar.setMinimumSize(new java.awt.Dimension(800, 70));
        title_bar.setPreferredSize(new java.awt.Dimension(1100, 60));

        manage_eve_label.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        manage_eve_label.setForeground(new java.awt.Color(34, 34, 34));
        manage_eve_label.setText("MANAGE EVENTS");

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
                .addGap(240, 240, 240)
                .addComponent(manage_eve_label)
                .addContainerGap())
        );
        title_barLayout.setVerticalGroup(
            title_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addGroup(title_barLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manage_eve_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                "Event Name", "Day", "Date", "Time", "Category", "Venue"
            }
        ));
        jScrollPane3.setViewportView(event_table);
        if (event_table.getColumnModel().getColumnCount() > 0) {
            event_table.getColumnModel().getColumn(4).setResizable(false);
        }

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
                String sql_00 = "SELECT * FROM events";
                st = con.prepareStatement(sql_00);
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    String events[]={rs.getString("event_name"), rs.getString("day"), rs.getString("date"),
                        rs.getString("time"), rs.getString("category"), rs.getString("venue")};
                    tb.addRow(events);
                }
                con.close();
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
                String sql_00 = "SELECT * FROM events";
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
                String sql_22 = "SELECT * FROM events WHERE event_name=? OR day=? OR date=? OR time=? OR category=? OR venue=?";
                st = con.prepareStatement(sql_22);
                st.setString(1, search_bar.getText());
                st.setString(2, search_bar.getText());
                st.setString(3, search_bar.getText());
                st.setString(4, search_bar.getText());
                st.setString(5, search_bar.getText());
                st.setString(6, search_bar.getText());
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
        if(event_name.getText().trim().isEmpty() || day.getSelectedItem().toString().isEmpty() ||
            date.getText().trim().isEmpty() || eve_time.getText().trim().isEmpty() || event_cat.getSelectedItem().toString().isEmpty()
            || eve_venue.getText().trim().isEmpty()){
            if(search_bar.getText().trim().isEmpty()){
                try {
                    DB_Connectivity db = new DB_Connectivity();
                    PreparedStatement st;
                    Connection con = db.con;
                    DefaultTableModel tb = (DefaultTableModel)event_table.getModel();
                    tb.setRowCount(0);
                    String sql_00 = "SELECT * FROM events";
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
            JOptionPane.showMessageDialog(rootPane, "Input fields are empty");
        }else{
            try{
                DB_Connectivity db = new DB_Connectivity();
                Connection con = db.con;
                PreparedStatement st;
                String sql_4 = "SELECT * FROM events WHERE event_name=?";
                st = con.prepareStatement(sql_4);
                st.setString(1, event_name.getText());
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    JOptionPane.showMessageDialog(this, "An event with this name is already registered", "Message", 1);
                }
                else{
                    String dateToCheck  = date.getText();
                    String timeToCheck = eve_time.getText();
                    if(isValidDateFormat(dateToCheck)){
                        if(isValidTimeFormat(timeToCheck)){
                            String sql_7 = "SELECT * FROM events WHERE date=? AND time=? AND venue=?";
                            st = con.prepareStatement(sql_7);
                            st.setString(1, date.getText());
                            st.setString(2, eve_time.getText());
                            st.setString(3, eve_venue.getText());
                            rs = st.executeQuery();
                            if(rs.next()){
                                JOptionPane.showMessageDialog(this, "An event at this venue on the given day, date & time is already scheduled", "Message", 1);
                            }else{
                                String sql_1 = "INSERT INTO events (event_name, day, date, time, category, venue) VALUES (?, ?, ?, ?, ?, ?);";
                                st = con.prepareStatement(sql_1);
                                st.setString(1, event_name.getText());
                                st.setString(2, day.getSelectedItem().toString());
                                st.setString(3, date.getText());
                                st.setString(4, eve_time.getText());
                                st.setString(5, event_cat.getSelectedItem().toString());
                                st.setString(6, eve_venue.getText());
                                int ans = st.executeUpdate();
                                if(ans>0){
                                    JOptionPane.showMessageDialog(this, "Event Successfully Added", "Message", 1);
                                    //                                  String ename=event_name.getText();
                                    //                                  String eday=day.getSelectedItem().toString();
                                    //                                  String edate=date.getText();
                                    //                                  String etime=eve_time.getText();
                                    //                                  String ecat=event_cat.getSelectedItem().toString();
                                    //                                  String evenue= eve_venue.getText();
                                    //                                  String eve_details [] = {ename, eday, edate, etime, ecat, evenue};
                                    //                                  DefaultTableModel tb = (DefaultTableModel)event_table.getModel();
                                    //                                  tb.addRow(eve_details);
                                    DefaultTableModel tb = (DefaultTableModel)event_table.getModel();
                                    tb.setRowCount(0);
                                    String sql = "SELECT * FROM events";
                                    st = con.prepareStatement(sql);
                                    rs = st.executeQuery();
                                    while(rs.next()){
                                        String events[]={rs.getString("event_name"), rs.getString("day"), rs.getString("date"),
                                            rs.getString("time"), rs.getString("category"), rs.getString("venue")};
                                        tb.addRow(events);
                                    }
                                    event_name.setText("");
                                    day.setSelectedItem("Monday");
                                    date.setText("");
                                    eve_time.setText("");
                                    event_cat.setSelectedItem("Select Category");
                                    eve_venue.setText("");
                                    event_name.requestFocus();
                                }else{
                                    JOptionPane.showMessageDialog(this, "Event Registration Unsuccesful", "Message", 1);
                                }
                            }
                        }else{
                            JOptionPane.showMessageDialog(this, "Time is invalid\n\nHint: 00:00:00", "Incorrect details", 1);
                        }
                    }else{
                        JOptionPane.showMessageDialog(this, "Date is invalid\n\nHint: 2024-01-31", "Incorrect details", 1);
                    }
                }
                con.close();
            }catch(SQLException s_ex){
                Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE,null,s_ex);
            }
        }
    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        if(event_name.getText().trim().isEmpty() || day.getSelectedItem().toString().isEmpty() ||
            date.getText().trim().isEmpty() || eve_time.getText().trim().isEmpty() || event_cat.getSelectedItem().toString().isEmpty()
            || eve_venue.getText().trim().isEmpty()){

            if(search_bar.getText().trim().isEmpty()){
                try {
                    DB_Connectivity db = new DB_Connectivity();
                    PreparedStatement st;
                    Connection con = db.con;
                    DefaultTableModel tb = (DefaultTableModel)event_table.getModel();
                    tb.setRowCount(0);
                    String sql_00 = "SELECT * FROM events";
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

            }JOptionPane.showMessageDialog(rootPane, "Input fields are empty");
        }else{
            try{
                DB_Connectivity db = new DB_Connectivity();
                PreparedStatement st;
                Connection con = db.con;
                String sql_02 = "SELECT * FROM events WHERE event_name=? AND day=? AND date=? AND time=? AND category=? AND venue=?";
                st = con.prepareStatement(sql_02);
                st.setString(1, event_name.getText());
                st.setString(2, day.getSelectedItem().toString());
                st.setString(3, date.getText());
                st.setString(4, eve_time.getText());
                st.setString(5, event_cat.getSelectedItem().toString());
                st.setString(6, eve_venue.getText());
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    JOptionPane.showMessageDialog(this, "All new details are same as the old details",
                        "Message", 1);
                }else{
                    String sql_8 = "SELECT * FROM events WHERE event_name=?";
                    st = con.prepareStatement(sql_8);
                    st.setString(1, event_name.getText());
                    rs = st.executeQuery();
                    if(rs.next()){
                        String dateToCheck  = date.getText();
                        String timeToCheck = eve_time.getText();
                        if(isValidDateFormat(dateToCheck)){
                            if(isValidTimeFormat(timeToCheck)){
                                String sql_7 = "SELECT * FROM events WHERE date=? AND time=? AND venue=?";
                                st = con.prepareStatement(sql_7);
                                st.setString(1, date.getText());
                                st.setString(2, eve_time.getText());
                                st.setString(3, eve_venue.getText());
                                rs = st.executeQuery();
                                if(rs.next()){
                                    JOptionPane.showMessageDialog(this, "An event at this venue on the given day, date & time is already scheduled", "Message", 1);
                                }else{
                                    String sql_3 = "UPDATE events SET day = ?, date = ?, time = ?, category = ?, venue = ? WHERE event_name = ?";
                                    st = con.prepareStatement(sql_3);
                                    st.setString(1, day.getSelectedItem().toString());
                                    st.setString(2, date.getText());
                                    st.setString(3, eve_time.getText());
                                    st.setString(4, event_cat.getSelectedItem().toString());
                                    st.setString(5, eve_venue.getText());
                                    st.setString(6, event_name.getText());
                                    int ans = st.executeUpdate();
                                    if(ans>0){
                                        JOptionPane.showMessageDialog(this, "Event details successfully updated", "Message", 1);
                                        DefaultTableModel tb = (DefaultTableModel)event_table.getModel();
                                        tb.setRowCount(0);
                                        String sql = "SELECT * FROM events";
                                        st = con.prepareStatement(sql);
                                        rs = st.executeQuery();
                                        while(rs.next()){
                                            String events[]={rs.getString("event_name"), rs.getString("day"), rs.getString("date"),
                                                rs.getString("time"), rs.getString("category"), rs.getString("venue")};
                                            tb.addRow(events);
                                        }
                                        event_name.setText("");
                                        day.setSelectedItem("Monday");
                                        date.setText("");
                                        eve_time.setText("");
                                        event_cat.setSelectedItem("Select Category");
                                        eve_venue.setText("");
                                        event_name.requestFocus();
                                    }else{
                                        JOptionPane.showMessageDialog(this, "Event details update failed", "Message", 1);
                                    }
                                }
                            }else{
                                JOptionPane.showMessageDialog(this, "Time is invalid\n\nHint: 00:00:00", "Incorrect details", 1);
                            }
                        }else{
                            JOptionPane.showMessageDialog(this, "Date is invalid\n\nHint: 2024-01-31", "Incorrect details", 1);
                        }
                    }else{
                        JOptionPane.showMessageDialog(this, "Event Not Found", "Incorrect details", 1);
                    }

                    con.close();
                }
            }catch(SQLException s_ex){
                Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE,null,s_ex);
            }
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if(event_name.getText().trim().isEmpty() || day.getSelectedItem().toString().isEmpty() ||
            date.getText().trim().isEmpty() || eve_time.getText().trim().isEmpty() || event_cat.getSelectedItem().toString().isEmpty()
            || eve_venue.getText().trim().isEmpty()){
            if(search_bar.getText().trim().isEmpty()){
                try {
                    DB_Connectivity db = new DB_Connectivity();
                    PreparedStatement st;
                    Connection con = db.con;
                    DefaultTableModel tb = (DefaultTableModel)event_table.getModel();
                    tb.setRowCount(0);
                    String sql_00 = "SELECT * FROM events";
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
            JOptionPane.showMessageDialog(rootPane, "Input fields are empty");
        }else{
            try{
                DB_Connectivity db = new DB_Connectivity();
                PreparedStatement st, st1;
                Connection con = db.con;
                String sql_2 = "SELECT * FROM events WHERE event_name=?";
                st = con.prepareStatement(sql_2);
                st.setString(1, event_name.getText());
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    String sql_02 = "SELECT * FROM events WHERE event_name=? AND day=? AND date=? AND time=? AND category=? AND venue=?";
                    st = con.prepareStatement(sql_02);
                    st.setString(1, event_name.getText());
                    st.setString(2, day.getSelectedItem().toString());
                    st.setString(3, date.getText());
                    st.setString(4, eve_time.getText());
                    st.setString(5, event_cat.getSelectedItem().toString());
                    st.setString(6, eve_venue.getText());
                    rs = st.executeQuery();
                    if(rs.next()){
                        String dateToCheck  = date.getText();
                        String timeToCheck = eve_time.getText();
                        if(isValidDateFormat(dateToCheck)){
                            if(isValidTimeFormat(timeToCheck)){
                                String sql_3 = "DELETE FROM events WHERE event_name=?";
                                String sql_03 = "DELETE FROM your_events WHERE event_name=?";
                                st = con.prepareStatement(sql_3);
                                st1 = con.prepareStatement(sql_03);
                                st.setString(1, event_name.getText());
                                st1.setString(1, event_name.getText());
                                int ans = st.executeUpdate();
                                int ans1 = st1.executeUpdate();
                                if(ans>0 || ans1>0){
                                    JOptionPane.showMessageDialog(this, "Event Deleted", "Message", 1);
                                    DefaultTableModel tb = (DefaultTableModel)event_table.getModel();
                                    tb.setRowCount(0);
                                    String sql = "SELECT * FROM events";
                                    st = con.prepareStatement(sql);
                                    rs = st.executeQuery();
                                    while(rs.next()){
                                        String events[]={rs.getString("event_name"), rs.getString("day"), rs.getString("date"),
                                            rs.getString("time"), rs.getString("category"), rs.getString("venue")};
                                        tb.addRow(events);
                                    }
                                    event_name.setText("");
                                    day.setSelectedItem("Monday");
                                    date.setText("");
                                    eve_time.setText("");
                                    event_cat.setSelectedItem("Select Category");
                                    eve_venue.setText("");
                                    event_name.requestFocus();
                                }else{
                                    JOptionPane.showMessageDialog(this, "Event removal failed", "Message", 1);
                                }
                            }else{
                                JOptionPane.showMessageDialog(this, "Time is invalid\n\nHint: 00:00:00", "Incorrect details", 1);
                            }
                        }else{
                            JOptionPane.showMessageDialog(this, "Date is invalid\n\nHint: 2024-01-31", "Incorrect details", 1);
                        }
                    }else{
                        JOptionPane.showMessageDialog(this, "Details are incorrect", "Message", 1);
                    }
                    con.close();
                }else{
                    JOptionPane.showMessageDialog(this, "Event Not Found",
                        "Message", 1);
                }
            }catch(SQLException s_ex){
                Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE,null,s_ex);
            }
        }
    }//GEN-LAST:event_deleteActionPerformed


    
    public static boolean isValidDateFormat(String inputDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        try {
            java.util.Date utilDate = dateFormat.parse(inputDate);
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
     public static boolean isValidTimeFormat(String inputTime) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        timeFormat.setLenient(false);
        try {
            java.util.Date utilDate = timeFormat.parse(inputTime);
            java.sql.Time sqlTime = new java.sql.Time(utilDate.getTime());
            return true;
        } catch (ParseException e) {
            return false;
        }
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
                manageEvents man_eve = new manageEvents();
                man_eve.setVisible(true);
                man_eve.pack();
                man_eve.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel back_button;
    private javax.swing.JPanel body;
    private javax.swing.JLabel cancel_label1;
    private javax.swing.JLabel cancel_label2;
    private javax.swing.JTextField date;
    private javax.swing.JLabel date_label1;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JLabel day_label;
    private javax.swing.JButton delete;
    private javax.swing.JLabel eve_cat_label;
    private javax.swing.JTextField eve_time;
    private javax.swing.JTextField eve_venue;
    private javax.swing.JLabel evename_label;
    private javax.swing.JComboBox<String> event_cat;
    private javax.swing.JTextField event_name;
    private javax.swing.JTable event_table;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel manage_eve_label;
    private javax.swing.JTextField search_bar;
    private javax.swing.JLabel search_icon;
    private javax.swing.JPanel side_panel;
    private javax.swing.JLabel time;
    private javax.swing.JPanel title_bar;
    private javax.swing.JButton update;
    private javax.swing.JLabel venue;
    private javax.swing.JLabel your_events1;
    private javax.swing.JLabel yyyymmdd;
    // End of variables declaration//GEN-END:variables
}
