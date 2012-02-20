package com.springinaction.desktop.springinaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springidol.Auditorium;
import springidol.PerformanceException;
import springidol.Performer;
import springidol.Stage;
import springidol.aop.Contestant;
import springidol.aop.MindReader;
import springidol.aop.Thinker;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws PerformanceException
    {
        System.out.println("--------------------------------------------------------");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
        Performer performer = (Performer)context.getBean("duke");
        performer.perform();
        
        performer = (Performer) context.getBean("poeticDuke");
        performer.perform();
        
        Stage stage = (Stage)context.getBean("theStage");
        System.out.println("stage");
        
        Auditorium auditorium = (Auditorium)context.getBean("auditorium");
        System.out.println(auditorium);
        auditorium = null;
        
        performer = (Performer)context.getBean("kenny");
        performer.perform();
        
        performer = (Performer)context.getBean("hank");
        System.out.println("hank: ");
        performer.perform();
        
        performer = (Performer) context.getBean("hank2");
        System.out.println("hank2: ");
        performer.perform();
        
        performer = (Performer) context.getBean("hank3");
        System.out.println("hank3: ");
        performer.perform();
        
        performer = (Performer) context.getBean("carl");
        System.out.println("carl: ");
        System.out.println(performer);
        
        System.out.println(context.getBean("chosenCity"));
        System.out.println(context.getBean("chosenCity2"));
        
        System.out.println(context.getBean("settings"));
        
        System.out.println(context.getBean("chosenCity3"));
        
        System.out.println("--------------------------------------------------------");
        
        ApplicationContext context2 = new ClassPathXmlApplicationContext("spring/spring_annotations.xml");
        System.out.println(context2.getBean("kenny"));
        System.out.println(context2.getBean("settings"));
        
        ((Performer)context2.getBean("duke")).perform();
        ((Performer)context2.getBean("duuke")).perform();
        
        System.out.println("--------------------------------------------------------");
        
        ApplicationContext context3 = new ClassPathXmlApplicationContext("spring/aop.xml");
        performer = (Performer)context3.getBean("duke");
        performer.perform();
        
        Thinker volunteer = (Thinker)context3.getBean("volunteer");
        MindReader magician = (MindReader)context3.getBean("magician");
        
        volunteer.thinkOfSomething("Jakieś tam myśli :)");
        System.out.println(magician.getThoughts());
        
        ((Contestant)performer).receiveAward();
    }
}
