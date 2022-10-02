package com.codesigne;

import java.util.Random;

public class DiceRoller {
    int number = 0;
    Random random;
    public DiceRoller(){
        random = new Random();
        roll();
    }

    public void roll(){
        number = random.nextInt(4)+1;
        System.out.println(number);
    }
}
