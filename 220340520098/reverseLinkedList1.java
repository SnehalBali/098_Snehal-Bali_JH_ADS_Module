import java.util.Scanner;
class reverseLinkedList1{
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
		Scanner sc = new Scanner(System.in);
		reverseLinkedList r = new reverseLinkedList();
		reverseLinkedList r2 = new reverseLinkedList();
			
		System.out.println("Test case:");
		System.out.println("Enter the no. of test case");
		int t = sc.nextInt();
		System.out.println(t);
		System.out.println("Enter the no. of elements in linked list");
		int n = sc.nextInt();
		System.out.println(n);
		for(int i=1;i<=n;i++){
			r.insert(sc.nextInt());
		}
		r.reverse(r.head);
		
		
	}
	
}