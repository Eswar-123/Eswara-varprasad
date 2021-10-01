package com.peopletech.array;

import java.util.Arrays;

public class Alphabetical {

	public static void main(String[] args) {
		String[]array= {"Govardhan","Sankar","Dinesh"};
		System.out.println("My Insorted Array Is "+ Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("My Sorted Array Is "+ Arrays.toString(array));
		
	}

	}

