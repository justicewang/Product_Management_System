package DAO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Category;
import model.Product;

public class DBhandling {
	private Connection con;
	private Statement st;
	public DBhandling() {
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/Product_Management","root","");
			if(con != null){
				System.out.println("jdbc connected...");
				st = con.createStatement();
				
				DatabaseMetaData dbm = con.getMetaData();
				ResultSet tables = dbm.getTables(null, null, "Products", null);
				if (tables.next()) {
				   st.execute("drop table Products");
				}
				tables = dbm.getTables(null, null, "Categories", null);
				if (tables.next()) {
				   st.execute("drop table Categories");
				}
				StringBuffer sb = new StringBuffer();
				String read;
				try {
					FileReader fr = new FileReader(new File("product.sql"));
					BufferedReader br = new BufferedReader(fr);
					while((read = br.readLine())!=null) {
						if(read.length()>=2 && read.substring(0, 2).equals("--"))
							continue;
						sb.append(read+"\n");
					}
					br.close();
					//System.out.println(sb.toString());
					String[] sqlList = sb.toString().split(";");
					for(String s : sqlList) {
						if(!s.trim().equals(""))
							st.execute(s);
					}
					System.out.println("database is created..");
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	public ResultSet getCategories() throws SQLException {
		return st.executeQuery("select * from Categories");
	}
	public ResultSet getProducts() throws SQLException {
		return st.executeQuery("select * from Products");
	}
	public ResultSet List_Products_of_Category(Category c) throws SQLException {
		return st.executeQuery("select * from Products where category="+c.getId());
	}
	public int Add_Category(Category category) throws SQLException{
		int x = 0;
		x = st.executeUpdate("insert into Categories(id, name) values("+category.getId()+",'"+category.getName()+"')");
		return x;
	}
	public int Add_Product_under_Category(Category c, Product p) throws SQLException {
		
		PreparedStatement ps = con.prepareStatement("insert into Products(id,name, price, category) values(?,?,?,?)");	
		ps.setInt(1, p.getId());
		ps.setString(2, p.getName());
		ps.setDouble(3, p.getPrice());
		ps.setInt(4, p.getCategory());
		int x = 0;
		x = ps.executeUpdate();
		ps.close();
		return x;
	}
	public boolean Delete_Category(Category c) throws SQLException {
		int x=st.executeUpdate("delete from Categories where id="+c.getId());
		return x==1? true:false; 
	}
	public boolean Delete_Product(Product p) throws SQLException {
		int x=st.executeUpdate("delete from Products where id="+p.getId());
		return x==1? true:false; 
	}
}
