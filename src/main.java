/**
 * 
 */

/**
 * @author justicewang
 *
 */

import Controller.Controller;
public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller c = new Controller();
		c.menu();
	}
}
// test running result:
/*
jdbc connected...
database is created..
 1. List Categories
 2. List Products of a Category
 3. Add Categories
 4. Add Products under a Category
 5. View specific product details by id
 6. View specific product details by name
 7. Average number of products among all categories
 8. Largest description product
 9. Delete Category
 10. Delete Product
 11. Remove Product from a category
 12. Display most recent 5 products
 13. Quit
3
[ id: 1, name:Books ]
[ id: 2, name:Electronics ]
[ id: 3, name:Sports ]
[ id: 4, name:Clothing ]
[ id: 5, name:Bags ]
Please type in the new Category's name
shoes
added
 1. List Categories
 2. List Products of a Category
 3. Add Categories
 4. Add Products under a Category
 5. View specific product details by id
 6. View specific product details by name
 7. Average number of products among all categories
 8. Largest description product
 9. Delete Category
 10. Delete Product
 11. Remove Product from a category
 12. Display most recent 5 products
 13. Quit
4
[ id: 1, name:Books ]
[ id: 2, name:Electronics ]
[ id: 3, name:Sports ]
[ id: 4, name:Clothing ]
[ id: 5, name:Bags ]
[ id: 6, name:shoes ]
Please type in the Category's id you want to add
6
Please type in the product name
nike air
Please type in the product's price
12.12
added
 1. List Categories
 2. List Products of a Category
 3. Add Categories
 4. Add Products under a Category
 5. View specific product details by id
 6. View specific product details by name
 7. Average number of products among all categories
 8. Largest description product
 9. Delete Category
 10. Delete Product
 11. Remove Product from a category
 12. Display most recent 5 products
 13. Quit
2
[ id: 1, name:Books ]
[ id: 2, name:Electronics ]
[ id: 3, name:Sports ]
[ id: 4, name:Clothing ]
[ id: 5, name:Bags ]
[ id: 6, name:shoes ]
Please select which Category you want to list: 
6
[ id: 29, name: nike air, price: 12.12, category: 6]
 1. List Categories
 2. List Products of a Category
 3. Add Categories
 4. Add Products under a Category
 5. View specific product details by id
 6. View specific product details by name
 7. Average number of products among all categories
 8. Largest description product
 9. Delete Category
 10. Delete Product
 11. Remove Product from a category
 12. Display most recent 5 products
 13. Quit
5
Please type in the Product id: 
12
[ id: 12, name: Samsung UN65KS8000 65-Inch 4K Ultra HD Smart LED TV (2016 Model), price: 1797.99, category: 2]
 1. List Categories
 2. List Products of a Category
 3. Add Categories
 4. Add Products under a Category
 5. View specific product details by id
 6. View specific product details by name
 7. Average number of products among all categories
 8. Largest description product
 9. Delete Category
 10. Delete Product
 11. Remove Product from a category
 12. Display most recent 5 products
 13. Quit
6
Please type in the Product Name: 
nike air
nike air;[ id: 29, name: nike air, price: 12.12, category: 6]
 1. List Categories
 2. List Products of a Category
 3. Add Categories
 4. Add Products under a Category
 5. View specific product details by id
 6. View specific product details by name
 7. Average number of products among all categories
 8. Largest description product
 9. Delete Category
 10. Delete Product
 11. Remove Product from a category
 12. Display most recent 5 products
 13. Quit
6
Please type in the Product Name: 
nike air
nike air;[ id: 29, name: nike air, price: 12.12, category: 6]
 1. List Categories
 2. List Products of a Category
 3. Add Categories
 4. Add Products under a Category
 5. View specific product details by id
 6. View specific product details by name
 7. Average number of products among all categories
 8. Largest description product
 9. Delete Category
 10. Delete Product
 11. Remove Product from a category
 12. Display most recent 5 products
 13. Quit
7
 Average number of products among all categories: 4.833333333333333
 1. List Categories
 2. List Products of a Category
 3. Add Categories
 4. Add Products under a Category
 5. View specific product details by id
 6. View specific product details by name
 7. Average number of products among all categories
 8. Largest description product
 9. Delete Category
 10. Delete Product
 11. Remove Product from a category
 12. Display most recent 5 products
 13. Quit
8
[ id: 23, name: Mancro Business Water Resistant Polyester Laptop Backpack with with USB Charging Port and Lock for less than 17-Inch Laptop and Notebook, Grey, price: 28.99, category: 5]
 1. List Categories
 2. List Products of a Category
 3. Add Categories
 4. Add Products under a Category
 5. View specific product details by id
 6. View specific product details by name
 7. Average number of products among all categories
 8. Largest description product
 9. Delete Category
 10. Delete Product
 11. Remove Product from a category
 12. Display most recent 5 products
 13. Quit
9
[ id: 1, name:Books ]
[ id: 2, name:Electronics ]
[ id: 3, name:Sports ]
[ id: 4, name:Clothing ]
[ id: 5, name:Bags ]
[ id: 6, name:shoes ]
please select the Category id or name.
6
 1. List Categories
 2. List Products of a Category
 3. Add Categories
 4. Add Products under a Category
 5. View specific product details by id
 6. View specific product details by name
 7. Average number of products among all categories
 8. Largest description product
 9. Delete Category
 10. Delete Product
 11. Remove Product from a category
 12. Display most recent 5 products
 13. Quit
The Category contains products, cannot delete
2
[ id: 1, name:Books ]
[ id: 2, name:Electronics ]
[ id: 3, name:Sports ]
[ id: 4, name:Clothing ]
[ id: 5, name:Bags ]
[ id: 6, name:shoes ]
Please select which Category you want to list: 
6
[ id: 29, name: nike air, price: 12.12, category: 6]
 1. List Categories
 2. List Products of a Category
 3. Add Categories
 4. Add Products under a Category
 5. View specific product details by id
 6. View specific product details by name
 7. Average number of products among all categories
 8. Largest description product
 9. Delete Category
 10. Delete Product
 11. Remove Product from a category
 12. Display most recent 5 products
 13. Quit
10
please select the Product id or name.
nike air
deleted!
 1. List Categories
 2. List Products of a Category
 3. Add Categories
 4. Add Products under a Category
 5. View specific product details by id
 6. View specific product details by name
 7. Average number of products among all categories
 8. Largest description product
 9. Delete Category
 10. Delete Product
 11. Remove Product from a category
 12. Display most recent 5 products
 13. Quit
2
[ id: 1, name:Books ]
[ id: 2, name:Electronics ]
[ id: 3, name:Sports ]
[ id: 4, name:Clothing ]
[ id: 5, name:Bags ]
[ id: 6, name:shoes ]
Please select which Category you want to list: 
6
 1. List Categories
 2. List Products of a Category
 3. Add Categories
 4. Add Products under a Category
 5. View specific product details by id
 6. View specific product details by name
 7. Average number of products among all categories
 8. Largest description product
 9. Delete Category
 10. Delete Product
 11. Remove Product from a category
 12. Display most recent 5 products
 13. Quit
9
[ id: 1, name:Books ]
[ id: 2, name:Electronics ]
[ id: 3, name:Sports ]
[ id: 4, name:Clothing ]
[ id: 5, name:Bags ]
[ id: 6, name:shoes ]
please select the Category id or name.
shoes
deleted!
 1. List Categories
 2. List Products of a Category
 3. Add Categories
 4. Add Products under a Category
 5. View specific product details by id
 6. View specific product details by name
 7. Average number of products among all categories
 8. Largest description product
 9. Delete Category
 10. Delete Product
 11. Remove Product from a category
 12. Display most recent 5 products
 13. Quit
1
[ id: 1, name:Books ]
[ id: 2, name:Electronics ]
[ id: 3, name:Sports ]
[ id: 4, name:Clothing ]
[ id: 5, name:Bags ]
 1. List Categories
 2. List Products of a Category
 3. Add Categories
 4. Add Products under a Category
 5. View specific product details by id
 6. View specific product details by name
 7. Average number of products among all categories
 8. Largest description product
 9. Delete Category
 10. Delete Product
 11. Remove Product from a category
 12. Display most recent 5 products
 13. Quit
11
[ id: 1, name:Books ]
[ id: 2, name:Electronics ]
[ id: 3, name:Sports ]
[ id: 4, name:Clothing ]
[ id: 5, name:Bags ]
please type in the Category id
1
please select the Product id or name.
2
deleted!
 1. List Categories
 2. List Products of a Category
 3. Add Categories
 4. Add Products under a Category
 5. View specific product details by id
 6. View specific product details by name
 7. Average number of products among all categories
 8. Largest description product
 9. Delete Category
 10. Delete Product
 11. Remove Product from a category
 12. Display most recent 5 products
 13. Quit
2
[ id: 1, name:Books ]
[ id: 2, name:Electronics ]
[ id: 3, name:Sports ]
[ id: 4, name:Clothing ]
[ id: 5, name:Bags ]
Please select which Category you want to list: 
1
[ id: 1, name: Steve Jobs, price: 49.99, category: 1]
[ id: 3, name: The Three-Body Problem, price: 7.99, category: 1]
[ id: 4, name: The C++ Programming Language, 4th Edition, price: 61.56, category: 1]
[ id: 5, name: JavaScript and JQuery: Interactive Front-End Web Development , price: 30.15, category: 1]
[ id: 6, name: MySQL (5th Edition) (Developer's Library), price: 41.07, category: 1]
 1. List Categories
 2. List Products of a Category
 3. Add Categories
 4. Add Products under a Category
 5. View specific product details by id
 6. View specific product details by name
 7. Average number of products among all categories
 8. Largest description product
 9. Delete Category
 10. Delete Product
 11. Remove Product from a category
 12. Display most recent 5 products
 13. Quit
11
[ id: 1, name:Books ]
[ id: 2, name:Electronics ]
[ id: 3, name:Sports ]
[ id: 4, name:Clothing ]
[ id: 5, name:Bags ]
please type in the Category id
1
please select the Product id or name.
Steve Jobs
deleted!
 1. List Categories
 2. List Products of a Category
 3. Add Categories
 4. Add Products under a Category
 5. View specific product details by id
 6. View specific product details by name
 7. Average number of products among all categories
 8. Largest description product
 9. Delete Category
 10. Delete Product
 11. Remove Product from a category
 12. Display most recent 5 products
 13. Quit
2
[ id: 1, name:Books ]
[ id: 2, name:Electronics ]
[ id: 3, name:Sports ]
[ id: 4, name:Clothing ]
[ id: 5, name:Bags ]
Please select which Category you want to list: 
1
[ id: 3, name: The Three-Body Problem, price: 7.99, category: 1]
[ id: 4, name: The C++ Programming Language, 4th Edition, price: 61.56, category: 1]
[ id: 5, name: JavaScript and JQuery: Interactive Front-End Web Development , price: 30.15, category: 1]
[ id: 6, name: MySQL (5th Edition) (Developer's Library), price: 41.07, category: 1]
 1. List Categories
 2. List Products of a Category
 3. Add Categories
 4. Add Products under a Category
 5. View specific product details by id
 6. View specific product details by name
 7. Average number of products among all categories
 8. Largest description product
 9. Delete Category
 10. Delete Product
 11. Remove Product from a category
 12. Display most recent 5 products
 13. Quit
12
Recent most 5 Products list: 
[ id: 6, name: MySQL (5th Edition) (Developer's Library), price: 41.07, category: 1]
[ id: 5, name: JavaScript and JQuery: Interactive Front-End Web Development , price: 30.15, category: 1]
[ id: 4, name: The C++ Programming Language, 4th Edition, price: 61.56, category: 1]
[ id: 3, name: The Three-Body Problem, price: 7.99, category: 1]
[ id: 6, name: MySQL (5th Edition) (Developer's Library), price: 41.07, category: 1]
 1. List Categories
 2. List Products of a Category
 3. Add Categories
 4. Add Products under a Category
 5. View specific product details by id
 6. View specific product details by name
 7. Average number of products among all categories
 8. Largest description product
 9. Delete Category
 10. Delete Product
 11. Remove Product from a category
 12. Display most recent 5 products
 13. Quit
13
good bye
*/