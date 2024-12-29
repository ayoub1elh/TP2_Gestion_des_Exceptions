package Exercice1;

public class Main {
    public static void main(String[] args) {
        try {
            EntierNaturel e1 = new EntierNaturel(5);
            System.out.println("Valeur de e1: " + e1.getVal());

            e1.setVal(0);
            System.out.println("Nouvelle valeur de e1: " + e1.getVal());

            e1.decrementer();
            System.out.println("Valeur décrémentée de e1: " + e1.getVal());

            // Tentative de créer un Exercice1.EntierNaturel avec une valeur négative
            EntierNaturel e2 = new EntierNaturel(-3);
        } catch (NombreNegatifException e) {
            System.out.println("Exception: Valeur négative détectée: " + e.getValeurErronee());
        }
    }
}
