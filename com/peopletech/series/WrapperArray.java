package com.peopletech.series;

public class WrapperArray {

	public static void main(String[] args) {
		Integer ids[]= new Integer[10];
		ids[0]=135;
		byte b= ids[0].byteValue();
		System.out.println("byte 12 is : "+b);
		System.out.println("arg[0]= "+(args[0]+5));
	}

}
