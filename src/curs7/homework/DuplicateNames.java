package curs7.homework;

public class DuplicateNames {
    public static void main(String[] args) {
        String[] names = {"Ion", "Maria", "Oana", "Ion", "Monica", "Elis", "Oana"};
        checkDuplicates(names);
    }

    public static void checkDuplicates(String [] names){
        for(int i=0; i<names.length; i++){
            for (int j=i+1; j<names.length; j++){
                if(names[i].equalsIgnoreCase(names[j]))
                    System.out.println("Nume duplicat " + names[i]);
            }
        }
    }
}
