package com.java8;

public class Book  implements Comparable<Book> {
  
	int price;
	String title;
	
	public Book(int price, String title) {
	//	super();
		this.price = price;
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public int compareTo(Book o) {
		if(this.getTitle().equals(o.getTitle()))
		{
			return (this.getPrice() - o.getPrice());
		}
		else
		{
			return this.getTitle().compareTo(o.getTitle());	
		}
		
		//return (this.getPrice() - o.getPrice());
	}
	@Override
	public String toString() {
		return "Book [price=" + price + ", title=" + title + "]";
	}
	
}
