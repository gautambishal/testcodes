package com.example.collections;

import java.util.ArrayList;
import java.util.List;

import static java.util.List.of;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> myNumbers = new ArrayList<>();
        myNumbers.add("4");
        myNumbers.add("5");
        myNumbers.add("6");
        myNumbers.add("6");
        myNumbers.add("44");
        //Array, ArrayList, Set, Map, Vector

        // map => value modify
        // filter
        List<String> modifiedValkue = myNumbers.stream()
                .map(value -> {
            if(value.equals("6")){
               value = "mr"+value;
               return value;
            }
            else{
                value = "mrs"+ value;
                return value;
            }
        }).filter(value -> value.contains("mrs"))
                .toList();

        modifiedValkue.forEach(System.out::println);
    }
}
