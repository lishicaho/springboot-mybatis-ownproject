package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.demo.User;
import com.springboot.mapper.UserMapper;

@Service
public class UserService {
	
	 @Autowired
	 private UserMapper userMapper;

	public User findUserByPhone(String phone) {
		User user=userMapper.findUserByPhone(phone);
		return user;
	}
	
	public Integer insert(String name,String password,String phone) {
		userMapper.insert(name,password,phone);
		return 1;
	}

}
