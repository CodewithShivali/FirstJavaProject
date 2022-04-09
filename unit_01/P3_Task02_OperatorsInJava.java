package unit_01;

public class P3_Task02_OperatorsInJava {
	public static void main(String[] args) {
		// Unary Operators
		System.out.println("Unary Operators");
		int a = 10;
		System.out.println(++a); // Compiler first add 1 then use it
		System.out.println(--a); // Compiler first subtract 1 then use it
		
		System.out.println(a++); // Compiler first use the value then adds 1 to it
		System.out.println(a--); // Compiler first use the value then subtract 1 from it
		System.out.println(a);
		
		// Arithmetic Operator
		System.out.println("\nArithmetic Operators");
		int b = 20;
		System.out.println(b+1);
		System.out.println(b-5);
		System.out.println(b*2);
		System.out.println(b/5);
		System.out.println(b%2);
		
		// Shift Operators
		// First it convert the number into binary then shift the bits accordingly
		System.out.println("\nShift Operators");
		int c = 8;
		System.out.println("Normal number : " + c);
		System.out.println("Right shift (1bit) : " + (c>>1));
		System.out.println("Left shift (1bit) : " + (c<<1));
		
		// Relational Operators
		System.out.println(10 < 5);
		System.out.println(10 > 5);
		System.out.println(10 <= 5);
		System.out.println(10 >= 5);
		System.out.println(2 == 2);
		System.out.println(3 != 4);
		
		// Bitwise Operators
		System.out.println("\nBitwise Operators");
		System.out.println(2 & 1);
		System.out.println(2 | 3);
		System.out.println(1 ^ 3);
		
		// Logical Operators
		System.out.println(2>1 && 1<3);
		System.out.println(3>5 || 5<9);
		
		// Ternary Operators
		System.out.println("\nTernary Operators");
		int num = (2 < 5) ? 10 : 20;
		System.out.println(num);
		
		// Assignment Operators
		System.out.println("\nAssignment Operators");
		int a1 = 10;
		a1 += 1; // a = a+1;
		System.out.println(a1);
		a1 -= 2; // a = a-2;
		System.out.println(a1);
		a1 *= 2; // a = a*2;
		System.out.println(a1);
		a1 /= 2; // a = a/2;
		System.out.println(a1);
		a1 &= 1;
		System.out.println(a1);
		a1 ^= 1;
		System.out.println(a1);
		a1 |= 1;
		System.out.println(a1);
		a1 <<= 1;
		System.out.println(a1);
		
	}
}