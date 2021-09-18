package com.company;

import java.util.Scanner;

public class CP31925014Automata {
    public static boolean startsWith1EndsWith0(String input) {
        boolean accepted = false;
        char state = '0';
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (state == '0') {
                if (ch == '1') {
                    state = '1';
                } else {
                    state = '3';
                }
            } else if (state == '1') {
                if (ch == '1') {
                    state = '1';
                } else if (ch == '0') {
                    state = '2';
                }
            } else if (state == '2') {
                if (ch == '1') {
                    state = '1';
                } else if (ch == '0') {
                    state = '2';
                }
            } else if (state == '3') {
                if (ch == '1') {
                    state = '3';
                } else if (ch == '0') {
                    state = '3';
                }
            }
            if (state == '2') {
                accepted = true;
            } else {
                accepted = false;
            }
        }

        return accepted;
    }

    public static boolean atLeastThree1(String input) {
        boolean accepted = false;
        char state = '0';
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (state == '0') {
                if (ch == '1') {
                    state = '1';
                } else
                    state = '0';
            } else if (state == '1') {
                if (ch == '1') {
                    state = '2';
                } else
                    state = '1';
            } else if (state == '2') {
                if (ch == '1') {
                    state = '3';
                } else
                    state = '2';
            } else if (state == '3') {
                if (ch == '1') {
                    state = '3';
                } else
                    state = '3';
            }

            if (state == '3') {
                accepted = true;
            } else {
                accepted = false;
            }
        }
        return accepted;
    }

    public static boolean containsSubString0101(String input) {
        boolean accepted = false;
        int state = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (state == 0) {
                if (ch == '0') {
                    state = 1;
                } else {
                    state = 0;
                }
            } else if (state == 1) {
                if (ch == '1') {
                    state = 2;
                } else {
                    state = 1;
                }
            } else if (state == 2) {
                if (ch == '0') {
                    state = 3;
                } else {
                    state = 0;
                }
            } else if (state == 3) {
                if (ch == '1') {
                    state = 4;
                } else {
                    state = 1;
                }
            } else if (state == 4) {
                if (ch == '0') {
                    state = 4;
                } else {
                    state = 4;
                }
            }

        }
        if (state == 4) {
            accepted = true;
        } else
            accepted = false;

        return accepted;
    }


    public static boolean lengthAtLeast3AndThirdSymbolIs0(String input) {
        int state = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (state == 0) {
                if (ch == '0' || ch == '1') {
                    state = 1;
                } else {
                    state = 0;
                }
            } else if (state == 1) {
                if (ch == '0' || ch == '1') {
                    state = 2;
                } else {
                    state = 0;
                }
            } else if (state == 2) {
                if (ch == '0') {
                    state = 3;
                } else {
                    state = 4;
                }
            } else if (state == 3) {
                if (ch == '0' || ch == '1') {
                    state = 3;
                } else {
                    state = 0;
                }
            } else if (state == 4) {
                state = 4;
            }
        }
        if (state == 3) {
            return true;
        } else
            return false;
    }

    public static boolean startsWith0OddLengthOrStartsWith1EvenLength(String input) {
        int state = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (state == 0) {
                if (ch == '0') {
                    state = 1;
                } else {
                    state = 2;
                }
            } else if (state == 1) {
                if (ch == '0' || ch == '1') {
                    state = 0;
                }
            } else if (state == 2) {
                if (ch == '0' || ch == '1') {
                    state = 3;
                }
            } else if (state == 3) {
                if (ch == '0' || ch == '1') {
                    state = 2;
                }
            }
        }
        if (state == 1 || state == 3) {
            return true;
        } else
            return false;
    }

    public static boolean doesNotContain110(String input) {
        int state = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (state == 0) {
                if (ch == '1') {
                    state = 1;
                } else {
                    state = 0;
                }
            } else if (state == 1) {
                if (ch == '1') {
                    state = 2;
                } else {
                    state = 0;
                }
            } else if (state == 2) {
                if (ch == '0') {
                    state = 3;
                } else {
                    state = 2;
                }
            } else if (state == 3) {
                if (ch == '1' || ch == '0') {
                    state = 3;
                }
            }

        }
        if (state == 3) {
            return false;
        } else
            return true;
    }

    public static boolean lengthAtMost5(String input) {
        int state = 0;
        System.out.print(state);
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (state == 0) {
                if (ch == '1' || ch == '0') {
                    state = 1;
                }
            } else if (state == 1) {
                if (ch == '1' || ch == '0') {
                    state = 2;
                }
            } else if (state == 2) {
                if (ch == '1' || ch == '0') {
                    state = 3;
                }
            } else if (state == 3) {
                if (ch == '1' || ch == '0') {
                    state = 4;
                }
            } else if (state == 4) {
                if (ch == '1' || ch == '0') {
                    state = 5;
                }
            } else if (state == 5) {
                if (ch == '1' || ch == '0') {
                    state = 6;
                }
            } else if (state == 6) {
                if (ch == '1' || ch == '0') {
                    state = 6;
                }
            }
            System.out.print("-->" + state);
        }
        if (state == 6) {
            return false;
        } else return true;
    }

    public static boolean acceptExcept11And111(String input) {
        int state = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (state == 0) {
                if (ch == '1') {
                    state = 1;
                } else
                    state = 0;
            } else if (state == 1) {
                if (ch == '1') {
                    state = 2;
                } else
                    state = 0;
            } else if (state == 2) {
                if (ch == '1') {
                    state = 3;
                } else
                    state = 0;
            } else if (state == 3) {
                if (ch == '1' || ch == '0') {
                    state = 0;
                }
            }
        }
        if (state == 2 || state == 3) {
            return false;
        } else
            return true;
    }

    public static boolean everyOddPositionIs1(String input) {
        int state = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (state == 0) {
                if (ch == '1') {
                    state = 1;
                } else {
                    state = 0;
                }
            } else if (state == 1) {
                if (ch == '1' || ch == '0') {
                    state = 2;
                }
            }
            else if (state == 2) {
                if (ch == '1') {
                    state = 1;
                } else {
                    state = 0;
                }
            }
        }
        if (state == 1 || state==2) {
            return true;
        } else
            return false;
    }

    public static boolean atLeast2ZeroAndAtMostOne1(String input) {
        int state = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (state == 0) {
                if (ch == '0') {
                    state = 1;
                } else {
                    state = 5;
                }
            } else if (state == 1) {
                if (ch == '0') {
                    state = 2;
                } else {
                    state = 4;
                }
            } else if (state == 2) {
                if (ch == '0') {
                    state = 2;
                } else {
                    state = 3;
                }
            } else if (state == 3) {
                if (ch == '0') {
                    state = 3;
                } else {
                    state = 6;
                }
            } else if (state == 4) {
                if (ch == '0') {
                    state = 3;
                } else {
                    state = 6;
                }
            } else if (state == 5) {
                if (ch == '0') {
                    state = 4;
                } else {
                    state = 6;
                }
            } else if (state == 6) {
                if (ch == '0') {
                    state = 6;
                } else {
                    state = 6;
                }
            }
            /*else  if(state==7){
                if (ch=='1'){
                    state=7;
                }
                else{
                    state=7;
                }
            }*/
        }
        if (state == 3) {
            return true;
        } else
            return false;
    }

    public static boolean acceptZeroOrEmptyString(String input) {
        int state = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (state == 0) {
                if (ch == '0') {
                    state = 1;
                } else {
                    state = 2;
                }
            } else if (state == 1) {
                if (ch == '0') {
                    state = 1;
                } else {
                    state = 2;
                }
            }
        }
        if (state == 0 || state == 1) {
            return true;
        } else
            return false;
    }

    public static boolean evenNumberOf0OrExactlyTwo1(String input) {
        int state = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (state == 0) {
                if (ch == '0') {
                    state = 1;
                } else {
                    state = 3;
                }
            } else if (state == 1) {
                if (ch == '0') {
                    state = 2;
                } else {
                    state = 3;
                }
            } else if (state == 2) {
                if (ch == '0') {
                    state = 1;
                } else {
                    state = 2;
                }
            } else if (state == 3) {
                if (ch == '0') {
                    state = 6;
                } else {
                    state = 4;
                }
            } else if (state == 4) {
                if (ch == '1') {
                    state = 5;
                } else {
                    state = 4;
                }
            } else if (state == 5) {
                if (ch == '0') {
                    state = 5;
                } else {
                    state = 5;
                }
            } else if (state == 6) {
                if (ch == '0') {
                    state = 2;
                } else {
                    state = 4;
                }
            }
        }
        if (state == 2 || state == 4) {
            return true;
        } else
            return false;

    }

    public static boolean acceptEmptyString(String input) {
        int state = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (state == 0) {
                if (ch == '0' || ch == '1') {
                    state = 1;
                }
            } else if (state == 1) {
                if (ch == '0' || ch == '1') {
                    state = 1;
                }
            }
        }
        if (state == 0) {
            return true;
        } else return false;
    }

    public static boolean allStringExceptEmptyString(String input) {
        int state = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (state == 0) {
                if (ch == '1' || ch == '0') {
                    state = 1;
                } else state = 0;
            } else if (state == 1) {
                if (ch == '1' || ch == '0') {
                    state = 1;
                } else state = 1;
            }
        }
        if (state == 1) {
            return true;
        } else return false;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String inputString = s.nextLine();


        boolean r = startsWith1EndsWith0(inputString);
        System.out.println("Starts with 1 And Ends With 0 = " + r);

        boolean r1 = atLeastThree1(inputString);
        System.out.println("At least Three 1  = " + r1);

        boolean r2 = containsSubString0101(inputString);
        System.out.println("Contains SubString 0101  = " + r2);

        boolean r3 = lengthAtLeast3AndThirdSymbolIs0(inputString);
        System.out.println("Length is atLeast 3 And Third Symbol is 0 = " + r3);
        boolean r4 = startsWith0OddLengthOrStartsWith1EvenLength(inputString);
        System.out.println("Starts with 0 has Odd length Or Starts W1H Even-" +
                " L = " + r4);

        boolean r5 = doesNotContain110(inputString);
        System.out.println("Does Not contain Sub String 110 = " + r5);

        boolean r6 = lengthAtMost5(inputString);
        System.out.println("\nLength is At most 5 = " + r6);

        boolean r7 = acceptExcept11And111(inputString);
        System.out.println("\nAccept Except 11 and 111 = " + r7);

        boolean r8 = everyOddPositionIs1(inputString);
        System.out.println("\nEvery Odd Position is 1 = " + r8);

        boolean r9 = atLeast2ZeroAndAtMostOne1(inputString);
        System.out.println("\nAt least 2 Zeros And At Most One 1 = " + r9);

        boolean r10 = acceptZeroOrEmptyString(inputString);
        System.out.println("\nAccept Empty or 0 = " + r10);

        boolean r11 = evenNumberOf0OrExactlyTwo1(inputString);
        System.out.println("\nEven Number of 0 Or Exactly Two 1 = " + r11);

        boolean r12 = acceptEmptyString(inputString);
        System.out.println("\nExcept only Empty String = " + r12);

        boolean r13 = allStringExceptEmptyString(inputString);
        System.out.println("\nAll String Except Empty String = " + r13);
    }
}
