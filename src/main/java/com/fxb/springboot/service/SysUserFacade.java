package com.fxb.springboot.service;


import com.fxb.springboot.entity.SysUserEntity;

/**
 * @author fengxianbin
 * @description: 用户接口
 * @create 2020-12-22 9:44
 */
public interface SysUserFacade {

    /**
     *  获取用户
     *  @param id
     * @return
     */
    SysUserEntity getSysUserEntity(String id);

    /**
     * 调用接口
     */
    void say();

    /**
     *
     * @param user
     */
    void save(SysUserEntity user);
}
