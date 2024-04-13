package com.Spring.Ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Amazon {

	public static void main(String[] args) {
		
				ApplicationContext alp =new ClassPathXmlApplicationContext("beans.xml");
	}

}
