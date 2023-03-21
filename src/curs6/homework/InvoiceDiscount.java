package curs6.homework;

import java.util.Scanner;

public class InvoiceDiscount {
    public static void main(String[] args) {
        applyDiscount();
    }

    public static void applyDiscount() {
        System.out.print("Enter invoice value: ");
        Scanner scanner = new Scanner(System.in);
        int invoicePrice = scanner.nextInt();
        double discount = (invoicePrice > 100) ? (0.1 * invoicePrice) : (0.05 * invoicePrice);
        double finalPrice = invoicePrice - discount;
        System.out.println("Discount: " + discount);
        System.out.println("Amount to be paied after discount: " + finalPrice);
    }
}
