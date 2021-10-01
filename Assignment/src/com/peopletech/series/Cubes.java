package com.peopletech.series;

import java.util.Scanner;
class Cubes {
	static int sumOfCubes(int n) {
		int sum=0;
		while(n>0) {
			int s=n%100;
			n=n/100;
			sum+=s*s*s;
		}
		return sum;
	}

	public static void main(String[] args) {
	System.out.println("Enter the Number: ");
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	System.out.println("sum= "+sumOfCubes(n));
	}

}
