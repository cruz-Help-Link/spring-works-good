/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.aopdemo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 *
 * @author Donna
 */

@Aspect
@Component
public class PrintAspect {
    
    @Before("execution(* com.example.aopdemo.service.GiftingService.pullList())")
    public void beforeGift() {
        System.out.println("ASPECT 101....");   //2
    }
    
    
    @After("execution(* com.example.aopdemo.service.GiftingService.pullList())")
     public void afterGift() {
        System.out.println("ASPECT 101 COMPLETED....");   //4
    }
    
}
