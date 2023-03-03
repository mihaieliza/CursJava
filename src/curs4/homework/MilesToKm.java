package curs4.homework;

import java.util.Scanner;

public class MilesToKm {

    /* Scrieti un program care sa converteasca mile in km si invers.
        Formula de transformare este 1 mila = 1.6 km  */

    public static void main(String[] args) throws IllegalArgumentException {
        System.out.print("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        System.out.print("Please choose between mila/km: ");
        Scanner scan = new Scanner(System.in);
        String type = scanner.next();
        float result = 0;

        switch (type) {
            case "mila":
                result = (float) (number * 1.6);
                System.out.println(number + " mile " + " = " + result + " km");
                break;
            case "km":
                result = (float) (number / 1.6);
                System.out.println(number + " km " + " = " + result + " mile");
                break;
            default:
            throw new IllegalArgumentException("Please provide mile or km!");
        }
    }
}
