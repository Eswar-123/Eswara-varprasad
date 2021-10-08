package DataStructure;

public class LinkedListEmp {
	


    Employee head;
    static int size=0;
     public void insert(LinkedListEmp list,int id,String name,double salary)
        {
      Employee emp=new Employee(id, name, salary);
            if(list.head ==null)
                list.head=emp;
            else
            {
             Employee trav=list.head;
                while(trav.next!=null)
                {
                    trav=trav.next;
                }
                trav.next=emp;
            }     
        }
     public void addFirst(LinkedListEmp list,int id,String name ,double salary ) {
         Employee emp=new Employee(id, name, salary);
           if(list.head==null)
               list.head=emp;
           else
           {
               emp.next=list.head;
               list.head.prev=emp;
               list.head=emp;
               
               
           }
           size++;
           
           
       }
     public void removeFirst(LinkedListEmp list) {
           if (list.head == null) {
               System.out.println("list is already empty");
           }
           else {
              Employee curr = list.head;
               list.head = curr.next;
               curr.next = null;
           }
       }
      
     public void removeLast(LinkedListEmp list)
     {
     Employee prev=null;
     if (list.head == null)
     {
     System.out.println("list is already empty");
     }
     else
     {
     Employee temp = list.head;
     while(temp.next != null)
     {
     prev=temp;
     temp = temp.next;
     }
     prev.next = null;
     }
     }
     public void remove(LinkedListEmp list, int id,String name,double salary)
     {
         if(list.head==null)
         System.out.println("The List is Empty..");
         else
         {
             
             Employee curr=list.head;
             Employee curr2=curr.next;
             if(curr.id==id)
             {
                 Employee temp=list.head;
                 list.head=list.head.next;
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
     public static void print(LinkedListEmp list)
     {
         Employee curr=list.head;
         System.out.println("\n LinkedList: ");
         while(curr!=null)
         {
             System.out.print(curr.id+ " "+curr.name+" "+curr.salary+" "+" --> ");
             curr=curr.next;
         }
     }
     
    public static void main(String[] args) {
     
     LinkedListEmp emp =new LinkedListEmp();
     
     emp.insert(emp, 123, "naresh", 24656.5);
     emp.insert(emp, 224, "sai", 55555.5);
     emp.insert(emp, 514, "kumar", 15566.5);
     emp.insert(emp, 514, "Eswar", 56262.5);



     
     print(emp);
     System.out.println("\n --------add first--------");
     emp.addFirst(emp,354,"Revanth",56465.5);
     print(emp);
     System.out.println("\n --------remove first--------");
     emp.removeFirst(emp);
     print(emp);
     System.out.println("\n --------remove last--------");
     emp.removeLast(emp);
     print(emp);
     System.out.println("\n ----------remove----------");
     emp.remove(emp, 224, "sai", 55555.5);
     print(emp);
     
   
   }
   class Employee
       {
      
       int id;
     String name;
     double salary;
     Employee next;
     Employee prev;
     
     public Employee(int id, String name, double salary) {
     this.id = id;
     this.name = name;
     this.salary = salary;
     this.next=null;
    }
       }
}
   