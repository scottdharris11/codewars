package com.harris.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LikeTest {
    @Test
    public void likeTests() {
        assertEquals("no one likes this", Like.whoLikesIt());
        assertEquals("Peter likes this", Like.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", Like.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", Like.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", Like.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}
