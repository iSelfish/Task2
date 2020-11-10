package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("How many positions do we shift?");
        int shift = in.nextInt();
        System.out.println("Enter the phrase:");
        in = new Scanner(System.in);
        String phrase = in.nextLine().toLowerCase().strip();

        char[] phraseChars = phrase.toCharArray();
        int cycleShift = 0;

        for (int i = 0; i < phrase.length(); i++) {
            char c = phraseChars[i];
            if (c == 32) {
            } else {
                if ((c + shift) < 97) {
                    cycleShift = 123 + (c - 97 + shift) % 26;
                    if (cycleShift == 123){
                        cycleShift = 97;
                    }
                } else if ((c + shift) > 122) {
                    cycleShift = (c - 97 + shift) % 26 + 97;
                } else {
                    cycleShift = c + shift;
                }
                phraseChars[i] = (char) (cycleShift);
            }
        }
        String resultPhrase = new String(phraseChars);
        System.out.println("Result: \"" + resultPhrase + "\"");
    }
}
