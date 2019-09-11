package com.testing;

import java.util.Scanner;

public class TestProduct {

	public static void main(String[] args) {
		Scanner inA = new Scanner(System.in);

		System.out.println("Product Name: ");
		Scanner inB = new Scanner(System.in);
		String productName = inB.nextLine();

		System.out.println("Product Cost: ");
		float productCost = inA.nextFloat();

		System.out.println("Number of stocks: ");
		int quantity = inA.nextInt();

		Product p = new Product(productName, productCost, quantity);
		
		p.setProductCode(p.initCounter());

		System.out.println(p.toString());

		System.out.println("No. of products to sell: ");
		p.sell(inA.nextInt());

		System.out.println("No. of products to purchase: ");
		p.purchase(inA.nextInt());

		System.out.println("Increase the price: ");
		p.priceIncrease(inA.nextFloat());

		System.out.println(p.toString());

	}

}
