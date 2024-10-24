package com.example.aopdemo;

import com.example.aopdemo.service.GiftingService;
import com.example.aopdemo.service.GreetingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        GreetingService greetingService = (GreetingService) context.getBean("greetingService");
        System.out.println("GREETING BELOW ");
        System.out.println(greetingService.sayHello("Eniola"));
        
        GiftingService gift = (GiftingService) context.getBean("gift");
        
        System.out.println("FROM PRINT ASPECT FOR GIFT SERVICE");   //1
        System.out.println(gift.pullList());  //3
         
    }
}