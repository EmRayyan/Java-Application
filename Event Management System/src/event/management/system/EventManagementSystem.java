package event.management.system;
public class EventManagementSystem {
    public static void main(String[] args) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Welcome welcomeframe = new Welcome();
                welcomeframe.setVisible(true);
                welcomeframe.pack();
                welcomeframe.setLocationRelativeTo(null);
            }
        });
    }
    
}
