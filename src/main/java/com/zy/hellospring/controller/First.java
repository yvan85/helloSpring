package com.zy.hellospring.controller;/*
*文件名: First
*创建者: zhengyi
*创建时间:2020/4/11 12:52
*描述: TODO
*/
import com.zy.hellospring.bean.EE.HouseimportBean;

import com.zy.hellospring.bean.APIRes;
import com.zy.hellospring.bean.CC;
import com.zy.hellospring.bean.EE;
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

        EE ee = new EE();
        ee.setUnitId(0);
        ee.setProductId(0);
        ee.setAddPeopleUnitId(0);
        ee.setAddPeopleProductId(0);
        ee.setCleanUnitId(0);
        ee.setCleanProductId(0);
        ee.setALLUnitId(0);
        ee.setALLProductId(0);
        ee.setHotelId(0);
        ee.setLandlordTel("");
        ee.setUserId(0);
        ee.setUserTel(0L);
        ee.setApikey("");
        HouseimportBean houseimportBean = new HouseimportBean();
        houseimportBean.setComment("");
        houseimportBean.setPartner_hotel_id("");
        houseimportBean.setHotelId(0);
        houseimportBean.setPartner_unit_id("");
        houseimportBean.setUnitId(0);
        houseimportBean.setPartner_product_id("");
        houseimportBean.setProductId(0);



        ee.setHouseimport(houseimportBean);



        return apiRes;
    }

//    public static void main(String[] args) {
//        System.out.println( first());
//    }   public static void main(String[] args) {
//        System.out.println( first());
//    }
}
