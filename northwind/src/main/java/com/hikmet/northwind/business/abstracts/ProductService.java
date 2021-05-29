package com.hikmet.northwind.business.abstracts;

import java.util.List;



import com.hikmet.northwind.core.utilities.results.DataResult;
import com.hikmet.northwind.core.utilities.results.Result;
import com.hikmet.northwind.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();
	DataResult<List<Product>> getAll(int pageNo, int pageSize);
	DataResult<List<Product>> getAllSorted();

	Result add(Product product);
	
	DataResult<Product> getByProductName(String productName);
	DataResult<Product> getByProductNameAndCategory_CategoryId(String productName,int id);
	DataResult<List<Product>> getByProductNameOrCategory_CategoryId(String productName,int id);
	DataResult<List<Product>> getByCategory_CategoryIdIn(List<Integer> categories);
	DataResult<List<Product>> getByProductNameContains(String productName);
	DataResult<List<Product>> getByProductNameStartsWith(String productName);
	
	
	DataResult<List<Product>> getByNameAndCategory(String productName,int id);
}
