package dev.omedia.Polymorphism;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    protected String startEngine() {
        return "Ford's engine is starting.";
    }

    @Override
    protected String accelerate() {
        return "Ford car is accelerating";
    }

    @Override
    protected String brake() {
        return "Ford car is braking.";
    }

}
