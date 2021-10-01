package com.peopletech.series;

import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		System.out.println("Enter The Number: ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(checkNumber(n));
	}
	public static boolean checkNumber(int n) {
	while(n!=1) {
		if(n%2!=0) {
			return false;
		}
		n=n/2;
	}
	return true;
	}

}
