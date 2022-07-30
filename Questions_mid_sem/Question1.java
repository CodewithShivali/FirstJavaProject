package Questions_Mid_Sem;

import java.util.Scanner;
class student {

    String name;
    int age;
    int rollNo;


   //parameterized constructor
    student (String name,int age)
    {
        this.name = name;
        this.age = age;
    }

    //Constructor chaining
    student(String name,int age,int rollNo)
    {
        this(name,age);
        this.rollNo = rollNo;
    }

    void display()
    {
        System.out.println(name + " "+ age+ " " +rollNo);
    }
    public static void main(String[]args)
    {

        Scanner scn = new Scanner(System.in);
        String name;
        int rollNo;
        int age;

        System.out.println("Enter the size class");
        int n=scn.nextInt();
        student s1[]=new student[n];
        for(int i=0;i< n;++i)
        {
            System.out.println("Enter the name");
            name = scn.next();

            System.out.println("Enter the rollnumber");
            rollNo = scn.nextInt();

            System.out.println("Enter the age");
            age = scn.nextInt();
              s1[i] = new student(name, age, rollNo);


        }

        for (int i=0;i<n;i++){
            s1[i].display();

        }
    }
}