package com.driver;

public class RWOnly {
     private int value;

     public int setter(int setvalue){
          this.value = setvalue;
          return value;
     }
     public void getter(){
          System.out.println(value);
     }
}
