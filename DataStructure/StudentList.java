package DataStructure;

public class StudentList {
	Student head;
	
	public static void add(StudentList list, Student newStudent) {
	if(list.head==null)
	list.head=newStudent;
	//System.out.print("List is empty");
	else {
	Student trav = list.head;
	while(trav.next!=null)
	trav = trav.next;
	trav.next = newStudent;
	}

	 }

	public static void addFirst(StudentList list, Student newStudent)
	{
	if(list.head==null)
	list.head = newStudent;
	else 
	{
	newStudent.next=list.head;
	list.head=newStudent;
	}
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
	public static void remove(StudentList list, Student s) {
	if(list.head==null)
	System.out.println("Empty List");
	else if(list.head.getRollno()==s.getRollno()) {
	Student temp =list.head;
	list.head=list.head.next;
	temp= null;
	}
	else {
	Student curr = list.head;
	Student curr1= curr.next;
	while(curr1.next!=null) {
	if(curr.getRollno()==s.getRollno()) {
	curr.next=curr1.next;
	curr1=null;
	break;
	}
	curr = curr1;
	curr1= curr1.next;
	}
	}
	}
	public static void main(String[] args) {
	StudentList list = new StudentList();
	list.add(list, new Student(20,"Eswar","CSE"));
	list.add(list, new Student(21,"Sankar","EEE"));
	list.add(list, new Student(22,"Govardhan","ECE"));
	list.add(list, new Student(23,"Dinesh","IT"));
	System.out.println("addFirst");
	printList(list);
	Student s=new Student();
	s.setRollno(20);
	System.out.print("\n=====================================================================\n");
	list.remove(list, s);
	printList(list);
	 }
	}


