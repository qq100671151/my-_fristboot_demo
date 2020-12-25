package com.fxb.springboot.configuration;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author fengxianbin
 * @description: hibernate配置类
 * @create 2020-12-25 9:11
 */
@Configuration
public class HibernateConfiguration {

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource dataSource(){
        return  new DruidDataSource();
    }

    @Bean
    public LocalSessionFactoryBean sessionFactoryBean(DataSource dataSource){
        LocalSessionFactoryBean lb=new LocalSessionFactoryBean();
        lb.setDataSource(dataSource);
        lb.setPackagesToScan("com.fxb.springboot");
        Properties hibernateProperties =new Properties();
        hibernateProperties.put("hibernate.dialect","org.hibernate.dialect.MySQL5InnoDBDialect");
        hibernateProperties.put("current_session_context_class","thread");
        hibernateProperties.put("javax.persistence.validation.mode","none");
        hibernateProperties.put("hibernate.show_sql","true");
        hibernateProperties.put("hibernate.format_sql","true");
        hibernateProperties.put("hibernate.hbm2ddl.auto","update");
        hibernateProperties.put("hibernate.cache.use_query_cache","false");
        hibernateProperties.put("hibernate.cache.use_second_level_cache","false");
        lb.setHibernateProperties(hibernateProperties);
        return lb;
    }
}
