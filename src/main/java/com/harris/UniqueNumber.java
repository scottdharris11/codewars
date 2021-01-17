package com.harris;

import java.util.Arrays;

public class UniqueNumber {
    public static double findUniq(double[] arr) {
        double val = arr[0];
        if ( arr[1] != val ) {
            if ( arr[1] == arr[2] ) {
                return val;
            } else {
                return arr[1];
            }
        }
        return Arrays.stream( arr )
                .filter( d -> d != val )
                .findFirst().getAsDouble();
    }
}
