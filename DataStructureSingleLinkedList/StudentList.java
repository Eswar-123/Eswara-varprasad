package DataStructureSingleLinkedList;

public class StudentList {
Student head;
	
	public static void add(StudentList list, Student newStudent) {
	if(list.head==null)
	list.head=newStudent;
	else {
	Student trav = list.head;
	while(trav.next!=null)
	trav = trav.next;
	trav.next = newStudent;
	}
    }
	
	public void get(StudentList list, int get) {
		System.out.println("\nThe Get Element:");
		int i=1;
		if(head == null) {
		System.out.print("empty list");
		}
		else {
		Student temp = head;
	    while(temp!=null) {
		if(i == get) {
		System.out.println(temp);
		}
		temp = temp.next;
		i++;
		}
		}
		}
	public static void getFirst(StudentList list) {
		System.out.println("\nThe GetFirst Element:");
		Student trav;
		if(list.head==null)
		System.out.print("Empty List");
		else {
		trav = list.head;
		System.out.print(trav);
		}
	}	
	
	public void getLast(StudentList list) {
		System.out.println("\nThe GetLast Element:");
		if(head == null) {
		System.out.print("empty list");
		}
		else {
		Student temp = head;
		while(temp.next != null) {
		temp = temp.next;
		}
		System.out.println(temp);
		}
		}
	
	public void LastIndex(StudentList list) {
		System.out.println("\nThe LastIndex Element:");
		int index = 1;
		if(head == null) {
		System.out.print("empty list");
		}
		else {
		Student temp = head;
		while(temp.next != null) {
		temp = temp.next;
		index++;
		}
		System.out.println("The last index is : "+index+" of student "+temp);

		}
		}
	
	public boolean contains(StudentList list, Student stu)
    {
		System.out.println("The Contains Element");
        if(head == null)
        {
            return false;
            }
        else
        {
            Student temp = head;
            while(temp.next != null)
            {
                if(temp.equals(stu))
                {
                    return true;
                    }
                temp = temp.next;
                }
            }
        return false;
    }
		
	
	public static void printList(StudentList list)
	{
	Student trav;
	if(list.head==null)
	System.out.print("Empty List");
	else {
	trav = list.head;
	while(trav!=null) {
	System.out.print(trav+"-->");
	trav = trav.next;
	}
	}
	}
	public static void main(String[] args) {
		StudentList list = new StudentList();
		list.add(list, new Student(20,"Eswar","CSE"));
		list.add(list, new Student(21,"Sankar","EEE"));
		list.add(list, new Student(22,"Govardhan","ECE"));
		list.add(list, new Student(23,"Dinesh","IT"));
		printList(list);
		System.out.println("\n=====================================");
		list.get(list, 3);
		System.out.println("\n=====================================");
		list.getFirst(list);
		System.out.println("\n=====================================");
		list.getLast(list);
		System.out.println("\n=====================================");
		list.LastIndex(list);
		System.out.println("\n=====================================");
		System.out.println(list.contains(list,new Student(20,"Eswar","CSE")));
		
}
}
