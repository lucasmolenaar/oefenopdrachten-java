package nl.novi.opdrachten.methodes;

import java.util.ArrayList;
import java.util.List;

/**
 * Gegeven: een lijst met namen zonder hoofdletters van klanten.
 * Opdracht: Een luie stagiair heeft alle klanten in het systeem gezet, maar deze kon de Shift-knop niet vinden.
 * Het is aan jou om alle namen van een hoofdletter aan het begin te voorzien. Maak een methode die een List als
 * parameter ontvangt en de inhoud vervolgens van hoofdletters voorziet.
 *
 * Bonus 1: Zorg ervoor dat tussenvoegsels geen hoofdletter krijgen.
 * Bonus 2: Zorg ervoor dat de eerste letter na een '-' wel een hoofdletter krijgt.
 *
 *
 */

public class Hoofdletters {

    public static void main(String[] args) {
        List<String> curstomerNames = new ArrayList<>();

        curstomerNames.add("nick piraat");
        curstomerNames.add("michael jackson");
        curstomerNames.add("glennis grace");
        curstomerNames.add("dreetje hazes");
        curstomerNames.add("robbie williams");
        curstomerNames.add("michiel de ruyter");
        curstomerNames.add("sjaak polak");
        curstomerNames.add("jan van jansen");
        curstomerNames.add("henk den hartog");
        curstomerNames.add("mo el-mecky");
        curstomerNames.add("fredje kadetje");

        capitilize(curstomerNames);
    }

    public static void capitilize(List<String> customerNames) {
        for (String person : customerNames) {
            String[] parts = person.split(" ");

//            if (parts.length > 2) {
//                String firstLetterFirstName = parts[0].substring(0,1);
//                String firstLetterLastName = parts[parts.length - 1].substring(0,1);
//            }

            for (String part : parts) {
                String firstLetter = part.substring(0,1);
                String restOfWord = part.substring(1);
                System.out.print(firstLetter.toUpperCase() + restOfWord + " " );
            }

            System.out.println(); // 1 regel naar beneden in de console
        }
    }
}
