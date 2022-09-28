package com.reda;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random random = new Random();
        //int number = random.nextInt(6)+1;
       // double number = random.nextDouble();
        boolean number = random.nextBoolean();
        System.out.println(number);
    }
}
