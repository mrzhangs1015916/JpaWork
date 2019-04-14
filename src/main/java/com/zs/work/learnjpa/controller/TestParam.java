package com.zs.work.learnjpa.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zs.work.learnjpa.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/test")
public class TestParam {
    @RequestMapping(value = "/single",method = RequestMethod.POST)
    public String getJson(@RequestBody Person person){
        Optional<Person> tmp = Optional.ofNullable(person);
        return tmp.orElse(null).toString();
    }
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public String getListJson(@RequestBody Object list){
        if(list==null){
            return "null";
        }
        else{
           List<Person> people = new ArrayList<Person>((Collection<Person>)list);
           return people.toString();
        }
    }
    @RequestMapping(value = "/list2",method = RequestMethod.POST)
    public String getListJson2(@RequestBody List<Person> list){
        if(list==null){
            return "null";
        }
        else{
            return list.toString();
        }
    }
    @RequestMapping(value = "/list3",method = RequestMethod.POST)
    public String getListJson3(@RequestParam("list") List<String> list){
        if(list==null){
            return "null";
        }
        else{
            return list.toString();
        }
    }

}
