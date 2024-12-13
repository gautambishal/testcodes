package com.example.collections;

import java.util.Arrays;
import java.util.function.BiFunction;

public class ArrayFirst {
    BiFunction<Integer,Integer,Double> multipleFunctionalAppraoch = (a,b) -> (a*b)/0.5;

    public static void main(String[] args) {
       ArrayFirst af = new ArrayFirst();
        double sumOfTWoNumbersTwo = af.multipleFunctionalAppraoch.apply(10,20);
        System.out.println(sumOfTWoNumbersTwo);
    }



}
