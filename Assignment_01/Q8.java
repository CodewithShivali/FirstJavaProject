package Assignment_01;

public class Q8 {
	public static void main(String []args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		for(int i=3;i<8;i++) {
			arr[i]=arr[i+1];
		}
		arr[8]=0;
		System.out.println("After removing 3rd index");
		for(int i=0;i<9;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
