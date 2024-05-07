package event.management.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class newsUpdate extends javax.swing.JFrame {

    public newsUpdate() {
        initComponents();
        try {
            DB_Connectivity db = new DB_Connectivity();
            Connection con = db.con;
            PreparedStatement st;
            ResultSet rs;
            String sql = "SELECT * FROM news_update";
            st = con.prepareStatement(sql);
            DefaultTableModel tb = (DefaultTableModel)newstable.getModel();
            tb.setRowCount(0);
            rs = st.executeQuery();
            while(rs.next()){
                String news [] = {rs.getString("news_title"), rs.getString("news")};
                tb.addRow(news);
            }
        } catch (SQLException ex) {
            Logger.getLogger(newsUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        side_panel = new javax.swing.JPanel();
        title_label = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        news_label = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cancel_label1 = new javax.swing.JLabel();
        cancel_label2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        newsarea = new javax.swing.JTextArea();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        title_bar = new javax.swing.JPanel();
        nupd_label = new javax.swing.JLabel();
        back_button = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        newstable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1115, 605));
        getContentPane().setLayout(null);

        side_panel.setBackground(new java.awt.Color(34, 34, 34));
        side_panel.setPreferredSize(new java.awt.Dimension(300, 570));

        title_label.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        title_label.setForeground(new java.awt.Color(255, 255, 255));
        title_label.setText("Title:");

        title.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        news_label.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        news_label.setForeground(new java.awt.Color(255, 255, 255));
        news_label.setText("News:");

        jPanel1.setBackground(new java.awt.Color(34, 34, 34));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        cancel_label1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        cancel_label1.setForeground(new java.awt.Color(255, 255, 255));
        cancel_label1.setText("ADD");

        cancel_label2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        cancel_label2.setForeground(new java.awt.Color(255, 255, 255));
        cancel_label2.setText("NEWS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(cancel_label1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(cancel_label2)))
                .addContainerGap(39, Short.MAX_VALUE))
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

        newsarea.setColumns(20);
        newsarea.setRows(5);
        jScrollPane1.setViewportView(newsarea);

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
            .addGroup(side_panelLayout.createSequentialGroup()
                .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(side_panelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(title_label)
                            .addComponent(news_label)
                            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(side_panelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(side_panelLayout.createSequentialGroup()
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(update))
                            .addGroup(side_panelLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(delete)))))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, side_panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        side_panelLayout.setVerticalGroup(
            side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(side_panelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(title_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(news_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(side_panel);
        side_panel.setBounds(0, 0, 300, 570);

        title_bar.setBackground(new java.awt.Color(255, 255, 255));
        title_bar.setMinimumSize(new java.awt.Dimension(800, 70));
        title_bar.setPreferredSize(new java.awt.Dimension(1100, 60));

        nupd_label.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        nupd_label.setForeground(new java.awt.Color(34, 34, 34));
        nupd_label.setText("NEWS UPDATE");

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
                .addGap(269, 269, 269)
                .addComponent(nupd_label)
                .addContainerGap())
        );
        title_barLayout.setVerticalGroup(
            title_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addGroup(title_barLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nupd_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(title_bar);
        title_bar.setBounds(300, 0, 800, 60);

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setPreferredSize(new java.awt.Dimension(800, 600));
        body.setLayout(null);

        newstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "News"
            }
        ));
        jScrollPane4.setViewportView(newstable);
        if (newstable.getColumnModel().getColumnCount() > 0) {
            newstable.getColumnModel().getColumn(0).setResizable(false);
        }

        body.add(jScrollPane4);
        jScrollPane4.setBounds(30, 22, 730, 460);

        getContentPane().add(body);
        body.setBounds(300, 60, 800, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        if(title.getText().trim().isEmpty() || newsarea.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Input fields are empty");
        }else{
            try{
                DB_Connectivity db = new DB_Connectivity();
                Connection con = db.con;
                PreparedStatement st;
                String sql_4 = "SELECT * FROM news_update WHERE news_title=? ";
                st = con.prepareStatement(sql_4);
                st.setString(1, title.getText());
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    JOptionPane.showMessageDialog(this, "News with this title already exists", "Registration Alert", 1);
                }
                else{
                    String Title = title.getText();
                    if(isValidTitle(Title)){
                            String sql_1 = "INSERT INTO news_update (news_title, news) VALUES (?, ?);";
                            st = con.prepareStatement(sql_1);
                            st.setString(1, title.getText());
                            st.setString(2, newsarea.getText());
                            int ans = st.executeUpdate();
                            if(ans>0){
                                JOptionPane.showMessageDialog(this, "News Succesfully Added", "Message", 1);
                                try {
                                    String sql = "SELECT * FROM news_update";
                                    st = con.prepareStatement(sql);
                                    DefaultTableModel tb = (DefaultTableModel)newstable.getModel();
                                    tb.setRowCount(0);
                                    rs = st.executeQuery();
                                    while(rs.next()){
                                        String news [] = {rs.getString("news_title"), rs.getString("news")};
                                            tb.addRow(news);
                                    }
                                } catch (SQLException ex) {
                                    Logger.getLogger(newsUpdate.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                title.setText("");
                                newsarea.setText("");
                                title.requestFocus();
                            }else{
                                JOptionPane.showMessageDialog(this, "Error", "Alert", 1);
                            }                     
                    }else{
                        JOptionPane.showMessageDialog(this, "Title is invalid\n\nTitle must of atleast 10 characters", "Incorrect title", 1);
                    }
                }
                con.close();
            }catch(SQLException s_ex){
                Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE,null,s_ex);
            }
        }
    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if(title.getText().trim().isEmpty() || newsarea.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Input fields are empty");
        }else{
            try{
                DB_Connectivity db = new DB_Connectivity();
                Connection con = db.con;
                PreparedStatement st;
                String sql_4 = "SELECT * FROM news_update WHERE news_title=? ";
                st = con.prepareStatement(sql_4);
                st.setString(1, title.getText());
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    String sql_04 = "SELECT * FROM news_update WHERE news_title=? AND news=?";
                    st = con.prepareStatement(sql_04);
                    st.setString(1, title.getText());
                    st.setString(2, newsarea.getText());
                    rs = st.executeQuery();
                    if(rs.next()){
                        JOptionPane.showMessageDialog(this, "New details cannot be the same as previous ones", "Alert", 1);                     
                    }else{
                        String sql_1 = "UPDATE news_update SET news=? WHERE news_title=?;";
                        st = con.prepareStatement(sql_1);
                        st.setString(1, newsarea.getText());
                        st.setString(2, title.getText());
                        int ans = st.executeUpdate();
                        if(ans>0){
                                JOptionPane.showMessageDialog(this, "News Succesfully Updated", "Message", 1);
                                try {
                                    String sql = "SELECT * FROM news_update";
                                    st = con.prepareStatement(sql);
                                    DefaultTableModel tb = (DefaultTableModel)newstable.getModel();
                                    tb.setRowCount(0);
                                    rs = st.executeQuery();
                                    while(rs.next()){
                                        String news [] = {rs.getString("news_title"), rs.getString("news")};
                                            tb.addRow(news);
                                    }
                                } catch (SQLException ex) {
                                    Logger.getLogger(newsUpdate.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                title.setText("");
                                newsarea.setText("");
                                title.requestFocus();
                        }else{
                            JOptionPane.showMessageDialog(this, "Error", "Alert", 1);
                        } 
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "News with this title does not exist", "Registration Alert", 1);
                }
                con.close();
            }catch(SQLException s_ex){
                Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE,null,s_ex);
            }
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if(title.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Please enter news title to delete news");
        }else{
            try{
                DB_Connectivity db = new DB_Connectivity();
                Connection con = db.con;
                PreparedStatement st;
                String sql_4 = "SELECT * FROM news_update WHERE news_title=? ";
                st = con.prepareStatement(sql_4);
                st.setString(1, title.getText());
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                        String sql_1 = "DELETE FROM news_update WHERE news_title=?;";
                        st = con.prepareStatement(sql_1);
                        st.setString(1, title.getText());
                        int ans = st.executeUpdate();
                        if(ans>0){
                                JOptionPane.showMessageDialog(this, "News Deleted", "Message", 1);
                                try {
                                    String sql = "SELECT * FROM news_update";
                                    st = con.prepareStatement(sql);
                                    DefaultTableModel tb = (DefaultTableModel)newstable.getModel();
                                    tb.setRowCount(0);
                                    rs = st.executeQuery();
                                    while(rs.next()){
                                        String news [] = {rs.getString("news_title"), rs.getString("news")};
                                            tb.addRow(news);
                                    }
                                } catch (SQLException ex) {
                                    Logger.getLogger(newsUpdate.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                title.setText("");
                                newsarea.setText("");
                                title.requestFocus();
                        }else{
                            JOptionPane.showMessageDialog(this, "Error", "Alert", 1);
                        }
                }
                else{
                    JOptionPane.showMessageDialog(this, "News with this title does not exist", "Registration Alert", 1);
                }
                con.close();
            }catch(SQLException s_ex){
                Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE,null,s_ex);
            }
        }
    }//GEN-LAST:event_deleteActionPerformed


    private static boolean isValidTitle(String title){
        return title.length() >= 10;
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
                newsUpdate nupd = new newsUpdate();
                nupd.setVisible(true);
                nupd.pack();
                nupd.setLocationRelativeTo(null);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel news_label;
    private javax.swing.JTextArea newsarea;
    private javax.swing.JTable newstable;
    private javax.swing.JLabel nupd_label;
    private javax.swing.JPanel side_panel;
    private javax.swing.JTextField title;
    private javax.swing.JPanel title_bar;
    private javax.swing.JLabel title_label;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
