package org.example.arge;

public class ElectricCar extends CarSkeleton{
    public double avgKmPerCharge;
    public int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName());
        System.out.println("ElectricCar's engine has started");
    }

    @Override
    public void drive() {
        runEngine();
        System.out.println("Driving the electric car");
    }
}
