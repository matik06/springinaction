/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;

/**
 *
 * @author Mateusz Lubański <m.lubanskii@gmail.com>
 */
public class Stock implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long stockId;
    private String stockCode;
    private String stockName;
    //getter and setter methods...

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public Long getStockId() {
        return stockId;
    }

    public void setStockId(Long stockId) {
        this.stockId = stockId;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
}
