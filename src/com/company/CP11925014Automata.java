package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CP11925014Automata {
    public boolean startW0_endsW1(String text) {
        String regx1 = "1[1 0]*0";
        String text1;
        text1 = text;
        Pattern pattern = Pattern.compile(regx1);
        Matcher matcher = pattern.matcher(text1);
        boolean result = matcher.matches();
        return result;
    }

    public boolean containsAtLeast3one(String text) {
        String regx1 = "[1 0]*1[1 0]*1[1 0]*1[1 0]*";
        String text1;
        text1 = text;
        Pattern pattern = Pattern.compile(regx1);
        Matcher matcher = pattern.matcher(text1);
        boolean result = matcher.matches();
        return result;
    }

    public boolean containsSubString0101(String text) {
        String regx1 = "[0 1]*(0+1+0+1)+[0 1]*";
        String text1;
        text1 = text;
        Pattern pattern = Pattern.compile(regx1);
        Matcher matcher = pattern.matcher(text1);
        boolean result = matcher.matches();
        return result;
    }

    public boolean lengthAtLeast3and3rdSymbol0(String text) {
        String text1;
        text1 = text;
        int count0 = 0;
        int length = text1.length();
        if (length >= 3) {

            int i = 2, j = 3;
            String subString = text1.substring(i, j);
            if (subString.equals("0")) {
                return true;
            } else
                return false;
        }
        return false;
    }

    public boolean startsWith0_OddLength_Or_startsWith1_evenLength(String text) {
        String regx1;
        String text1;
        int length = text.length();
        if (length % 2 == 0) {
            regx1 = "1[1 0]+";
            text1 = text;
            Pattern pattern = Pattern.compile(regx1);
            Matcher matcher = pattern.matcher(text1);
            boolean result = matcher.matches();
            return result;
        } else {
            regx1 = "0[1 0]*";
            text1 = text;
            Pattern pattern = Pattern.compile(regx1);
            Matcher matcher = pattern.matcher(text1);
            boolean result = matcher.matches();
            return result;
        }
    }

    public boolean doesNotContainsSubString110(String text) {
        String regx1 = "[0 1]*(1+1+0)+[0 1]*";
        String text1;
        text1 = text;
        Pattern pattern = Pattern.compile(regx1);
        Matcher matcher = pattern.matcher(text1);
        boolean result = matcher.matches();
        if (result) {
            return false;
        }
        return true;
    }


    public boolean containsAtMost5(String text) {
        String regx1 = "[0 1]{0,1}[0 1]{0,1}[0 1]{0,1}[0 1]{0,1}[0 1]{0,1}";
        String text1;
        text1 = text;
        Pattern pattern = Pattern.compile(regx1);
        Matcher matcher = pattern.matcher(text1);
        boolean result = matcher.matches();
        if (result) {
            return true;
        }
        return false;
    }

    public boolean anyStringExcept11And111(String text) {
        String regx1 = "[1]{1}[1]{1}[1]{0,1}";
        String text1;
        text1 = text;
        Pattern pattern = Pattern.compile(regx1);
        Matcher matcher = pattern.matcher(text1);
        boolean result = matcher.matches();
        if (result) {
            return false;
        }
        return true;
    }

    public boolean everyOddPosition1(String text) {
        String text1;
        text1 = text;
        int count0 = 0;
        int length = text1.length();
        for (int i = 0, j = i + 1; j <= length; i = i + 2, j = j + 2) {
            String subString = text1.substring(i, j);
            if (subString.equals("1")) {
                count0 = 0;
            } else {
                count0++;
                break;
            }
        }
        if (count0 == 0) {
            return true;
        } else
            return false;
    }


    public boolean atLeast2ZeroAtMost1One(String text) {
        String regx1 = "";
        String text1;
        text1 = text;
        int count0 = 0, count1 = 0;
        int length = text1.length();
        for (int i = 0, j = i + 1; j <= length; i++, j++) {
            String subString = text1.substring(i, j);
            if (subString.equals("1")) {
                count1++;
            } else if (subString.equals("0")) {
                count0++;
            }
        }
        if (count0 >= 2 && count1 < 2) {
            return true;
        }
        return false;
    }


    public boolean emptyStringOrZero(String text) {
        String text1;
        text1 = text;
        if (text1.equals("0") || text1.isEmpty()) {
            return true;
        }
        return false;
    }


    public boolean evenNumberOf0_OrExactly2_Ones(String text) {
        String text1;
        text1 = text;
        int count0 = 0, count1 = 0;
        int length = text1.length();
        for (int i = 0, j = i + 1; j <= length; i++, j++) {

            String subString = text1.substring(i, j);
            if (subString.equals("1")) {
                count1++;
            } else if (subString.equals("0")) {
                count0++;
            }
        }
        if (count0 % 2 == 0 || count1 == 2) {
            return true;
        }
        return false;
    }

    public boolean emptyString(String text) {
        String text1;
        text1 = text;
        if (text1.isEmpty()) {
            return true;
        }
        return false;
    }


    public boolean allStringExceptEmptyString(String text) {
        String text1;
        text1 = text;
        text1 = text;
        if (text1.isEmpty()) {
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        CP11925014Automata main = new CP11925014Automata();
        String input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        //System.out.println(input);

        boolean result = main.startW0_endsW1(input);
        System.out.print("Start with 1 Ends With 0 = " + result + "\n");

        boolean result1 = main.containsAtLeast3one(input);
        System.out.print("Contains At least 3 one = " + result1 + "\n");

        boolean result2 = main.containsSubString0101(input);
        System.out.print("Contains Sub String 0101 = " + result2 + "\n");

        boolean result3 = main.lengthAtLeast3and3rdSymbol0(input);
        System.out.print("Length At least 3 and third Symbol is 0 = " + result3 + "\n");

        boolean result4 = main.startsWith0_OddLength_Or_startsWith1_evenLength(input);
        System.out.print("Starts with 1 even Or starts with 0 Odd = " + result4 + "\n");

        boolean result5 = main.doesNotContainsSubString110(input);
        System.out.print("Does not contains Sub String 110 = " + result5 + "\n");

        boolean result6 = main.containsAtMost5(input);
        System.out.print("Contains At Most 5 = " + result6 + "\n");

        boolean result7 = main.anyStringExcept11And111(input);
        System.out.print("Any String Except 11 and 111 = " + result7 + "\n");

        boolean result8 = main.everyOddPosition1(input);
        System.out.print("Every Odd Position is 1 = " + result8 + "\n");

        boolean result9 = main.atLeast2ZeroAtMost1One(input);
        System.out.print("At least 2 Zero and atMost 1 One  = " + result9 + "\n");

        boolean result10 = main.emptyStringOrZero(input);
        System.out.print("Empty String Or Zero  = " + result10 + "\n");

        boolean result11 = main.evenNumberOf0_OrExactly2_Ones("00111");
        System.out.print("Even Number of 0 oR exactly 2 ones  = " + result11 + "\n");

        boolean result12 = main.emptyString(input);
        System.out.print("Empty String  = " + result12 + "\n");


        boolean result13 = main.allStringExceptEmptyString(input);
        System.out.print("All String Except Empty String  = " + result13 + "\n");

    }
}
