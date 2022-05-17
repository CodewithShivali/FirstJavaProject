package Assignment_01;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		testClass ob1=new testClass();
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();		
		ob1.display(num);
	}
}
interface in1{
	void display(int p);
}
class testClass implements in1{
	int temp;
	public void display(int p) {
		int i=2;
		for(;i<=p/2;i++) {
			if(p%i==0) {
				System.out.println("Not a prime number");
				break;
			}
		}
		if(i>p/2)System.out.println("Prime number");
	}
	
}