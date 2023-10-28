package com.demo.emp.dao;

import java.util.List;

import com.demo.emp.entity.User;


public interface UserDao {

	public List<User> findAll();
}
