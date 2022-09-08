package curs1;

public class MyFirstClass {
    String name = "Eliza"; // variabila de instanta, deoarce este pusa la nivelul clasei
    int age = 23;


    public static void main(String[] args) {
        MyFirstClass person = new MyFirstClass();
        System.out.println("Salut " + person.name);
        System.out.println("Am " + person.age);
    }
}
