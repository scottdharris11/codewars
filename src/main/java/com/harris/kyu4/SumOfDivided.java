package com.harris.kyu4;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class SumOfDivided {
    public static String sumOfDivided(int[] l) {
        // find max number
        int maxNum = Arrays.stream( l )
                .map( Math::abs )
                .max().getAsInt();

        // find all primes
        LinkedHashMap<Integer,Integer> entries = new LinkedHashMap<>();
        for ( int i = 2; i <= maxNum; i++ ) {
            if ( isPrime( i ) ) {
                boolean include = false;
                int sum = 0;
                for ( int k : l ) {
                    if ( k % i == 0 ) {
                        include = true;
                        sum += k;
                    }
                }

                if ( include ) {
                    entries.put( i, sum );
                }
            }
        }

        // produce output
        StringBuilder sb = new StringBuilder();
        for ( Map.Entry<Integer,Integer> entry : entries.entrySet() ) {
            sb.append( String.format( "(%d %d)", entry.getKey(), entry.getValue() ) );
        }
        return sb.toString();
    }

    private static boolean isPrime(int num) {
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
