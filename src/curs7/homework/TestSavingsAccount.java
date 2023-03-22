package curs7.homework;

import java.util.Scanner;

public class TestSavingsAccount {
    public static void main(String[] args) {
        Customer customer = new Customer("Maria", "Bucuresti", "test@test.com");
        SavingsAccount account = new SavingsAccount(12345678,20,customer);

        System.out.println("Hi " + customer.getName());
        System.out.print("Please enter the amount to withdraw: ");
        Scanner scanner = new Scanner(System.in);
        double amountToWithdraw = scanner.nextDouble();
        try{
            account.withdrawMoney(amountToWithdraw);
        } catch (InsuficientFundsException e) {
            System.out.println("The amount you entered is greater than the available balance: "
                    + account.getBalance());
            System.out.println("Thank you for using our ATM!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
