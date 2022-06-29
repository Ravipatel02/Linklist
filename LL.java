
public class LL {
	Node head;
	
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data = data;
			this.next = null;
		}
	}
	// add first Postion
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return ;
		}
		newNode.next = head;
		head = newNode;
	}
	// add last postion
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return ;
		}
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next ;
		}
		currNode.next = newNode;
	}
	
	//print node
	public void print() {
		if(head == null) {
			System.out.println("list is null");
		}
		while(head !=null) {
			System.out.print(head.data);
			System.out.print("->");
			head = head.next;
		}
		System.out.println("null");
		
	}
	// delete first
	public void deleteFirst() {
		if(head == null) {
			System.out.println("Empty");
		}
		head = head.next;
	}
	
	// delete last 
	public void deleteLast() {
		if(head == null) {
			System.out.println("Empty");
		}
		if(head.next == null) {
			head = null ;
			return ;
		}
		Node secondLast = head;
		Node last = head.next;
		
		while(last.next != null) {
			last = last.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
		return ;
		
	}
	
	public static void main(String[] args) {
		
		LL list = new LL();
		list.addFirst("a");
		list.addFirst("is");
		list.addLast("list");
		list.addFirst("this");
		
		list.deleteFirst();
		
		list.deleteLast();
		
		list.print();
		
		
	}

}
