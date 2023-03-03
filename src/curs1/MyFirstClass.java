package curs1;

public class MyFirstClass {
    /* variabila = o cutie in care salvez ceva, tipul variabilei aloca o anumita bucata
    de memorie
    variabila de instanta, deoarce este pusa la nivelul clasei si
    are nevoie de un obiect al clasei pentru a putea fi utilizata
     */
    String name = "Eliza";
    int age = 23;


    //metoda main - metoda principala de executie
    public static void main(String[] args) {
        MyFirstClass person = new MyFirstClass();
        System.out.println("Salut " + person.name);
        System.out.println("Am " + person.age);

//        variabila locala
        String prenume = "Ioana";
        System.out.println(prenume);
    }
}
