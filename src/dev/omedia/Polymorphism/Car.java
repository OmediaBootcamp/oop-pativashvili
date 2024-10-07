package dev.omedia.Polymorphism;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    protected String startEngine() {
        return "car's engine is starting.";
    }

    protected String accelerate() {
        return "car is accelerating.";
    }

    protected String brake() {
        return "the car is braking.";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
