package org.launchcode;

import java.util.HashMap;
import java.util.Map;


public class CountingCharacters {

    public static void main(String[] args) {
        String hiddenFigure = "If the product of two terms is zero then common" +
                " sense says at least one of the two terms has to be zero to start " +
                "with. So if you move all the terms over to one side, you can put the" +
                " quadratics into a form that can be factored allowing that" +
                " side of the equation to equal zero. Once you’ve done" +
                " that, it’s pretty straightforward from there.";

        char[] charactersInString = hiddenFigure.toCharArray();

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char character : charactersInString) {
            if (charCount.containsKey(character)) {
                int value = charCount.get(character);
                value++;
                charCount.put(character, value);
            } else {
                charCount.put(character, 1);
            }


        }
            for (Map.Entry<Character, Integer> charEntry : charCount.entrySet()) {
            System.out.println(charEntry.getKey() + " : " + charEntry.getValue());

            }

    }
};

