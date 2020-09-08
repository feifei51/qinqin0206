package com.qf.serviceTest;

import com.qf.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailTest {

    @Resource
    private IUserService userService;

    @Test
    public void test1(){

        System.out.println(userService.sendMail("874262808@qq.com"));
    }
}