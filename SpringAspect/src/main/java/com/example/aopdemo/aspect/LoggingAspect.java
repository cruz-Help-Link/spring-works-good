package com.example.aopdemo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.aopdemo.service.GreetingService.sayHello(..))")
    public void logBefore() {
        System.out.println("Executing sayHello()...");
    }

    @After("execution(* com.example.aopdemo.service.GreetingService.sayHello(..))")
    public void logAfter() {
        System.out.println("sayHello() execution completed.");
    }
}
