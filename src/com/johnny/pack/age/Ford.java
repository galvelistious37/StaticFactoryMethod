package com.johnny.pack.age;

public class Ford implements Car {
    private final String model;
    private final String color;
    private final String transmission;
    private final int topSpeed;

    private Ford(String model, String color, String transmission, int topSpeed){
        this.model = model;
        this.color = color;
        this.transmission = transmission;
        this.topSpeed = topSpeed;
    }

    public static Ford modelColorIsManualTopSpeed(String model, String color, boolean isManual, int topSpeed){
        return new Ford(model, color, transmissionType(isManual), topSpeed);
    }

    private static String transmissionType(boolean isManual){
        return isManual ? "Manual" : "Automatic";
    }

    public String burnout(){
        return "SCRRRREEEEEECH! ... Tire tracks and stuff";
    }

    @Override
    public String displayCar() {
        String message = "Model: " + model +
                "\nColor: " + color +
                "\nTransmission: " + transmission +
                "\nTop Speed: " + topSpeed + "MPH";
        return message;
    }
}
