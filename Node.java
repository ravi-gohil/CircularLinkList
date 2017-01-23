
public class Node {
	private int data;
	private Node link;
	
	public Node(){
		link = null;
		data = 0;
	}
	
	public Node(int d, Node l){
		data = d;
		link = l;
	}
	
	public void setLink(Node n){
		link = n;
	}
	
	public void setData(int d){
		data = d;
	}
	
	public Node getlink(){
		return link;
	}
	
	public int getData(){
		return data;
	}
	
}
