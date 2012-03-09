package mkyong.stock.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import mkyong.stock.dao.StockDao;
import mkyong.stock.model.Stock;
import mkyong.util.CustomHibernateDaoSupport;

@Repository("stockDao")
public class StockDaoImpl extends CustomHibernateDaoSupport implements StockDao{
	
	public void save(Stock stock){
		getHibernateTemplate().save(stock);
	}
	
	public void update(Stock stock){
		getHibernateTemplate().update(stock);
	}
	
	public void delete(Stock stock){
		getHibernateTemplate().delete(stock);
	}
	
	public Stock findByStockCode(String stockCode){
		List list = getHibernateTemplate().find("from Stock where stockCode=?",stockCode);
		return (Stock)list.get(0);
	}

}