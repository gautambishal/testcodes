package com.example;

public class SimpleBitwise {

    public static void main(String[] args) {

        //check odd or even -- swap two numbers


        int a =5;

        if((a&1)==0){
            System.out.println("is even");

        }

        // swap

        int n= 10;
        int m = 20;

        n = n^m;
        m=n^m;
        n=n^m;

        System.out.println(n);
        System.out.println(m);


    }
}
