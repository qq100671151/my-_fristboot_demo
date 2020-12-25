package com.fxb.springboot.dao;

import com.fxb.springboot.entity.SysUserEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * @author fengxianbin
 * @description: 用户dao层
 * @create 2020-12-22 9:42
 */
@Repository
public class SysUserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private DataSource dataSource;

    public SysUserEntity getSysUserEntity(String id) {
        System.out.println(dataSource);
        return sessionFactory.getCurrentSession().get(SysUserEntity.class,id);
        //return new SysUserEntity("1","胡小兰","女",14);
    }

    public void save(SysUserEntity user) {
        sessionFactory.getCurrentSession().save(user);
    }
}
