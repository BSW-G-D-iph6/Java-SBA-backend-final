package com.graphqljava.tutorial.tut;

import java.util.List;


import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = {"http://127.0.0.1:3000/","http://localhost:3000"})
@Controller
class TutApplicationController {

	

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
    public List<product> allPoduct() {
    	return product.getall();
    }

    /**
     * @param book
     * @return
     */
    @SchemaMapping
    public Author author(Book book) {
        return Author.getById(book.authorId());
    }
    
 

}