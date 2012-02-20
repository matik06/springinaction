/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springidol.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 *
 * @author Mateusz Lubański <m.lubanskii@gmail.com>
 */
@Aspect
public class AudienceAnnotation {

    //define pointcut
    //nazwa pointcut pochodzi od nazwy metody na której wywołana jest adnotacja (performance)
    //ciało metody performance powinno być puste (służy tylko do tego aby przyczepić gdzieś adnotacji)
    @Pointcut("execution(* springidol.Performer.perform(..))")
    public void performance() {
        
    }
    
//    @Before("performance()")
    public void takeSeats() {
        System.out.println("The audience is taking their seats.");
    }
    
//    @Before("performance()")
    public void turnOffCellPhones() {
        System.out.println("The audience is turning off their cellphones");
    }

//    @AfterReturning("performance()")
    public void applaud() {
        System.out.println("CLAP CLAP CLAP");
    }


//    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Boo! We want our money back");
    }
    
    @Around("performance()")
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
