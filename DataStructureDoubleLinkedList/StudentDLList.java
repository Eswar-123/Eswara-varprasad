package DataStructureDoubleLinkedList;

public class StudentDLList {
	Student head;
    static int size=0;
    // Adding Element to the End of the List
    public static void add(StudentDLList list , Student newStudent)
    {
        if(list.head==null)
            list.head=newStudent;
        else
        {
            Student curr=list.head;
            
            while(curr.next!=null)
                curr=curr.next;
            curr.next=newStudent;
            newStudent.prev=curr;
        }
        size++;
    }
    public static Student get(StudentDLList list,int index)
    {
        Student s=null;
        if(index>size)
            System.out.println("Invalid Index..");
        else
        {
            int temp=1;
            s=list.head;
            while(s.next!=null)
            {
                s=s.next;
                temp++;
                if(temp==index)
                    break;
            }
            
        }
        return s;
    }
    public static void printList(StudentDLList list)
    {
        Student curr=list.head;
        if(list.head==null)
            System.out.println("List is Empty...");
        else
        {
            while(curr!=null)
            {
                System.out.print(curr+" <-> ");
                curr=curr.next;
            }
            
        }
        System.out.println("\nList in reverse order\n");
        Student s=get(list,size);
        while(s!=null)
        {
            System.out.print(s+" <-> ");
            s=s.prev;
        }    
    }
    
    
    public static void addFirst(StudentDLList list, Student newStudent)
    {
        if(list.head==null)
            list.head=newStudent;
        else
        {
            newStudent.next=list.head;
            list.head.prev=newStudent;
            list.head=newStudent;
        }    
        size++;
    }
    public static void addAfter(StudentDLList list, Student newStudent) {
    	if(list.head== null) {
    		list.head=newStudent;
    	}
    	else
    		{
    			newStudent.next=list.head;
    			list.head.prev=newStudent;
    			list.head=newStudent;
    		}
    	}
    		
    
    
    public static void remove(StudentDLList list, Student s)
    {
        if(list.head==null)
            System.out.println("\nThe List is Empty");
        else
        {
            Student curr=list.head;
            while(curr.next!=null)
            {
                if(curr.equals(s)) {
                    curr.prev.next=curr.next;
                    curr.next.prev=curr.prev;
                    curr=null;
                    break;
                }
                curr=curr.next;
            }
        }
    }
    
    public static void main(String[] args) {
        StudentDLList list=new StudentDLList();
        list.add(list, new Student(10,"Sankar","CS"));
        list.add(list, new Student(11,"dinesh","IT"));
        list.add(list, new Student(12,"gowtham","EEE"));
        list.add(list, new Student(13,"govardhan","ECE")); 
        list.addAfter(list, new Student(14,"vinod","CS"));
        
        printList(list);
        
        System.out.println("\nElement at index 2 : "+get(list,2));
        System.out.println("\n===============================================\n");
        list.addFirst(list, new Student(9,"surya","IIT"));
        printList(list);
        System.out.println("\n===============================================\n");
        list.remove(list, new Student(13,"govardhan","ECE"));
        System.out.println("\n===============================================\n");
        printList(list);
       
       
    }

 

}

