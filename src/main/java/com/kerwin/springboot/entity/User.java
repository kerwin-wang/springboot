package com.kerwin.springboot.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: User
 * @Description:
 * @version: v1.0.0
 * @Author: d.wang
 * @Date: 2018-12-10 15:19
 */
@JsonIgnoreProperties({"password"})
public class User implements Serializable
{

    private static final long serialVersionUID = 8620637297453154414L;

    private String name;

    private String password;

    private int age;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss a",locale = "zh",timezone = "GMT+8")
    private Date birthday;

    private int sex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String dec;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Date getBirthday()
    {
        return birthday;
    }

    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }

    public int getSex()
    {
        return sex;
    }

    public void setSex(int sex)
    {
        this.sex = sex;
    }

    public String getDec()
    {
        return dec;
    }

    public void setDec(String dec)
    {
        this.dec = dec;
    }
}
