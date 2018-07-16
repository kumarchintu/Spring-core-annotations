package org.inetsolv.SprinfCoreAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext container=new AnnotationConfigApplicationContext(Person.class);
    	Person person = container.getBean("person",Person.class);
    	System.out.println(person.getPid());
    	((AbstractApplicationContext)container).close();
    }
}