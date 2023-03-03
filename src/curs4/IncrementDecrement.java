package curs4;

public class IncrementDecrement {
    public static void main(String[] args) {
        /*num1 + 1
        num1 ++ */

        System.out.println("------------POST------------");
        int num = 10;
        System.out.println("Valoare lui num inainte de increment este:" + num);
        System.out.println("Valoare lui num in post increment este:" + num++);
        System.out.println("Valoare lui num dupa post increment este:" + num);
        /* explicatie: increment adauga 1 la valoare curenta.Difera momentul in care
        este adaugata aceasta valoare, in POST, adaugarea se face dupa executie   */

        System.out.println("------------PRE------------");
        int num2 = 10;
        System.out.println("Valoare lui num inainte de increment este:" + num2);
        System.out.println("Valoare lui num in post increment este:" + ++num2);
        System.out.println("Valoare lui num dupa post increment este:" + num2);

        //pre increment --> ++num
        // post increment --> num++
        // pre decrement --> --num
        // post decrement -> num--

    }
}
