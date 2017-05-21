package com.lovego.controller;

import com.lovego.entity.User;
import com.lovego.facade.UserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by admin on 2017/5/18.
 */
@RestController
public class UserController {

   @Autowired
    private UserFacade userFacade;

    @RequestMapping("/user/{userId}")
    public User getUser(@PathVariable("userId") String userId){
        User user = userFacade.getUser(userId);
        System.out.println(" >>>>>>>>>>>>>> ");
        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getAeg());
        System.out.println(user.getSex());

        System.out.println(user);
        System.out.println(" <<<<<<<<<<<<<<");
        return user;
    }

    @RequestMapping("getUserInfo")
    public User getUserInfo(User user){
        System.out.println(user);
        return userFacade.getUserInfo(user);
    }

    @GetMapping("map")
    public Map<String, String> map(@RequestParam Map<String, String> map){
        System.out.println(map);
        return userFacade.map(map);
    }

    @RequestMapping("/getUser")
    public User user(){
        return new User();
    }

    @RequestMapping("base")
    public User base(int id){
        System.out.println(id);
        return userFacade.base(id);
    }
}
