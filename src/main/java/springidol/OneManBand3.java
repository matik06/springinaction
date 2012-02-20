/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springidol;

import java.util.Enumeration;
import java.util.Properties;


/**
 *
 * @author Mateusz Lubański <m.lubanskii@gmail.com>
 */
public class OneManBand3 implements Performer {

    private Properties instruments;
    
    public OneManBand3() {
    }

    public void perform() throws PerformanceException {
        System.out.println("properties: " + instruments);
    }

    public void setInstruments(Properties instruments) {
        this.instruments = instruments;
    }
}
