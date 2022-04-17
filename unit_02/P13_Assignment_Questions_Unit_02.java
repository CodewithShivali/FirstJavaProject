package unit_02;

public class P13_Assignment_Questions_Unit_02 {
    public static void main(String[] args) {
        Assignment_Questions_Unit_02 obj = new Assignment_Questions_Unit_02();
        obj.abstractClassCall();
        obj.overloadingAndOverriding();
        obj.accessProtectionInJava();
        obj.InterfaceImplementation();
    }
}

class Assignment_Questions_Unit_02 {
    void abstractClassCall() {
        Sample3 obj = new Sample3();
        obj.run();
    }

    void overloadingAndOverriding() {
        Sample3 obj = new Sample3();
        obj.run();
        obj.run(1);
        obj.run(1, 2);
        obj.display();
    }

    void accessProtectionInJava() {
        Sample3 obj = new Sample3();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        obj.showdata();
        obj.display();
    }

    void InterfaceImplementation() {
        Sample3 obj = new Sample3();
        obj.display1();
        obj.display2();
    }
}

abstract class Sample2 {
    int a = 10;
    public int b = 20;
    protected int c = 30;
    private int d = 40;

    void showdata() {
        System.out.println("Inside Sample2 ParentClass");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        System.out.println("d=" + d);
    }

    public void display() {
        System.out.println("This is a dsiplay method inside abstract class Sample2");
    }

    abstract public void run();
}

class Sample3 extends Sample2 implements A3, B3 {
    public void display() {
        System.out.println("Inside ChildClass");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        // System.out.println("d="+d);
    }

    public void display1() {
        System.out.println("this is a display1 method in child class Sample3 from interface");
    }

    public void display2() {
        System.out.println("This is a display method in child class Sample3 from Interface");
    }

    public void run() {
        System.out.println("this is a run method from abstract class Sample2");
    }

    public void run(int x) {
        System.out.println("This is a run overloaded method in Sample3 ");
    }

    public void run(int x, int y) {
        System.out.println("this is a run overloaded method in Sample3! ");
    }
}

interface A3 {
    public void display1();
}

interface B3 {

    public void display2();
}