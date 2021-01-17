package com.harris.kyu7;

import java.util.stream.Collectors;

public class Troll {
    public static String disemvowel(String str) {
        return str.chars()
                .mapToObj( i->(char)i )
                .filter( Troll::notVowel )
                .map( String::valueOf )
                .collect( Collectors.joining() );
    }
    private static boolean notVowel( char c ) {
        return ! ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                 c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' );
    }
}
