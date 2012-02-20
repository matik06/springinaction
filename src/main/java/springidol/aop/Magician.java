/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springidol.aop;

/**
 *
 * @author Mateusz Lubański <m.lubanskii@gmail.com>
 */
public class Magician implements MindReader {
    
    private String thoughts;

    @Override
    public String getThoughts() {
        return this.thoughts;
    }

    @Override
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer's thoughts");
        this.thoughts = thoughts;
    }
    
}
