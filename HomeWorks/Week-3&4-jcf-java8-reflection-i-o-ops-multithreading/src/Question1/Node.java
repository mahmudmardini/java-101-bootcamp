package Question1;


public class Node {

	int data;
	Node next;
	Node previous; 
	
	public Node(int d, Node n, Node p){
		
		data = d;
		next = n;
		previous = p;
	}
	
	public void setLinkNext(Node n) {
		next = n;
	}
	
	public void setLinkPrevious(Node p) {
		previous = p;
	}
	
	public void setData(int d) {
		data = d;
	}

	public Node getLinkNext() {
		return next;
	}

	public Node getLinkPrevious() {
		return previous;
	}
	
	public int getData() {
		return data;
	}
	
}
