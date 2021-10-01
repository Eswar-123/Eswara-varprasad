package com.peopletech.series;
import java.util.Scanner;

public class Increasing {

	public static void main(String[] args) {
		System.out.println("Enter The Number: ");
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(checkNumber(n));
		}
       public static boolean checkNumber(int n) {
    	   while(n>0) {
    		   int a=n%10;
    		   n=n/10;
    		   int b=n%10;
    		   if (a<b) {
    		   }
    	      return true;
    	   }
    	   return false;
       }
}
