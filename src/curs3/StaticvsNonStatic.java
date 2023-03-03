package curs3;

public class StaticvsNonStatic {

    public String nume = "Jhonny"; // var de instanta

    public String printeazaNume() { //metoda de instanta
        return "Hello " + prenume;
    }

    public static String prenume = "Bravo"; // var de instanta

    public static String printeazaMsgStatic(){
        return "Hello static " + prenume; //am voie sa apelez numai var statice
    }


//     JVM executa inainte partea static si apoi partea de instanta de aceea nu se pot
//    apela var de instanta in metode statice
//    metodele si var de instanta se apeleaza prin intermediul unui obiect al clasei
//    metodele si var statice se apeleaza in afara clasei in care a fost definit cu ajutorul
//    numelui clasei, de exemplu StaticvsNonStatic. prenume; StaticvsNonStatic.printeazaMsgStatic

    public static void main(String[] args) {
        StaticvsNonStatic obiect = new StaticvsNonStatic();
        System.out.println(obiect.nume);
        System.out.println(obiect.printeazaNume());
        System.out.println(prenume);
        System.out.println(printeazaMsgStatic());

    }
}
