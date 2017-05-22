package com.niit.testcase;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.config.ApplicationContextConfig;
import com.niit.dao.CategoryDao;
import com.niit.dao.ProductDao;
import com.niit.dao.RegisterDao;
import com.niit.model.Category;
import com.niit.model.CreateUser;
import com.niit.model.Product;

public class TestApp {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		System.out.println("I am in Main class");

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ApplicationContextConfig.class);
		// context.scan("com.niit");
		// context.refresh();

	RegisterDao regDao = (RegisterDao) context.getBean("regDao");

		CreateUser user = new CreateUser();
		user.setEmail("sowmyakarmel@gmail.com");
		user.setMyname("sowmya");
		user.setContactno("9246150869");
		user.setPassword("sowmya");
		user.setRole("Customer");
		user.setIs_active(true);
		regDao.addData(user);
	

	
	/*CategoryDao catDao= (CategoryDao) context.getBean("catDao");
	
	Category category=new Category();
	category.setCategoryid(1);
	category.setCatname("Jaguar");
	catDao.newCategory(category);
	*/

	
	/*ProductDao proDao=(ProductDao) context.getBean("proDao");
	
	Product product=new Product();
	product.setProductId(1);
	product.setProductName("Jaguar");
	product.setProductPrice("100000");
	product.setProductDescription("Jaguar is a car");
	//product.setCategoryId(categoryId);
	product.setQuantity(1);
	product.setStatus(true);
	proDao.addProduct(product);
	*/
}
}