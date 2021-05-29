package com.hikmet.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.hikmet.northwind.business.abstracts.ProductService;
import com.hikmet.northwind.core.utilities.results.DataResult;
import com.hikmet.northwind.core.utilities.results.Result;
import com.hikmet.northwind.core.utilities.results.SuccessDataResult;
import com.hikmet.northwind.core.utilities.results.SuccessResult;
import com.hikmet.northwind.dataAccess.abstracts.ProductDao;
import com.hikmet.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService{

	
	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {
		
		return new SuccessDataResult<List<Product>>
		(this.productDao.findAll(),"Data listelendi.");
				
				
	}
	
	@Override
	public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo-1, pageSize);
		
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(pageable).getContent());
	}
	
	@Override
	public DataResult<List<Product>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC,"productName");
		
		return new SuccessDataResult<List<Product>>
		(this.productDao.findAll(sort),"Data listelendi.");
	}
	
	
	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün eklendi.");
	}

	@Override
	public DataResult<Product> getByProductName(String productName) {
		return new SuccessDataResult<Product>
		(this.productDao.getByProductName(productName),"Data listelendi.");
	}

	@Override
	public DataResult<Product> getByProductNameAndCategory_CategoryId(String productName, int id) {
		return new SuccessDataResult<Product>
		(this.productDao.getByProductNameAndCategory_CategoryId(productName,id),"Data listelendi.");
	}

	@Override
	public DataResult<List<Product>> getByProductNameOrCategory_CategoryId(String productName, int id) {
		return new SuccessDataResult<List<Product>>
		(this.productDao.getByProductNameOrCategory_CategoryId(productName,id),"Data listelendi.");
	}

	@Override
	public DataResult<List<Product>> getByCategory_CategoryIdIn(List<Integer> categories) {
		return new SuccessDataResult<List<Product>>
		(this.productDao.getByCategory_CategoryIdIn(categories),"Data listelendi.");
	}

	@Override
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		return new SuccessDataResult<List<Product>>
		(this.productDao.getByProductNameContains(productName),"Data listelendi.");
	}

	@Override
	public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
		return new SuccessDataResult<List<Product>>
		(this.productDao.getByProductNameStartsWith(productName),"Data listelendi.");
	}

	@Override
	public DataResult<List<Product>> getByNameAndCategory(String productName, int id) {
		return new SuccessDataResult<List<Product>>
		(this.productDao.getByNameAndCategory(productName,id),"Data listelendi.");
	}

	

	
	
}
