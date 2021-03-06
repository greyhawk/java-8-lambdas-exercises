package com.insightfullogic.java8.exercises.chapter3;

import com.insightfullogic.java8.exercises.Exercises;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class StringExercises {

    // Question 7
    public static int countLowercaseLetters(String string) {
        return (int)string.chars().filter(Character::isLowerCase).count();
    }

    // Question 8
    public static Optional<String> mostLowercaseString(List<String> strings) {
        Function<String, Long> maxLowerCaseLength = s -> s.chars().filter(Character::isLowerCase).count();
        return strings.stream().max(Comparator.comparing(maxLowerCaseLength));
    }

}
