package com.harris.kyu4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {
    @Test
    public void testToRoman() throws Exception {
        assertEquals( "I", RomanNumerals.toRoman(1), "1 converts to 'I'" );
        assertEquals( "II", RomanNumerals.toRoman(2), "2 converts to 'II'" );
        assertEquals( "VIII", RomanNumerals.toRoman(8), "8 converts to 'VIII'" );
        assertEquals( "IX", RomanNumerals.toRoman(9), "9 converts to 'IX'" );
        assertEquals( "MCMXC", RomanNumerals.toRoman(1990), "1990 converts to 'MCMXC'" );
        assertEquals( "MMVIII", RomanNumerals.toRoman(2008), "2008 converts to 'MMVIII'" );
        assertEquals( "MDCLXVI", RomanNumerals.toRoman(1666), "1666 converts to 'MDCLXVI'" );
    }

    @Test
    public void testFromRoman() throws Exception {
        assertEquals( 1, RomanNumerals.fromRoman("I"), "'I' converts to 1" );
        assertEquals( 2, RomanNumerals.fromRoman("II"), "'II' converts to 2" );
        assertEquals( 8, RomanNumerals.fromRoman("VIII"), "'VIII' converts to 8" );
        assertEquals( 9, RomanNumerals.fromRoman("IX"), "'IX' converts to 9" );
        assertEquals( 1990, RomanNumerals.fromRoman("MCMXC"), "'MCMXC' converts to 1990" );
        assertEquals( 2008, RomanNumerals.fromRoman("MMVIII"), "'MMVIII' converts to 2008" );
        assertEquals( 1666, RomanNumerals.fromRoman("MDCLXVI"), "'MDCLXVI' converts to 1666" );
    }
}