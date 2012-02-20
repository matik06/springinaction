/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springidol.annotations;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.springframework.beans.factory.annotation.Qualifier;


/**
 * Własna adnotacja
 *
 * @author Mateusz Lubański <m.lubanskii@gmail.com>
 */
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface  StringedInstrument {
    
}
