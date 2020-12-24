package com.fxb.springboot.controller;

import com.fxb.springboot.entity.SysUserEntity;
import com.fxb.springboot.service.SysUserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author fengxianbin
 * @description: 测试springmvc
 * @create 2020-12-22 15:10
 */
@Controller
@RequestMapping("/helloWord")
public class HelloWordController {

    @Autowired
    private SysUserFacade sysUserFacade;

    @RequestMapping("/getTestDataMap/{id}")
    @ResponseBody
    public String getTestDataMap(@PathVariable("id") String id){
        System.out.println("进来了"+id);
        sysUserFacade.say();
        return "admin/you";
    }


    @RequestMapping("/getTestDataMap2/{age}")
    @ResponseBody
    public SysUserEntity getTestDataMap2(@PathVariable("age") String age){
        System.out.println("进来了"+age);
        SysUserEntity user = new SysUserEntity(null, "张小斐","女",Integer.valueOf(age) );
        sysUserFacade.save(user);
        return user;
    }

    @RequestMapping("/getSysUserEntity/{id}")
    @ResponseBody
    public SysUserEntity getSysUserEntity(@PathVariable("id") String id){
        SysUserEntity en=sysUserFacade.getSysUserEntity(id);
        System.out.println("进来了"+en.getAge());
        return en;
    }
}
