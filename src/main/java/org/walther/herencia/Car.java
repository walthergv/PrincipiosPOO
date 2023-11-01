package org.walther.herencia;

public class Car extends Vehicle{
    private int numDoors;
    public Car (int numDoors, String brand, String model){
        super(brand,model); // atributos de la clase padre
        this.numDoors=numDoors;
    }
    // Sobreescritura del método getMaxSpeed de la clase padre (Vehicle)
    @Override
    public int getMaxSpeed(){
        return 200;
    }
}
