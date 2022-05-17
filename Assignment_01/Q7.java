package Assignment_01;

public class Q7 {

	public static void main(String[] args) {
		Temp t=new Temp();
		Temp t1=new Temp();
		Temp t2=new Temp();
		t.fun();t1.fun();t2.fun();
		Temp.display();
	}
}
class Temp{
	static int c=0,fc=0;
	Temp(){
		c++;
	}
	void fun() {
		fc++;
	}
	static void display() {
		System.out.println("Objects created - "+c);
		System.out.print("Function called - "+fc);
	}
}
