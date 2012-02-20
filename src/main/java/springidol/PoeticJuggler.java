/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springidol;

/**
 *
 * @author Mateusz Lubański <m.lubanskii@gmail.com>
 */
public class PoeticJuggler extends Juggler {
    private Poem poem;
    
    public PoeticJuggler(Poem poem) {
        super();
        this.poem = poem;
    }

    public PoeticJuggler(Poem poem, int beanBags) {
        super(beanBags);
        this.poem = poem;
    }
    
    public void perform() throws PerformanceException {
        super.perform();
        System.out.println("While reciting...");
        poem.recite();
    }
}
