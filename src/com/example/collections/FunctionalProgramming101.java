package com.example.collections;

public class FunctionalProgramming101{

    public static void main(String[] args) {
        //interface object creation -> directly
        StringUtilities stringUtilities = (input -> input.length());
        int count = stringUtilities.count("hello");
        System.out.println(count);




    }

}
//class parent - extends, interface- implements
//functional interface -> that has only one method
interface StringUtilities{
    //abstract
    int count(String input);
}
