package Questions_Mid_Sem;

import java.util.Scanner;

public class Re_write {
    String name;
    int rollNo;
    static String universityName = "Graphic era university";


    void set(String name,int rollNo)
    {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display()
    {
        System.out.println("Name : "+name+ ", roll number : "+rollNo + ", university Name : "+universityName);
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        Re_write student = new Re_write();


        System.out.println("Enter the name ");
        String name = scn.nextLine();

        System.out.println("Enter the roll-no ");
        int rollNo = scn.nextInt();

        student.set(name,rollNo);
        student.display();
    }
}
