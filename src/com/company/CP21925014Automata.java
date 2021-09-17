package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CP21925014Automata {

    public boolean atLeast3a_And_atLeast2b(String text) {
        String text1;
        text1 = text.toLowerCase();
        int countA = 0, countB = 0;
        int length = text1.length();
        for (int i = 0, j = i + 1; j <= length; i++, j++) {
            String subString = text1.substring(i, j);
            if (subString.equals("a")) {
                countA++;
            } else if (subString.equals("b")) {
                countB++;
            }
        }
        if (countA >= 3 && countB >= 2) {
            return true;
        }
        return false;
    }


    public boolean exactly2a_And_atLeast2b(String text) {
        String text1;
        text1 = text.toLowerCase();
        int countA = 0, countB = 0;
        int length = text1.length();
        for (int i = 0, j = i + 1; j <= length; i++, j++) {
            String subString = text1.substring(i, j);
            if (subString.equals("a")) {
                countA++;
            } else if (subString.equals("b")) {
                countB++;
            }
        }
        if (countA == 2 && countB >= 2) {
            return true;
        }
        return false;
    }

    public boolean evenNumberOfA_And_1_Or_2b(String text) {
        String text1;
        text1 = text.toLowerCase();
        int countA = 0, countB = 0;
        int length = text1.length();
        for (int i = 0, j = i + 1; j <= length; i++, j++) {
            String subString = text1.substring(i, j);
            if (subString.equals("a")) {
                countA++;
            } else if (subString.equals("b")) {
                countB++;
            }
        }
        if (countA % 2 == 0 && (countB == 2 || countB == 1)) {
            return true;
        }
        return false;
    }

    public boolean evenNumberOfA_And_Each_A_IsFollowedByAtLeast1B(String text) {
        String text1;
        text1 = text.toLowerCase();
        int countA = 0, countB = 0;
        int length = text1.length();
        for (int i = 0, j = i + 1; j <= length; i++, j++) {
            String subString = text1.substring(i, j);
            if (subString.equals("a")) {
                countA++;
            } else if (subString.equals("b")) {
                countB++;
            }
        }
        if (countA % 2 == 0) {

            String regx1 = "([b]+[a]){1,}";
            text1 = text;
            Pattern pattern = Pattern.compile(regx1);
            Matcher matcher = pattern.matcher(text1);
            boolean result = matcher.matches();
            return result;

        }
        return false;
    }


    public boolean startsWithAAndAtMost1B(String text) {
        String text1;
        String regx1 = "[a]+b[a]*";
        text1 = text;
        Pattern pattern = Pattern.compile(regx1);
        Matcher matcher = pattern.matcher(text1);
        boolean result = matcher.matches();

        return result;
    }


    public boolean oddNumberOfA_AND_EndsWithaB(String text) {
        String text1;
        text1 = text.toLowerCase();
        int countA = 0, countB = 0;
        int length = text1.length();

        int i,j;
        String subString ;

        for ( i = 0, j = i + 1; j <= length; i++, j++) {
            subString = text1.substring(i, j);
            if (subString.equals("a")) {
                countA++;
            } else if (subString.equals("b")) {
                countB++;
            }
        }
        j=length;
        i= length-1;
        subString = text1.substring(i, j);
        if (countA % 2 != 0 && subString.equals("b")) {
            return true;
        }
        return false;
    }


    public boolean evenLengthAndOddNumberOfA(String text) {
        String text1;
        text1 = text.toLowerCase();
        int countA = 0, countB = 0;
        int length = text1.length();
        for (int i = 0, j = i + 1; j <= length; i++, j++) {
            String subString = text1.substring(i, j);
            if (subString.equals("a")) {
                countA++;
            } else if (subString.equals("b")) {
                countB++;
            }
        }
        if (countA % 2 != 0 && length % 2 == 0) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        CP21925014Automata assignment2 = new CP21925014Automata();
        String input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();

        boolean result = assignment2.atLeast3a_And_atLeast2b(input);
        System.out.println("At Least 3 A's  and at Least 2 b's = " + result+"\n");

        boolean result1 = assignment2.exactly2a_And_atLeast2b(input);
        System.out.println("Exactly 2A And AtLeast 2B = " + result1+"\n");

        boolean result2 = assignment2.evenNumberOfA_And_1_Or_2b(input);
        System.out.println("Even Number of A And 1 or 2B = " + result2+"\n");

        boolean result3 = assignment2.evenNumberOfA_And_Each_A_IsFollowedByAtLeast1B(input);
        System.out.println("Even Number of A And A is followed By At Least 1 B = " + result3+"\n");

        boolean result4 = assignment2.startsWithAAndAtMost1B(input);
        System.out.println("Starts With A And At Most 1 B = " + result4+"\n");

        boolean result5 = assignment2.oddNumberOfA_AND_EndsWithaB(input);
        System.out.println("Odd Number of a And Ends with a B = " + result5+"\n");

        boolean result6 = assignment2.evenLengthAndOddNumberOfA(input);
        System.out.println("Even Length And Odd Number of A  = " + result6+"\n");

    }
}
