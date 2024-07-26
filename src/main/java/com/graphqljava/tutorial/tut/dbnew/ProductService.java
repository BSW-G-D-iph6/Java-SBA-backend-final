package com.graphqljava.tutorial.tut.dbnew;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graphqljava.tutorial.tut.db.dbrepo;
import com.graphqljava.tutorial.tut.dbnew.PojoProducts.ProductNew;
import com.graphqljava.tutorial.tut.db.db.Product;

@Service
public class ProductService {
	   @Autowired
	    private ProductRepo productRepository;

	    public List<ProductNew> getAllProducts() {
	        return productRepository.findAll();
	    }

	    public Optional<ProductNew> getProductById(String id) {
	        return productRepository.findById(id);
	    }

	    public ProductNew createProduct(ProductNew product) {
	        return productRepository.save(product);
	    }

	    public Optional<ProductNew> updateProduct(String id, ProductNew product) {
	        return productRepository.findById(id).map(existingProduct -> {
	            existingProduct.setTitle(product.getTitle());
	            existingProduct.setBenefit(product.getBenefit());
	            existingProduct.setDetail(product.getDetail());
	            existingProduct.setTags(product.getTags());
	            existingProduct.setPrice(product.getPrice());
	            existingProduct.setImg(product.getImg());	           
	            existingProduct.setCurrency(product.getCurrency());
	            return productRepository.save(existingProduct);
	        });
	    }

	    public void deleteProduct(String id) {
	        productRepository.deleteById(id);
	    }
}
