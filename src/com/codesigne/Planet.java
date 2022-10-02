package com.codesigne;

public enum Planet {
    MERCURY(1),
    VENUS(2),
    EARTH(3),
    JUPITER(4),
    SATURN(5),
    URANUS(6),
    NEPTUNE(7),
    PLUTO(8);

    int number;

     Planet(int num){
        this.number = num;
    }
}
