package com.peopletech.array;

import java.util.Scanner;

public class ReversingAnArray {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements in Array: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	System.out.print("\n Array Reverse Elemnts ");
	for(int i=a.length-1;i>=0;i--) {
		System.out.print(a[i]+" ");
	}
	}

}
