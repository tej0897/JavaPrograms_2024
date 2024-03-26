package BasicPrograms;

/*

Prime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words, prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.

Note: 0 and 1 are not prime numbers. The 2 is the only even prime number because all the other even numbers can be divided by 2.

 */

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        int flag=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prime Number Checker \n Enter Number: \t");
        int number = scanner.nextInt();
        int half = number/2;
        if (number==0 || number==1){
            System.out.println(number +" is not a Prime Number");
        } else{
            for (int i=2; i<half; i++){
                if (number%i==0){
                    System.out.println(number +" is not a Prime Number");
                    flag=1;
                    break;
                }
            }
            if (flag==0){
                System.out.println(number + " is a Prime Number");
            }
        }
    }

}
