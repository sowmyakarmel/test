package com.niit.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Category;
import com.niit.model.Product;

@Repository("proDao")
@Transactional
public class ProductDaoImpl implements ProductDao {

	@Autowired
	SessionFactory sessionFactory;

	public boolean addProduct(Product product) {
		// TOO Auto-generated method stub
		System.out.println("Entered into new product");
		try {
			Session s = sessionFactory.openSession();
			Transaction t = s.beginTransaction();
			s.save(product);
			t.commit();
			return true;
		} catch (Exception e) {
			// TODO:handle exception
			System.out.println(e);
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Product> allProducts() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("From Product").getResultList();
	}

	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		System.out.println("Product");
		try {
			return sessionFactory.getCurrentSession().get(Product.class, Integer.valueOf(id));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return null;
		}
	}

	public List<Product> allProduct() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("From Product", Product.class).getResultList();
	}

	public Product get(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		return session.get(Product.class, id);
	}

	public boolean update(Product product) {
		System.out.println("Product price::::::::::::::::::" + product.getProductPrice());
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(product);
			return true;
		} catch (Exception e) {
			System.out.println("Exception in ProductDao:::::::" + e);
			return false;
		}
	}

	@SuppressWarnings("deprecation")
	public boolean delete(int id) {
		System.out.println("Testing");
		try {
			Query q = sessionFactory.getCurrentSession()
					.createQuery("Update Product set quantity=:qan,status=:status WHERE productId=:ID");
			q.setParameter("ID", id);
			q.setParameter("qan", 0);
			q.setParameter("status", false);
			q.executeUpdate();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Product> getCatProducts(Integer id) {
		// TODO Auto-generated method stub
		try {
			Query q = sessionFactory.getCurrentSession().createQuery("From Product where category_id=:id");
			q.setParameter("id", id);
			return q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	
}