package com.catelogue.search.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.catelogue.search.dao.ProductCatelogueDao;
import com.catelogue.search.entity.ProductCatelogue;
import com.catelogue.search.service.ProductCatelogueService;

@Component
public class ProductCatelogueServiceImpl implements ProductCatelogueService{

	@Autowired
	private ProductCatelogueDao productCatelogueDao;
	
	@Override
	public List<ProductCatelogue> findAllProducts() {
		List<ProductCatelogue> listProducts = productCatelogueDao.findAllProducts();
		listProducts.stream().filter(product -> product.getStockLeft() > 0);
		return listProducts;
	}

	@Override
	public List<ProductCatelogue> findByBrand(String brandName) {
		List<ProductCatelogue> listProducts = productCatelogueDao.findByBrand(brandName);
		listProducts.stream().filter(product -> product.getStockLeft() > 0);
		return listProducts;
	}

	@Override
	public List<ProductCatelogue> findByPrice(Double low, Double high) {
		List<ProductCatelogue> listProducts =  productCatelogueDao.findByPrice(low, high);
		listProducts.stream().filter(product -> product.getStockLeft() > 0);
		return listProducts;
	}

	@Override
	public List<ProductCatelogue> findBySku(String sku) {
		return productCatelogueDao.findBySku(sku);
	}

	@Override
	public List<ProductCatelogue> findAvailableProductsBySeller(String seller) {
		List<ProductCatelogue> listProducts =  productCatelogueDao.findAvailableProductsBySeller(seller);
		listProducts.stream().filter(product -> product.getStockLeft() > 0);
		return listProducts;
	}

	@Override
	public List<ProductCatelogue> findProductsGroupByBrand() {
		List<ProductCatelogue> listProducts =  productCatelogueDao.findProductsGroupByBrand();
		listProducts.stream().filter(product -> product.getStockLeft() > 0);
		return listProducts;
	}

	@Override
	public List<ProductCatelogue> findProductsGroupByColor() {
		List<ProductCatelogue> listProducts =  productCatelogueDao.findProductsGroupByColor();
		listProducts.stream().filter(product -> product.getStockLeft() > 0);
		return listProducts;
	}

	@Override
	public List<ProductCatelogue> findProductsGroupBySize() {
		List<ProductCatelogue> listProducts =  productCatelogueDao.findProductsGroupBySize();
		listProducts.stream().filter(product -> product.getStockLeft() > 0);
		return listProducts;
	}
}
