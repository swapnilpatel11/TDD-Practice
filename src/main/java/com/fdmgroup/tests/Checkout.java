package com.fdmgroup.tests;

public class Checkout {
	private double price;
	
	

	public Checkout() {
		super();
		this.price = price;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public double calculatePrice(Basket basket) {
		double	sumOfPrice = basket.getBooksInBasket().size() * price;
		
		if(basket.getBooksInBasket().size() == 3) {
		double discount = sumOfPrice * (0.01);
		sumOfPrice -= discount;
		return sumOfPrice;
		}
		else if(basket.getBooksInBasket().size() == 7) {
		double discount = sumOfPrice * (0.02);
		sumOfPrice -= discount;
		return sumOfPrice;
		}
		else if(basket.getBooksInBasket().size() == 10) {
		double discount = sumOfPrice *(0.13);
		sumOfPrice -= discount;
		return sumOfPrice;
		}
		return  sumOfPrice;
		
	}
	
	
}
