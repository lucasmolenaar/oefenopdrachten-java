package nl.novi.practise;

import java.util.ArrayList;
import java.util.List;

public class SubstringMain {
    public static void main(String[] args) {

        List<String> people = new ArrayList<>();

        people.add("piet piraat");
        people.add("frans duits engels");
        people.add("andre-hazes");

        capitilize(people);

    }

    public static void capitilize(List<String> people) {
        for (String person : people) {
            String[] parts = person.split(" ");

            for (String part : parts) {
                String firstLetter = part.substring(0,1);
                String restOfWord = part.substring(1);
                System.out.print(firstLetter.toUpperCase() + restOfWord + " " );
            }

            System.out.println(); // 1 regel naar beneden in de console
        }
    }
}
