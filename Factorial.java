package com.turkcell;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result = 1;
		
		System.out.print("Sayi: ");
		int num = scan.nextInt();
		
		for (int i = 1; i <= num; i++) {
			result = result * i;
		}
		System.out.println(num + "! = " + result);
		
	}
	
}
