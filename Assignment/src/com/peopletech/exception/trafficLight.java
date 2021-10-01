package com.peopletech.exception;
import java.util.Scanner;

public class trafficLight {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose one color : ");
		System.out.println("red ");
		System.out.println("yellow");
		System.out.println("green");
		String color = scan.next();
		light(color);
		
	}
	
	public static void light(String color){
		
		switch (color){
			case "red": System.out.println("stop");break;
			case "yellow": System.out.println("ready");break;
			case "green": System.out.println("go");break;
		  
			default:System.out.println("Choose only one red, yello or green");  
		}
		
	}

}
