package serves;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import DAO.DBhandling;
import model.Category;
import model.Product;
import model.FixedQueue;

public class Datahandling {
	ArrayList<Product> Products;
	int p_last_id;
	int c_last_id;
	ArrayList<Category> Categories;
	FixedQueue ProductHistory;
	DBhandling db;
	public Datahandling(){
		Products = new ArrayList<Product>();
		Categories = new ArrayList<Category>();
		db = new DBhandling();
		try {
			ResultSet c = db.getCategories();
			while(c.next()) {
				int c_id = Integer.parseInt(c.getString(1));
				String c_name = c.getString(2);
				Category c1 = new Category(c_id,c_name);
				Categories.add(c1);
			}
			
			ResultSet p = db.getProducts();
			while(p.next()) {
				int p_id = Integer.parseInt(p.getString(1));
				String p_name = p.getString(2);
				double price = Double.parseDouble(p.getString(3));
				int c_id = Integer.parseInt(p.getString(4));
				Product p1 = new Product(p_id,p_name,price,c_id);
				Products.add(p1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		c_last_id = Categories.get(Categories.size()-1).getId();
		p_last_id= Products.get(Products.size()-1).getId();
		ProductHistory = new FixedQueue<Product>(5);
	}
	public void List_Category() {
		for (Category c : Categories) {
			System.out.println(c.toString());
		}
	}
	public void List_Product() {
		for (Product p : Products) {
			System.out.println(p.toString());
			ProductHistory.add(p);
		}
	}
	public void List_Products_of_Category(Category c) {
		if(c==null){
			System.out.println("Category is not found.");
			return;
		}
		for (Product p : Products) {
			if(p.getCategory()==c.getId()){
				System.out.println(p.toString());
				ProductHistory.add(p);
			}
		}
	}
	public boolean Add_Category(String Category_name) {
		int x = 0;
		try {
			Category c = new Category(++c_last_id,Category_name);
			Categories.add(c);
			x = db.Add_Category(c);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x==1? true:false;
	}
	public boolean Add_Product_under_Category(Category c, String Product_name, double price) {
		if(c==null){
			System.out.println("Category is not found.");
			return false;
		}
		int x = 0;
		try {
			Product p = new Product(++p_last_id,Product_name,price,c.getId());
			Products.add(p);
			x = db.Add_Product_under_Category(c, p);
			ProductHistory.add(p);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x==1? true:false;
	}
	public void View_Product_Details(Product p) {
		if(p==null){
			System.out.println("Product is not found.");
		}
		else {
			ProductHistory.add(p);
			System.out.println(p.toString());
		}
	}
	
	public double Avg_Number_amoung_Categories() {
		if(Categories.size()<=0){
			System.out.println("there is not Category.");
			return 0.0;
		}
		else
			return ((double)Products.size())/Categories.size();
	}
	public Product Largest_description_Product() {
		if(Products.size()<=0){
			System.out.println("there is not Product.");
			return null;
		}
		Product p1 = Products.get(0);
		for(Product p: Products) {
			if(p.getName().length()>p1.getName().length())
				p1 = p;
		}
		ProductHistory.add(p1);
		return p1;
	}
	public boolean Delete_Category(Category c) {
		if(c==null){
			System.out.println("Product is not found.");
			return false;
		}
		try {
			for(Product p : Products) {
				if(p.getCategory()==c.getId()) {
					System.err.println("The Category contains products, cannot delete");
					return false;
				}
			}
			return db.Delete_Category(c) && Categories.remove(c);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean Delete_Product(Product p) {
		if(p==null){
			System.out.println("Product is not found.");
			return false;
		}
		try {
			return db.Delete_Product(p) && Products.remove(p);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean Remove_Product_from_Category(Category c, Product p) {
		if(p==null || c== null){
			System.out.println("Product or Category is not found.");
			return false;
		}
		for(Product product:Products) {
			if(product.getCategory()==c.getId()){
				Delete_Product(p);
				return true;
			}
		}
		return false;
	}
	
	public Category find_Category(int id) {
		for(Category c : Categories) {
			if(c.getId()==id)
				return c;
		}
		return null;
	}
	public Category find_Category(String name) {
		for(Category c : Categories) {
			if(c.getName().equals(name))
				return c;
		}
		return null;
	}
	public Product find_Product(int id) {
		for(Product c : Products) {
			if(c.getId()==id)
				return c;
		}
		return null;
	}
	public Product find_Product(String name) {
		for(Product c : Products) {
			if(c.getName().equals(name))
				return c;
		}
		return null;
	}
	public void Recent_Products() {
		Iterator it = ProductHistory.descendingIterator();
		System.out.println("Recent most 5 Products list: ");
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
