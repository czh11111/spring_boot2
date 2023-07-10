package com.example.spring_boot2.controller;

import com.example.spring_boot2.Pojo.User;
import com.example.spring_boot2.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HellowController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/query")
    @ResponseBody
    public List<User> quertyUserList(){
        List<User> users = userMapper.queryUserList();
        for (User user : users){
            System.out.println(user);
        }
        return users;
    }


    @RequestMapping("/hello")
    @ResponseBody
    public String HelloWold(){
        return "hello world";
    }

    @RequestMapping("/hello1")
    public String HelloWold1(Model model){
        model.addAttribute("msg","hello1");
        return "hello1";
    }

    @RequestMapping("/hello2")
    public String HelloWold2(){
        int i=1/0;
        return "hello1";
    }
}
