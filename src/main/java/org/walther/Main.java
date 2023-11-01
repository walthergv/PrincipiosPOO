package org.walther;

import org.walther.herencia.Bus;
import org.walther.herencia.Car;
import org.walther.herencia.Motorcycle;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(4, "camry", "toyota");
        System.out.println("My car: ");
        car.info(); // el metodo info es heredado de la clase Vehicle

        Motorcycle motorcycle = new Motorcycle(true, "croos", "montañera");
        System.out.println("\nMy motorcycle:");
        motorcycle.info();

        Bus bus = new Bus(true, "m-213", "mercedes benz");
        System.out.println("\nMy bus:");
        bus.info();
    }
}