package Q2circular;

public class circularLL 
{

	public static void main(String[] args)
	{
		List l1=new List();
		
		l1.addFirst('t');
		l1.addFirst('u');
		l1.addFirst('h');
		l1.addFirst('d');
		l1.addFirst('v');
		l1.addFirst('a');
		l1.addFirst('*');
		l1.display();

		
		l1.addLast('p');
		l1.addLast('o');
		l1.addLast('l');
		l1.addLast('*');
		
		l1.display();
		
		l1.addPosition('V', 7);
		l1.display();
		
		l1.deleteFirst();
		l1.display();
		
		l1.deleteLast();
	
		l1.display();
	
		l1.addLast('*');
		l1.addLast('*');
		
		l1.display();
		
		l1.deletePosition(11);
		l1.display();
		
		
		l1.deletePosition(11);
		l1.display();
		
	}

}
