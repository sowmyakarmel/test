package com.niit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.CreateUser;

@Repository("regDao")
public class RegisterDaoImpl implements RegisterDao {
	SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addData(CreateUser createuser) {
		Session session = sessionFactory.openSession();
		// session.beginTransaction();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(createuser);
		tx.commit();
	}

	public void createuserUpdate() {

	}

	public CreateUser getUser(int id) {
		return null;
	}

	
	public CreateUser getEmail(String email) {
		Session s = sessionFactory.openSession();
		@SuppressWarnings("rawtypes")
		Query q = s.createQuery("From CreateUser where email=:email",CreateUser.class);
		q.setParameter("email", email);
		try {
			Object o = q.getSingleResult();
			return (CreateUser) o;

		} catch (Exception e) {
			return null;
		}
	}
}