package com.harris.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueNumberTest {
    @Test
    public void sampleTestCases() {
        assertEquals(1.0, UniqueNumber.findUniq(new double[]{0, 1, 0}), 0.00001);
        assertEquals(2.0, UniqueNumber.findUniq(new double[]{1, 1, 1, 2, 1, 1}), 0.00001);
    }
}