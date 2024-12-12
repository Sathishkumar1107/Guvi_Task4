package com.java.Demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringList {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");


        List<String> nonEmptyStrings = strings.stream()
                .filter(s -> !s.isEmpty())
                .toList();


        System.out.println("Non-empty strings: " + nonEmptyStrings);


    }
}
