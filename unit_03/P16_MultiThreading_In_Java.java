package Unit_03;

import java.util.Scanner;

public class P16_MultiThreading_In_Java {

    public static void main(String[] args) {

        Thread t1 = new Thread(new T1(), "T1"); Thread t2 = new Thread(new T2(), "T2"); Thread t3 = new Thread(new T3(), "T3"); t1.start();
        t2.start();
        t3.start();
    }

}

class A1 {
    void show1() {
        Scanner obj = new Scanner(System.in); int a = obj.nextInt(); System.out.println(a); System.out.println("\n Done"); obj.close();

    }
}

class A2{
    void show2() {
        for(int i = 0 ; i < 10 ; i++) { System.out.println( i + "HEYY!");
        }
    }
}


class P1 extends Thread{

    public void run() {
        Scanner obj = new Scanner(System.in); int a = obj.nextInt(); System.out.println(a); System.out.println("\n Done with T1 "); obj.close();
    }
}

class P2 extends Thread{
    public void run() {
        for(int i = 0 ; i < 10 ; i++) { System.out.println( i + " HEYY!");
        }
    }
}

class P3 extends Thread{

    public void run() {
        for(int i = 0 ; i < 10 ; i++) { System.out.println( i + " HEYY2!");
        }
    }
}
class ABC3 {
    void threadConcept() {

    }

    void threadSynchronization() {
    }

    void interThreadCommunication() {

    }

    void ProducerConsumerProblems() {

    }

    void Wait_And_Notify() {

    }

}

