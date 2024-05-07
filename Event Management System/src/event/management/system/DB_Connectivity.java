package event.management.system;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB_Connectivity {
    Connection con;
    Statement st;
    ResultSet rs;
    
    DB_Connectivity(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems", "root", "");
            st = con.createStatement();
            
            System.out.println("DB is connected");
            
        }catch(Exception DB_error){
            System.out.println(DB_error);
        }
    }
    
    public ResultSet matchuser(String email, String password){
        String sql = "SELECT * FROM accounts WHERE email='"+email+"' AND password='"+password+"'";
        try{
            rs = st.executeQuery(sql);
        }catch(SQLException s_ex){
            Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE,null,s_ex);
        }
        
        return rs;
    }
//    public ResultSet matchemail(String email){
//        String sql_2 = "SELECT * FROM accounts WHERE email=?";
//        try{
//            rs = st.executeQuery(sql_1);
//        }catch(SQLException s_ex){
//            Logger.getLogger(DB_Connectivity.class.getName()).log(Level.SEVERE,null,s_ex);
//        }
//        
//        return rs;
//    }
    
    public static void main(String[]args){
        
        DB_Connectivity db = new DB_Connectivity();
    }
}

