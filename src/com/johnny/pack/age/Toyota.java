package com.johnny.pack.age;

public class Toyota implements Car {
    private final String model;
    private final String color;
    private final String transmission;

    private Toyota(String model, String color, String transmission){
        this.model = model;
        this.color = color;
        this.transmission = transmission;
    }

    public static Toyota modelColorIsManual(String model, String color, boolean isManual){
        return new Toyota(model, color, transmissionType(isManual));
    }

    private static String transmissionType(boolean isManual){
        return isManual ? "Manual" : "Automatic";
    }

    public String offRoad(){
        return "Drive over rocks and stuff";
    }

    @Override
    public String displayCar() {
        String message = "Model: " + model + "\nColor: " + color +
                "\nTransmission: " + transmission;
        return message;
    }
}
