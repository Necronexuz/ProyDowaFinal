package com.dowa.springmvc.configuration;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by nexuz on 24/05/15.
 * NEXUZ NOTES:
 * TODO: Configure Hibernate to current session context Thread
 * @Configuration indicates that this class contains one or more bean methods annotated with @Bean producing beans
 * manageable by spring container. In our case, this class represent hibernate configuration.
 * @ComponentScan is equivalent to context:component-scan base-package="..." in xml, providing with where to look for
 * spring managed beans/classes.
 * @EnableTransactionManagement is equivalent to Spring’s tx:* XML namespace, enabling Spring’s annotation-driven
 * transaction management capability.
 * @PropertySource is used to declare a set of properties(defined in a properties file in application classpath) in
 * Spring run-time Environment, providing flexibility to have different values in different application environments.
 */

@Configuration
@EnableTransactionManagement
@ComponentScan({"com.dowa.springmvc.configuration"})
@PropertySource(value = {"classpath:application.properties"})
public class HibernateConfiguration {

    @Autowired
    private Environment enviroment;

    @Bean
    public LocalSessionFactoryBean sessionFactoryBean(){
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan(new String[] {"com.dowa.springmvc.model"});
        sessionFactory.setHibernateProperties(hibernateProperties());
        return sessionFactory;
    }

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(enviroment.getRequiredProperty("jdbc.driverClassName"));
        dataSource.setUrl(enviroment.getRequiredProperty("jdbc.url"));
        dataSource.setUsername(enviroment.getRequiredProperty("jdbc.username"));
        dataSource.setPassword(enviroment.getRequiredProperty("jdbc.password"));
        return dataSource;
    }

    private Properties hibernateProperties(){
        Properties properties = new Properties();
        properties.put("hibernate.dialect", enviroment.getRequiredProperty("hibernate.dialect"));
        properties.put("hibernate.show_sql", enviroment.getRequiredProperty("hibernate.show_sql"));
        properties.put("hibernate.format_sql", enviroment.getRequiredProperty("hibernate.format_sql"));
        return properties;
    }

    @Bean
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory s){
        HibernateTransactionManager txManager = new HibernateTransactionManager();
        txManager.setSessionFactory(s);
        return txManager;
    }



}
