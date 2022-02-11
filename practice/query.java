/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Mahip
 */
public class query {
    public static void main(String[] args){
        try{
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab?zeroDateTimeBehavior=convertToNull", "root", "");
             System.out.println("Connection created");

            Statement stmt = con.createStatement();
            
            // query all rows from table
            String q1 = "select * from movies";
            ResultSet rs = stmt.executeQuery(q1);
            
            // printing output for q1
            while(rs.next()){
                String name = rs.getString(1);
                String actor = rs.getString(2);
                String actress = rs.getString(3);
                int yor = rs.getInt(4);
                String dir = rs.getString(5);
                System.out.println(name+"; "+actor+"; "+actress+"; "+yor+"; "+dir);
            }
            System.out.println("---------------------------------------------");
             
            // query all information where 'Tom Hanks' was lead actor. 
            String q2 = "select * from movies where actor='Tom Hanks'";
            rs = stmt.executeQuery(q2);
            // printing output for q2
             while(rs.next()){
                String name = rs.getString(1);
                String actor = rs.getString(2);
                String actress = rs.getString(3);
                int yor = rs.getInt(4);
                String dir = rs.getString(5);
                System.out.println(name+"; "+actor+"; "+actress+"; "+yor+"; "+dir);
            }
            
            
            
            
            
            
        }catch(Exception e){
            System.out.println(e);
        } 
    }
}
