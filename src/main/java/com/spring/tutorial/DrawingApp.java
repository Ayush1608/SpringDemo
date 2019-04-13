package com.spring.tutorial;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class DrawingApp 
{
	public static void main(String args[])
	{
//		Resource resource = new ClassPathResource("spring.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
		
//		AbstractApplicationContext factory = new ClassPathXmlApplicationContext("spring2.xml");
//		factory.registerShutdownHook();
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring2.xml");
		
		Shape shape = (Shape) factory.getBean("circle");
		shape.draw();
	}
}
