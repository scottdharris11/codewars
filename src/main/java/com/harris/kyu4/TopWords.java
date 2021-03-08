package com.harris.kyu4;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopWords {

    public static List<String> top3( String s ) {
        return Arrays.stream( s.split( "[^a-zA-Z']+" ) )
                .map( str -> str.replaceAll( "'{2,}", "" ).toLowerCase() )
                .filter( str -> str.length() > 0 )
                .filter( str -> ! str.equals( "'" ) )
                .collect( Collectors.groupingBy(
                        String::toString,
                        LinkedHashMap::new,
                        Collectors.counting() ) )
                .entrySet()
                .stream()
                .sorted( (l, r) -> (int) ( r.getValue() - l.getValue() ) )
                .map( Map.Entry::getKey )
                .limit( 3 )
                .collect( Collectors.toList() );
    }

}
