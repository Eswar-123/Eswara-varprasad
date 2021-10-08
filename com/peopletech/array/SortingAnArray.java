package com.peopletech.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingAnArray {

	public static void main(String[] args) {
	int a[]= {123,56,41,21,11,100,3};
	Arrays.sort(a);
	for(int i=0;i<=a.length-1;i++) {
		System.out.print(" "+a[i]);
	}

	}

}
