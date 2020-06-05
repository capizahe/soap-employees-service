package com.parameta.webservices.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
@EnableWs
public class ServiceConfig extends WsConfigurerAdapter{
	
	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServletBean(ApplicationContext context){
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(context);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<MessageDispatcherServlet>(servlet,"/webservice/*");
	}
	
	@Bean
	public XsdSchema employeeSchema() {
		return new SimpleXsdSchema(new ClassPathResource("employee.xsd"));
	}
	
	@Bean(name = "employees")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema schema) {
		DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
		definition.setSchema(schema);
		definition.setLocationUri("/webservice");
		definition.setPortTypeName("EmployeeService");
		definition.setTargetNamespace("http://www.parameta.com/webservices/employe");
		return definition;
		
	}	
	
}
