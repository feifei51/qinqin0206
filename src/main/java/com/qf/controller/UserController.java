package com.qf.controller;

import com.qf.service.IUserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/sendMail")
    public Integer sendMail(@RequestParam("mail") String mail){
        return userService.sendMail(mail);
    }
    



}
