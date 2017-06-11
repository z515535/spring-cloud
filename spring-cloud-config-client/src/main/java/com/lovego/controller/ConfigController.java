package com.lovego.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by acer on 2017-5-30.
 */
@RestController
@RefreshScope
public class ConfigController {
    @Value("${name}")
    private String name;

    @RequestMapping("name")
    public String name(){
        return this.name;
    }
}
