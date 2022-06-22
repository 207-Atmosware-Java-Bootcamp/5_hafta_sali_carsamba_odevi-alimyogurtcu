package com.turkcell;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Vize: ");
		int num1 = scan.nextInt();
		System.out.print("Final: ");
		int num2 = scan.nextInt();
		
		int average = (num1 + num2) / 2;
		
		if (average < 50)
			System.out.println("Kaldi");
		else if (average == 50)
			System.out.println("Gecti");
		else if (average >= 51 && average <= 70)
			System.out.println("BB");
		else if (average >= 71 && average <= 84)
			System.out.println("BA");
		else if (average >= 85 && average <= 100)
			System.out.println("AA");
		else
			System.out.println("Gecersiz");
		
	}
}
