package com.company;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Assignment2 {

    public boolean atLeast3a_And_atLeast2b(String text){
        String text1 ;
        text1 = text.toLowerCase();
        int countA=0,countB=0;
        int length = text1.length();
        for (int i=0,j=i+1;j<=length;i++,j++){

            String subString = text1.substring(i,j);
            if (subString.equals("a")){
                countA++;
            }
            else if(subString.equals("b")){
                countB++;
            }
        }
        //System.out.println("Count0 = "+countA+" "+"Count1 = "+countB);
        if (countA>=3 && countB>=2){
            return true;
        }
        return false;
    }



    public boolean exactly2a_And_atLeast2b(String text){
        String text1 ;
        text1 = text.toLowerCase();
        int countA=0,countB=0;
        int length = text1.length();
        for (int i=0,j=i+1;j<=length;i++,j++){
            String subString = text1.substring(i,j);
            if (subString.equals("a")){
                countA++;
            }
            else if(subString.equals("b")){
                countB++;
            }
        }
        //System.out.println("Count0 = "+countA+" "+"Count1 = "+countB);
        if (countA==2 && countB>=2){
            return true;
        }
        return false;
    }

    public boolean evenNumberOfA_And_1_Or_2b(String text){
        String text1 ;
        text1 = text.toLowerCase();
        int countA=0,countB=0;
        int length = text1.length();
        for (int i=0,j=i+1;j<=length;i++,j++){
            String subString = text1.substring(i,j);
            if (subString.equals("a")){
                countA++;
            }
            else if(subString.equals("b")){
                countB++;
            }
        }
        //System.out.println("Count0 = "+countA+" "+"Count1 = "+countB);
        if (countA%2==0 && (countB==2 || countB==1)){
            return true;
        }
        return false;
    }

    public boolean evenNumberOfA_And_Each_A_IsFollowedByAtLeast1B(String text){
        String text1 ;
        text1 = text.toLowerCase();
        int countA=0,countB=0;
        int length = text1.length();
        for (int i=0,j=i+1;j<=length;i++,j++){
            String subString = text1.substring(i,j);
            if (subString.equals("a")){
                countA++;
            }
            else if(subString.equals("b")){
                countB++;
            }
        }
       // System.out.println("Count0 = "+countA+" "+"Count1 = "+countB);
        if (countA%2==0){

            String regx1 ="([b]+[a]){1,}";
            text1 = text;
            Pattern pattern = Pattern.compile(regx1);
            Matcher matcher = pattern.matcher(text1);
            boolean result = matcher.matches();
           // System.out.println(result);
            return result;
           // return true;
        }
        return false;
    }


    public boolean startsWithAAndAtMost1B(String text){
        String text1 ;
        String regx1 ="[a]+b[a]*";
        text1 = text;
        Pattern pattern = Pattern.compile(regx1);
        Matcher matcher = pattern.matcher(text1);
        boolean result = matcher.matches();
        System.out.println(result);
        return result;
    }


    public boolean oddNumberOfA_AND_EndsWithaB(String text){
        String text1 ;
        text1 = text.toLowerCase();
        int countA=0,countB=0;
        int length = text1.length();
        for (int i=0,j=i+1;j<=length;i++,j++){
            String subString = text1.substring(i,j);
            if (subString.equals("a")){
                countA++;
            }
            else if(subString.equals("b")){
                countB++;
            }
        }
         //System.out.println("Count0 = "+countA+" "+"Count1 = "+countB);
        if (countA%2!=0){
            String regx1 ="[a]+[b]";
            text1 = text;
            Pattern pattern = Pattern.compile(regx1);
            Matcher matcher = pattern.matcher(text1);
            boolean result = matcher.matches();
            // System.out.println(result);
            return result;
            // return true;
        }
        return false;
    }


    public boolean evenLengthAndOddNumberOfA(String text){
        String text1 ;
        text1 = text.toLowerCase();
        int countA=0,countB=0;
        int length = text1.length();
        for (int i=0,j=i+1;j<=length;i++,j++){
            String subString = text1.substring(i,j);
            if (subString.equals("a")){
                countA++;
            }
            else if(subString.equals("b")){
                countB++;
            }
        }
        if (countA%2!=0 && length%2==0){
            /*String regx1 ="[a]+[b]";
            text1 = text;
            Pattern pattern = Pattern.compile(regx1);
            Matcher matcher = pattern.matcher(text1);
            boolean result = matcher.matches();
            // System.out.println(result);
            return result;*/
             return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Assignment2 assignment2 = new Assignment2();

        boolean result = assignment2.atLeast3a_And_atLeast2b("aaabbaabb");
       // System.out.println("At Least 3 A's  and at Least 2 b's = "+result);

        boolean result1 = assignment2.exactly2a_And_atLeast2b("aabbbb");
        //System.out.println("Exactly 2A or AtLeast 2B = "+result1);

        boolean result2 = assignment2.evenNumberOfA_And_1_Or_2b("aaaabbaa");
        //System.out.println("Even Number of A or 1 or 2B = "+result2);

        boolean result3 = assignment2.evenNumberOfA_And_Each_A_IsFollowedByAtLeast1B("bbabbbbbababba");
        //System.out.println("Even Number of A And A is followed By At Least 1 B = "+result3);

        boolean result4 = assignment2.startsWithAAndAtMost1B("abaaaa");
        //System.out.println("Starts With A And At Most 1 B = "+result4);

        boolean result5 = assignment2.oddNumberOfA_AND_EndsWithaB("aaaaab");
       // System.out.println("Odd Number of a And Ends with a B = "+result5);

        boolean result6 = assignment2.evenLengthAndOddNumberOfA("abababbb");
        System.out.println("Even Length And Odd Number of A  = "+result6);

    }
}
