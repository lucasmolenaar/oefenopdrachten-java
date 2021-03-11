package nl.novi.opdrachten.lijsten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOefening {

    public static void main(String[] uitlegList) {

        //We hebben een list die de namen van voetbalclubs bevat
        List<String> clubNames = new ArrayList<>();
        //Die vullen we alvast voor de opdracht
        clubNames.add("Ajax");
        clubNames.add("PSV");
        clubNames.add("Feyenoord");
        clubNames.add("Fc Utrecht");
        clubNames.add("Fc Groningen");
        clubNames.add("FC Twente");

        // Vraag -1: Maak een methode die als taak heeft om de list per regel uit te printen.
        //printList(clubNames);


        // Vraag 0: Maak een methode die als taak heeft om de list uit te printen: positie + inhoud.
        // Bovenstaande list zou dan dit zijn:
        // 0 - Ajax
        // 1 - PSv
        // etc...

        // Vraag 1: Maak een methode die checkt of een club al in de lijst zit en voeg deze anders toe.
        addClub(clubNames, "AZ");
        //printList(clubNames);

        // Vraag 2: Maak een methode die de positie van de club in de lijst teruggeeft.
        //givePosition(clubNames, "Fc Utrecht");

        // Vraag 3: Maak een methode die de lijst alfabetisch sorteert. Wanneer Ajax niet op positie 1 staat, moeten de
        // clubs die voor Ajax staan verwijderd worden.
        // We voegen nog wat clubs toe om de code te kunnen testen.
        clubNames.add("AA Aachen");
        clubNames.add("AFC Amsterdam");
        clubNames.add("AFC");

        sortList(clubNames);


        // Vraag 4: Kun je hetzelfde doen als hierboven, maar PSV moet dan laatste zijn.
        clubNames.add("Zlotty FC");
        clubNames.add("SC Eindhoven");



    }

    public static void printList(List<String> clubNames) {
        for (int i = 0; i < clubNames.size(); i++) {
            System.out.println(clubNames.get(i));
        }
    }

    public static void addClub(List<String> clubNames,String newClub) {
        if (!clubNames.contains(newClub)) {
            clubNames.add(newClub);
        } else {
            System.out.println("\n Je probeert " + newClub + " toe te voegen, maar deze staat al in de lijst");
        }
    }

    public static void givePosition(List<String> clubNames, String clubName) {
        if (clubNames.contains(clubName)) {
            int positionOfClub = clubNames.indexOf(clubName);
            System.out.println("De club waar je naar zoekt, staat op positie " + positionOfClub + " in de lijst");
        } else {
            System.out.println("De club waar je naar zoekt, staat niet in de lijst");
        }
    }

    public static void sortList(List<String> clubNames) {
        //Sorteren van de clubs in de ArrayList
        Collections.sort(clubNames);

        //Ervoor zorgen dat alles vóór Ajax verwijderd wordt
        String ajax;
        for (int i = 0; i < clubNames.size(); i++) {
            // Snap ik niet
        }

        // Uitprinten van de clubs
        for (int i = 0; i < clubNames.size(); i++) {
            System.out.println(clubNames.get(i));
        }
    }


}
