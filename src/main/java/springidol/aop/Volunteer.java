/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springidol.aop;

/**
 *
 * @author Mateusz Lubański <m.lubanskii@gmail.com>
 */
public class Volunteer implements Thinker {

    private String thoughts;
    
    @Override
    public void thinkOfSomething(String thoughts) {
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}
