package model;

public class Product {
	int id;
	String name;
	double price;
	int category;
	public Product(int id, String name, double price, int category) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	public Product() {
		
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getCategory() {
		return category;
	}
	
	public void setCategory(int category) {
		this.category = category;
	}
	
	public String toString() {
		return "[ id: "+this.id+", name: "+this.name
				+", price: "+this.price+", category: "+this.category+"]";
	}
	public String ToString() {
		return "[ id: "+this.id+", name: "+this.name+", price: "+this.price+"]";
	}
}
