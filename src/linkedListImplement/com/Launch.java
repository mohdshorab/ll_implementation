package linkedListImplement.com;
public class Launch {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.insertAtBeg(44);
		linkedList.insertAtBeg(55);
		linkedList.insertAtBeg(66);
		linkedList.insertAtBeg(77);
		linkedList.display();
		linkedList.insertAtEnd(88);
		linkedList.insertAtEnd(99);
		linkedList.display();
		linkedList.insertAtIndex(3, 101);
		linkedList.display();
		System.out.println(linkedList.deleteFromFirst());
		linkedList.display();
		System.out.println(linkedList.deleteFromEnd());
		linkedList.display();
		System.out.println(linkedList.delete(2));
		linkedList.display();
		linkedList.insertAtIndex(2, 405);
		linkedList.display();
	}
}
