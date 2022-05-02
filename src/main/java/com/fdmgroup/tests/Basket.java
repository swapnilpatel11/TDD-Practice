package com.fdmgroup.tests;

import java.util.ArrayList;

public class Basket {
	private ArrayList<String> BooksInBasket;
	
	public Basket() {
		super();
		this.BooksInBasket = new ArrayList();
	}

	public void setBooksInBasket(ArrayList<String> BooksInBasket) {
		this.BooksInBasket = BooksInBasket;
	}


	public ArrayList<String> getBooksInBasket() {
		return this.BooksInBasket ;
	}
	
	public void addBook(String book) {
		BooksInBasket.add(book);
	}
	
}
