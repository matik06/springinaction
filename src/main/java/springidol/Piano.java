/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springidol;

import org.springframework.beans.factory.annotation.Qualifier;
import springidol.annotations.StringedInstrument;

/**
 *
 * @author Mateusz Lubański <m.lubanskii@gmail.com>
 */
@Qualifier(value="klawiszowy")
@StringedInstrument
public class Piano implements Instrument {

    public Piano() {
    }

    public void play() {
        System.out.println("PLINK PLINK PLINK");
    }
    
}
