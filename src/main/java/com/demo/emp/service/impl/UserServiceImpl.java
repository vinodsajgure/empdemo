package com.demo.emp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.emp.dao.UserDao;
import com.demo.emp.entity.User;
import com.demo.emp.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao dao;

	@Override
	public List<User> getAllUsers() {
		return dao.findAll();
	}

}
