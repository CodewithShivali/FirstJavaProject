/*
* Apply following functions on the String "Java".
(i) Try to concat "Welcome" and write down your observation.
(ii) Find character at index 1
(iii) Find index of first 'a'.
(iv) Find index of second 'a'
(v) Compare "Java" to "JAVA"
(vi) Compare "Java" to "JAVA" ignoring the case
(vii) Find the index of first 'a' from last

* */

package Questions_Mid_Sem;

public class Appliying_Functions_String {

public static void main(String[]args)
{
    String s1 = "Java";
    String s2 = "C++";
    String s3 = "Python";
    String s4 = "Kotlin";
    String s5 = "PHP";

    //Concat
    System.out.println(s1.concat(" Welcome"));

    //Character at indedx 1st
    System.out.println(s1.charAt(1));

    //Index of first a
    System.out.println(s2.indexOf("Java"));

    //Index at 2nd a's
    System.out.println(s1.indexOf('a',s1.indexOf('a')+1));

    //Comparing
    System.out.println(s1.equals(s2));

    //Comparing ignoring the cases
    System.out.println(s1.equalsIgnoreCase(s4));
}

}
