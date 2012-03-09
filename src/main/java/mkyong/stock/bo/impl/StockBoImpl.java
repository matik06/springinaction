package mkyong.stock.bo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mkyong.stock.bo.StockBo;
import mkyong.stock.dao.StockDao;
import mkyong.stock.model.Stock;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

//określa, że wszystkie metody wewnątrz klasy będą wspierały transakcyjność
//@Transactional(propagation= Propagation.SUPPORTS, readOnly=true)
@Service("stockBo")
public class StockBoImpl implements StockBo{
	
	@Autowired
	StockDao stockDao;
        
        @Autowired
        TransactionTemplate transactionTemplate;
        
	
	public void setStockDao(StockDao stockDao) {
		this.stockDao = stockDao;
	}

	public void save(Stock stock){
		stockDao.save(stock);
	}
	
	public void update(final Stock stock){
                
            transactionTemplate.execute(new TransactionCallback<Void>() {

                @Override
                public Void doInTransaction(TransactionStatus ts) {
                    try {
                        stockDao.update(stock);
                    } catch (RuntimeException e) {
                        ts.setRollbackOnly();
                        throw e;
                    }
                    return null;
                }
                
            });
	}
	
        //określa, że dana metoda będzie wspierała transakcyjność
        @Transactional(propagation= Propagation.REQUIRED, readOnly=false)
	public void delete(Stock stock){
		stockDao.delete(stock);
	}
	
	public Stock findByStockCode(String stockCode){
		return stockDao.findByStockCode(stockCode);
	}
}
