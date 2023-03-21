package curs6.homework;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        login();
    }

    public static void login() {
        int counter = 0;
        do {
            System.out.print("Enter a user: ");
            Scanner scanner = new Scanner(System.in);
            String user = scanner.next();
            System.out.print("Enter a password: ");
            String password = scanner.next();
            counter++;
            if (user.equals("Test") && password.equals("1234")) {
                System.out.println("Login successful");
                break;
            } else if (counter == 3) {
                System.out.println("Maximum attempts reached. User blocked!");
                break;
            } else
                System.out.println("Login Error");
        } while (counter < 3);
    }
}