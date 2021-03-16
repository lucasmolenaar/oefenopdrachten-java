package nl.novi.opdrachten.methodes;

import java.util.ArrayList;
import java.util.List;

/**
 * Schrijf een methode  die een List<Integer> ontvangt.
 *
 * Wanneer er twee getallen of meer in zijn:
 * Return het volgende:
 * "Het hoogste getal van de gegeven getallen is: %GETAL%"
 *
 * Je mag hier geen Collections.sort of java.streams gebruiken.
 *
 */
public class HoogsteGetalAbstract {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(60);
        numbers.add(35);
        numbers.add(2);
        numbers.add(45);
        numbers.add(320);
        numbers.add(5);

        System.out.println("Array Before Sorting");
        for(int i=0; i < numbers.size(); i++){
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();

        sortNumbers(numbers);//sorting array elements using bubble sort

        System.out.println("Array After Sorting");
        for(int i=0; i < numbers.size(); i++){
            System.out.print(numbers.get(i) + " ");
        }
    }

    public static void sortNumbers(List<Integer> numbers) {
        int temp = 0;
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 1; j < (numbers.size() - i); j++) {
                if (numbers.get(j - 1) > numbers.get(j)) {
                    // Swap element
                    temp = numbers.get(j-1);                    //
                    numbers.get(j - 1) = numbers.get(j);       // HIER ZIT ERGENS EEN ERROR
                    numbers.get(j) = temp;                     //
                }
            }
        }
    }
}
