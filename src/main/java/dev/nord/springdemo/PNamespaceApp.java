package dev.nord.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dev.nord.springdemo.domain.Organization;

public class PNamespaceApp {

	public static void main(String[] args) {
		// create the app context
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
        
        // create the bean
        Organization org = (Organization) ctx.getBean("myorg");

        // print organization details
        System.out.println(org);

        // close app context
        ((ClassPathXmlApplicationContext) ctx).close();


	}

}
