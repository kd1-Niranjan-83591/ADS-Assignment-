package Q3insertdataafternode;



public class insertdataafternode 
{

	public static void main(String[] args)
	{
		List l1=new List();
		l1.addFirst(10);
		l1.addFirst(20);
		l1.addFirst(30);
		l1.addFirst(40);
		l1.addFirst(50);
		
		l1.display();
		
//		l1.addafternode(20, 25);
//		l1.display();
//		
//		//l1.addafternode(60, 25);//enter a valid data
//		
//		l1.addafternode(10, 11);
//		l1.display();
		
		
		l1.addbeforenode(30, 29);
		l1.display();
		
		l1.addbeforenode(50, 48);
		l1.display();
		

	}

}
