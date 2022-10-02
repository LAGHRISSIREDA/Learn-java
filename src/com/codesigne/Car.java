package com.codesigne;

public class Car {
    String make = "chvrolet";
    String model = "corvette";
    int year = 2001;

     public Car(){

     }

     public Car(Car x){
         this.copy(x);
     }

//     getter
    public String getMake(){return this.make;}
    public String getModel(){return this.model;}
    public int getYear(){return this.year;}

//    setters
    public void setMake(String make){this.make = make;}
    public void setModel(String model){this.model = model;}
    public void setYear(int year){this.year = year;}


     public void copy(Car x){
         this.setMake(x.getMake());
         this.setModel(x.getModel());
         this.setYear(x.getYear());
     }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
