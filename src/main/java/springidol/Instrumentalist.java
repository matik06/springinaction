/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springidol;

/**
 *
 * @author Mateusz Lubański <m.lubanskii@gmail.com>
 */
public class Instrumentalist implements Performer {
    
    private Instrument instrument;
    private String song;
    private double age;

    public Instrumentalist() {
    }

    public void perform() throws PerformanceException {
        System.out.println("Playing " + song + " : ");
        instrument.play();
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }
    
    public String screamSong() {
        return song;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Instrumentalist{" + "instrument=" + instrument + ", song=" + song + ", age=" + age + '}';
    }
}

