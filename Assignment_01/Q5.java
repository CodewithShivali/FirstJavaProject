package Assignment_01;

import java.util.Scanner;
import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {
		Employee objs[]=new Employee[8];
		for(int i=0;i<3;i++)
			objs[i]=new Employee();
		Employee.display();
	}
}
class Employee{
	static String depArr[]=new String[100];
	static float salArr[]=new float[100];
	String name,dep;
	int age;
	float sal;
	Employee(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name,department,age and salary");
		name=sc.next();
		dep=sc.next();
		age=sc.nextInt();
		sal=sc.nextFloat();
		if(sal>30000)sal=25000;
		for(int i=0;i<100;i++) {
			if(dep.equals(depArr[i])) {	
				salArr[i]+=sal;break;
			}else if(depArr[i]==null) {
				depArr[i]=dep;
				salArr[i]+=sal;break;
			}
		}
	}
	static void display() {
		int i=0;
		while(i<100 && depArr[i]!=null) {
			System.out.println(depArr[i]+" - "+salArr[i++]);
		}
	}
}