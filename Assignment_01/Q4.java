package Assignment_01;

public class Q4 {

	public static void main(String[] args) {
		ClassThree ob1=new ClassThree(1);
		ClassThree ob2=new ClassThree();
	}
}
class ClassOne{
	ClassOne(int x){
		System.out.println("ClassOne");
	}
}
class ClassTwo extends ClassOne{
	ClassTwo(){
		super(1);
		System.out.println("Second Default constructor");
	}
}
class ClassThree extends ClassTwo{
	ClassThree(){
		System.out.println("ClassThird");
	}
	ClassThree(int x){
		System.out.println("Third default constructor");
	}
}
