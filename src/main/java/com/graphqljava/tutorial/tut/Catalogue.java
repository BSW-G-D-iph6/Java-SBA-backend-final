package com.graphqljava.tutorial.tut;

import java.util.Arrays;
import java.util.List;

public record Catalogue( product productss) {

	 private static List<Catalogue> catalogue = Arrays.asList(
			new Catalogue(product.getById("hii"))
			 
			 );
	
}
