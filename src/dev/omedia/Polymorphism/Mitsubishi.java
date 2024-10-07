package dev.omedia.Polymorphism;

public class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    protected String startEngine() {
        return "Mitsubishi's engine is starting.";
    }

    @Override
    protected String accelerate() {
        return "Mitsubishi car is accelerating";
    }

    @Override
    protected String brake() {
        return "Mitsubishi car is braking.";
    }
}
