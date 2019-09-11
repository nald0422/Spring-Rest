package com.testing;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a, b;

		System.out.println("Input a number A : ");
		a = in.nextInt();

		System.out.println("Input a number B:  ");
		b = in.nextInt();
		
		System.out.println("Num A:\t" + a + "\nNum B:\t" + b);
		
		if(a%2 == 0) {
			System.out.println("Num A is even");
		}
		else {
			System.out.println("Num A is odd");
		}
		
		for(int i = 0; i < a; i++) {
			System.out.println("Counter : " + i);
		}
	}
}
