package com.springboot.rest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.demo.User;
import com.springboot.mapper.UserMapper;
import com.springboot.service.UserService;

@Controller
public class UserController {
	
	private Logger logger = Logger.getLogger(UserController.class);
	
	 @Autowired
	 private UserService userService;
	 
	 	@RequestMapping(value="/getUserInfo", method=RequestMethod.GET)
	    @ResponseBody
	    public User getUserInfo(@RequestParam String phone) {
	 		User user =userService.findUserByPhone(phone);
	 		if(user!=null){
	            System.out.println("user.getName():"+user.getName()+user.getPassword()+user.getPhone());
	            logger.info("user.getAge():"+user.getName()+user.getPassword()+user.getPhone());
	        }
	        return user;
	    }
	 	
	 	@RequestMapping(value="/insertUserInfo", method=RequestMethod.GET)
	    @ResponseBody
	    public Integer insertUserInfo(@RequestParam String name,
	    		@RequestParam String password,@RequestParam String phone) {
	 		Integer i=userService.insert(name,password,phone);
	        System.out.println(i);
	        return i;
	    }
	 
	 

}
