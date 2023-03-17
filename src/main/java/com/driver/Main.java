package com.driver;

public class Main {

    public static void main(String[] args) {

        RWOnly obj = new RWOnly();

        obj.setter("encapsulation");
        String ans = obj.getter();
        System.out.println(ans);
    }
  
}