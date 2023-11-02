package org.walther;

import org.walther.abstraccion.model.Autor;
import org.walther.abstraccion.model.Libro;
import org.walther.abstraccion.service.AutorImp;

import org.walther.abstraccion.service.LibroImp;
import org.walther.herencia.Bus;
import org.walther.herencia.Car;
import org.walther.herencia.Motorcycle;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println("--------------------------------------------------------------------");
        //--------------------------------------------------------------------------------------

        AutorImp autorImp = new AutorImp();

        Autor autor1 = new Autor(1, "Ricardo", "Palma", "Peruano");
        Autor autor2 = new Autor(2, "Pablo", "Neruda", "Chileno");
        Autor autor3 = new Autor(3, "Cesar", "Vallejo", "Peruano");

        for (Autor autor: List.of(autor1, autor2, autor3)) {
            autorImp.registrar(autor);
        }

        autorImp.getAll();
        autorImp.eliminar(2);
        autorImp.getAll();
        System.out.println("--------------------------------------------------------------------");
        // ------------------------------------------------------------------------------------------

        LibroImp libroImp = new LibroImp();
        Libro libro1 = new Libro(1, "Trilce", autor3);
        Libro libro2 = new Libro(2, "Cien años de soledad", autor2);
        Libro libro3 = new Libro(3, "El ingenioso hidalgo don Quijote de la Mancha", autor1);

        for (Libro libro: List.of(libro1, libro2, libro3)) {
            libroImp.registrar(libro);
        }
        libroImp.getAll();
        libroImp.eliminarLibro(2);
        libroImp.getAll();
    }
}