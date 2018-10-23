//Made by Daniel Sabanov
package fahrenheittocelsiusconverter;

import java.util.Scanner;

public class FahrenheitToCelsiusConverter {

    public static void main(String[] args) {
        Scanner fahrenheitInput;
        Scanner celsiusInput;

        double fahrenheit;
        double celsius;
        double fahrenheitToCelsiusOutput;
        double celsiusToFahrenheitOutput;

        fahrenheitInput = new Scanner(System.in);
        System.out.println("Enter a Fahrenheit temperature");
        fahrenheit = fahrenheitInput.nextDouble();

        fahrenheitToCelsiusOutput = (fahrenheit - 32) * 5.0 / 9;
        System.out.println(fahrenheit + "F is eqivalent to " + fahrenheitToCelsiusOutput + "C");

        celsiusInput = new Scanner(System.in);
        System.out.println("Enter a Celsius temperature");
        celsius = celsiusInput.nextDouble();

        celsiusToFahrenheitOutput = celsius * 9 / 5 + 32;
        System.out.println(celsius + "C eqivalent to" + celsiusToFahrenheitOutput + "F");
    }
}
