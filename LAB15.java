/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dbprogramming2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author JJ_JoJo
 */

public class LAB15 {

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
             String sql = "SELECT * FROM student";
             ResultSet results = statement.executeQuery(sql);
             ResultSetMetaData rsMetaData = results.getMetaData();
             
             
            for (int i = 1; i <= rsMetaData.getColumnCount(); i++)
                System.out.printf("%-12s\t", rsMetaData.getColumnName(i));
                    System.out.println();
                    
                        while (results.next()) {
                                for (int i = 1; i <= rsMetaData.getColumnCount(); i++)
                                    System.out.printf("%-12s\t", results.getObject(i));
            System.out.println();
}
        connection.close();

             
           
            
             
                   
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB8.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB8.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    

