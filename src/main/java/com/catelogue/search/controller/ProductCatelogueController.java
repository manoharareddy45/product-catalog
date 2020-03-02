package com.catelogue.search.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.catelogue.search.entity.ProductCatelogue;
import com.catelogue.search.service.ProductCatelogueService;

@RestController
@RequestMapping("/products")
public class ProductCatelogueController {
	
	@Autowired
	private ProductCatelogueService productCatelogueService;
	
	@GetMapping("/all")
    private List<ProductCatelogue> getAllAvailableProducts() {
        return productCatelogueService.findAllProducts();
    }
	
	@GetMapping("/groupby/brand")
    private List<ProductCatelogue> getProductsGroupByBrand() {
        return productCatelogueService.findProductsGroupByBrand();
    }
	
	@GetMapping("/groupby/color")
    private List<ProductCatelogue> getProductsGroupByColor() {
        return productCatelogueService.findProductsGroupByColor();
    }
	
	@GetMapping("/groupby/size")
    private List<ProductCatelogue> getProductsGroupBySize() {
        return productCatelogueService.findProductsGroupBySize();
    }
	
	@GetMapping("/bybrand")
    private List<ProductCatelogue> getProductsByBrand(@RequestParam String brand) {
        return productCatelogueService.findByBrand(brand);
    }
	
	@GetMapping("/byprice/range")
    private List<ProductCatelogue> getProductByPriceRange(@RequestParam Double low, @RequestParam Double high) {
        return productCatelogueService.findByPrice(low, high);
    }
	
	@GetMapping("/bysku")
    private List<ProductCatelogue> getProductsBySku(@RequestParam String sku) {
        return productCatelogueService.findBySku(sku);
    }
	
	@GetMapping("/products/byseller")
    private List<ProductCatelogue> getAvailableProductsBySeller(@RequestParam String seller) {
        return productCatelogueService.findAvailableProductsBySeller(seller);
    }
	
}
