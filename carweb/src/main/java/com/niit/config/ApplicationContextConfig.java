package com.niit.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages="com.niit")
@EnableTransactionManagement
public class ApplicationContextConfig 
{
	@Bean("dataSource")
	public DataSource getH2DataSource()
	{
		System.out.println("I am in datasource");
		BasicDataSource datasource= new BasicDataSource();
		datasource.setDriverClassName("org.h2.Driver");
		datasource.setUrl("jdbc:h2:tcp://localhost/~/shopdb");
		datasource.setUsername("sa");
		datasource.setPassword("sa");
		return datasource;
	}
	@Autowired
	@Bean
	public LocalSessionFactoryBean getSessionFactory(DataSource dataSource)
	{
		System.out.println("I am in local session factory");
		LocalSessionFactoryBean sessionFactory= new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		sessionFactory.setHibernateProperties(getHibernateProperties());
		sessionFactory.setPackagesToScan(new String[] {"com.niit.model"});
		return sessionFactory;
	}
	public Properties getHibernateProperties()
	{
		System.out.println("I am in hibernate properties");
		Properties properties=new Properties();
		properties.setProperty("hibernate.dialect","org.hibernate.dialect.H2Dialect");
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		
		return properties;
	}
	@Autowired
	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		System.out.println("I am in transaction manager");
		HibernateTransactionManager transactionManager=new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory);
		return transactionManager;
	}
}
