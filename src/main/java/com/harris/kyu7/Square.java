package com.harris.kyu7;

public class Square {
    public boolean isSquare(int n) {
        int root = (int) Math.floor( Math.sqrt( n ) );
        return ( root * root ) == n;
    }
}
