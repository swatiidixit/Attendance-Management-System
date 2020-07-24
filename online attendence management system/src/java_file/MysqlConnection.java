/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_file;
import java.sql.*;

import java.sql.DriverManager;

/**
 *
 * @author Da Silva
 */
public class MysqlConnection {
    public static void main(String[] args){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sams","root","ROOT");
            System.out.println("Connection established");
        }
        catch(ClassNotFoundException e){
            System.out.println("Exception:"+e.getMessage());
        }
        catch(SQLException e){
             System.out.println("SQL Exception:"+e.getMessage());
        }
    }
}
