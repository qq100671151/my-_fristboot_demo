package com.fxb.springboot.service;

import com.fxb.springboot.dao.SysUserDao;
import com.fxb.springboot.entity.SysUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fengxianbin
 * @description: 用户实现
 * @create 2020-12-22 9:44
 */
@Service
public class SysUserFacadeImpl implements  SysUserFacade{

    @Autowired
    private SysUserDao sysUserDao;


    @Override
    public SysUserEntity getSysUserEntity(String id) {
        return sysUserDao.getSysUserEntity(id);
    }

    @Override
    public void say() {
        System.out.println("1234567");
    }

    @Override
    public void save(SysUserEntity user) {
        sysUserDao.save(user);
    }

}
