/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springidol;

import java.util.Collection;
import java.util.Map;

/**
 *
 * @author Mateusz Lubański <m.lubanskii@gmail.com>
 */
public class OneManBand2 implements Performer {

    private Map<String, Instrument> instruments;
    
    public OneManBand2() {
    }

    public void perform() throws PerformanceException {
        for(String key : instruments.keySet()) {
            System.out.println(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }
}
