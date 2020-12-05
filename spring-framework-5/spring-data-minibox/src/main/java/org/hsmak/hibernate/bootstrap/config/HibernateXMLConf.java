package org.hsmak.hibernate.bootstrap.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ImportResource({"classpath:bootstrap/hibernate5Configuration.xml"})
public class HibernateXMLConf {

}