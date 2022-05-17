package Assignment_01;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		int arr[][]=new int[4][4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++) {
			System.out.println("Enter data for city "+(i+1));
			for(int j=0;j<4;j++) {
				System.out.println("Enter data for model "+(j+1));
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<4;i++) {
			int sum=0;
			for(int j=0;j<4;j++) {
				sum+=arr[i][j];
			}
			System.out.println("Total cars sold in city"+i+1+" - "+sum);
		}
	}

}
