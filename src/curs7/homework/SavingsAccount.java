package curs7.homework;

public class SavingsAccount extends Account {

    public SavingsAccount(int accountNumber, double balance, Customer accountOwner) {
        super(accountNumber, balance, accountOwner);
    }

    @Override
    public double withdrawMoney(double sum) throws InsuficientFundsException {
        double endBalance;
        if (sum <= balance) {
            endBalance = balance - sum;
            System.out.println("Please pick your money!");
            System.out.println("Your balance is: " + endBalance);
            System.out.println("Thank you for using our ATM!");
        } else
            throw new InsuficientFundsException(Finals.INSUFFICIENT_FUNDS_EXCEPION);
        return endBalance;
    }
}