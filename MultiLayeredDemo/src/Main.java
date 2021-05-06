import multiLayeredDemo.business.abstracts.ProductService;
import multiLayeredDemo.business.concretes.ProductManager;
import multiLayeredDemo.core.JLoggerManagerAdapter;
import multiLayeredDemo.dataAccess.abstracts.ProductDao;
import multiLayeredDemo.dataAccess.concretes.AbcProductDao;
import multiLayeredDemo.dataAccess.concretes.HibernateProductDao;
import multiLayeredDemo.entities.concretes.Product;

public class Main {
	
	public static void main(String[] args) {
		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
		Product product = new Product(1,2,"Elma",12,50);
		productService.add(product);
	}

}
