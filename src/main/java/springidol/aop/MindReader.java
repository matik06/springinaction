/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springidol.aop;

/**
 *
 * @author Mateusz Lubański <m.lubanskii@gmail.com>
 */
public interface MindReader {

    void interceptThoughts(String thoughts);
    String getThoughts();
    
}
