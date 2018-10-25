//Made by Daniel Sabanov
package fivedigitscalculator;

import java.util.Scanner;

public class FiveDigitsCalculator {

    public static void main(String[] args) {

        Scanner input;
        int fiveDigits;
        int seperateDigits[] = new int[100000];
        int sum = 0;

        input = new Scanner(System.in);
        System.out.println("Enter a 5-digit positive integer");
        fiveDigits = input.nextInt();

        System.out.print("The sum of the digits is ");

        for (int i = 10000; i >= 1; i = i / 10) {
            seperateDigits[i] = (fiveDigits / i) % 10;
            sum += seperateDigits[i];

            if (i >= 10) {

                System.out.print(seperateDigits[i] + " + ");

            } else {
                System.out.print(seperateDigits[i] + " = " + sum);
            }
        }
        System.out.println("\n");
    }
}
