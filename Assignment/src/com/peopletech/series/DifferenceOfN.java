package com.peopletech.series;

import java.util.Scanner;

public class DifferenceOfN {
	public static void main(String[] args) {
		
		System.out.println("enter the number: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("the diffrence is "+calculateDifference (n));
	}

	private static int calculateDifference(int n) {
		
		int sumOfSquare = 0, squareOfSum=0;
		
		for(int i=1; i<=n; i++) {
			sumOfSquare += (i*i);
			squareOfSum += i;
		}
		
		System.out.println("sum of square is: "+sumOfSquare);
		System.out.println("square of sum is: "+(squareOfSum*squareOfSum));
		
		int diff = Math.abs(sumOfSquare - (squareOfSum*squareOfSum));
		return diff;
	}
	}
