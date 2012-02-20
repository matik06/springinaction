/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springidol.aop;

/**
 *
 * @author Mateusz Lubański <m.lubanskii@gmail.com>
 */
public class GraciousContestant implements Contestant {

    @Override
    public void receiveAward() {
        System.out.println("receiving award 1000zł!");
    }
    
}
