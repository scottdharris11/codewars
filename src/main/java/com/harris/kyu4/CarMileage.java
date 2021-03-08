package com.harris.kyu4;

public class CarMileage {

    public static int isInteresting(int number, int[] awesomePhrases) {
        if ( checkInteresting( number, awesomePhrases ) ) {
            return 2;
        } else if ( checkInteresting( number + 1, awesomePhrases ) ||
                checkInteresting( number + 2, awesomePhrases ) ) {
            return 1;
        } else {
            return 0;
        }
    }

    private static boolean checkInteresting( int number, int[] awesomePhrases ) {
        if (number <= 99) {
            return false;
        }
        int[] digits = extractDigits(number);
        if ( isAwesome( number, awesomePhrases ) ) {
            return true;
        } else if ( digitsEquals( 0, digits, 0 ) ) {
            return true;
        } else if ( digitsEquals( digits[0], digits, 0 ) ) {
            return true;
        } else if ( digitsEquals( digits[0] + 1, digits, 1 ) ) {
            return true;
        } else if ( digitsEquals( digits[0] - 1, digits, -1 ) ) {
            return true;
        } else {
            return isPalindrome(digits);
        }
    }

    private static int[] extractDigits( int number ) {
        String s = String.valueOf( number );
        int[] digits = new int[s.length()];
        int idx = 0;
        for ( char c : s.toCharArray() ) {
            digits[idx] = Character.getNumericValue( c );
            idx++;
        }
        return digits;
    }

    private static boolean digitsEquals( int value, int[] digits, int adjustVal ) {
        boolean equals = true;
        int valueComp = value;
        for ( int i = 1; i < digits.length; i++ ) {
            if ( digits[i] != valueComp ) {
                equals = false;
                break;
            }
            valueComp += adjustVal;
            if ( valueComp == 10 ) {
                valueComp = 0;
            }
        }
        return equals;
    }

    private static boolean isPalindrome( int[] digits ) {
        boolean palindrome = true;
        for ( int i = 0, j = digits.length-1; i < digits.length; i++, j-- ) {
            if ( digits[i] != digits[j] ) {
                palindrome = false;
                break;
            }
        }
        return palindrome;
    }

    private static boolean isAwesome( int number, int[] awesomePhrases ) {
        boolean awesome = false;
        for ( int awesomePhrase : awesomePhrases ) {
            if ( number == awesomePhrase ) {
                awesome = true;
                break;
            }
        }
        return awesome;
    }
}
