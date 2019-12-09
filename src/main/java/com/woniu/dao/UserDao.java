package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.User;

public interface UserDao {
   //dao
	 void save(User user);
	 void update(User user);
	 void delete(Integer userId);
	 User findOne(Integer userId);
	 List<User> findAll();
	
}
