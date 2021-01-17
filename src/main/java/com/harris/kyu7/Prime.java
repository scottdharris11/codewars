package com.harris.kyu7;

public class Prime {
    public static boolean isPrime(int num) {
        if ( num <= 1 ) {
            return false;
        }
        int work = (int) Math.sqrt( num );
        while ( work > 1 ) {
            if ( num % work == 0 ) {
                return false;
            }
            work--;
        }
        return true;
    }
}
