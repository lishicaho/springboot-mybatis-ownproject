package com.springboot.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.User;
import com.springboot.service.UserService;

@RestController
public class UserLogin {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/user/login", method= RequestMethod.POST)
    @ResponseBody
    public Map getUserInfo(@RequestBody User user) {
        Boolean bl=userService.login(user);
        String msg=null;
        Map map =new HashMap();
        if(bl){
            msg="登陆成功";
            map.put("msg","登陆成功");
        }else{
            msg="登陆失败";
            map.put("msg","登陆失败");
        }
        return map;
    }
    
    
    @RequestMapping(value="/user/message", method= RequestMethod.GET)
    @ResponseBody
    public List<User> getMessage() {
    	List<User> user=userService.getMessage();
        
        return user;
    }


}
