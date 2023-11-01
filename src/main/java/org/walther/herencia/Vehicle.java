package org.walther.herencia;

public abstract class Vehicle {
    private String brand;
    private String model;

    // Metodo Constructor
    public Vehicle(String brand, String model){
        this.brand=brand;
        this.model=model;
    }

    // Metodo abstracto (sin implementacion)
    public abstract int getMaxSpeed();

    // Metodo no abstracto (concreto)
    public void info(){
        System.out.println("brand: " + brand);
        System.out.println("model: " + model);
        System.out.println("Max speed: " + getMaxSpeed() + " km/h");
    }
}