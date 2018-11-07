package com.caps.dev.java.autowiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx = 
        		new AnnotationConfigApplicationContext(AppConfig.class);
        Person p = ctx.getBean(Person.class,"person");
        String[] beans = ctx.getBeanDefinitionNames();
        for(String bean:beans) {
        	System.out.println(bean);
        }
        System.out.println("No.of Beans:"+ctx.getBeanDefinitionCount());
        ctx.close();
    
       /* System.out.println(p.getName());
        p.getJob().job();*/
    }
}