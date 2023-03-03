package curs4;

import java.util.Scanner;

public class Greetings {

    public static void main(String[] args) {
        System.out.println("Te rog introdu calificativul: ");
        Scanner scanner = new Scanner(System.in);
        String calificativ = scanner.next();

        switch (calificativ.toUpperCase()) {
            case "A":
                System.out.println("Very good!");
                break;
            case "B":
                System.out.println("Try harder!");
                break;
            case "C":
                System.out.println("Kind of bad");
                break;
            default:
                System.out.println("Please provide only A or B or C!");
        }
    }
}
