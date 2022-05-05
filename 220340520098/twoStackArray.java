class twoStackArray{
	int top1;
	int top2;
	int size;
	int arr[];
	
	twoStackArray(int size){
		this.size=size;
		arr=new int[size];
		top1 = -1;
		top2 = size;
	}
	
	boolean isEmpty(){
		if(top1<0 && top2>size){
			return true;
		}
		return false;
	}
	
	boolean isFull(){
		if(top1>=top2){
			return true;
		}
		return false;
	}
	
	void push1(int data){
		if(top1<top2-1){
			top1++;
			arr[top1]=data;
		}
		else{
			System.out.println("Stack full");
			return;
		}
		
	}
	
	void push2(int data){
		if(top1<top2-1){
			top2--;
			arr[top2]=data;
		}
		else{
			System.out.println("Stack full");
			return;
		}
		
	}
	
	void pop1(){
		if(isEmpty()){
			System.out.println("Stack is Empty");
			return;
		}
		int x = arr[top1];
		System.out.println("\nPopped element from stack1 is "+x);
		top1--;
		return;
	}
	
	void pop2(){
		if(isEmpty()){
			System.out.println("Stack is Empty");
			return;
		}
		int x = arr[top2];
		System.out.println("\nPopped element from stack2 is "+x);
		top2++;
		return;
	}
	
	void display(){
		if(isEmpty()){
			System.out.println("Stack is Empty");
			return;
		}
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+" ");
		}
	}
	void peek(){
		System.out.println("\n-->top1 index: "+top1+" value: "+arr[top1]);
		System.out.println("\n-->top2 index: "+top2+" value: "+arr[top2]);
	}
	
	public static void main(String[] args){
		twoStackArray s1 = new twoStackArray(10);
		s1.push1(5);
		s1.push2(10);
		s1.push2(15);
		s1.push1(11);
		s1.push2(7);
		s1.push2(40);
		s1.pop1();
		s1.pop2();
		
	}
	

}