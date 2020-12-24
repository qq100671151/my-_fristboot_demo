package com.fxb.springboot.dao;

import com.fxb.springboot.entity.SysUserEntity;
import org.springframework.stereotype.Repository;

/**
 * @author fengxianbin
 * @description: 用户dao层
 * @create 2020-12-22 9:42
 */
@Repository
public class SysUserDao {

    public SysUserEntity getSysUserEntity(String id) {
        return new SysUserEntity("1","胡小兰","女",14);
    }

    public void save(SysUserEntity user) {
    }
}
