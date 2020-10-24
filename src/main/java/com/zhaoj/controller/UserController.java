package com.zhaoj.controller;

import com.zhaoj.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * 作者:zhaoj
 * 创建时间:2020/10/21    20:09
 * 类的作用:
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    RestTemplate restTemplate;

    @RequestMapping("users")
    public List queryUsers(){
        System.out.println("客户端1开始请求咯！！！！！");
        //输入要去的地址
        String url = "http://localhost:8763/user/queryAllUser";
        //第二个参数为返回的东西
        List forObject = restTemplate.getForObject(url, List.class);
        User user = new User("1","小黑",10);
        forObject.add(user);
        return forObject;
    }

    @RequestMapping("queryOne")
    public String queryOne(){
        return "调用了客户端1:发送了请求;";
    }

    @RequestMapping("queryUser")
    public String queryUser(@RequestBody User user){
        return "客户端1接收到了学生为："+user;
    }

}
