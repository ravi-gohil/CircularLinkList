import java.util.Scanner;

public class CircularSinglyLinkList {
	public static void main(String args[]){
		Scanner sn = new Scanner(System.in);
		LinkedList ll = new LinkedList();
		char ch;
		do{
			System.out.println("Circular Singly Linke List Operation");
			System.out.println("1. Insert at beginning");
			System.out.println("2. Insert at Last");
			System.out.println("3. Insert at Position");
			System.out.println("4. Delete at Position");
			System.out.println("5. Check Empty");
			System.out.println("6. Get Size");
			int choice = sn.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the element");
				ll.insertAtStart(sn.nextInt());
				break;
			case 2:
				System.out.println("enter the element");
				ll.insertAtEnd(sn.nextInt());
				break;
			case 3:
				System.out.println("enter the element");
				int num = sn.nextInt();
				System.out.println("enter the position");
				int pos = sn.nextInt();
				if (pos < 1 || pos> ll.getSize())
					System.out.println("invalid position ");
				else 
					ll.insertAtPos(num, pos);
				break;
			case 4:
				System.out.println("Enter the position");
				pos = sn.nextInt();
				if (pos < 1 || pos> ll.getSize())
					System.out.println("invalid position ");
				else
					ll.deleteAtPos(pos);
				break;
			case 5:
				System.out.println("Empty status : "+ ll.isEmpty());
				break;
			case 6:
				System.out.println("Size : "+ ll.getSize());
				break;
			default:
				System.out.println("wrong input");
				break;
			}
			ll.display();
			System.out.println("Do you want to continue (y|n)");
			ch = sn.next().charAt(0);
		}while (ch == 'Y' || ch == 'y');
	}
}
