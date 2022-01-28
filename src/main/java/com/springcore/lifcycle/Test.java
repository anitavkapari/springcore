package com.springcore.lifcycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifcycle/configSamosa.xml");
		Samosa samosa = (Samosa) context.getBean("samosa");
        System.out.println( samosa );
        context.registerShutdownHook();
	}

}
