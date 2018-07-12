package com.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
public class HibernateConfiguration {
    @Value("org.postgresql.Driver")
    private String DRIVER;
    @Value("208923c6a2d611e8b2239c734f1383c3709d8596ab834db2f42b6d3f89f4f97a")
    private String PASSWORD;
    @Value("jdbc:postgresql://ec2-54-227-240-7.compute-1.amazonaws.com:5432/d8ql01thqpd300?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory&foo=true")
    private String URL;
    @Value("sdigxsaxrhqedf")
    private String USERNAME;
    @Value("org.hibernate.dialect.PostgreSQLDialect")
    private String DIALECT;
    @Value("true")
    private String SHOW_SQL;
    @Value("com")
    private String PACKAGES_TO_SCAN;

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(DRIVER);
        dataSource.setUrl(URL);
        dataSource.setUsername(USERNAME);
        dataSource.setPassword(PASSWORD);
        return dataSource;
    }
    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan(PACKAGES_TO_SCAN);
        Properties hibernateProperties = new Properties();
        hibernateProperties.put("hibernate.dialect", DIALECT);
        hibernateProperties.put("hibernate.show_sql", SHOW_SQL);
        sessionFactory.setHibernateProperties(hibernateProperties);

        return sessionFactory;
    }
    @Bean
    public HibernateTransactionManager transactionManager() {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactory().getObject());
        return transactionManager;
    }
}
