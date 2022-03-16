package linkedListImplement.com;

public class LinkedList {
	Node headNode;
	Node tailNode;
	int size;
	public LinkedList() {
		this.size =0;
	}
	void insertAtBeg(int value) {
		Node newNode =  new Node(value);
		newNode.next = headNode;
		headNode = newNode;
		if (tailNode==null) {
				tailNode = headNode;
		}
		size++;
	}
	void insertAtEnd(int value) {
		if (tailNode==null) {
			insertAtBeg(value);
			return;
		}
		Node newNode = new Node(value);
//		newNode.next = null;
		tailNode.next = newNode;
		tailNode = newNode;
		size++;
	}
	void insertAtIndex(int index, int value) {
		if (index==0) {
			insertAtBeg(value);
			return;
		}
		if (index==size) {
			insertAtEnd(value);
			return;
		}
		Node tempNode = headNode;
		for (int i = 1; i < index; i++) {
			tempNode=tempNode.next;
		}
		Node newNode = new Node(value, tempNode.next);
		tempNode.next = newNode;
		size++;
	}
	
	public int deleteFromFirst() {
		int val = headNode.value;
		headNode = headNode.next;
		if (headNode==null) {
			tailNode =null;
		}
		size--;
		return val;
	}
	
//	Delete from End
	public int deleteFromEnd() {
		if (size<=1) {
			deleteFromFirst();
		}
		Node secondLastNode = getNode(size-2);
		int val = tailNode.value;
		tailNode = secondLastNode;
		secondLastNode.next =null;
		return val;
	}
	
//Delete from anywhere
	public int delete(int index) {
		if (index==0) {
			deleteFromFirst();
		}		
		if (index==size-1) {
			deleteFromEnd();
		}
		Node prevNode = getNode(index-1);
		int val = prevNode.next.value;
		Node tempNode = prevNode.next.next;
		prevNode.next.next = null;
//		We have to set the "*next" of deleted node to null so that GC can collect it;
//		programmer assigns null to the reference variables of all those objects which are no longer required.
//		This makes the useless objects automatically eligible for the purpose of garbage collection.
		prevNode.next = tempNode;
		return val;
	}
	
	public Node getNode(int index) {
		Node node = headNode;
		for(int i = 0;i<index;i++) {
			node = node.next;
		}
		return node;
	}
	
	public void display() {
		Node tempNode = headNode;
		while (tempNode!=null) {
			
			System.out.print(tempNode.value+" --> ");
			tempNode=tempNode.next;
		}
		System.out.print("End/Null\n");
		
	}
	
}
