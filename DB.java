/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author GUARDIAN
 */
public class DB {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost/LibrarySystem";

 //  Database credentials
    static final String USER = "root";
    static final String PASS = "";
    public Connection con=null;

    public DB(){
       try{
           Class.forName("com.mysql.jdbc.Driver");

                       //STEP 3: Open a connection
                       System.out.println("Connecting to database...");
                       con = DriverManager.getConnection(DB_URL,USER,PASS);
                       System.out.println("Connected database successfully...");

                   }catch(Exception e){System.out.println(e);}

           }
}