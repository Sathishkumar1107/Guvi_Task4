package com.java.Demos;


import java.util.ArrayList;

public class UpperCase {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("aBc");
        al.add("d");
        al.add("ef");

        al
                .stream()
                .sorted()
                .map(letters -> letters.toUpperCase())
                .forEach(System.out::println);
    }
}
