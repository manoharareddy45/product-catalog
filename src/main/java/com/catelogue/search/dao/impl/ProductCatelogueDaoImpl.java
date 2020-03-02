package com.catelogue.search.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.catelogue.search.dao.ProductCatelogueDao;
import com.catelogue.search.entity.ProductCatelogue;
import com.catelogue.search.repo.ProductCatelogueRepository;

@Component
public class ProductCatelogueDaoImpl implements ProductCatelogueDao {

	@Autowired
	private ProductCatelogueRepository productCatelogueRepository;
	@Override
	public List<ProductCatelogue> findAllProducts() {
		return (List<ProductCatelogue>) productCatelogueRepository.findAll();
	}
	@Override
	public List<ProductCatelogue> findByBrand(String brandName) {
		return productCatelogueRepository.findByBrand(brandName);
	}
	@Override
	public List<ProductCatelogue> findByPrice(Double low, Double high) {
		return productCatelogueRepository.findByPriceBetween(low, high);
	}
	
	@Override
	public List<ProductCatelogue> findBySku(String sku) {
		return productCatelogueRepository.findBySku(sku);
	}
	@Override
	public List<ProductCatelogue> findAvailableProductsBySeller(String seller) {
		return productCatelogueRepository.findBySeller(seller);
	}
	
	@Override
	public List<ProductCatelogue> findProductsGroupByBrand() {
		return productCatelogueRepository.groupByBrand();
	}
	@Override
	public List<ProductCatelogue> findProductsGroupByColor() {
		return productCatelogueRepository.groupByColor();
	}
	@Override
	public List<ProductCatelogue> findProductsGroupBySize() {
		return productCatelogueRepository.groupBySize();
	}
}
