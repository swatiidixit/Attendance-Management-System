/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_file;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Da Silva
 */
public class mysql {
    Connection con = null;
    public static Connection ConnectDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sams","root","ROOT");
            JOptionPane.showMessageDialog(null,"CONNECTED TO DATABASE");
            return con;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    
}
