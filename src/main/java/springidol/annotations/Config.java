/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springidol.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springidol.Performer;
import springidol.Poem;
import springidol.PoeticJuggler;
import springidol.Sonet29;


/**
 * klasa ładowana automatycznie do springowego kontenera (tak samo jak @Controller..)
 * @author Mateusz Lubański <m.lubanskii@gmail.com>
 */
@Configuration
public class Config {

    /**
     * Odpowiada konfiguracji:
     * 
     *  <bean id="duuke" class="springidol.Juggler">
     *      <constructor-arg value="55"/>
     *  </bean>
     * 
     * @return 
     */
    @Bean
    public Performer duuke() {
        return new Juggler(55);
    }
    
    @Bean
    public Poem sonnet29() {
        return new Sonet29();
    }
    
    @Bean
    public Performer poeticDuke() {
        return (Performer) new PoeticJuggler(sonnet29());
    }
    
    
}
