package com.fdmgroup.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckoutTest {

	@Test
	public void test_CalculatePrice_ReturnsDoubleZeroPointZeroWhenPassedAnEmptyBasket() {
		//Arrange
		Basket basket = new Basket();
		Checkout ck = new Checkout();
		double expected = 0.0;
		//Act
		double actual = ck.calculatePrice(basket);
		
		//Assert
		assertEquals(expected,actual);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithOneBook() {
		//Arrange
		Basket basket = new Basket();
		Checkout ck = new Checkout();
		double expected = 15;
		//Act
		basket.addBook("1");
		ck.setPrice(15);
		double actual = ck.calculatePrice(basket);
				
		//Assert
		assertEquals(expected,actual);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithTwoBook() {
		//Arrange
		Basket basket = new Basket();
		Checkout ck = new Checkout();
		double expected = 20;
		//Act
		basket.addBook("12354");
		basket.addBook("1245");
		ck.setPrice(10);
		double actual = ck.calculatePrice(basket);
		//Assert
		assertEquals(expected,actual);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithThreeBook() {
		//Arrange
		Basket basket = new Basket();
		Checkout ck = new Checkout();
		double expected = (25.99*3)-((25.99 * 3)*(0.01));
		//Act
		basket.addBook("12");
		basket.addBook("148");
		basket.addBook("1458");
		ck.setPrice(25.99);
		double actual = ck.calculatePrice(basket);
		//Assert
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithSevenBook() {
		//Arrange
		Basket basket = new Basket();
		Checkout ck = new Checkout();
		double expected = (25.99*7)-((25.99 * 7)*(0.02));
		//Act
		basket.addBook("12");
		basket.addBook("148");
		basket.addBook("1458");
		basket.addBook("15");
		basket.addBook("15");
		basket.addBook("15");
		basket.addBook("15");
		ck.setPrice(25.99);
		double actual = ck.calculatePrice(basket);
		
		//Assert
		assertEquals(expected,actual);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithTenBook() {
		//Arrange
		Basket basket = new Basket();
		Checkout ck = new Checkout();
		double expected = (25.99*10)-((25.99 * 10)*(0.13));
		//Act
		basket.addBook("12");
		basket.addBook("148");
		basket.addBook("1458");
		basket.addBook("15");
		basket.addBook("15");
		basket.addBook("15");
		basket.addBook("15");
		basket.addBook("15");
		basket.addBook("15");
		basket.addBook("15");
		ck.setPrice(25.99);
		double actual = ck.calculatePrice(basket);
				
		//Assert
		assertEquals(expected,actual);
	}
	
	



}
