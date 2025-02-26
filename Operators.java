/*TYPES : 
Unary Operator,
Arithmetic Operator,
Shift Operator,
Relational Operator,
Bitwise Operator,
Logical Operator,
Ternary Operator and
Assignment Operator. */

public class Operators {
    public static void main(String[] args) {
        int x  = 24;
        boolean state1 = true, state2  = false;
        System.out.println("X : " + x++);
        System.out.println("X : " + x);
        System.out.println("X : " + ++x);
        System.out.println("X : " + x++ + ++x);
        System.out.println("X : " + ~x );
        System.out.println("B : " + !state1);

        int a = 20;
        int b = 3;

        System.out.println("Addition: a + b = " + (a + b));
        System.out.println("Subtraction: a - b = " + (a - b));
        System.out.println("Multiplication: a * b = " + (a * b));
        System.out.println("Division: a / b = " + (a / b));
        System.out.println("Modulus: a % b = " + (a % b));
        System.out.println("Mixed : " + (10*10/5+3-1*4/2));  

        int num = -8; // Binary: 11111111 11111111 11111111 11111000 (in 32-bit representation)
        
        System.out.println("Original: " + num);
        System.out.println("Signed Right Shift (>> 2): " + (num >> 2));//divisible by 2^n 
        System.out.println("Signed Right Shift (<< 2): " + (num << 2)); //multiply by 2^n
        System.out.println("Unsigned Right Shift (>>> 2): " + (num >>> 2)); 

        System.out.println("Logical AND (state1 && state2): " + (state1 && state2)); // false
        System.out.println("Logical OR (state1 || state2): " + (state1 || state2));   // true

        
        int c = 5;  
        int d = 3;  

        System.out.println("Bitwise AND (a & b): " + (c & d)); // 0101 & 0011 = 0001 (1)
        System.out.println("Bitwise OR (a | b): " + (c | d));  // 0101 | 0011 = 0111 (7)
        
}}      




    