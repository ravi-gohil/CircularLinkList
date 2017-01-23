
public class LinkedList {

	private Node start;
	private Node end;
	public int size;
	
	public LinkedList(){
		start = null;
		end  = null;
		size = 0;
	}
	
	public boolean isEmpty(){
		return start == null;
	}
	
	public int getSize(){
		return size;
	}
	
	public void insertAtStart(int val){
		Node nptr = new Node(val, null);
		size++;
		nptr.setLink(start);
		if(start == null)
		{
			start = nptr;
			end = start;
			
		}
		else
		{
			end.setLink(nptr);
			start = nptr;
		}
	}
	
	public void insertAtEnd(int val){
		Node nptr = new Node(val, null);
		nptr.setLink(start);
		if(start == null)
		{
			start = nptr;
			end = start;
		}
		else
		{
			end.setLink(nptr);
			end = nptr;
		}
		size++;
	}
	
	public void insertAtPos(int val, int pos){
		Node nptr = new Node(val, null);
		Node ptr = start;
		pos = pos - 1;
		for (int i =1 ; i< size - 1; i++)
		{
			if(i == pos)
			{
				Node tmp = ptr.getlink();
				ptr.setLink(nptr);
				nptr.setLink(tmp);
				break;
			}
			ptr = ptr.getlink();
		}
		size++;
	}
	
	public void deleteAtPos(int pos){
		if(size ==1 && pos == 1)
		{
			start = null;
			end = null;
			size =0;
			return;
		}
		
		if (pos == 1)
		{
			start =start.getlink();
			end.setLink(start);
			size--;
			return;
		}
		
		if (pos == size)
		{
			Node s = start;
			Node t = start;
			
			while ( s != end)
			{
				t = s;
				s = s.getlink();
			}
			
			end  = t;
			end.setLink(start);
			size--;
			return;
		}
		
		Node ptr = start;
		pos = pos - 1;
		
		for (int i = 1; i< size - 1; i++)
		{
			if(i == pos)
			{
				Node tmp = ptr.getlink();
				tmp = tmp.getlink();
				ptr.setLink(tmp);
				break;
			}
		}
		size--;
	}
	
	public void display(){
		System.out.println(" Circular Singly Linke List");
		Node ptr = start;
		if(size == 0)
		{
			System.out.println("Empty");
			return;
		}
		
		if(start.getlink() == start)
		{
			System.out.println(start.getData()+"->"+ ptr.getData());
			return ;
		}
		
		
		System.out.print(start.getData()+"->");
		ptr = start.getlink();
		while (ptr.getlink() != start)
		{
			System.out.print(ptr.getData()+"->");
			ptr  = ptr.getlink();
		}
		System.out.print(ptr.getData()+"->");
		ptr.getlink();
		System.out.print(ptr.getData());
	}
}
