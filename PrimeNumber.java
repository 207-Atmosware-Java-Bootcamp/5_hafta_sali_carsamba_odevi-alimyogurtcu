package com.turkcell;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Sayi: ");
		int num = scan.nextInt();
		int count = 0;
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Asal");
		} else {
			System.out.println("Asal degil");
		}
		
	}
	
}
