package curs6;

public class TernaryOperator {

    public static void main(String[] args) {
        ternaryOperation(20, 50);
        System.out.println("---------------------");
        ternaryOperation(70,15);
    }

    public static void ternaryOperation(int num1, int num2) {
        int result = (num1 > num2) ? (num1 + num2) : (num2 - num1);
        System.out.println("The result is: " + result);

/*        if (num1 > num2)
            result = num1 + num2;
          else
           result = num2 - num1;
 */
    }
}
