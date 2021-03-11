package nl.novi.opdrachten.methodes;

/**
 * Schrijf een methode die een Integer ontvangt.
 * Wanneer het getal deelbaar is door 5, laat hem de volgende tekst returnen:
 * 'deelbaar door vijf'
 * Wanneer het getal niet deelbaar is door vijf:
 * 'ondeelbaar door vijf'
 */
public class DeelbaarDoorVijf {

    public static void main(String[] sammieKijkOmhoog) {
        int chosenNumber = 45;
        deelbaarDoorVijf(chosenNumber);
    }

    public static void deelbaarDoorVijf(int number) {
        if (number % 5 == 0) {
            System.out.println("Dit getal is deelbaar door vijf");
        } else {
            System.out.println("Dit getal is ondeelbaar door vijf");
        }
    }
}
