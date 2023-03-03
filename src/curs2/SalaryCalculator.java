package curs2;

public class SalaryCalculator {

    int numberOfHours = 40;

    public static void main(String[] args) {
        Tester tester1 = new Tester();
        tester1.setName("Oana");
        tester1.setRatePerHour(30);
        System.out.println(tester1.getName());

        Tester tester2 = new Tester();
        tester2.setName("Maria");
        tester2.setRatePerHour(25);
        System.out.println(tester2.getName());

        SalaryCalculator salaryCalculator = new SalaryCalculator();
        System.out.println("Tester1's salary is:" +
                salaryCalculator.calculeSalary(tester1.getRatePerHour()));
        System.out.println("Tester2's salary is:" +
                salaryCalculator.calculeSalary(tester2.getRatePerHour()));
    }

    public int calculeSalary(int payPerHour){
        int salary = numberOfHours * payPerHour;
        return salary;
    }
}
