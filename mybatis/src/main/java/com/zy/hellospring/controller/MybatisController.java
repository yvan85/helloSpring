package com.zy.hellospring.controller;/*
*文件名: MybatisController
*创建者: zhengyi
*创建时间:2020/4/13 23:33
*描述: TODO
*/

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MybatisController {


    @GetMapping("students")
    public Object students(){

        return null;
    }

}
