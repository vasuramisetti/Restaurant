package menu;
public class Item {
	
	private String name;
	private double price;
	private String category;
	private String type;
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return this.name;
	}
	public double getPrice() {
		return this.price;
	}
	public String getCategory() {
		return this.category;
	}
	public String getType() {
		
		return this.type;
	}
	
	public Item(String name,double price,String category,String type){
		this.name=name;
		this.price=price;
		this.category=category;
		this.type=type;
		
		
	}
	public Item() {
		
	}
	

}
