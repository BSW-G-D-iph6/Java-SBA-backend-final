package com.graphqljava.tutorial.tut.old;

import java.util.Arrays;
import java.util.List;

import com.graphqljava.tutorial.tut.dbnew.product;

public record Catalogue( product productss) {

	 private static List<Catalogue> catalogue = Arrays.asList(
			new Catalogue(product.getById("hii"))
			 
			 );
	
}
