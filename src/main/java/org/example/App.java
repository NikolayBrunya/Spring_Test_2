package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{

       public static void main( String[] args )    {

           ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");


           AutoFactory autoFactory = ctx.getBean("autoFactory", AutoFactory.class);
           autoFactory.run();
           autoFactory.run();


// test

           System.out.println("Num cars:" + autoFactory.getNumCars());

    }


}
