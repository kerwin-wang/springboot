package com.kerwin.springboot;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Properties;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

/**
 * @ClassName: PropertiesLoadTest
 * @Description:
 * @version: v1.0.0
 * @Author: d.wang
 * @Date: 2018-12-18 10:43
 */
public class PropertiesLoadTest
{

    @Test
    public void loadProperties1() throws IOException
    {
        /** 注：FileInputStream 加载文件时，需使用文件的全路径 */
        InputStream in = new BufferedInputStream(new FileInputStream("E:/workBussiness/code/code_learning/springboot/src/test/resources/prop/test.properties"));

        Properties properties = new Properties();

        properties.load(in);

        System.out.println(properties);
    }

    /** 注：ResourceBundle.getBundle 加载配置时，不能写后缀,且路径为项目相对路径即可 */
    @Test
    public void loadProperties2(){
        ResourceBundle rb = ResourceBundle.getBundle("prop/test", Locale.getDefault());

        String my_name = rb.getString("my_name");

        String my_password = rb.getString("my_password");
        System.out.println("name: "+my_name+"; password: "+my_password);
    }

    /** 注：PropertyResourceBundle 与 Properties 用法差不多，主要是在获取参数的区别 */
    @Test
    public void loadProperties3() throws IOException
    {
        InputStream in = new BufferedInputStream(new FileInputStream("E:/workBussiness/code/code_learning/springboot/src/test/resources/prop/test.properties"));
        PropertyResourceBundle rb = new PropertyResourceBundle(in);

        String my_name = rb.getString("my_name");
        String my_password = rb.getString("my_password");

        System.out.println("name: "+my_name+"; password: "+my_password);
    }

    /** 注：getResourceAsStream 须是本类的类文件去调用，路径为项目的相对或绝对路径 */
    @Test
    public void loadProperties4() throws IOException
    {
        InputStream in = PropertiesLoadTest.class.getResourceAsStream("/prop/test.properties");

        if (in != null){
            Properties pr = new Properties();

            pr.load(in);

            System.out.println(pr);
        }
    }

    /** 注：使用ClassLoader.getSystemResourceAsStream() 路径为项目内部的相对路径 */
    @Test
    public void loadProperties5() throws IOException
    {
        InputStream in = ClassLoader.getSystemResourceAsStream("prop/test.properties");
        Properties pr = new Properties();

        pr.load(in);

        System.out.println(pr);
    }

    /** 注：此方式只使用于servlet中，context为servlet容器 */
    public void loadProperties6(){
//        ServletContext context
//        InputStream in = context.getResourceAsStream("prop/test.properties");
//        Properties p = new Properties();
//        p.load(in);
    }
}
