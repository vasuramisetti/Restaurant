package menu;

import java.util.ArrayList;
import java.util.Date;

import menu.Item;
import menu.Menu;
import menu.Restaurent;

public class RestaurentMenu {

	public static void main(String[] args) {

		Restaurent details = new Restaurent("Indian Delicious", 5106747629L, "indiandelicious@gmail.com",
				"wwww.indiandeliciousrestaurant.com", "40640 High Street,Fremont,CA,94538");
		
		ItemDAO getitem =new ItemDAO();
		

		
		ArrayList<Item> items = getitem.returnitems();
		
		
		
		
		Menu breakfast = new Menu();
		Menu lunch = new Menu();
		Menu dinner = new Menu();
		
		for(Item item: items){
			if (item.getCategory() == "starters") {
				breakfast.addItem(item);
				
				System.out.println("Hai"+item.getCategory());
				
			}
				 else if (item.getCategory() == "tiffen"){
					 lunch.addItem(item);	 
				 }
				 else  {
			}
			System.out.println(item.getCategory() +item.getName() +item.getPrice() +item.getType());
			
			}
	
			

		

		
		
		
		
		/*breakfast.addItem(item3);
		breakfast.addItem(item4);
		breakfast.addItem(item5);
		breakfast.setStartTime(new Date());
		breakfast.setEndTime(new Date());
		lunch.addItem(item6);
		lunch.addItem(item7);
		lunch.addItem(item8);
		lunch.addItem(item1);
		lunch.addItem(item2);
		lunch.setStartTime(new Date());
		dinner.addItem(item6);
		dinner.addItem(item7);
		dinner.addItem(item8);
		
		// System.out.println("Restaurant Name:"+ details.getName() +"\n"
		// +"Address:"+ details.getAddress() + "\n"+"Phone Number:"+
		// +details.getPhoneNumberL() +"\n"+"Email:" +details.getEmail() +"\n"
		// +"Website Name:"+ details.getWebSiteName());
		// System.out.println("***************");
		// System.out.println("Starters:");*/
		//items.addAll(breakfast.getItems());
		//items.addAll(lunch.getItems());


		
	}
}
