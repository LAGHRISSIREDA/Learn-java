package com.reda;

public class InnerDemo {
    public static void main(String[] args) {
        //create Outer object
        Outer obj = new Outer();
        obj.show();

        Outer.Inner obj1 = obj.new Inner();
        obj1.display();
    }
}

class Outer{
    int a;
    public void show(){
        System.out.println("Hello from show function from OUTER");
    }

    class Inner{
      public void display(){
          System.out.println("Hello from display function");
      }
    }
}
