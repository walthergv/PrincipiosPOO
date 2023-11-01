package org.walther.herencia;

public class Bus extends Vehicle{
    private boolean isEducational;
    public Bus(boolean isEducational, String model, String brand){
        super(brand, model); // atributos de la clase padre
        this.isEducational=isEducational;
    }
    // Sobreescritura del método getMaxSpeed de la clase padre (Vehicle)
    @Override
    public int getMaxSpeed(){
        return 180;
    }
}
