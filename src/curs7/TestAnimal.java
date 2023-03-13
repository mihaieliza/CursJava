package curs7;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        System.out.println("----------------------------");
        Deer bambi = new Deer();
        bambi.makeSound();
        bambi.eatGrass();
        System.out.println("----------------------------");
        Lion lion = new Lion();
        lion.makeSound();
        lion.eatMeat();
        System.out.println("----------------------------");
        Animal leu = new Lion();
        leu.makeSound(); // merge fiindca o gaseste in ambele clase si o suprascrie
//        leu.eatMeat - eroare -> nu va aduce metoda eatMeat din Lion pt ca nu exista in Animal
        System.out.println("----------------------------");
        feedAnimal(leu);
        feedAnimal(bambi);

/*       override Java isi da seama ce metode sa ruleze pe baza instantei clasei respective
         daca metoda din instanta nu exista, atunci se va rula metoda din clasa parinte
         Cand 2 metode se numesc la fel una in clasa parinte si una in clasa copil, Java
         va alege metoda pe care sa o execute in functie de instanta
         override = suprascrierea unei metode

         overload - supraincarcarea metodei pastreaza functionalitatea si pastreaza numai params
         pe cand in override se schimba functionalitatea
         (makeSound deer vs makeSound lion = funcionalitati diferite / mesaje diferite)

         @Override - annotare specifica java, obiect specific din java si are rolul de decorator
 */
    }

    public static void feedAnimal(Animal object) {
        if (object instanceof Lion) {
            System.out.println("You are geting steak!");
        } else if (object instanceof Deer) {
            System.out.println("You are getting salad!");
        } else
            System.out.println("You are not getting anything!");
    }
}
