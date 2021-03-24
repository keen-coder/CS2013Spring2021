package linked_list;

public class LinkedList<E> {
	private int size;
	private Node<E> head;
	private Node<E> tail;
	
	public LinkedList() {
		this.size = 0;
		this.head = null;
		this.tail = null;
	}
	
	public LinkedList(E ... values) {
		for (int i = 0 ; i < values.length ; i++ ) {
			this.addLast(values[i]);
		}
	}
	
	//O(n)
	public E get(int index) {
		if (index < 0 || index >= this.size) {
			throw new IndexOutOfBoundsException("Index is out of bounds for index value: " + index);
		}
		Node<E> current = this.head;
		int currIndex = 0;
		
		while(currIndex < index) {
			current = current.next;
			currIndex++;
		}
		
		return current.data;
	}
	
	
	
	//O(1)
	public void addFirst(E data) {
		Node<E> temp = new Node<>(data);
		
		if (this.isEmpty()) {
			this.head = temp;
			this.tail = temp;
		}
		else {
			temp.next = this.head;
			this.head = temp;
		}
		
		this.size++;
	}
	
	//With Tail Reference: O(1)
	//Without Tail Reference: O(n) (must iterate from head to tail.
	public void addLast(E data) {
		Node<E> temp = new Node<>(data);
		
		if (this.isEmpty()) {
			this.head = temp;
			this.tail = temp;
		}
		else {
			this.tail.next = temp;
			this.tail = this.tail.next;
			//OR this.tail = temp;	
		}
		
		this.size++;
	} 
	
	public void insert(int index, E data) {
		if (index < 0 || index > this.size) {
			throw new IndexOutOfBoundsException("Index is out of bounds for index value: " + index);
		}
		
		Node<E> temp = new Node<>(data);
		
		if (index == 0) {
			this.addFirst(data);
		}
		else if (index == this.size) {
			this.addLast(data);
		}
		else {
			Node<E> current = this.head;
			int count = 0;
			
			while (count < index - 1) {
				current = current.next;
				count++;
			}
			
			temp.next = current.next;
			current.next = temp;
			this.size++;
		}
	}
	
	public E deleteFirst() throws RuntimeException {
		
		if (this.isEmpty()) {
			throw new RuntimeException("Linked list is empty, nothing to delete!");
		}
		
		E temp = this.head.data;
		if (this.size == 1) {
			this.head = this.tail = null;
		}
		else {
			this.head = this.head.next;
		}
		
		this.size--;
		return temp;
	}
	
	public E deleteLast() throws RuntimeException {	
		if (this.isEmpty()) {
			throw new RuntimeException("Linked list is empty, nothing to delete!");
		}
		
		E temp = this.tail.data;
		if (this.size == 1) {
			this.head = this.tail = null;
		}
		else {
			
			Node<E> current = this.head;
			Node<E> previous = this.head;
			
			while(current != this.tail) {
				previous = current;
				current = current.next;
			}
			 
			previous.next = null;
			this.tail = previous;
		}
	
		this.size--;
		return temp;
		
	}
	
	public E delete(int index) {
		if (this.isEmpty()) {
			throw new RuntimeException("Linked list is empty, nothing to delete!");
		}
		
		if (index < 0 || index >= this.size) {
			throw new IndexOutOfBoundsException("Index is out of bounds for index value: " + index);
		}
		
		if (index == 0) {
			return this.deleteFirst();
		}
		else if (index == this.size - 1) {
			return this.deleteLast();
		}
		else {
			int count = 0;
			Node<E> previous = this.head;
			
			while (count < index - 1) {
				previous = previous.next;
				count++;
			}
			
			E temp = previous.next.data;
			previous.next = previous.next.next;
		
			this.size--;
			return temp;
		}
		
		
	}
	
	
	
	
	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return (this.head == null && this.tail == null && this.size == 0);
	}
	

	
	
	//head
	//  |---> n1 --> n2 --> n3 ... --> nn --> null
	
	public String toString() {
		String result = "";
		
		Node<E> current = this.head;
		
		while(current != null) {
			result += current.data + " ";
			current = current.next;
		}
		
		//MAYBE REMOVE THIS FOR FINAL CODE.
		result += "\nhead: " + this.head;
		result += "\ntail: " + this.tail;
		result += "\nsize: " + this.size;
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
}
















































































////!!!!!Delete this constructor later!!!!
//public LinkedList(boolean x) {
//	//Create some nodes
//	Node<Integer> n1 = new Node<>(10);
//	Node<Integer> n2 = new Node<>(20);
//	Node<Integer> n3 = new Node<>(30);
//	Node<Integer> n4 = new Node<>(40);
//	Node<Integer> n5 = new Node<>(50);
//	Node<Integer> n6 = new Node<>(60);
//	Node<Integer> n7 = new Node<>(70);
//	Node<Integer> n8 = new Node<>(80);
//	Node<Integer> n9 = new Node<>(90);
//	Node<Integer> n10 = new Node<>(100);
//	
//	n1.next = n2;
//	n2.next = n3;
//	n3.next = n4;
//	n4.next = n5;
//	n5.next = n6;
//	n6.next = n7;
//	n7.next = n8;
//	n8.next = n9;
//	n9.next = n10;
//	
//	this.head = n1;
//	this.tail = n10;
//}