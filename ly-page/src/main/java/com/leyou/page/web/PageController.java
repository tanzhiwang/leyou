package com.leyou.page.web;

import com.leyou.page.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class PageController {
    @Autowired
    private PageService pageService;

    @GetMapping("item/{id}.html")
    public String toItemPage(@PathVariable("id")Long spuId, Model model){
        //查询模型数据
        Map<String,Object> attributes=pageService.loadModel(spuId);
        //准备模型数据
        model.addAllAttributes(attributes);//这里调错了方法，addAttribute方法中接收Map对象解析会报错
        //返回视图
        return "item";
    }
}
