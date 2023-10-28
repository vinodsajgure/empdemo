package com.demo.emp.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.emp.dao.ContactUsDao;
import com.demo.emp.entity.ContactUs;
@Repository
public class ContactUsDaoImpl implements ContactUsDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(ContactUs contactUs) {
		Session session= sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(contactUs);
		tx.commit();
		session.close();
	}

}
