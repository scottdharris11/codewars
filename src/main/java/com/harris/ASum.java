package com.harris;

public class ASum {
    public static long findNb(long m) {
        long workVolume = m;
        long cubes = 0;
        while ( workVolume > 0 ) {
            cubes++;
            workVolume -= ( cubes * cubes * cubes );
        }
        return workVolume == 0 ? cubes : -1;
    }
}
