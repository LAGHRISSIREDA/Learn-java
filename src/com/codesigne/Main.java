package com.codesigne;

public class Main {
    public static void main(String[] args) {
        //declaration
//        Car c = new Car();
//        System.out.println(c.model);
//        DiceRoller diceRoller = new DiceRoller();
//        Car car1 = new Car();
//        car1.setMake("dacia");
//        car1.setModel("4/4");
//        car1.setYear(2022);
//        System.out.println(car1.toString());
//        Car car2 = new Car(car1);
//        System.out.println(car2.toString());
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicule[] racers = {boat,bicycle};
        for (Vehicule x:racers) {
           
            x.go();
        }


    }
}
