package com.harris.kyu4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarMileageTest {
    @Test
    public void testTooSmall() {
        assertEquals(0, CarMileage.isInteresting(3, new int[]{1337, 256}));
    }

    @Test
    public void testTrailingZeros() {
        assertEquals(2, CarMileage.isInteresting(1000, new int[]{1337, 256}));
    }

    @Test
    public void testAllSame() {
        assertEquals(2, CarMileage.isInteresting(2222, new int[]{1337, 256}));
    }

    @Test
    public void testIncrementing() {
        assertEquals(2, CarMileage.isInteresting(567890, new int[]{1337, 256}));
    }

    @Test
    public void testDecrementing() {
        assertEquals(2, CarMileage.isInteresting(43210, new int[]{1337, 256}));
    }

    @Test
    public void testPalidrome() {
        assertEquals(2, CarMileage.isInteresting(73837, new int[]{1337, 256}));
    }

    @Test
    public void testAlmostAwesome() {
        assertEquals(1, CarMileage.isInteresting(1336, new int[]{1337, 256}));
    }

    @Test
    public void testAwesome() {
        assertEquals(2, CarMileage.isInteresting(1337, new int[]{1337, 256}));
    }

    @Test
    public void testFarNotInteresting() {
        assertEquals(0, CarMileage.isInteresting(11208, new int[]{1337, 256}));
    }

    @Test
    public void testAlmostInteresting() {
        assertEquals(1, CarMileage.isInteresting(11209, new int[]{1337, 256}));
    }

    @Test
    public void testInteresting() {
        assertEquals(2, CarMileage.isInteresting(11211, new int[]{1337, 256}));
    }
}