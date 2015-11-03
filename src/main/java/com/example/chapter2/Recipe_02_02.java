package com.example.chapter2;

/**
 * Created by apovarkov on 03.11.15.
 */
public class Recipe_02_02 {
    public static void main(String[] args) {
        PoolCalculator calculator = new PoolCalculator();
        calculator.setLength(32);
        calculator.setWidth(16);
        calculator.setMaxDepth(8);
        calculator.setMinDepth(4);

        Volume volume = calculator::calculateVolume;

        double poolVolume = volume.calculateVolume();

        System.out.println("Volume of the pool is: " + poolVolume + " cubic feet");
        System.out.println("Gallons in the pool: " + calculator.calculateGallons(volume));
    }
}
