/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Mahip
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
//            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            System.out.println("Driver is loaded");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab?zeroDateTimeBehavior=convertToNull", "root", "");
            System.out.println("Connection created");

            Statement stmt = con.createStatement();
            // creating movies table
            String create_table = "CREATE TABLE Movies " +
                   "(Name VARCHAR(255) not NULL, " +
                   " Actor VARCHAR(255), " + 
                   " Actress VARCHAR(255), " + 
                   " YOR INTEGER, " + 
                   " Director VARCHAR(255) )"; 
            stmt.executeUpdate(create_table);
            

             
            
            
            System.out.println("Table is created");
            
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
