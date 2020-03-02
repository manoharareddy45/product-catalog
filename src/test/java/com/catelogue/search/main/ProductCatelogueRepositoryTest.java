package com.catelogue.search.main;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.catelogue.search.entity.ProductCatelogue;
import com.catelogue.search.repo.ProductCatelogueRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ProductCatelogueRepositoryTest {

    @Autowired
    private ProductCatelogueRepository repository;

    @Test
    public void testFindBySku() {
    	List<ProductCatelogue> list = repository.findBySku("010012");
		assertThat(list).extracting(ProductCatelogue::getSku).containsOnly("010012");
    }
    
    @Test
    public void testFindByBrand() {
    	List<ProductCatelogue> list = repository.findByBrand("US Polo");
		assertThat(list).extracting(ProductCatelogue::getBrand).containsOnly("US Polo");
    }
    
    @Test
    public void testFindBySeller() {
    	List<ProductCatelogue> list = repository.findBySeller("Seller2");
		assertThat(list).extracting(ProductCatelogue::getSeller).containsOnly("Seller2");
    }
    
}
