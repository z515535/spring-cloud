package com.lovego.controller;


import com.lovego.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @RequestMapping("getUser/{userId}")
    public User getUser(@PathVariable String userId){
        System.out.println(" rest 接口远程调用开始 ");

        User user = new User();
        user.setId(Integer.valueOf(userId));
        user.setAeg(20);
        user.setName("test");
        user.setSex("男");

        System.out.println(" rest 接口远程调用结束 ");
        return user;
    }
}
