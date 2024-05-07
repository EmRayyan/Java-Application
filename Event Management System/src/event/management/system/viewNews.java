package event.management.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class viewNews extends javax.swing.JFrame {

    public viewNews() {
        initComponents();
        newstable.setBackground(new java.awt.Color(255, 255, 255));
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

        title_bar = new javax.swing.JPanel();
        nupd_label = new javax.swing.JLabel();
        back_button = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        newstable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1115, 605));
        getContentPane().setLayout(null);

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
                .addGap(400, 400, 400)
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
        title_bar.setBounds(0, 0, 1100, 60);

        body.setBackground(new java.awt.Color(34, 34, 34));
        body.setPreferredSize(new java.awt.Dimension(800, 600));
        body.setLayout(null);

        newstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "News"
            }
        ));
        newstable.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(newstable);

        body.add(jScrollPane4);
        jScrollPane4.setBounds(30, 22, 1040, 460);

        getContentPane().add(body);
        body.setBounds(0, 60, 1100, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                viewNews vnews = new viewNews();
                vnews.setVisible(true);
                vnews.pack();
                vnews.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back_button;
    private javax.swing.JPanel body;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable newstable;
    private javax.swing.JLabel nupd_label;
    private javax.swing.JPanel title_bar;
    // End of variables declaration//GEN-END:variables
}
