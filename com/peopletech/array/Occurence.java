package com.peopletech.array;

public class Occurence {

	public static void main(String[] args) {
		int a[]= {20,30,20,50,30,66,23,23,30,10};
     System.out.println(count(a));
	}
	private static int count(int []a) {
     int count=0;
     for(int i=0;i<a.length;i++) {
    	 if(a[i]==30) {
    		 count++;
    		 
    	 }
     }
     return count;
	}

}
