package Q6employee;

import java.util.Scanner;

/*
 Implement menudriven program to maintain linked list of employees and provide below operations. i.
Add employee (Perfrom any add operation) ii. Display all employees iii. Search employee by name
 iv.Delete employee by empid v. Update salary of employee
 
 */

public class tester
{

	public static void main(String[] args)
	{
		List l1=new List();
		int choice;
		Scanner sc=new Scanner(System.in);
		
		do
		{	
			System.out.println("i.Add employee (Perfrom any add operation)");
			System.out.println("ii. Display all employees");
			System.out.println("iii. Search employee by name");
			System.out.println("iv.Delete employee by empid");
			System.out.println("v. Update salary of employee");
			
			System.out.println("eneter choice");
		    choice=sc.nextInt();
		    
		    
		    switch(choice)
		    {
		       
				    case 1:
				    {
				    	int id;
				    	String name;
				    	double salary;
				    	
				    	System.out.println("enter employee id");
				    	id=sc.nextInt();
				    	System.out.println("enter Employee name");
				    	name=sc.next();
				    	System.out.println("enter Employee salary");
				    	salary=sc.nextDouble();
				    	
				    	Employee e=new Employee(id,name,salary);
				    	l1.addLast(e);
				    	
				    }
				    	  break;
				    
				    case 2:
				    {
				      l1.display();	
				    }
				    	  break;
				    	  
				    case 3:
				    {
				    	String name;
				    	System.out.println("enter name");
				    	name=sc.next();
				    	l1.searchemp(name);
				    	
				    }
				    	  break;
				    	  
				    case 4:
				    {
				    	int id;
				    	System.out.println("enter empid to be deleted");
				    	id=sc.nextInt();
				    	l1.delete(id);
				    }
				    	  break;
				    	  
				    case 5:
				    {
				    	
				    }
				    	  break;
			 }

		}while(choice!=0);
	}

}
