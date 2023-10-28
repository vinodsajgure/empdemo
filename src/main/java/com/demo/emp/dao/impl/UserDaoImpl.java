package com.demo.emp.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.emp.dao.UserDao;
import com.demo.emp.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionfactory;

	@Override
	public List<User> findAll() {
		Session session = sessionfactory.openSession();
		 List<User> list = (List<User>)session.createQuery("from User").list();
		session.close();
		return list;
	}
	
	

}
