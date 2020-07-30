package com.leyou.page.web;

import com.leyou.page.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String toHello(Model model){
        User user=new User();
        user.setAge(21);
        user.setName("Jack Chen");
        User user2 = new User("李小龙", 30, null);
        model.addAttribute("users", Arrays.asList(user,user2));
        //普通字符串被当成试图名称，结合前缀和后缀寻找视图
        return "hello";
    }
}
