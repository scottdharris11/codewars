package com.harris.kyu6;

public class Like {
    public static String whoLikesIt(String... names) {
        final String singleLikeFmt = "%s likes this";
        final String twoLikesFmt = "%s and %s like this";
        final String threeLikesFmt = "%s, %s and %s like this";
        final String fourOrMoreLikesFmt = "%s, %s and %d others like this";

        if ( names.length == 0 ) {
            return "no one likes this";
        } else if ( names.length == 1 ) {
            return String.format( singleLikeFmt, names[0] );
        } else if ( names.length == 2 ) {
            return String.format( twoLikesFmt, names[0], names[1] );
        } else if ( names.length == 3 ) {
            return String.format( threeLikesFmt, names[0], names[1], names[2] );
        } else {
            return String.format( fourOrMoreLikesFmt, names[0], names[1], names.length - 2 );
        }
    }
}
