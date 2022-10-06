package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {

	private ProductDao productDao;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers) {
		// ProductDao newlendiğinde bana bir ProductDao türünde bişey ver demek
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		// iş kuralları business rules

		if (product.getUnitPrice() < 10) {
			throw new Exception("ürün fiyatı 10'dan kucuk olamaz");
		}

		productDao.add(product);
		for (Logger logger : loggers) { // [db,mail]
			logger.log(product.getName());
		}

		// bir katman başka bir katmanın class'ını kullanıyorken sadece interface'den
		// erisim kurmalıdır.

		// ProductDao productDao = new HibernateProductDao();
		// productDao.add(product);

	}

}
