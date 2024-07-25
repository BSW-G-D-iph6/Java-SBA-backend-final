package com.graphqljava.tutorial.tut;

import java.util.Arrays;
import java.util.List;

import org.bson.Document;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public record product(String title, String benefit,String detail, String[] tags, int price,String img,String currency,String UUID ) {

//	 private static List<Author> products = Arrays.asList(
//	            new Author("author-1", "Joanne", "Rowling"),
//	            new Author("author-2", "Herman", "Melville"),
//	            new Author("author-3", "Anne", "Rice"));
	

     
     
	 private static List<product> products = Arrays.asList(
			 new product("Traum Bot Merchandise","Classic pull over hoodie","100% Super good, Jet Black", new String[]{"hoodie","pullover","apparel"} ,49,"https://my-store-fb4d51.creator-spring.com/_next/image?url=https%3A%2F%2Fimages.teespring.com%2Fv3%2Fimage%2FFAyOR_5No7tU5ZirMQVBHKV-icU%2F800%2F800.jpg&w=1200&q=75","£","blank"),
			 new product("Traum T-Shirt","Cotton Shirt","Super Good, Navy blue, availible in other colors", new String[]{"sdf","and sffooo"} ,400,"https://raw.githubusercontent.com/GDSimpson3/images/main/ban77.png","£","blank")

			 );
	 public static List<product> getall() {
	        return products;
	    }
	  public static product getById(String id) {
	        return products.stream().filter(product -> product.UUID().equals(id)).findFirst().orElse(null);
	    }

	 
	
}

//title: string,
//benefit: string,
//detail: ReactElement,
//tags: string[],
//price: number,
//img: string,
//currency: string,
//UUID: string,