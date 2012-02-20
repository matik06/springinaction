/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springidol;

/**
 *
 * @author Mateusz Lubański <m.lubanskii@gmail.com>
 */
public class Stage {
    private Stage() {
        
    }
    
    private static class StageSingletonHolder {
        static Stage instance = new Stage();
    }
    
    public static Stage getInstance() {
        return StageSingletonHolder.instance;
    }

    @Override
    public String toString() {
        return "Stage{" + '}';
    }        
}
