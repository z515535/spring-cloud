package com.lovego.controller;


import com.lovego.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


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

    @RequestMapping("/getUserInfo")
    public User getUser(@RequestBody User user){
        System.out.println(user);
        return new User(user.getId());
    }

    @RequestMapping("/map")
    public Map<String,String> map(@RequestParam Map<String,String> map){
        System.out.println(map);
        return map;
    }

    @RequestMapping("/base")
    public User base(int id){
        return new User(id);
    }
}
