package org.walther.abstraccion.service;

import org.walther.abstraccion.model.Libro;

import java.util.ArrayList;
import java.util.List;

public class LibroImp implements ILibro {
    List<Libro> libros= new ArrayList<>();
    @Override
    public Libro registrar(Libro libro) {
        for (Libro l: libros){
            if(l.getId()==libro.getId()){
                System.out.println("ya existe un libro con ese id");
                return null;
            }
        }
        return libros.add(libro)?libro:null;
    }

    @Override
    public String getAll() {
        if (libros.size()==0){
            System.out.println("no hay libros registrados");
            return null;
        }
        System.out.println("Libros:");
        for (Libro libro: libros){
            System.out.println("- "+"\""+libro.getTitulo()+"\""+" escrito por "+libro.getAutor().getNombre()+" "+libro.getAutor().getApellido());
        }
        return null;
    }

    @Override
    public void eliminarLibro(int id) {
        for (Libro libro: libros){
            if (libro.getId()==id){
                libros.remove(libro);
                System.out.println("* se ha eliminado el libro \""+libro.getTitulo()+"\"");
                return;
            }
        }
    }
}
