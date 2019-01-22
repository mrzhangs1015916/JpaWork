package com.zs.work.learnjpa.controller;

import com.zs.work.learnjpa.entity.User;
import com.zs.work.learnjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/info/{name}")
    public User getUserInfo(@PathVariable(value = "name") String name){
        return userService.getUser(name);

    }
    @RequestMapping("/ageinfo")
    public User getUserFromAgeAndName(@RequestParam(value = "name")String name,@RequestParam(value = "age")int age){
        return userService.getUserByAgeAndName(name,age);
    }
    @RequestMapping("/Allinfo/{name}")
    public Object getAllUserInfo(@PathVariable(value = "name") String name){
        Object u = userService.getAllUser(name);
        return u;

    }
    @RequestMapping("/save")
    public void saveUser(@RequestParam("name")String name,@RequestParam("age")int age,@RequestParam("partid")int partid){
             User user = new User();
             user.setAge(age);
             user.setName(name);
             user.setPartid(1);
             userService.saveUser(user);
    }
    @RequestMapping("/delete/{name}")
    public void deleteUserInfo(@PathVariable("name")String name){
        userService.deleteUserByName(name);

    }
}
