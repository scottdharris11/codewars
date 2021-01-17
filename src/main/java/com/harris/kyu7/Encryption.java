package com.harris.kyu7;

public class Encryption {
    public static String encrypt(final String text, final int n) {
        if ( text == null || text.length() < 2 ) {
            return text;
        }
        String result = text;
        for ( int i = 0; i < n; i++ ) {
            result = scrambleString( result, true );
        }
        return result;
    }

    public static String decrypt(final String encryptedText, final int n) {
        if ( encryptedText == null || encryptedText.length() < 2 ) {
            return encryptedText;
        }
        String result = encryptedText;
        for ( int i = 0; i < n; i++ ) {
            result = scrambleString( result, false );
        }
        return result;
    }

    private static String scrambleString( String text, boolean scramble ) {
        char[] textChars = text.toCharArray();
        int len = text.length();
        int charIdx = 1;
        char[] scrambleChars = new char[len];
        for ( int i = 0; i < len; i++ ) {
            if ( scramble ) {
                scrambleChars[i] = textChars[charIdx];
            } else {
                scrambleChars[charIdx] = textChars[i];
            }
            charIdx += 2;
            if ( charIdx > len - 1 ) {
                charIdx -= len;
                if ( charIdx == 1 ) {
                    charIdx = 0;
                }
            }
        }
        return String.valueOf( scrambleChars );
    }

}
