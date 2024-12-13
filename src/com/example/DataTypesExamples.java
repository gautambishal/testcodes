package com.example;

public class DataTypesExamples {
    public static void main(String[] args) {

    //code -> bytecode(javac) -> java (byt


      String name="anup";
      String surname="bhurtel";

      StringBuilder sb = new StringBuilder(); //mutable - non-thread safe
      StringBuffer sb1 = new StringBuffer(); //mutable - thread safe

        System.out.println(name + surname); // extra size

        for(int i=0;i<100;i++){
            sb.append(name).append(surname).append(i);
        }

        System.out.println(sb);
    }
}
