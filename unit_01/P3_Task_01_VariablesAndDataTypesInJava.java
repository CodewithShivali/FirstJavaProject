package unit_01;
/* 	Types of variables:
-In java,there are three types of variables:

# Local Variables- declared nside the body of a method

# Instance Variables-Instance variables are defined without the static Keyword,
-They are defined outside a method declaration.
-They are Object specific and are known as instance variables.

# Static Variables-
-static variables are defined with the static keyword
-Static variables are initialized only once,at the start of the program execution.
-These static variables should be initialized first,before the initialization of any instance variable 	
 */
public class P3_Task_01_VariablesAndDataTypesInJava {
static int q=11;
int p=10;

public static void main(String[] args) {
//Valid Declaration
int b,c;
float pi;
double d;
char e;
int a=5; //Local Variable
System.out.println("This is Dislay Method!");
System.out.println(a);

}
void typeConversionAndTypeCasting() {
/*
*double f; //8bytes =64bits/slots int i =10; // 4bytes =32 bits/ 
* = i;//Type Conversion System.out.println(f);
* 
*double g = 10; //64 int j; //32 j =(int)g;
*/
double f;//64 slots
int i =10;//32 slots
f=i;//Type Conversion
System.out.println(f);

double g =10;//64
int j;//32
j=(int)g; // Type Casting
//32 bits =64 bits
System.out.println(i);
System.out.println(j);
}
}