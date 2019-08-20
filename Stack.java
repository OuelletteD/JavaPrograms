public class Stack{
	Node head;
	int size;
	private class Node{
		int data;
		Node next;
	}
	Stack(){
		head = new Node();
		this.size = 0;
		this.head = head;
		this.head.data=-1;
		this.head.next=null;
	}
	public void push(int num){
		Node temp = new Node();
		temp.data = num;
		temp.next = null;
		if(this.size==0){
			this.head.next=temp;
		}else{
			temp.next = head.next;
			head.next = temp;
		}
		size++;
	}
	public void printValues(){
		Node temp = new Node();
		temp = this.head;
		while(temp.next!=null){
			temp = temp.next;
			System.out.println(temp.data);
		}
	}
	public void pop(){
		this.head.next=this.head.next.next;
		size--;
	}
	public void peek(){
		System.out.println(this.head.next.data);
	}
	public static void main(String[] args){
		//TESTING
		Stack a = new Stack();
		a.push(10);
		a.push(30);
		a.push(256);
		a.printValues();
		a.pop();
		a.printValues();
		System.out.println();
		a.peek();
	}
}