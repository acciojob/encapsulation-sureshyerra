package com.driver;

public class RWOnly {
     private String name;

     public String setter(String setname){
          this.name = setname;
          return name;
     }
     public void getter(){
          System.out.println(name);
     }
}
