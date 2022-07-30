package Unit_03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P14_ExceptionHandling {

    public static void main(String[] args) { Scanner Scan = new Scanner(System.in);

        ABC5 obj = new ABC5();

        obj.basicException(); obj.handleException(); obj.multipleCatch(); obj.inputMismatchException();

        obj.indexOutOfBoundException(); obj.nullPointerException();

        obj.useOfThrows_And_Finally(); obj.checkedAndUncheckedException();

    }
}

class ABC5 {

    void basicException() {
        try {
            int b = 0;
            int a = 100 / b;
        } catch (ArithmeticException e) { System.out.println(e.getMessage());
        }
        System.out.println("Done");

    }

    void handleException() {

        try {

            int b = 0;
            int a = 100 / b; System.out.println(a);
        }


        catch (ArithmeticException e) {

            System.out.println("kahddeuggdcbjguyxgxqui"); System.out.println(e.getMessage());
        }

    }

    void multipleCatch() {


        try {

            int b = 0;
            int a = 100 / b; System.out.println(a);
        }

        catch (ArithmeticException e) {

            System.out.println("kahddeuggdcbjguyxgxqui"); System.out.println(e.getMessage());
        } catch (Exception e) { System.out.println("kahddeuggdcbjguyxgxqui"); System.out.println(e.getMessage());
        }

    }

    void inputMismatchException() {


        try {


            Scanner scan = new Scanner(System.in); System.out.println("Enter A Number -> "); int number = scan.nextInt();
            System.out.println("You Have Entered -> " + number); scan.close();

        } catch (InputMismatchException e) { System.out.println("Input Mismatch Issue");
        }
        System.out.println("Done");

    }

    void stackOverFlowError(int i) {


        try {


            while (i > 0) { i++;
                stackOverFlowError(i);

            }
        } catch (Exception e) { System.out.println(e.getMessage());
        }
// Rest of the code System.out.println("Done!");

    }

    void indexOutOfBoundException() {


        try {


            int[] myNumbers = { 1, 2, 3 }; System.out.println(myNumbers[10]);

        } catch (Exception e) { System.out.println("Something Went Wrong!:(");
        }

        finally {

            System.out.println("The 'Try and Catch' block is finished");
        }
    }

    void nullPointerException() {


        try {


            String s = null; System.out.println(s.length());

        } catch (NullPointerException e) { System.out.println(e.getMessage());
        }

    }

    void useOfThrow(int age) throws Exception {

        if (age > 18) {
            throw new Exception();
        } else {
            System.out.println("You are allowed to Enter:)");
        }

    }

    void useOfThrows_And_Finally() {
        try {
            useOfThrow(18);
        } catch (Exception e) { e.printStackTrace();
        }
    }

    void checkedAndUncheckedException() {

    }

}
