/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dbprogramming2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JJ_JoJo
 */
public class LAB9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          String url = "jdbc:mysql://localhost:3306/mydb2";
        String username = "root";
        String password ="Jayda_9252";       
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement(); 
             String sql = "INSERT INTO student(studentID,firstName, lastName, email, deptID)"
                     + "values ('111111','AAAA','ll','aaaa@gmail.com','IT')";
             statement.executeUpdate(sql);
             
                   
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB8.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB8.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    
