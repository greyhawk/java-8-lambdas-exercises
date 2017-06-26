package com.insightfullogic.java8.exercises.chapter3;

import com.insightfullogic.java8.examples.chapter1.Artist;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Question2 {

    // Q3
    public static long countBandMembersInternal(List<Artist> artists) {
        return artists.stream().flatMap(Artist::getMembers).count();
    }

}
