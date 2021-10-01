package com.peopletech.library;

public class Library {
	abstract class Item 

	{ 

	private String unique_ID; 

	private String title; 

	private int noOfCopies; 

	 

	public String getUnique_ID() 

	{ 

	return unique_ID; 

	} 

	  

	public String getTitle()  

	{ 

	return title; 

	} 

	public int getNoOfCopies() 

	{ 

	return noOfCopies; 

	} 

	public void setNoOfCopies(int noOfCopies) 

	{ 

	this.noOfCopies = noOfCopies; 

	} 

	  

	public Item(String unique_ID, String title, int noOfCopies) { 

	super(); 

	this.unique_ID = unique_ID; 

	this.title = title; 

	this.noOfCopies = noOfCopies; 

	} 

	  

	@Override 

	public String toString() { 

	return "Item [unique_ID=" + unique_ID + ", title=" + title + ", noOfCopies=" + noOfCopies + "]"; 

	} 

	abstract public int addItem(); 

	abstract public String checkIn(); 

	abstract public String checkOut(); 

	 

	} 

	class Writtenitem extends Item 

	{ 

	private String  author; 

	 

	 

	public String getAuthor() { 

	return author; 

	} 

	@Override 

	public int addItem() 

	{ 

	return 25; 

	} 

	@Override 

	public String checkIn() 

	        { 

	return "25sept"; 

	} 

	@Override 

	public String checkOut()  

	{ 

	return "29sept"; 

	 

	} 

	  

	public Writtenitem(String unique_ID, String title, int noOfCopies) { 

	super(unique_ID, title, noOfCopies); 

	 

	} 

	 

	} 

	class Books extends Writtenitem 

	{ 

	public int addItem() 

	{ 

	return 15; 

	} 

	@Override 

	public String checkIn() 

	        { 

	return "12sept"; 

	} 

	@Override 

	public String checkOut()  

	{ 

	return "10sept"; 

	} 

	 

	public Books(String unique_ID, String title, int noOfCopies) { 

	super(unique_ID, title, noOfCopies); 

	 

	} 

	  

	class JournalPaper extends Writtenitem 

	{ 

	private String yearpublished; 

	  

	public String getYearpublished() { 

	return yearpublished; 

	} 

	@Override 

	public int addItem() 

	{ 

	return 5; 

	} 

	@Override 

	public String checkIn() 

	        { 

	return "5sept"; 

	} 

	@Override 

	public String checkOut()  

	{ 

	return "9sept"; 

	 

	} 

	public JournalPaper(String unique_ID, String title, int noOfCopies) { 

	super(unique_ID, title, noOfCopies); 

	 

	} 

	 

	 

	} 

	  

	 

	class Medialitem extends Item 

	{ 

	private int runTime; 

	  

	public int getRunTime() { 

	return runTime; 

	} 

	  

	public void setRunTime(int runTime) { 

	this.runTime = runTime; 

	} 

	@Override 

	public int addItem() 

	{ 

	return 5; 

	} 

	@Override 

	public String checkIn() 

	        { 

	return "5sept"; 

	} 

	@Override 

	public String checkOut()  

	{ 

	return "9sept"; 

	 

	} 

	  

	public Medialitem(String unique_ID, String title, int noOfCopies) { 

	super(unique_ID, title, noOfCopies); 

	 

	} 

	 

	} 

	class Video extends Medialitem 

	{ 

	private String director; 

	private String genre; 

	private String yearreleased; 

	public String getDirector() { 

	return director; 

	} 

	public String getGenre() { 

	return genre; 

	} 

	public String getYearreleased() { 

	return yearreleased; 

	} 

	@Override 

	public int addItem() 

	{ 

	return 1; 

	} 

	@Override 

	public String checkIn() 

	        { 

	return "2sept"; 

	} 

	@Override 

	public String checkOut()  

	{ 

	return "3sept"; 
	} 
	public Video(String unique_ID, String title, int noOfCopies) { 
	super(unique_ID, title, noOfCopies); 
	} 
	} 
	class CD extends Medialitem 
	{ 
	private String director; 
	private String genere; 
	public String getDirector() { 
	return director; 
	} 
	public String getGenere() { 
	return genere; 
	} 
	@Override 
	public int addItem() 
	{ 
	return 13; 
	} 
	@Override 
	public String checkIn() 
    { 
    return "24sept"; 
    } 
	@Override 
	public String checkOut()  
	{ 
	return "30sept"; 
	} 
	public CD(String unique_ID, String title, int noOfCopies) { 
	super(unique_ID, title, noOfCopies); 
	} 
	} 
	} 
	public class InheritancePolymorphism  
	{ 
	public void main(String[] args)  
	{ 
	} 
	} 
}
