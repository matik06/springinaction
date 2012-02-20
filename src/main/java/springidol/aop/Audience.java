/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springidol.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 *
 * @author Mateusz Lubański <m.lubanskii@gmail.com>
 */
public class Audience {
    
    //before performance
    
    public void takeSeats() {
        System.out.println("The audience is taking their seats.");
    }
    
    public void turnOffCellPhones() {
        System.out.println("The audience is turning off their cellphones");
    }
    
    //after performance
    
    public void applaud() {
        System.out.println("CLAP CLAP CLAP");
    }
    
    //after bad performance
    
    public void demandRefund() {
        System.out.println("Boo! We want our money back");
    }
    
    public void watchPerformance(ProceedingJoinPoint joinpoint) {
        try {
            System.out.println("The audience is taking their seats");
            System.out.println("The audience is turning off their cellphones");
            long start = System.currentTimeMillis();
            
            joinpoint.proceed();
            
            long end = System.currentTimeMillis();
            System.out.println("CLAP CLAP CLAP");
            System.out.println("The performance took " + (end - start) + " miliseconds.");
        } catch (Throwable t) {
            System.out.println("Boo! We want our money back");
        }
    }
}
