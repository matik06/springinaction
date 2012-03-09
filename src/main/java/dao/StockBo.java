/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Mateusz Lubański <m.lubanskii@gmail.com>
 */
public interface StockBo {

    void save(Stock stock);

    void update(Stock stock);

    void delete(Stock stock);

    Stock findByStockCode(String stockCode);
}
