package com.kerwin.springboot.util;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: GeneratorDisplay
 * @Description:
 * @version: v1.0.0
 * @Author: d.wang
 * @Date: 2018-12-11 11:20
 */
public class GeneratorDisplay
{
    public void generator() throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException
    {
        List<String> warnings = new ArrayList<>();
        boolean overwrite = true;
        //指定逆向工程配置文件
        File configFile = new File("E:\\workBussiness\\code\\code_learning\\springboot\\src\\main\\resources\\generator\\generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,callback,warnings);
        myBatisGenerator.generate(null);
    }

    public static void main(String[] args)
    {
        try
        {
            GeneratorDisplay generatorDisplay = new GeneratorDisplay();
            generatorDisplay.generator();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
