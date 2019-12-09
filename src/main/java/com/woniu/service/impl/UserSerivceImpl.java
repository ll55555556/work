package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.UserDao;
import com.woniu.pojo.User;
import com.woniu.service.UserService;

@Service
@Transactional
public class UserSerivceImpl implements UserService {
    @Autowired
    public UserDao  userDao;
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		userDao.delete(user.getUserId());
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		userDao.update(user);
	}

	@Override
	public User findOne(Integer uid) {
		// TODO Auto-generated method stub
	    User user=userDao.findOne(uid);
		return user;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		List<User> list=userDao.findAll();
		return list;
	}
	
	

}
