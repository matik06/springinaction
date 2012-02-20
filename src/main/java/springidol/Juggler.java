/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springidol;

/**
 *
 * @author Mateusz Lubański <m.lubanskii@gmail.com>
 */
public class Juggler implements Performer {
    
    private int beanBags = 3;

    public Juggler() {
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }
    
    

    public void perform() throws PerformanceException {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }
    
}
