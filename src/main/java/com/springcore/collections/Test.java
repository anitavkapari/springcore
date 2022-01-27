package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/configEmp.xml");
        Employee employee = (Employee) context.getBean("emp");
        System.out.println( employee.getEmpName() );
        System.out.println( employee.getAddresses() );
        System.out.println( employee.getPhone() );
        System.out.println( employee.getCourses() );

	}

}
