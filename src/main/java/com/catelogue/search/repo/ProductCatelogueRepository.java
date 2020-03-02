package com.catelogue.search.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.catelogue.search.entity.ProductCatelogue;

@Repository
public interface ProductCatelogueRepository extends CrudRepository<ProductCatelogue, Integer>{

	List<ProductCatelogue> findByBrand(String brand);
	
	List<ProductCatelogue> findByPriceBetween(Double low, Double high);
	
	List<ProductCatelogue> findBySku(String sku);
	
	List<ProductCatelogue> findBySeller(String seller);
	
	@Query(nativeQuery = true, value ="SELECT ID, BRAND, PRODUCT_NAME, FIT_TYPE, MATERIAL, PRICE, COLOR, PRODUCT_SIZE, STOCK_LEFT, SELLER,\r\n" + 
			"PRODUCT_SKU FROM PRODUCT_CATELOGUE GROUP BY BRAND, ID")
	public List<ProductCatelogue> groupByBrand();
	
	@Query(nativeQuery = true, value ="SELECT ID, BRAND, PRODUCT_NAME, FIT_TYPE, MATERIAL, PRICE, COLOR, PRODUCT_SIZE, STOCK_LEFT, SELLER,\r\n" + 
			"PRODUCT_SKU FROM PRODUCT_CATELOGUE GROUP BY COLOR, ID")
	public List<ProductCatelogue> groupByColor();
	
	@Query(nativeQuery = true, value ="SELECT ID, BRAND, PRODUCT_NAME, FIT_TYPE, MATERIAL, PRICE, COLOR, PRODUCT_SIZE, STOCK_LEFT, SELLER,\r\n" + 
			"PRODUCT_SKU FROM PRODUCT_CATELOGUE GROUP BY PRODUCT_SIZE, ID")
	public List<ProductCatelogue> groupBySize();
	
}
