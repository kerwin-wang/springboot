package com.kerwin.springboot.entity;

import java.io.Serializable;

/**
 * @ClassName: Mail
 * @Description:
 * @version: v1.0.0
 * @Author: d.wang
 * @Date: 2018-12-20 9:39
 */
public class Mail implements Serializable
{
    private String mailName;

    private String title;

    private String content;

    public String getMailName()
    {
        return mailName;
    }

    public void setMailName(String mailName)
    {
        this.mailName = mailName;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    @Override
    public String toString()
    {
        final StringBuffer sb = new StringBuffer("Mail{");
        sb.append("mailName='").append(mailName).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", content='").append(content).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
