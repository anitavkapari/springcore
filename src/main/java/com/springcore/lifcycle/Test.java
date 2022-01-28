package com.springcore.lifcycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifcycle/configSamosa.xml");
        context.registerShutdownHook();
		Samosa samosa = (Samosa) context.getBean("samosa");
        System.out.println( samosa );
       
        System.out.println( "+++++++++++++++++++++++++++" );

        Pepsi pepsi = (Pepsi) context.getBean("pepsi");
        System.out.println( pepsi );
	}

}
