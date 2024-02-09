package org.example.service;

import org.example.data.Morse;

public class ConvertService {

    public static String output = "";
    public static String convertString(String input) {
        output = "";
        for(int i = 0; i < input.length(); i++) {
            output = output + " " + Morse.getMorse(input.charAt(i));
        }
        return output;
    }
}
