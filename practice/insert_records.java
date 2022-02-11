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
public class insert_records {
    public static void main(String[] args){
        try{
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab?zeroDateTimeBehavior=convertToNull", "root", "");
            System.out.println("Connection created");

            Statement stmt = con.createStatement();
            // inserting records...
             String q1 = "INSERT INTO movies (Name, Actor, Actress, YOR, Director) VALUES ('A quiet place', 'John Krasinski', 'Emily Blunt', 2018, 'John Krasinski')";
             String q2 = "INSERT INTO movies (Name, Actor, Actress, YOR, Director) VALUES ('Forrest Gump', 'Tom Hanks', 'Robin Wright', 1994, 'Robert Zemeckis')";
             String q3 = "INSERT INTO movies (Name, Actor, Actress, YOR, Director) VALUES ('Tumbbad', 'Sohum Shah', 'Jyoti Malshe', 2018, 'Anand Gandhi')";
             
             stmt.executeUpdate(q1);
             stmt.executeUpdate(q2);
             stmt.executeUpdate(q3);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
