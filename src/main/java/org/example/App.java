package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{

       public static void main( String[] args )    {

           //ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
           AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

           AutoFactory autoFactory = context.getBean("autoFactory", AutoFactory.class);
           autoFactory.setProductionSize(15);
           autoFactory.run();

           System.out.println("Num cars:" + autoFactory.getNumCars());

    }


}
