package com.codesigne;

import java.util.InputMismatchException;
import java.util.Scanner;

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
//        Bicycle bicycle = new Bicycle();
//        Boat boat = new Boat();
//
//        Vehicule[] racers = {boat,bicycle};
//        for (Vehicule x:racers) {
//
//            x.go();
//        }
//        ************************************************** dynamic plymorphism*******************
//        Scanner scan = new Scanner(System.in);
//        Animal animal;
//
//        System.out.println("What Animal do you want ?");
//        System.out.println("(1=Dog) Or (2=Cat)");
//        int choice = Integer.parseInt(scan.nextLine());
//        if(choice == 1){
//            animal = new Dog();
//            animal.speak();
//        }else if (choice == 2){
//            animal = new Cat();
//            animal.speak();
//        }else{
//            animal = new Animal();
//            animal.speak();
//        }

//        ************************************* catch exception***********************
        Scanner scan = new Scanner(System.in);

       try{
           System.out.println("Enter number : ");
           int number1 = scan.nextInt();
           System.out.println("Enter other number : ");
           int number2 = scan.nextInt();
           int result = number1/number2;
           System.out.println("The result is : "+result);

       }catch(ArithmeticException e){
           System.out.println("You can't devide by Zero !!! Idiot");
       }catch (InputMismatchException e){
           System.out.println("Please enter two numbers");
       }catch (Exception e){
           System.out.println("Something went Wrong");
       }finally {
           System.out.println("this will always print");
       }


    }
}
