package com.peopletech.array;

public class Character {
    
	public static void main(String[] args) {
		char ch[]= {'e','s','w','a','r'};
		int a[]=new int[26];
		for(int i=0;i<ch.length;i++) {
			a[ch[i]-97]+=1;
			
		}
		for (int i=0;i<a.length;i++) {
			if(a[i]>=1) {
				System.out.println((char)(i+97)+" = "+a[i]);
			}
		}
	
}
}
