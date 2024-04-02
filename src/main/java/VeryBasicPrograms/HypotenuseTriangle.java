package VeryBasicPrograms;

import java.util.Scanner;

public class HypotenuseTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side A of triangle: \t");
        double sideA = scanner.nextDouble();
        System.out.println("Enter side B of triangle: \t");
        double sideB = scanner.nextDouble();

        double result = Math.sqrt((sideA*sideA)+(sideB*sideB));

        System.out.println("The Hypotenuse is: "+result);
        scanner.close();

    }
}
