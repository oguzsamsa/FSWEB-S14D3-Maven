package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void startEngine() {
        System.out.println(getClass().getSimpleName());
        System.out.println("Engine has started");
    }

    public void drive(){
        runEngine();
        System.out.println("Driving the car");
    }

    protected void runEngine(){
        System.out.println("Engine is running");
    }
}
