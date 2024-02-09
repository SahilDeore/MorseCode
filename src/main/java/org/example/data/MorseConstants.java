package org.example.data;

import java.util.HashMap;
import java.util.Map;

public class MorseConstants {
    private static final Map<Character, String> MORSE_CONSTANTS;
    static {
        MORSE_CONSTANTS = new HashMap<>();

        MORSE_CONSTANTS.put('a', ".-");
        MORSE_CONSTANTS.put('b', "-...");
        MORSE_CONSTANTS.put('c', "-.-.");
        MORSE_CONSTANTS.put('d', "-..");
        MORSE_CONSTANTS.put('e', ".");
        MORSE_CONSTANTS.put('f', "..-.");
        MORSE_CONSTANTS.put('g', "--.");
        MORSE_CONSTANTS.put('h', "....");
        MORSE_CONSTANTS.put('i', "..");
        MORSE_CONSTANTS.put('j', ".---");
        MORSE_CONSTANTS.put('k', "-.-");
        MORSE_CONSTANTS.put('l', ".-..");
        MORSE_CONSTANTS.put('m', "--");
        MORSE_CONSTANTS.put('n', "-.");
        MORSE_CONSTANTS.put('o', "---");
        MORSE_CONSTANTS.put('p', ".--.");
        MORSE_CONSTANTS.put('r', "--.-");
        MORSE_CONSTANTS.put('s', "...");
        MORSE_CONSTANTS.put('t', "-");
        MORSE_CONSTANTS.put('u', "..-");
        MORSE_CONSTANTS.put('v', ".---");
        MORSE_CONSTANTS.put('w', ".--");
        MORSE_CONSTANTS.put('x', "-..-");
        MORSE_CONSTANTS.put('y', "-.--");
        MORSE_CONSTANTS.put('z', "--..");
        MORSE_CONSTANTS.put(' ', "   /   ");
    }

    public static String getMorseString(char character) {
        return MORSE_CONSTANTS.get(character);
    }
}
