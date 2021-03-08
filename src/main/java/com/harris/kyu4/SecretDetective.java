package com.harris.kyu4;

public class SecretDetective {

    public String recoverSecret(char[][] triplets) {
        String word = "";
        while ( true ) {
            String tWord = applyRules( word, triplets );
            if ( tWord.equals( word ) ) {
                word = tWord;
                break;
            } else {
                word = tWord;
            }
        }
        return word;
    }

    public String applyRules( String word, char[][] triplets ) {
        String work = word;
        for ( char[] triplet : triplets ) {
            for ( int i = triplet.length - 1; i >= 0; i-- ) {
                char c = triplet[i];
                if ( work.indexOf( c ) < 0 ) {
                    work = work + c;
                }
                if ( i < triplet.length - 1 ) {
                    work = moveBefore( work, c, triplet[i+1] );
                }
            }
        }
        return work;
    }

    private String moveBefore( String str, char moveChar, char moveBeforeChar ) {
        int currIdx = str.indexOf( moveChar );
        int idx = str.indexOf( moveBeforeChar );
        if ( currIdx > idx ) {
            String work = str.replaceAll( String.valueOf( moveChar ), "" );
            return work.substring( 0, idx ) + moveChar + work.substring( idx );
        }
        return str;
    }

}
