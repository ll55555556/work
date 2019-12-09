package com.woniu.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.pojo.User;
import com.woniu.service.UserService;

@Service
@Transactional
public class UserSerivceImpl implements UserService {

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findOne(Integer uid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
