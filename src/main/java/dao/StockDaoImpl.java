/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Mateusz Lubański <m.lubanskii@gmail.com>
 */
public class StockDaoImpl extends HibernateDaoSupport implements StockDao {

    public void save(Stock stock) {
        getHibernateTemplate().save(stock);
    }

    public void update(Stock stock) {
        getHibernateTemplate().update(stock);
    }

    public void delete(Stock stock) {
        getHibernateTemplate().delete(stock);
    }

    public Stock findByStockCode(String stockCode) {
        List list = getHibernateTemplate().find(
                "from Stock where stockCode=?", stockCode);
        return (Stock) list.get(0);
    }
}