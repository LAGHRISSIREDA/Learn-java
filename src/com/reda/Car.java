package com.reda;

public class Car {
    //variable
    public String color;

    //constructor
    public Car(){};
    public Car(String colorName){
        this.color = colorName;
    }

    //get function
    public String getColor(){
        return this.color;
    }

    //main function
    public static void main(String[] args) {
        //declar new car
        Car c = new Car("pink");
        System.out.println("Car color is : "+c.getColor()+"\n");
        setColor(c);
        System.out.println("Car color is : "+c.getColor()+"\n");
    }

    //set new color
    public static void setColor(Car c){
        c.color = "blue";
    }


}
