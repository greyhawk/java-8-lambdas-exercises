package com.insightfullogic.java8.exercises.chapter2;

import java.util.function.Predicate;

/**
 * Created by ging on 02/06/2017.
 */


interface IntPred {
    boolean test(Integer value);
}

public class Question3 {
    
    boolean check(Predicate<Integer> predicate) {
        return true;
    }

    boolean check(IntPred predicate) {
        return true;
    }

    public static void main(String[] args) {
        Question3 q3 = new Question3();
        // q3.check(x -> x > 5);
    }
}
