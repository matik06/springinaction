/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springidol;

import java.util.Collection;

/**
 *
 * @author Mateusz Lubański <m.lubanskii@gmail.com>
 */
public class OneManBand implements Performer {

    private Collection<Instrument> instruments;
    
    public OneManBand() {
    }

    public void perform() throws PerformanceException {
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }
    
    
}
