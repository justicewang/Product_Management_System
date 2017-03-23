package Controller;

import java.sql.SQLException;
import java.util.Scanner;

import model.Category;
import model.Product;
import serves.Datahandling;

public class Controller {
	
	private static String menu = " 1. List Categories\n 2. List Products of a Category\n "
			+"3. Add Categories\n 4. Add Products under a Category\n "
			+"5. View specific product details by id\n 6. View specific product details by name\n "
			+"7. Average number of products among all categories\n "
			+"8. Largest description product\n 9. Delete Category\n "
			+"10. Delete Product\n 11. Remove Product from a category\n "
			+"12. Display most recent 5 products\n "
			+"13. Quit\n";
	Datahandling dataHandler;
	Scanner sc;
	public Controller() {
		dataHandler = new Datahandling();
		sc = new Scanner(System.in);
	}
	public void menu() {
		int select = 0;
		while (true) {
			System.out.print(menu); 
			int Category_id;
			String Category_name;
			int Product_id;
			String Product_name;
			double price;
			Category c;
			Product p;
			String read;
			select = sc.nextInt();
			String ignore_new_line = sc.nextLine();
			switch(select) {
			// case 1 : List Categories
			case 1 :
				dataHandler.List_Category();
				break;
			// case 2 : List Products of a Category
			case 2 :
				dataHandler.List_Category();
				System.out.println("Please select which Category you want to list: ");
				Category_id = sc.nextInt();
				c = dataHandler.find_Category(Category_id);
				dataHandler.List_Products_of_Category(c);
				break;
			// case 3 : Add Categories
			case 3 :
				dataHandler.List_Category();
				System.out.println("Please type in the new Category's name");
				Category_name = sc.nextLine();
				if(dataHandler.Add_Category(Category_name))
					System.out.println("added");
				else
					System.out.println("error!");
				break;
			// case 4 : Add Products under a Category
			case 4 :
				dataHandler.List_Category();
				System.out.println("Please type in the Category's id you want to add");
				Category_id = sc.nextInt();
				ignore_new_line = sc.nextLine();
				c = dataHandler.find_Category(Category_id);
				if(c==null){
					System.out.println("Category is not found.");
					break;
				}
				System.out.println("Please type in the product name");
				Product_name = sc.nextLine();
				System.out.println("Please type in the product's price");
				price = sc.nextDouble();
				if(dataHandler.Add_Product_under_Category(c,Product_name, price))
					System.out.println("added");
				else
					System.out.println("error!");
				break;
			// case 5 : View specific product details by id
			case 5 :
				System.out.println("Please type in the Product id: ");
				Product_id = sc.nextInt();
				ignore_new_line = sc.nextLine();
				p = dataHandler.find_Product(Product_id);
				dataHandler.View_Product_Details(p);
				break;
			// case 6 : View specific product details by name
			case 6 :
				System.out.println("Please type in the Product Name: ");
				Product_name = sc.nextLine();
				p = dataHandler.find_Product(Product_name);
				dataHandler.View_Product_Details(p);
				break;
			// case 7 : Average number of products among all categories
			case 7 :
				double avg = dataHandler.Avg_Number_amoung_Categories();
				if(avg==0.0)
					break;
				System.out.println(" Average number of products among all categories: "+avg);
				break;
			// case 8 : Largest description product
			case 8 :
				p = dataHandler.Largest_description_Product();
				if(p!=null)
					System.out.println(p.toString());
				break;
			// case 9 : Delete Category
			case 9 :
				dataHandler.List_Category();
				System.out.println("please select the Category id or name.");
				read = sc.nextLine();
				try {
					Category_id = Integer.parseInt(read);
					c = dataHandler.find_Category(Category_id);
				} catch (NumberFormatException e) {
					Category_name = read;
					c = dataHandler.find_Category(Category_name);
				}
				if(dataHandler.Delete_Category(c))
					System.out.println("deleted!");
				break;
			// case 10 : Delete Product
			case 10 :
				System.out.println("please select the Product id or name.");
				read = sc.nextLine();
				try {
					Product_id = Integer.parseInt(read);
					p = dataHandler.find_Product(Product_id);
				} catch (NumberFormatException e) {
					Product_name = read;
					p = dataHandler.find_Product(Product_name);
				}
				if(dataHandler.Delete_Product(p))
					System.out.println("deleted!");
				break;
			// case 11 : Remove Product from a category
			case 11 :
				dataHandler.List_Category();
				System.out.println("please type in the Category id");
				Category_id = sc.nextInt();
				ignore_new_line = sc.nextLine();
				c = dataHandler.find_Category(Category_id);
				System.out.println("please select the Product id or name.");
				read = sc.nextLine();
				try {
					Product_id = Integer.parseInt(read);
					p = dataHandler.find_Product(Product_id);
				} catch (NumberFormatException e) {
					Product_name = read;
					p = dataHandler.find_Product(Product_name);
				}
				if(dataHandler.Remove_Product_from_Category(c, p))
					System.out.println("deleted!");
				break;
			// case 12 : Display most recent 5 products
			case 12 :
				dataHandler.Recent_Products();
				break;
			case 13 :
				System.out.println("good bye");
				break;
			default:
				 System.out.printf("Bad menu choice:  %s\n", select);
				break;
			}
			if(select==13)
				break;
		}	
	}
}
