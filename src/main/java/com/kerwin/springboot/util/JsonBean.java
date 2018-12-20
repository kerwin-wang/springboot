package com.kerwin.springboot.util;

import java.io.Serializable;

/**
 * @ClassName: JsonBean
 * @Description:
 * @version: v1.0.0
 * @Author: d.wang
 * @Date: 2018-12-20 10:26
 */
public class JsonBean implements Serializable
{
    private static final long serialVersionUID = -2151874615013021520L;

    private boolean success;

    private String code;

    private Object object;

    public JsonBean()
    {
    }

    public JsonBean(boolean success, String code, Object object)
    {
        this.success = success;
        this.code = code;
        this.object = object;
    }

    public boolean isSuccess()
    {
        return success;
    }

    public void setSuccess(boolean success)
    {
        this.success = success;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public Object getObject()
    {
        return object;
    }

    public void setObject(Object object)
    {
        this.object = object;
    }
}
