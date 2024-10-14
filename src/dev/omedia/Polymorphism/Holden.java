package dev.omedia.Polymorphism;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    protected String startEngine() {
        return "Holden's engine is starting.";
    }

    @Override
    protected String accelerate() {
        return "Holden car is accelerating";
    }

    @Override
    protected String brake() {
        return "Holden car is braking.";
    }
}
