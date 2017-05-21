package com.lovego.entity;

import java.io.Serializable;

/**
 * Created by admin on 2017/5/18.
 */
public class User implements Serializable{
    private Integer id;
    private String name;
    private String sex;
    private Integer aeg;

    public User(){}

    public User(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAeg() {
        return aeg;
    }

    public void setAeg(Integer aeg) {
        this.aeg = aeg;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", aeg=" + aeg +
                '}';
    }
}
