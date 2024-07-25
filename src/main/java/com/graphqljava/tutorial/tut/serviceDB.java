package com.graphqljava.tutorial.tut;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graphqljava.tutorial.tut.db.Product;

@Service
public class serviceDB {

    @Autowired
    private dbrepo productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Optional<Product> updateProduct(String id, Product product) {
        return productRepository.findById(id).map(existingProduct -> {
            existingProduct.setName(product.getName());
            existingProduct.setDescription(product.getDescription());
            existingProduct.setPrice(product.getPrice());
            return productRepository.save(existingProduct);
        });
    }

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}
