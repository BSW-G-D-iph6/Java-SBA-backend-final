package com.graphqljava.tutorial.tut.dbnew;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class PojoProducts {
//	String title, 
//	String benefit,
//	String detail, 
//	String[] tags, 
//	int price,
//	String img,
//	String currency,
//	String UUID

@Document(collection = "products")
public static class ProductNew {

    @Id
    private String id;
	private String title;
    private String benefit;
    private String detail;
    private String[] tags;
    private int price;
    private String img;
    private String currency;
//    private double price;

    public ProductNew() {
    }

    public ProductNew(String title, String benefit, String detail, String[] tags, int price, String img, String currency) {
        this.title = title;
        this.benefit = benefit;
        this.detail = detail;
        this.tags = tags;
        this.price = price;
        this.img = img;
        this.currency = currency;
//        this.detail = price;

    }
    
    public String getId() {
 		return id;
 	}

 	public void setId(String id) {
 		this.id = id;
 	}

 	public String getTitle() {
 		return title;
 	}

 	public void setTitle(String title) {
 		this.title = title;
 	}

 	public String getBenefit() {
 		return benefit;
 	}

 	public void setBenefit(String benefit) {
 		this.benefit = benefit;
 	}

 	public String getDetail() {
 		return detail;
 	}

 	public void setDetail(String detail) {
 		this.detail = detail;
 	}

 	public String[] getTags() {
 		return tags;
 	}

 	public void setTags(String[] tags) {
 		this.tags = tags;
 	}

 	public int getPrice() {
 		return price;
 	}

 	public void setPrice(int price) {
 		this.price = price;
 	}

 	public String getImg() {
 		return img;
 	}

 	public void setImg(String img) {
 		this.img = img;
 	}

 	public String getCurrency() {
 		return currency;
 	}

 	public void setCurrency(String currency) {
 		this.currency = currency;
 	}

  
}

}
