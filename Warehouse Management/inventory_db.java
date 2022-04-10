import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class inventory_db {
   static final String DB_URL = "jdbc:mysql://localhost:3306/";
   static final String USER = "guest";
   static final String PASS = "1234567";

   public static void main(String[] args) throws Exception{
      // Open a connection
     
     try{
     
       Class.forName("com.mysql.cj.jdbc.Driver");
     }
     catch (ClassNotFoundException e){
     
       e.printStackTrace();
     }
     try{
       Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement(); 
      {        
         String sql = "CREATE DATABASE INVENTORY";
         stmt.executeUpdate(sql);
         //ResultSet result = stmt.executeQuery(query);
         System.out.println("Database created successfully...");  
         
       }
      
      {
      
         String sql = "CREATE TABLE EMPLOYEE " +
                   "(staffId INTEGER not NULL, " +
                   " firstName VARCHAR(255), " + 
                   " lastName VARCHAR(255), " + 
                   " emailAddress VARCHAR(255)" +    
                   " DOB DATE, " + 
                   " PRIMARY KEY ( staffId ))"; 

         stmt.executeUpdate(sql);
         System.out.println("Table Created");   
      }
      
      {
        
         String sql = "CREATE TABLE MANAGER " +
                   "(stuffId INTEGER not NULL, " +
                   " firstName VARCHAR(255), " + 
                   " lastName VARCHAR(255), " +
                   " PRIMARY KEY ( staffId )" + 
                   " FOREIGN KEY (staffId))";
         stmt.executeUpdate(sql);
         System.out.println("Table Created");   
      }
      
      {
      
        
         String sql = "CREATE TABLE SUPPLIER " +
                   " supplierName VARCHAR(255), " + 
                   " emailAddress VARCHAR(255), " + 
                   " PRIMARY KEY ( supplierName ))";

         stmt.executeUpdate(sql);
         System.out.println("Table Created");   
      }
      
      {
         String sql = "CREATE TABLE PRODUCT " +
                   "(productId INTEGER not NULL, " +
                   " productName VARCHAR(255), " + 
                   " productPrice INTEGER, " + 
                   " PRIMARY KEY ( productId ))"; 

         stmt.executeUpdate(sql);
         System.out.println("Table Created");   
      }
      
      {
         String sql = "CREATE TABLE ORDER " +
                   "(orderId INTEGER not NULL, " +
                   " orderDetails VARCHAR(255), " + 
                   " orderDate DATE, " + 
                   " quantity INTEGER" +    
                   " productId INTEGER, " + 
                   " PRIMARY KEY ( orderId )"+ 
                   " FOREIGN KEY (productId))";
 
         stmt.executeUpdate(sql);
         System.out.println("Table Created");   
      }
      
      {
            String sql = "CREATE TABLE COMPANY" +
                   " companyName VARCHAR(255), " + 
                   " address VARCHAR(255), " + 
                   " PRIMARY KEY ( companyName ))"; 

         stmt.executeUpdate(sql);
         System.out.println("Table Created");   
      }
      
      {
         String sql = "CREATE TABLE STOCK " +
                   "(stockId INTEGER not NULL, " +
                   " stockName VARCHAR(255), " + 
                   " productId VARCHAR(255), " + 
                   " productName  VARCHAR(255)" +    
                   " PRIMARY KEY ( stockId ))"; 

         stmt.executeUpdate(sql);
         System.out.println("Table Created"); 
         
      }
      
      {
         String sql = "CREATE TABLE INVENTORY " +
                   "(stockId INTEGER not NULL, " +
                   " stockName VARCHAR(255), " + 
                   " PRIMARY KEY ( stockId )" +
                   " FOREIGN KEY (stockId)" +
                   " FOREIGN KEY (stockName))";

         stmt.executeUpdate(sql);
         System.out.println("Table Created");   
      }
      
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}