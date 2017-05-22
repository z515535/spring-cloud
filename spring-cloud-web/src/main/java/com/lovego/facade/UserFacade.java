package com.lovego.facade;

import com.lovego.entity.User;
import com.lovego.fallback.UserFallBack;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@FeignClient(name = "user-server", fallback = UserFallBack.class)
public interface UserFacade {

    @RequestMapping(method = RequestMethod.GET,path = "/getUser/{userId}")
    User getUser(@PathVariable("userId") String userId);


    /**
     * 远程 rpc 传递实体对象需要使用 @RequestBody注解
     * @param user
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, path = "/getUserInfos")
    User getUserInfo(@RequestBody User user);

    /**
     * 传递 map 类型参数需要使用 @RequestParam 注解
     * @param map
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, path = "/map")
    Map<String, String> map(@RequestParam Map<String, String> map);

    /**
     * 传递基本类型参数需要 @RequestParam 注解 并申明其变量名
     * @param id
     * @return
     */
    @RequestMapping(path = "/base")
    User base(@RequestParam("id") int id);

}


