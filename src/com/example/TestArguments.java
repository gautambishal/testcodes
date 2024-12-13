package com.example;

import java.util.Arrays;

public class TestArguments {

    public static void main(String... args) {
        System.out.println(System.getenv(""));
        Arrays.stream(args).forEach(System.out::println);
        int[] a = {4,5,6,76,5};
        sumOfNumbers();
        sumOfNumbers(2,4,5,6);
        sumOfNumbers(a);

    }
    //var-args method
    public static void sumOfNumbers(int... numbers){
        //null input, (2,3,4,5), array
        if(numbers.length==0){
            System.out.println("your sum is 0");
        }else{
            System.out.println(Arrays.stream(numbers).sum());
        }

    }
}
