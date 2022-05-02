package com.fdmgroup.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BasketTest {

	@Test
	public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded(){
		//Arrange
		Basket bk = new Basket();
		int expected = 0;
		//Act
		int numberOfBook = bk.getBooksInBasket().size();
		//Assert
		assertEquals(expected,numberOfBook);
			
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook() {
		//Arrange
		Basket bk = new Basket();
		//Book b = new Book();
		int expected = 2;
		//Act
		bk.addBook("1");
		bk.addBook("12");  //TDD test3
		//Assert
		assertEquals(expected,bk.getBooksInBasket().size());
	}
	
	



}
