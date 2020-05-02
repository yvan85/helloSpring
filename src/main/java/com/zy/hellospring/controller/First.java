package com.zy.hellospring.controller;/*
*文件名: First
*创建者: zhengyi
*创建时间:2020/4/11 12:52
*描述: TODO
*/

import com.zy.hellospring.bean.APIRes;
import com.zy.hellospring.bean.CC;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class First {


/***
 *
 *
 */

    @RequestMapping(value = "/aa")
    public  APIRes first() {

//        APIRes apiRes=new APIRes();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/spring-bean.xml"});
        context.start();

        APIRes apiRes = (APIRes) context.getBean("apiRes");
        CC cc = (CC) context.getBean("cc");


        apiRes.setAa("aa");
        apiRes.setBb("bb");
        cc.setCc1("c1111");
        cc.setCc2("c2222");
        apiRes.setCc(cc);

        return apiRes;
    }

//    public static void main(String[] args) {
//        System.out.println( first());
//    }   public static void main(String[] args) {
//        System.out.println( first());
//    }
}
