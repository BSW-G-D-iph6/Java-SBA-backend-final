package com.graphqljava.tutorial.tut;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.graphqljava.tutorial.tut.dbnew.PojoProducts.ProductNew;
import com.graphqljava.tutorial.tut.dbnew.ProductService;
import com.graphqljava.tutorial.tut.dbnew.product;
import com.graphqljava.tutorial.tut.old.*;

@CrossOrigin(origins = {"http://127.0.0.1:3000/","http://localhost:3000"})
@Controller
class TutApplicationController {

	 @Autowired
	 private ProductService productService;


//	@CrossOrigin(origins = "http://localhost:3000")
    @QueryMapping
    public Book bookById(@Argument String id) {
        return Book.getById(id);
    }
//	@CrossOrigin(origins = "http://localhost:3000")
    @QueryMapping
    public product productById(@Argument String id) {
        return product.getById(id);
    }
    
    
//	@CrossOrigin(origins = "http://localhost:3000")
    @QueryMapping
    public List<product> allPoductMock() {
//    	return product.getall();
    	return product.allProducts();
    	
    }

    
    
    
    
    @QueryMapping
    public List<ProductNew> allPoductReal() {
//    	return product.getall();
    	return productService.getAllProducts();
    	
    }
    
//    @QueryMapping
//    public Optional<ProductNew> getbyidDB(@Argument String id) {
////    	return product.getall();
//    	return productService.getProductById(id);
//    	
//    }
    
    /**
     * @param book
     * @return
     */
    @SchemaMapping
    public Author author(Book book) {
        return Author.getById(book.authorId());
    }
    
 

}