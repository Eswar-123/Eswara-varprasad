package com.peopletech.exception;

import java.util.Scanner;

public class Fibbo {

	public static void main(String[] args) {
	       Scanner scan=new Scanner(System.in);
		   System.out.println("Enter the number: ");	
      int n=scan.nextInt();
      int c=0,d=1;
      System.out.println("without recursion");
        noRecursion(c,d,n);
      System.out.println("\n with recursion");
      recursion(c,d,n-2);
	}
	static void noRecursion(int c,int d,int n) {
		int sum=0;
		for(int i=2;i<n;i++){
			sum=c+d;
			System.out.print(sum+" ");
			c=d;
			d=sum;
		}
	}
	static void recursion(int c,int d,int n) {
		int sum=0;
		if(n>0) {
			sum=c+d;
			c=d;
			d=sum;
			System.out.print(sum+" ");
			recursion(c,d,n-1);
		}
	}

}
