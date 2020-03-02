package com.catelogue.search.dao;

import java.util.List;

import com.catelogue.search.entity.ProductCatelogue;

public interface ProductCatelogueDao {
	
	List<ProductCatelogue> findAllProducts();
	List<ProductCatelogue> findByBrand(String brandName);
	List<ProductCatelogue> findByPrice(Double low, Double high);
	List<ProductCatelogue> findBySku(String sku);
	List<ProductCatelogue> findAvailableProductsBySeller(String seller);
	List<ProductCatelogue> findProductsGroupByBrand();
	List<ProductCatelogue> findProductsGroupByColor();
	List<ProductCatelogue> findProductsGroupBySize();
	
}
