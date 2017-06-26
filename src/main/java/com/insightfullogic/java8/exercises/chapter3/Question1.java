package com.insightfullogic.java8.exercises.chapter3;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.Artist;
import com.insightfullogic.java8.exercises.Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Question1 {

    public static int addUp(Stream<Integer> numbers) {
        return numbers.reduce(0, (x, y) -> x + y);
    }

    public static List<String> getNamesAndOrigins(List<Artist> artists) {
        Function<Artist, Stream<String>> mapToNameAndNationality = artist -> Stream.of(artist.getName(), artist.getNationality());
        return artists
                .stream()
                .flatMap(mapToNameAndNationality)
                .collect(toList());
    }

    public static List<Album> getAlbumsWithAtMostThreeTracks(List<Album> input) {
        Predicate<Album> noMoreThanThreeAlbum = album -> album.getTrackList().size() <= 3;
        return input.stream().filter(noMoreThanThreeAlbum).collect(toList());
    }
}
