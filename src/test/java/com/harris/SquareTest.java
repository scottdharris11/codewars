package com.harris;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void testIsSquare() {
        Square s = new Square();
        assertFalse( s.isSquare( -1 ), "-1 should be false" );
        assertTrue( s.isSquare( 0 ), "0 should be true" );
        assertFalse( s.isSquare( 2 ), "2 should be false" );
        assertTrue( s.isSquare( 4 ), "4 should be true" );
        assertFalse( s.isSquare( 6 ), "6 should be false" );
        assertTrue( s.isSquare( 9 ), "9 should be true" );
    }

}