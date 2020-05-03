package com.zy.hellospring.controller;/*
*文件名: ConfigInfoController
*创建者: zhengyi
*创建时间:2020/4/11 14:52
*描述: TODO
*/

import com.zy.hellospring.bean.APIRes;
import com.zy.hellospring.bean.CC;
import com.zy.hellospring.bean.ConfigInfo_Prefix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConfigInfoController {

//    @Value("${boot.name}")
//    private String name;
//
//    @Value("${boot.age}")
//    private String age;

    @Autowired
    private ConfigInfo_Prefix configInfo_prefix;

//    @RequestMapping("/boot")
//    public @ResponseBody String configinfo() {
//
//        return name+"----"+age;
//    }


    

    @RequestMapping("/prefix")
    public @ResponseBody String configinfoPrefix() {
        return configInfo_prefix.getName()+"----"+configInfo_prefix.getAge();
    }

    @GetMapping("/jsp")
    public String jsp(Model model) {
        model.addAttribute("msg","spring message");
        return "index";
    }
}
