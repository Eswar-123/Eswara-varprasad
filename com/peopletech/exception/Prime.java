package com.peopletech.exception;


import java.util.Scanner;

public class Prime {

	public static void prime(int n) {
		System.out.println("prime numbers are of before "+n+" are: ");
		
		for(int i=2;i<=n;i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
					System.out.print(i+" ");
				}
			}
		}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number: ");
        int n=scan.nextInt();
        prime(n);
	}
	}
	
