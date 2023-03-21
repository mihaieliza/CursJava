package curs6.homework;

import java.util.Scanner;

public class InvoiceDiscount {
    public static void main(String[] args) {
        applyDiscount();
        System.out.println("----------------");
        aplicaComision(3500);
        System.out.println("----------------");
        aplicaComision(2000);

    }

    public static void applyDiscount() {
        System.out.print("Enter invoice value: ");
        Scanner scanner = new Scanner(System.in);
        int invoicePrice = scanner.nextInt();
        double discount = (invoicePrice > 100) ? (0.1 * invoicePrice) : (0.05 * invoicePrice);
        double finalPrice = invoicePrice - discount;
        System.out.println("Discount: " + discount);
        System.out.println("Amount to be paid after discount: " + finalPrice);
    }

    public static void aplicaComision(int vanzari){
        double comision;
        if(vanzari > 2500)
            comision = vanzari * 5/100;
        else
            comision = vanzari * 0;
        System.out.println("Comisionul este: " + comision);
    }
}
