package com.graphqljava.tutorial.tut;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.graphqljava.tutorial.tut.db.Product;

//import com.graphqljava.tutorial.tut.db.User;
//@Component
//public class dbrepo {
//	
//	public interface UserRepository extends MongoRepository<User,String>{
//
//	}
//}

@Repository
public interface dbrepo extends MongoRepository<Product, String> {
}