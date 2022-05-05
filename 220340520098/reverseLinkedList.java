class reverseLinkedList{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	boolean isEmpty(){
		if(head==null){
			return true;
		}
		return false;
	}
	
	void insert(int data){
		Node newnode = new Node(data);
		if(isEmpty()){
			head = newnode;
			return;
		}
		Node temp= head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=newnode;
		newnode.next=null;
	}
	
	void display(){
		if(isEmpty()){
			System.out.println("Empty!!");
			return;
		}
		Node temp = head;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	void reverse(Node n){
		if(n!=null){
		reverse(n.next);
		System.out.print(n.data+" ");
		}
		
	}
	
	public static void main(String[] args){
		reverseLinkedList r1 = new reverseLinkedList();
		reverseLinkedList r2 = new reverseLinkedList();
		System.out.println("Test case 1:");
		r1.insert(1);
		r1.insert(2);
		r1.insert(3);
		r1.insert(4);
		r1.insert(5);
		r1.reverse(r1.head);
		System.out.println("\n============");
		System.out.println("Test case 2:");
		r2.insert(3);
		r2.insert(4);
		r2.insert(2);
		r2.insert(5);
		r1.reverse(r2.head);
	}
	
}