//package com.prud.zm.parser;
//
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.env.Environment;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//
//@Configuration 
//@ComponentScan(basePackages = "com.prud.zm.persist")
//@EnableJpaRepositories("com.prud.zm.persist")
//@PropertySource(value = { "classpath:application.properties" })
//public class ApplicationConfig {
//	
//    @Autowired
//    private Environment env;
//
//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(env.getRequiredProperty("spring.datasource.driverClassName"));
//        dataSource.setUrl(env.getRequiredProperty("spring.datasource.url"));
//        dataSource.setUsername(env.getRequiredProperty("spring.datasource.username"));
//        dataSource.setPassword(env.getRequiredProperty("spring.datasource.password"));
//        return dataSource;
//    }
//    
//    @Bean
//    public EntityManagerFactory entityManagerFactory() {
//        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//        vendorAdapter.setGenerateDdl(true);
//        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
//        factory.setJpaVendorAdapter(vendorAdapter);
//        factory.setPackagesToScan("com.prud.zm.persist");
//        factory.setDataSource(dataSource());
//        factory.afterPropertiesSet();
//        return factory.getObject();
//    }
//}
