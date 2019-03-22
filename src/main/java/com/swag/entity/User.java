package com.swag.entity;

import java.util.Date;

/**
 * @author ${name}
 * @ClassName ${ClassName}
 * @Description ${description}
 */
public class User {
    private Integer id;
    private String uname;
    private Integer age;
    private Date ctm;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCtm() {
        return ctm;
    }

    public void setCtm(Date ctm) {
        this.ctm = ctm;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", age=" + age +
                ", ctm=" + ctm +
                '}';
    }
}
