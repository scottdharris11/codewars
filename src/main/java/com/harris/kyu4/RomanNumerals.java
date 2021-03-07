package com.harris.kyu4;

public class RomanNumerals {

    private static final int[] LEVELS = { 1000, 500, 100, 50, 10, 5, 1 };
    private static final char[] VALUES = { 'M', 'D', 'C', 'L', 'X', 'V', 'I' };

    public static String toRoman(int n) {
        StringBuilder sb = new StringBuilder();

        int thousands = n / 1000;
        for ( int i = 0; i < thousands; i++ ) {
            sb.append( VALUES[0] );
        }

        int work = n - ( thousands * 1000 );
        int hundreds = work / 100;
        sb.append( buildNumeral( hundreds, 0 ) );

        work = work - ( hundreds * 100 );
        int tens = work / 10;
        sb.append( buildNumeral( tens, 2 ) );

        work = work - ( tens * 10 );
        sb.append( buildNumeral( work, 4 ) );

        return sb.toString();
    }

    public static int fromRoman(String romanNumeral) {
        char[] entries = romanNumeral.toCharArray();
        int value = 0;
        int sectionValue = 0;
        int prevIdx = -1;
        for ( char entry : entries ) {
            int nIdx = findNumeralIdx( entry );
            if ( prevIdx == -1 || nIdx == prevIdx ) {
                sectionValue += LEVELS[nIdx];
                prevIdx = nIdx;
            } else if ( nIdx > prevIdx ) {
                value += sectionValue;
                sectionValue = LEVELS[nIdx];
                prevIdx = nIdx;
            } else {
                value += ( -sectionValue + LEVELS[nIdx] );
                sectionValue = 0;
                prevIdx = -1;
            }
        }
        value += sectionValue;
        return value;
    }

    private static int findNumeralIdx( char value ) {
        for ( int i = 0; i < VALUES.length; i++ ) {
            if ( value == VALUES[i] ) {
                return i;
            }
        }
        throw new IllegalArgumentException( "Unexpected numeral: " + value );
    }

    private static String buildNumeral( int digit, int idxOffset ) {
        StringBuilder sb = new StringBuilder();
        if ( digit > 0 ) {
            if ( digit <= 3 ) {
                for ( int i = 0; i < digit; i++ ) {
                    sb.append( VALUES[idxOffset + 2] );
                }
            } else if ( digit == 4 ) {
                sb.append( VALUES[idxOffset + 2] );
                sb.append( VALUES[idxOffset + 1] );
            } else if ( digit == 5 ) {
                sb.append( VALUES[idxOffset + 1] );
            } else if ( digit <= 8 ) {
                sb.append( VALUES[idxOffset + 1] );
                for ( int i = 0; i < digit-5; i++ ) {
                    sb.append( VALUES[idxOffset + 2] );
                }
            } else {
                sb.append( VALUES[idxOffset + 2] );
                sb.append( VALUES[idxOffset] );
            }
        }
        return sb.toString();
    }

}
