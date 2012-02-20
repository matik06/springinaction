/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springidol.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import springidol.*;


/**
 *
 * @author Mateusz Lubański <m.lubanskii@gmail.com>
 */
public class Instrumentalist implements Performer {
    
    //adnotacja może być również użyta przy setterze
    //jeśli parametr required jest ustawiony na false to nie dostajemy wyjątku w przypadku braku obiektu o danym typie
    //a do pola zostaje przypisana wartośc null
    //W przypadku użycia @Autowired dla konstruktorów tylko jeden może być ustawiony na @Autowired(required=true) pozostałe muszą być ustawione na @Autowired(required=false)
    
    //jeśli mamy więcej niż jeden pasujący bean to używamy @Qualifier zawężąjący wynik do beanów o podanym id
    //lub do obiektu który ma ustawioną adnotację @Qualifier o takiej samej wartości
    
    //dodatkową możliwością jest stworzenie własnej adnotacji @Qualifier np. @StringedInstrument
    //i oznaczenie ją konkretnej klasy
    @Autowired(required=false)
//    @Qualifier(value="klawiszowy")
    @StringedInstrument
    
    private Instrument instrument;
    
    //do ustawiania autowire dla typów prostych używamy @Value, jako atrybut możemy podać wyrażenie SpEL
    @Value(value="#{settings.songName}")
    private String song;
    private double age;

    public Instrumentalist() {
    }
    
//    //autowire constructor parameter
//    @Autowired
//    public Instrumentalist(Instrument instrument) {
//        this.instrument = instrument;
//    }

    @Override
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

