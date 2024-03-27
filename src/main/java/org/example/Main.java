package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Hello world!");

        Car car = new Car(8, "Base car");

        System.out.println(car.startEngine());

        System.out.println(car.accelerate());

        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        System.out.println(mitsubishi.startEngine());

        System.out.println(mitsubishi.accelerate());

        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");

        System.out.println(ford.startEngine());

        System.out.println(ford.accelerate());

        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");

        System.out.println(holden.startEngine());

        System.out.println(holden.accelerate());

        System.out.println(holden.brake());*/

        CarSkeleton carSkeleton = new CarSkeleton("test", "test");
        carSkeleton.startEngine();
        carSkeleton.drive();

        CarSkeleton gasPoweredCar = new GasPoweredCar("gas", "powered", 15, 4);
        gasPoweredCar.startEngine();
        gasPoweredCar.drive();

        CarSkeleton hybridCar = new HybridCar("hybrid", "hybrid", 10, 10, 4);
        hybridCar.startEngine();
        hybridCar.drive();

        CarSkeleton electricCar = new ElectricCar("electric", "electric", 100, 50);
        electricCar.startEngine();
        electricCar.drive();
    }
}