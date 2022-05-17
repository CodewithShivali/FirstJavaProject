package Assignment_01;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		Student s5=new Student();
		Student s6=new Student();
		Student.avg();
	}

}
class Student{
	float per;
	String name,sec;
	int age;
	static int st=0;
	static float total=0; 
	Student(){
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter Name,Sec,Age and percentage");
		name=sc.nextLine();
		sec=sc.nextLine();
		age=sc.nextInt();
		per=sc.nextFloat();
		st++;total+=per;
	}
	static void avg() {
		System.out.println("Average percent of Section A - "+total/st);
	}
}
