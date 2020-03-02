package com.catelogue.search.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT_CATELOGUE")
public class ProductCatelogue implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private Integer id;
	@Column(name="PRODUCT_NAME")
	private String productName;
	@Column(name="FIT_TYPE")
	private String fitType;
	@Column(name="MATERIAL")
	private String material;
	@Column(name="BRAND")
	private String brand;
	@Column(name="PRICE")
	private Double price;
	@Column(name="COLOR")
	private String color;
	@Column(name="PRODUCT_SIZE")
	private String size;
	@Column(name="STOCK_LEFT")
	private Integer stockLeft;
	@Column(name="SELLER")
	private String seller;
	@Column(name="PRODUCT_SKU")
	private String sku;
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getFitType() {
		return fitType;
	}
	public void setFitType(String fitType) {
		this.fitType = fitType;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	public Integer getStockLeft() {
		return stockLeft;
	}
	public void setStockLeft(Integer stockLeft) {
		this.stockLeft = stockLeft;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	@Override
	public String toString() {
		return "ProductCatelogue [id=" + id + ", productName=" + productName + ", fitType=" + fitType + ", material="
				+ material + ", brand=" + brand + ", price=" + price + ", color=" + color + ", size=" + size + "]";
	}
	
	
	
}
