package linked_list;

class Node<E> {
	protected E data;
	protected Node<E> next;
	
	public Node(E data) {
		this.data = data;
	}
	
	public String toString() {
		return this.data.toString();
	}
}