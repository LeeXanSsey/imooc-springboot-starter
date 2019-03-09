package com.imooc.controller;

import com.imooc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getuser")
    @ResponseBody
    public User getuser() {
        User user = new User();
        user.setName("imooc");
        user.setAge("11");
        user.setBirthday(new Date());

        return user;
    }
}
