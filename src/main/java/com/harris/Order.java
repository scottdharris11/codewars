package com.harris;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Order {
    public static String order(String words) {
        return Arrays.stream( words.split(" ") )
                .map( OrderString::new )
                .sorted()
                .map( OrderString::getStr )
                .collect( Collectors.joining( " " ) );
    }
}

class OrderString implements Comparable<OrderString> {
    private final int order;
    private final String str;
    OrderString( String str ) {
        this.str = str;
        this.order = str.chars().mapToObj( i->(char) i )
                .filter( Character::isDigit )
                .map( c -> Integer.parseInt( String.valueOf( c ) ) )
                .findFirst()
                .orElse( 0 );
    }
    public int compareTo(OrderString o) {
        return order - o.order;
    }
    public String getStr() {
        return str;
    }
}