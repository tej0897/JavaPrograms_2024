package BasicPrograms;

/*

    Factorial Program in Java: Factorial of n is the product of all positive descending integers.
    Factorial of n is denoted by n!.

    For example:
    4! = 4*3*2*1 = 24
    5! = 5*4*3*2*1 = 120

 */

import java.util.Scanner;

public class FactorialProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = 1;
        System.out.println("Enter Number for Factorial: \t");
        int number = scanner.nextInt();

        for (int i=1; i<=number; i++){
            factorial = factorial*i;
        }

        System.out.println("Factorial of "+number+" is : "+factorial);
    }
}
