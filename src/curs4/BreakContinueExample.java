package curs4;

public class BreakContinueExample {

    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            if(i == 5)
//                break;  // acesta intrerupe executia
            continue; // face skip la bucla, adica in cazul asta nu mai afiseaza 5 in consola
            System.out.println(i);
        }
    }
}

