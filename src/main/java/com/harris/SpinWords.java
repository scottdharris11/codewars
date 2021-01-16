package com.harris;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {
    public String spinWords(String sentence) {
        return Arrays.stream( sentence.split(" ") )
                .map( this::spin )
                .collect( Collectors.joining( " " ) );
    }
    private String spin( String word ) {
        if ( word.length() < 5 ) {
            return word;
        } else {
            return new StringBuilder( word ).reverse().toString();
        }
    }
}
