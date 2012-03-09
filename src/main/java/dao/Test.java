/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Mateusz Lubański <m.lubanskii@gmail.com>
 */
public interface Test<T> {
    T getById();
    void saveOrUpdate(T t);
    void delete(T t);
}
