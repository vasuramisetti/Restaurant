package menu;

import java.sql.*;  

class menuDAO{  
public static void main(String args[])throws Exception
{ 
	{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/restaurent","root","Vasudev17*");    
Statement stmt=con.createStatement();  
ResultSet rs =stmt.executeQuery("select * from breakfast");

 
while(rs.next())
	System.out.println(rs.getString("name") + rs.getDouble("price") +rs.getString("catagory")+rs.getString("type"));  
  
con.close();  
	}
	

	
	
}

  
}  