package com.johnny.pack.age;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Toyota tacoma = Toyota.modelColorIsManual("Tacoma", "Black", true);
        System.out.println(tacoma.displayCar());
        System.out.println(tacoma.offRoad());
        System.out.println();
        Ford mustang = Ford.modelColorIsManualTopSpeed("Mustang", "Red", true, 195);
        System.out.println(mustang.displayCar());
        System.out.println(mustang.burnout());
    }
}
