package com.mapping.collection.list;

import java.util.List;

public class Book {
	private Integer bk_id;
	private String bk_name;
	private String publisher;
	private List<String> author;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(Integer bk_id, String bk_name, String publisher, List<String> author) {
		super();
		this.bk_id = bk_id;
		this.bk_name = bk_name;
		this.publisher = publisher;
		this.author = author;
	}
	public Integer getBk_id() {
		return bk_id;
	}
	public void setBk_id(Integer bk_id) {
		this.bk_id = bk_id;
	}
	public String getBk_name() {
		return bk_name;
	}
	public void setBk_name(String bk_name) {
		this.bk_name = bk_name;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public List<String> getAuthor() {
		return author;
	}
	public void setAuthor(List<String> author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bk_id=" + bk_id + ", bk_name=" + bk_name + ", publisher=" + publisher + ", author=" + author
				+ "]";
	}
	
	
	


}