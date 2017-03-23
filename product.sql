--create Categories table
create table Categories(
	id int primary key AUTO_INCREMENT,
	name varchar(50)
);
--create Products table
create table Products(
	id int primary key AUTO_INCREMENT,
	name varchar(255),
	price double,
	category int,
	FOREIGN KEY(category) REFERENCES Categories(id)
);

--insert Categories
insert into Categories(name) values ("Books");			
insert into Categories(name) values ("Electronics");	
insert into Categories(name) values ("Sports");			
insert into Categories(name) values ("Clothing");		
insert into Categories(name) values ("Bags");		

--insert books Category 1
insert into Products(name, price,category) values("Steve Jobs",49.99,1);
insert into Products(name, price,category) values("OCA Java SE 7 Programmer I Certification Guide",33.07,1);
insert into Products(name, price,category) values("The Three-Body Problem",7.99,1);
insert into Products(name, price,category) values("The C++ Programming Language, 4th Edition",61.56,1);
insert into Products(name, price,category) values("JavaScript and JQuery: Interactive Front-End Web Development ",30.15,1);
insert into Products(name, price,category) values("MySQL (5th Edition) (Developer's Library)",41.07,1);

--insert Electronics Category 2
insert into Products(name, price,category) values("GoPro HERO5 Black",349.99,2);
insert into Products(name, price,category) values("iPhone 7s plus",899.99,2);
insert into Products(name, price,category) values("iPad pro",1229.99,2);
insert into Products(name, price,category) values("MacBook Air 2",949.99,2);
insert into Products(name, price,category) values("Sony PlayStation 4 500GB Console",261.00,2);
insert into Products(name, price,category) values("Samsung UN65KS8000 65-Inch 4K Ultra HD Smart LED TV (2016 Model)",1797.99,2);

--insert Sports Category 3
insert into Products(name, price,category) values("Burton Clash Snowboard - Men's",538.65,3);
insert into Products(name, price,category) values("Callaway Men's Strata Complete Golf Club Set with Bag (12-Piece)",219.99,3);
insert into Products(name, price,category) values("Spalding NBA Varsity Outdoor Rubber Basketball",31.40,3);
insert into Products(name, price,category) values("AW Pro Compound Bow Kit Archery Set",264.95,3);
insert into Products(name, price,category) values("Wilson Traditional Soccer Ball",26.56,3);

--insert Clothing Category 4
insert into Products(name, price,category) values("Haggar Men's Big and Tall Long Sleeve Weekender Shirt",19.54,4);
insert into Products(name, price,category) values("POGTMM Women Long Sleeve O-Neck Patchwork Casual Loose T-shirt Blouse Tops",17.98,4);
insert into Products(name, price,category) values("Lanmo Women Plus Size 3/4 Sleeve Tunic Tops Loose Basic Shirt",15.99,4);
insert into Products(name, price,category) values("H2H Mens Casual Slim Fit Henley Shirts With Bound Pocket of Waffle Cotton",26.99,4);
insert into Products(name, price,category) values("FaPlus Men's Fashion Lifelike Explosion 3D Print T-Shirts",33.99,4);

--insert Bags Category 5
insert into Products(name, price,category) values("Mancro Business Water Resistant Polyester Laptop Backpack with with USB Charging Port and Lock for less than 17-Inch Laptop and Notebook, Grey",28.99,5);
insert into Products(name, price,category) values("Ammazona New Women Messenger Bags Vintage Small Shell Leather Handbag Casual Bag",12.56,5);
insert into Products(name, price,category) values("Makeup bag - Mr.Pro Waterproof Travel Kit Organizer Bathroom Storage Cosmetic Bag Carry Case Toiletry Bag (Cylinder Red)",9.99,5);
insert into Products(name, price,category) values("adidas Diablo Small Duffle Bag",19.99,5);
insert into Products(name, price,category) values("Big Sale---S-ZONE Women's Vintage Genuine Leather Shoulder Bag Big Capacity Handbags Tote Top-handle Purse",75.99,5);

insert into Products(name, price,category) values("aaa",75.99,5);