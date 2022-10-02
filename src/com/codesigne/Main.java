package com.codesigne;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
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
//        Scanner scan = new Scanner(System.in);
//
//       try{
//           System.out.println("Enter number : ");
//           int number1 = scan.nextInt();
//           System.out.println("Enter other number : ");
//           int number2 = scan.nextInt();
//           int result = number1/number2;
//           System.out.println("The result is : "+result);
//
//       }catch(ArithmeticException e){
//           System.out.println("You can't devide by Zero !!! Idiot");
//       }catch (InputMismatchException e){
//           System.out.println("Please enter two numbers");
//       }catch (Exception e){
//           System.out.println("Something went Wrong");
//       }finally {
//           scan.close();
//       }

//       ************************************************ File practice *******************************
//        File file = new File("secret_message.txt");
//        if(file.exists()){
//            System.out.println("That file existes ! :o!");
//            System.out.println(file.getAbsoluteFile());
//            System.out.println(file.getPath());
//            System.out.println(file.isFile());
//
//        }else{
//            System.out.println("That file doesn't exist :(");
//        }
//        try{
//            FileWriter writer = new FileWriter("poem.txt");
//            writer.write("Roses are red\nViolets are blue \nBooty booty boot");
//            writer.append("\nadd new ine to the peom");
//            writer.close();
//        }catch(IOException e){
//            e.printStackTrace();
//        }

//        try{
//            FileReader reader = new FileReader("poem.txt");
//            int data = reader.read();
//            while(data != -1){
//                System.out.print((char) data);
//                data = reader.read();
//            }
//            reader.close();
//
//        }catch(IOException e){
//            e.printStackTrace();
//        }

//        ***************************** Jframe ****************************
//        JFrame frame = new JFrame();
//        frame.setSize(420,420);
//        frame.setTitle("Jframe title goes here !!");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(false);
//        frame.getContentPane().setBackground(Color.red);
//        frame.setVisible(true);

//        ********************************* enum **************************************
        Planet myPlanet = Planet.EARTH;
        canILiveHere(myPlanet);
    }

    static void canILiveHere(Planet myPlanet){
        switch (myPlanet){
            case EARTH :
                System.out.println("You can Live here :)");
                System.out.println("this is Plannet number #"+myPlanet.number);
             break;
            default :
                System.out.println("You can't live here .... YET");
                System.out.println("this is Plannet number #"+myPlanet.number);
            break;
        }
    }
}
