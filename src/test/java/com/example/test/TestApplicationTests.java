package com.example.test;

import com.example.test.bean.UserBean;
import com.example.test.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.annotation.security.RunAs;

@RunWith(SpringRunner.class)
@SpringBootTest

public class TestApplicationTests {

    @Resource
    UserService userService;

    @Test
    public void contextLoads() {
        UserBean userBean=userService.loginIn("李四","lisi");
        System.out.println("该用户ID为：");
        System.out.println(userBean.getId());
    }

}
