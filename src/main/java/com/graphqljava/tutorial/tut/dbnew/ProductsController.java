package com.graphqljava.tutorial.tut.dbnew;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.graphqljava.tutorial.tut.dbnew.PojoProducts.ProductNew;
import com.graphqljava.tutorial.tut.dbnew.ProductService;

import com.graphqljava.tutorial.tut.db.db.Product;



@RestController
@RequestMapping("/catalogue")
public class ProductsController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductNew> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Optional<ProductNew> getProductById(@PathVariable String id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public ProductNew createProduct(@RequestBody ProductNew product) {
        return productService.createProduct(product);
    }

    @PutMapping("/{id}")
    public Optional<ProductNew> updateProduct(@PathVariable String id, @RequestBody ProductNew product) {
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable String id) {
        productService.deleteProduct(id);
    }
}
