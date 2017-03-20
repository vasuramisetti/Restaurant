package menu;

import java.sql.*;
import java.util.ArrayList;  

class menuDAO{  
public static void main(String args[])throws Exception
{ 
	{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/restaurent","root","Vasudev17*");    
Statement stmt=con.createStatement();  

ResultSet rs =stmt.executeQuery("select * from breakfast");
ArrayList<Item> item = new ArrayList<Item>();
item.addAll(breakfast.getItems());
while (rs.next()){
	System.out.println(rs.getString("name") + rs.getDouble("price") +rs.getString("category")+rs.getString("type"));  
	 items = new Item();
     items.setName(rs.getName("name"));
     items.setPrice(rs.getPrice("price"));
     items.setCategory(rs.getCategory("caegory"));
     items.setType(rs.getType("type"));

 }
	
	
}
	
con.close();  
	}
	
		
	
	
}

  
}  