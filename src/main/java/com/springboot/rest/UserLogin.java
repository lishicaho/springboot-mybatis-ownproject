package com.springboot.rest;

import com.springboot.demo.User;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserLogin {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/user/login", method= RequestMethod.POST)
    @ResponseBody
    public User getUserInfo(@RequestBody User user) {
       // User user =userService.login(user);
        if(user!=null){
        }
        return user;
    }


}
