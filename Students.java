package com.java.Demos;

import java.util.ArrayList;
import java.util.List;

public class Students {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("Sathish");
        li.add("Sai");
        li.add("Santhosh");
        li.add("kumar");
        li.add("Kavin");
        li.add("Sanjay");
        li.add("Ashok");
        li.add("Prabu");
        li.add("Karthi");
        li.add("Mano");

        li
                .stream()
                .filter(name-> name.startsWith("S"))
                .forEach(System.out::println);


    }
}
