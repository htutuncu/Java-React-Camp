package multiLayeredDemo.business.abstracts;

import java.util.List;

import multiLayeredDemo.entities.concretes.Product;

public interface ProductService {
	void add(Product product);
	List<Product> getAll();
}
