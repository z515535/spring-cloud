package com.lovego.facade;

import com.lovego.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name = "user-server")
public interface UserFacade {

    @RequestMapping(method = RequestMethod.GET,path = "/getUser/{userId}")
    User getUser(@PathVariable("userId") String userId);
}
