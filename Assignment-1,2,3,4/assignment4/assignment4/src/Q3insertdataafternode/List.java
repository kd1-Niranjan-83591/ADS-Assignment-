package Q3insertdataafternode;

//3. In singly linear list implement following operations. i. insert a new node after a given node ii. insert a new node before a given node


public class List 
{
	static class Node
	{
		
		private int data;
		private Node next;
		public Node(int value) 
		{
			data = value;
			next = null;
		}
		
	}
	
	private Node head;
	public List() 
	{
		head = null;
	}
	
	public boolean isEmpty() 
	{
		return head == null;
	}
	
	public void addFirst(int value)
	{
		//1. create a node with given data
		Node newnode = new Node(value);
		//2. add head into next of newnode
		newnode.next = head;
		//3. add newnode into head
		head = newnode;
	}
	
							//  20      25
	public void addafternode(int data,int value)
	{
		Node newnode=new Node(value);
		
	   if(isEmpty())
	   {
		   head=newnode;
	   }
	   else
	   {
		   int flag=0;
		   Node trap=head;
		   while(trap!=null)
		   {
				if(trap.data==data)
				{
				  flag=1;
				  break;
				}
				trap=trap.next;
		   }
		   
		   if(flag==1)
		   {
			   Node trav=head;
			   
			   while(trav.data!=data)
			   {
				 trav=trav.next;   
			   }
		     
			   newnode.next=trav.next;
			   trav.next=newnode;
		   }
		   else
		   {
			   System.out.println("enter a valid data");
		   }
	   }
		
	}
	
	//***************************************************************************************
	public void addbeforenode(int data,int value)
	{
		Node newnode=new Node(value);
		Node first=head;
	   if(isEmpty())
	   {
		   head=newnode;
	   }
	   else if(first.data==data)
	   {
		 newnode.next=head;
		 head=newnode;
	   }
	   else
	   {
		   int flag=0;
		   Node trap=head;
	
		   while(trap!=null)
		   {
				if(trap.data==data)
				{
				  flag=1;
				  break;
				}
				trap=trap.next;
		   }
		   
		   if(flag==1)
		   {
			   Node trav=head;
			   Node tras=null;
			   while(trav.next.data!=data)
			   {				 
				 trav=trav.next;  
			   }
		     
			   newnode.next=trav.next;
			   trav.next=newnode;
		   }
		   else
		   {
			   System.out.println("enter a valid data");
		   }
	   }
		
	}
	
	
	
	
	public void deleteFirst()
	{
		//1. if list is empty
		if(isEmpty())
			return;
		//2. if list is not empty
		else
			//a. move head on second node
			head = head.next;
	}
	
	
	
	
	
	public void deleteAll() 
	{
		head = null;
	}
	
	public void display() 
	{
		//1. create a trav referance and start at head
		Node trav = head;
		System.out.print("List :: ");
		while(trav != null) 
		{
			//2. print/visit current node (trav.data)
			System.out.print(" " + trav.data);
			//3. go on next node (trav.next)
			trav = trav.next;
		}//4. repeat step 2 and 3 till last node
		System.out.println("");
	}
	
	
	
}














