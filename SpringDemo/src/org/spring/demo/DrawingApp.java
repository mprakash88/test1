package org.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		//BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("resource\\spring.xml"));
		//Triangle triangle = (Triangle) beanFactory.getBean("triangle");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle)context.getBean("triangle");
		
		triangle.draw();
	}

}
