package com.dataapplab.firstweb;
import java.sql.*;
public class DBloginService implements AuthService{
	 public boolean validateUser (String userName, String password) {
	 boolean st =false;
	 try{
		 System.out.println("we are connect database"); 
 		 //loading drivers for mysql
         Class.forName("com.mysql.jdbc.Driver");

    	 //creating connection with the database 
         String connectionString = "jdbc:mysql://localhost:3306/commerce?user=root&password=msd211314";
         Connection con=DriverManager.getConnection(connectionString);
         try{
	         PreparedStatement ps =con.prepareStatement("select * from user where name=? and password=?");
	         try{
		         ps.setString(1,userName );
		         ps.setString(2,password );
		         ResultSet rs=ps.executeQuery(); 
		         try {
		        	 st=rs.next();
		        		        	 
		         }finally{
		        	 rs.close(); // release resultSet
		         }
	         }finally{
	          ps.close(); // release the statement
	         }
         }finally{
        	 con.close(); // release the connection
         }
	   }catch(Exception e){
	          e.printStackTrace();
       }
       return st;
	 }
}
