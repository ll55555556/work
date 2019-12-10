package com.woniu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.pojo.User;
import com.woniu.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("save")
	public String save(User user){
		 userService.save(user);
		return "redirect:findAll.do";
	}
	
	@RequestMapping("update")
	public String update(User user){
		userService.update(user);
		return "redirect:findAll.do";
	}
	@RequestMapping("delete")
	public String delete(User user){
		userService.delete(user);
		return "redirect:findAll.do";
	}
	@RequestMapping("findOne")
	public String findOne(Integer userId,HttpServletRequest req){
		req.setAttribute("user", userService.findOne(userId));
		return "userUpd";
	}
	
	@RequestMapping("findAll")
	public String findAll(HttpServletRequest req) {
		List<User> users = userService.findAll();
		req.setAttribute("users", users);
		return "userShow";
	}
	
}
