package com.pluralsight;

import java.math.*;

public class Dice {

    //add roll
    public int roll() {

        //max & max value
        int maxValue = 6;
        int minValue = 1;

        //add random
        int randomNumber = (int) (Math.random() * maxValue) + minValue;

        return randomNumber;
    }
}
