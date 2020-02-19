package com.demo.spring;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo2 {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Demospring.xml");
		Passenger passenger=(Passenger) ctx.getBean("v");
		passenger.travel();
	}

}
