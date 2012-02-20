/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springidol.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 *
 * @author Mateusz Lubański <m.lubanskii@gmail.com>
 */
@Aspect
public class ContestantIntroducer {
    
    //zmienna statyczna określa obiekt który chcemy rozszerzyć o nową funkcjonalność
    //niestety nie można zastowować tej funkcjonalności do beanów wewanątrz springowego kontenera (trzeba użyś xmlowych taków)
    @DeclareParents(
            value="springidol.Performer+",
            defaultImpl=GraciousContestant.class)
    public static Contestant contestant;
}
