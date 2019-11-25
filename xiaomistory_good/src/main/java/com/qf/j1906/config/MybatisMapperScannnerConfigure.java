package com.qf.j1906.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import java.util.Properties;

/**
 * Created by Lmy on 2019/11/20.
 */
@Configuration
public class MybatisMapperScannnerConfigure {

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");//设置会话工厂
        mapperScannerConfigurer.setBasePackage("com.qf.j1906.mapper");//设置扫描的接口
        Properties properties = new Properties();
        properties.setProperty("notEmpty","false"); //默认时，是否为空
        properties.setProperty("IDENTITY","MYSQL");//主键策略遵循的数据库标准
        properties.setProperty("mappers","com.qf.j1906.config.BaseMapper");//设置通用父mapper
        mapperScannerConfigurer.setProperties(properties);
        return mapperScannerConfigurer;
    }

    @Bean
     public PageHelper pageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum","true");
        properties.setProperty("rowBoundsWithCount","true");
        properties.setProperty("reasonable","true");
        pageHelper.setProperties(properties);
        return pageHelper;

    }

}
