package com.woniu.service;

import java.util.List;

import com.woniu.pojo.User;

public interface UserService {

	void save(User user);
	void delete(Integer uid);
	void update(User user);
	User findOne(Integer uid);
	List<User> findAll();
	
}
