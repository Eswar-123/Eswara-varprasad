package DataStructure;

public class DoubleLinkedListAuthor {
	
	 Author head;
	    public void add(int id ,String name,int  noOfBooks ) {
	    Author auth =new Author(id,name, noOfBooks);
	    auth.next=head;
	    auth.prev=null;
	    if(head!=null) {
	    head.prev =auth;
	    }
	    head=auth;
	    }
	    public void remove( DoubleLinkedListAuthor auth   ,int id) {
	        
	
			if(auth.head==null)
	             System.out.println("The List is Empty..");
	             else
	             {
	                 
	                 Author curr=auth.head;
	                 Author curr2=curr.next;
	                 if(curr.id==id)
	                 {
	                     Author temp=auth.head;
	                     auth.head=auth.head.next;
	                     temp=null;
	                     
	                 }
	                 else
	                 {
	                 while(curr2.next!=null)
	                 {
	                     if(curr2.id==id)
	                     {
	                         curr.next=curr2.next;
	                         curr2=null;
	                         break;
	                     }
	                     curr=curr2;
	                     curr2=curr2.next;
	                 }
	                 }
	             }
	    }
	    
	    public void addInMiddle(Author auth_prev,int id,String name ,int noOfBooks)
	    {
	    if(auth_prev==null)
	    {
	    System.out.println("The List is Empty..");
	    return;
	    }
	    Author author =new Author(id,name, noOfBooks);
	    author.next=auth_prev.next;
	    auth_prev.next=author;
	    author.prev=auth_prev;
	    if(author.next!=null)
	    author.next.prev=author;
	    }
	    
	    public void removeInMiddle( DoubleLinkedListAuthor auth   ,int id) {
	    	if(auth.head==null)
	             System.out.println("The List is Empty..");
	             else
	             {
	                 
	                 Author curr=auth.head;
	                 Author curr2=curr.next;
	                 if(curr.id==id)
	                 {
	                     Author temp=auth.head;
	                     auth.head=auth.head.next;
	                     temp=null;
	                     
	                 }
	                 else
	                 {
	                 while(curr2.next!=null)
	                 {
	                     if(curr2.id==id)
	                     {
	                         curr.next=curr2.next;
	                         curr2=null;
	                         break;
	                     }
	                     curr=curr2;	
	                     curr2=curr2.next;
	                 }
	                 }
	             }
	    	
	    }

	    public void find(DoubleLinkedListAuthor auth, int id)
	    {
	    if(auth.head==null)
	    System.out.println("The List is Empty..");
	    else if(auth.head.getId()==id)
	    System.out.println(auth.head);
	    else
	    {
	    Author curr=auth.head;
	    while(curr.next!=null)
	    {
	    if(curr.getId()==id)
	    {
	    System.out.println(curr);
	    return;
	    }
	    curr=curr.next;
	    }
	    }
	    }
	    public void printList(Author author)
	    {
	    Author prev=null;
	    while(author!=null)
	    {
	    System.out.print(author.id+" "+author.name+" "+author.noOfBooks+" " +" ");
	    prev=author;
	    author=author.next;
	    }
	    } 
	  
	    public static void main(String[] args) {
	    DoubleLinkedListAuthor auth= new DoubleLinkedListAuthor();
	    auth.add(100,"Hakuna Matata", 1);
	    auth.add(101," Simbha", 2);
	    auth.add(102,"SpiderMan", 3);
	    auth.add(103,"Avengers", 4);
	    auth.printList(auth.head);
	    System.out.println("\n========================");
	    auth.remove(auth, 101);
	    auth.printList(auth.head);
	    System.out.println("\n========================");
	    auth.addInMiddle(auth.head.next,104,"BatMan",5);
	    auth.printList(auth.head);
	    System.out.println("\n========================");
	    auth.removeInMiddle(auth, 104);
	    auth.printList(auth.head);
	    System.out.println("\n========================");
	    auth.find(auth,103);
	    auth.printList(auth.head);
	  
	    }

	    

		class Author
	    {

public Author head;
int id;
String name;
int noOfBooks;
Author next;
Author prev;


public Author(int id,String name,int noOfBooks) {
super();
this.id = id;
this.name = name;
this.noOfBooks = noOfBooks;
this.next=null;
this.prev=null;
}


public Author getHead() {
return head;
}


public void setHead(Author head) {
this.head = head;
}


public int getId() {
return id;
}


public void setId(int id) {
this.id = id;
}


public String getName() {
return name;
}


public void setName(String name) {
this.name = name;
}


public int getNoOfBooks() {
return noOfBooks;
}


public void setNoOfBooks(int noOfBooks) {
this.noOfBooks = noOfBooks;
}


@Override
public String toString() {
return "Author [ id= " + id + ", name=" + name + " ,noOfBooks=" + noOfBooks+" ]" ;

}
}
}
	


