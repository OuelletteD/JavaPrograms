public class Queue{
	Node head;
	Node tail;
	int size;
	private class Node{
		int value = -1;
		Node next = null;
	}
	Queue(){
		head = new Node();
		tail = new Node();
		this.head = head;
		this.tail = tail;
		this.size = 0;

	}
	public void enQueue(int value){
		Node temp = new Node();
		temp.value = value;
		if(this.size == 0){
			this.tail.next = temp;
			this.head.next = temp;
		}else{
			this.tail.next.next = temp;
			this.tail.next = temp;
		}
		size++;
	}
	public void deQueue(){
		if(tail.next == null){
			throw new NullPointerException("Queue is empty");
		}
		Node temp = new Node();
		this.head.next = this.head.next.next;
		size--;
	}
	public void printValues(){
		Node temp = new Node();
		temp = this.head;
		while(temp.next != null){
			temp = temp.next;
			System.out.println(temp.value);
		}
	}
	public int printSize(){
		return this.size;
	}
	public void peek(){
		System.out.println(this.head.next.value);
	}
	public static void main(String[] args){
		Queue a = new Queue();
		a.enQueue(30);
		a.enQueue(40);
		System.out.println(a.printSize());
		a.printValues();
		a.deQueue();
		System.out.println(a.printSize());
		a.printValues();
		a.peek();
	}
}