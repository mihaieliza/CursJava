package curs6.homework;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        login();
    }

    public static void login() {
        String user;
        String password;
        int counter = 0;
        do {
            System.out.print("Enter a user: ");
            Scanner scanner = new Scanner(System.in);
            user = scanner.next();
            System.out.print("Enter a password: ");
            password = scanner.next();
            System.out.println("Login Error");
            counter++;
        } while (!(user.equals("Test") && password.equals("1234")) && counter < 3);

        if (user.equals("Test") && password.equals("1234")) {
            System.out.println("Login successful");
        } else if (counter == 3) {
            System.out.println("Maximum attempts reached. User blocked!");
        }
    }
}
