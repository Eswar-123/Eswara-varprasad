package com.peopletech.array;

public class MinMax {

	public static void main(String[] args) {
		int a[]= {50,30,20,10,60};
		
		int min=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Min of array: "+min);
        int max=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Max of array: "+max);

	}

}
