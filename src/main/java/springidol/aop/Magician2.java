/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springidol.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 *
 * @author Mateusz Lubański <m.lubanskii@gmail.com>
 */
@Aspect
public class Magician2 implements MindReader {
    
    private String thoughts;
    
    @Pointcut("execution(* springidol.aop.Thinker.thinkOfSomething(java.lang.String)) and args(thoughts)")
    public void thinking(String thoughts) {
        
    }

    @Override
    public String getThoughts() {
        return this.thoughts;
    }

    @Override
    //nie działa a powinno...
//    @Before(value="thinking(thoughts)")
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer's thoughts");
        this.thoughts = thoughts;
    }
    
}
