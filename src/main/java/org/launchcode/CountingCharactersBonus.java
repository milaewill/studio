package org.launchcode;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CountingCharactersBonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a string to count its characters: ");
        String userString = input.nextLine();

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char[] charactersInString = userString.toUpperCase().toCharArray();

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char character : charactersInString) {
            if (alphabet.indexOf(character) >= 0 ) {

                if (charCount.containsKey(character)) {
                    int value = charCount.get(character);
                    value++;
                    charCount.put(character, value);
                } else {
                    charCount.put(character, 1);
                }
            }


        }
        for (Map.Entry<Character, Integer> charEntry : charCount.entrySet()) {
            System.out.println(charEntry.getKey() + " : " + charEntry.getValue());

        }
    }
}
