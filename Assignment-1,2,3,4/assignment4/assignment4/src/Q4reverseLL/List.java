package Q4reverseLL;

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
	
	public void rev()
	{
		System.out.println("reverese of linked list is : ");
	  reverse(head);	
	}
	
	public void reverse(Node head)
	{
	  int data;	
	  if(head==null)
	  {
		return;  
	  }
	  
	  data=head.data;
	  reverse(head.next);
	  System.out.print(data +" ");
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














