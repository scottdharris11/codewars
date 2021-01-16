package com.harris;

import java.util.stream.Collectors;

public class SquareDigit {
    public int squareDigits(int n) {
        return Integer.parseInt(
                String.valueOf( n ).chars().mapToObj( i->(char)i )
                    .map( Character::getNumericValue )
                    .map( d -> String.valueOf( d * d ) )
                    .collect( Collectors.joining() ) );
    }
}
