package com.insightfullogic.java8.exercises.chapter2;

import com.insightfullogic.java8.exercises.Exercises;

import javax.swing.text.DateFormatter;

import java.util.function.Predicate;

import static java.lang.ThreadLocal.withInitial;

public class Question2 {

    public static ThreadLocal<DateFormatter> formatter
            = Exercises.replaceThisWithSolution();

    public static Runnable helloWorld = () -> System.out.println("Hello world.");

}




