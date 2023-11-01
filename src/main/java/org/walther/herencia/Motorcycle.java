package org.walther.herencia;

public class Motorcycle extends Vehicle{
    private boolean hasFairing;
    public Motorcycle(boolean hasFairing, String model, String brand){
        super(model, brand); // atributos de la clase padre
        this.hasFairing=hasFairing;
    }
    // Sobreescritura del método getMaxSpeed de la clase padre (Vehicle)
    @Override
    public int getMaxSpeed(){
        return 350;
    }
}
