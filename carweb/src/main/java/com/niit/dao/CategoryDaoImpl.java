package com.niit.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.CreateUser;
import com.niit.model.Category;

@Repository("catDao")
@Transactional
public class CategoryDaoImpl implements CategoryDao {
	@Autowired
	SessionFactory sessionFactory;

	public boolean newCategory(Category category) {
		// TOO Auto-generated method stub
		System.out.println("Entered into new category");
		Session s = sessionFactory.openSession();
		Transaction t = s.beginTransaction();
		s.save(category);
		t.commit();
		return true;
	}

	@SuppressWarnings("unchecked")
	public Map<Integer,String> getAllCat()
	{
	//TOO Auto-generated method stub
	List<Category>
	list=sessionFactory.getCurrentSession().createQuery("From Category").getResultList();
	Map<Integer,String> map=new HashMap<Integer,String>();
	Iterator<Category> it=list.iterator();
	while(it.hasNext())
	{
		Category c=it.next();
		map.put(c.getCategoryid(),c.getCatname());
	}
	return map;
	
}

public boolean deleteCategory(int id)
{
	Category category=getCategory(id);
	try
	{
		sessionFactory.getCurrentSession().delete(category);
		System.out.println("Category deleted");
	}
	catch(Exception e)
	{
	//TODO: handle exception
	System.out.println(e);
	}return true;

}

public boolean updateCategory(Category category)
{
	//TODO Auto-generated method stub
	try
	{
		sessionFactory.getCurrentSession().update(category);
		return true;
	}
	catch(Exception e)
	{
		//TODO handle exception
		System.out.println(e);
		return false;
	}
}

public Category getCategory(int id)
{
	//TODO Auto-generated method stub
	System.out.println("Category");
	try
	{
		return sessionFactory.getCurrentSession().get(Category.class,Integer.valueOf(id));
	}
	catch(Exception e)
	{
		//TODO: handle exception
		System.out.println(e);
		return null;
	}
}

public List<Category>allCategories()
{
	//TODO Auto-generated method stub
	return sessionFactory.getCurrentSession().createQuery("From Category",Category.class).getResultList();
}

@Override
public boolean update(Category category) {
	// TODO Auto-generated method stub
	return false;
}


}