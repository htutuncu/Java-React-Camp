package multiLayeredDemo.business.concretes;

import java.util.List;

import multiLayeredDemo.business.abstracts.ProductService;
import multiLayeredDemo.core.LoggerService;
import multiLayeredDemo.dataAccess.abstracts.ProductDao;
import multiLayeredDemo.entities.concretes.Product;
import multiLayeredDemo.jLogger.JLoggerManager;

public class ProductManager implements ProductService{
	
	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		if(product.getCategoryId() == 1 ) {
			System.out.println("Bu kategoride urun kabul edilmiyor.");
			return;
		}
		
		
		
		this.productDao.add(product);
		this.loggerService.logToSystem("Eklendi");
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
