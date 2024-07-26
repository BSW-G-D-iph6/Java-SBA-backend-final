package com.graphqljava.tutorial.tut.dbnew;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.graphqljava.tutorial.tut.db.db.Product;
import com.graphqljava.tutorial.tut.dbnew.PojoProducts.ProductNew;

//public class ProductRepo {

@Repository
public interface ProductRepo extends MongoRepository<ProductNew, String> {
}
//}
