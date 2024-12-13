package com.example;

public class HelloWorld {
    public static void main(String[] args) {
        //java data type  2 (integer), hello (string), 3.5 (float/double), c (character)
        String name = "anup";

        long phone = 23423432423L;


        //println
        System.out.println("hello world " + name);
        System.out.println("hello world " + name);
        System.out.printf("hello world %s %n", name); //%n new line



        // interesting
        Integer a = 10;
        int b = 20; //by default number integer


        // datatype - primitive (int, float, long, double,char) - wrapper class (Integer, Float, Long, Double,Character,String)
        float c= 2.6f; //range by default decimal double

        // more interesting
// datatype hierarchy -> string,char, double, float, long, int
         // imlicit typecasting - small datatype converts to big data type

        System.out.println('a');
        System.out.println(2+2);
        System.out.println((int)(2+2.5)); //explicit typecasting -> classes, big datatype to smaller datatype

    }
}
