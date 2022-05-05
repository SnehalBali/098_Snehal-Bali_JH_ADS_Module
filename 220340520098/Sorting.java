import java.util.Scanner;
class Sorting{
	
	void display(int arr[]){
		int n = arr.length;
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
	}
	
	void insertionSort(int arr[]){
		int n = arr.length;
		for(int i=1;i<n;i++){
			int k = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>k){
				arr[j+1]=arr[j];
				j=j-1;
				for(int l=0;l<n;l++){
			System.out.print(arr[l]+" ");
			}
			System.out.println(" ");
			}
			arr[j+1]=k;
			
		}
	}
	
	public static void main(String[] args){
		Sorting s1 = new Sorting();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		System.out.println("sample inputs: enter 5");
		int n = sc.nextInt();
		System.out.println("Enter the elements of array");
		System.out.println("sample inputs:enter {2 4 6 8 3}");
		int a1[] = new int[n];
		
		for(int i=0;i<n;i++){
			a1[i]=sc.nextInt();
		}
		
		System.out.println("Display the array");
		s1.display(a1);
		System.out.println("Display the sorting method of array");
		s1.insertionSort(a1);
		s1.display(a1);
	
	}
}