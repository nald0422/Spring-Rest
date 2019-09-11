package com.testing;

public class Product {

	public int productCode;
	public String productName;
	public float productCost;
	public int quantity;
	public static int counter = 0;

	public Product(String productName, float productCost, int quantity) {
		this.productName = productName;
		this.productCost = productCost;
		this.quantity = quantity;
	}

	public int initCounter() {
		counter += 1;
		return counter;
	}

	public boolean sell(int count) {
		if (count <= quantity) {
			int currentStocks = quantity - count;
			setQuantity(currentStocks);
			return true;
		} else {
			return false;
		}
	}

	public void purchase(int count) {
		int total = quantity + count;
		setQuantity(total);
	}

	public void priceIncrease(float count) {
		float currentPrice = productCost * count;
		setProductCost(currentPrice);
	}

	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getProductCost() {
		return productCost;
	}

	public void setProductCost(float productCost) {
		this.productCost = productCost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Product.counter = counter;
	}

	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", productName=" + productName + ", productCost=" + productCost
				+ ", quantity=" + quantity + "]";
	}

}
