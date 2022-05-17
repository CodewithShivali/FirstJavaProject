package Assignment_01;

import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		int result=a>b?sum(a,b):sub(a,b);
		System.out.println("result - "+result);
	}
	static int sum(int a,int b) {return a+b;}
	static int sub(int a,int b) {
		return a-b<0?0:a-b;
	}
}
