package com.driver;

public class Main {

    public static void main(String[] args) {

        RWOnly obj = new RWOnly();

        obj.setter(5);
        obj.getter();
    }
  
}