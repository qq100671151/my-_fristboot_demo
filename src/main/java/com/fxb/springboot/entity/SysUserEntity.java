package com.fxb.springboot.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author fengxianbin
 * @description: 用户实体
 * @create 2020-12-21 16:35
 */
@Entity
@Table(name = "SYS_USER")
public class SysUserEntity {

    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @GeneratedValue(generator = "system-uuid")
    @Column(name="ID", length =64)
    private String id;

    @Column(name="NAME", length =256)
    private String name;

    @Column(name="SEX", length =64)
    private String sex;

    @Column(name="AGE")
    private Integer age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public SysUserEntity() {
    }

    public SysUserEntity(String id, String name, String sex, Integer age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "SysUserEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
