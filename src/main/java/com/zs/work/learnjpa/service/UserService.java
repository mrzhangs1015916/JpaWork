package com.zs.work.learnjpa.service;

import com.zs.work.learnjpa.dao.UserInfoDAO;
import com.zs.work.learnjpa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserInfoDAO userInfoDAO;
    public User getUser(String name){
        return userInfoDAO.findByName(name);
    }
    public User getUserByAgeAndName(String name,int age){
        return userInfoDAO.getAllInfo(name,age);
    }
    public Object getAllUser(String name){
        Object o = null;
        o=userInfoDAO.getUserPartInfo(name);
        return o;
    }
    @Transactional
    public void saveUser(User u){
        userInfoDAO.save(u);
    }
    @Transactional
    public void deleteUserByName(String name){
        userInfoDAO.deleteByName(name);
    }
}
