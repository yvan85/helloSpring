package com.zy.hellospring.bean;/*
*文件名: ConfigInfoController
*创建者: zhengyi
*创建时间:2020/4/11 14:52
*描述: TODO
*/

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Data
@ConfigurationProperties(prefix = "boot")
@Component //Spring 组件
public class ConfigInfo_Prefix {

    private String name;

    private String age;

}
