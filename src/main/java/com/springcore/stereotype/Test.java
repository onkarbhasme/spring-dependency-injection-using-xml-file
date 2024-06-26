package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.standalone.collection.Person;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/stereotype/stereotypeconfig.xml");
		Student s1 = context.getBean("student", Student.class);
		System.out.println(s1);
		System.out.println(s1.hashCode());
		Student s2 = context.getBean("student", Student.class);
		System.out.println(s2);
		System.out.println(s2.hashCode());
		System.out.println("_____________________________________________");
		Teacher t1 = context.getBean("t", Teacher.class);
		System.out.println(t1.hashCode());
		Teacher t2 = context.getBean("t", Teacher.class);
		System.out.println(t2.hashCode());

	}

}
