package curs4;

import java.util.Scanner;

public class SwitchExample {
    int number1;
    int number2;
    String operation;
    int result;

    public void printResult(){
        System.out.println(number1 + " " + operation + " " + number2 + "=" + " " + result);
    }

    public void askUserForNumber(){
        System.out.println("Provide number1: ");
        Scanner scan = new Scanner(System.in); // citim de la tastatura
        number1 = scan.nextInt();
        System.out.println("Provide number2: ");
        number2 = scan.nextInt();
        System.out.println("Provide operation: ");
        operation = scan.next();
    }

   public void calculate(){
        askUserForNumber();
       switch (operation){
           case "+":
               result = number1+number2;
               printResult();
               break;
           case "-":
               result = number1 - number2;
               printResult();
               break;
           case "*":
               result = number1*number2;
               printResult();
               break;
           default:
               System.out.println("Wrong operation");
       }
   }
}
