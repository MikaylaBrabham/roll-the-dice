package com.pluralsight;

public class RollTheDice {
    public static void main(String[] args) {

            //add dice
            Dice dice = new Dice();

            // 2,4,6,7 roll count
            int two = 0;
            int four = 0;
            int six = 0;
            int seven = 0;


            //add for
            for (int i = 1; i <= 100; i++) {

                //add int variables
                int roll1 = dice.roll();
                int roll2 = dice.roll();
                int sum = roll1 + roll2;

                //print statement
                System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + " Sum: " + sum);

                //determine if sum is equal to special cases

                if(sum == 2) {
                    two++;
                }
                if(sum == 4) {
                    four++;
                }
                if(sum == 6) {
                    six++;
                }
                if(sum == 7) {
                    seven++;
                }
            }

            //print counters
            System.out.println("2 was rolled " + two + " times");
            System.out.println("4 was rolled " + four + " times");
            System.out.println("6 was rolled " + six + " times");
            System.out.println("7 was rolled " + seven + " times");
        }
    }


