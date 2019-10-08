package com.springboot.mapper;


import org.apache.ibatis.annotations.Param;

import com.springboot.demo.User;

public interface UserMapper {
	
	
    User findUserByPhone( String phone);

    void insert(@Param ("name")String name,@Param ("password")String password,@Param ("phone")String phone);
}
