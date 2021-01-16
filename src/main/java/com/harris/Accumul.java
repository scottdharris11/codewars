package com.harris;

public class Accumul {
    public static String accum(String s) {
        StringBuilder out = new StringBuilder();
        int times = 0;
        for ( char c : s.toCharArray() ) {
            times++;
            if ( times > 1 ) {
                out.append( '-' );
            }
            for ( int i = 0; i < times; i++ ) {
                out.append( i == 0 ? Character.toUpperCase( c ) : Character.toLowerCase( c ) );
            }
        }
        return out.toString();
    }
}
