package org.walther.abstraccion.service;

import org.walther.abstraccion.model.Autor;

import java.util.ArrayList;
import java.util.List;

public class AutorImp implements IAutor {

    List<Autor> autores = new ArrayList<>();
    @Override
    public Autor registrar(Autor autor) {
        for (Autor autor1: autores) {
            if (autor1.getId()==autor.getId()) {
                System.out.println("ya existe un autor con ese id");
                return null;
            }
        }
        System.out.println("se ha registrado el autor "+autor.getNombre()+" "+autor.getApellido());
        return autores.add(autor)?autor:null;
    }

    @Override
    public String getAll() {
        if (autores.size()==0) {
            System.out.println("no hay autores registrados");
            return null;
        }
        System.out.println("Autores:");
        for (Autor autor: autores) {
            System.out.println("- "+autor.getNombre()+" "+autor.getApellido());
        }
        return null;
    }

    @Override
    public void eliminar(int id) {
        for (Autor autor: autores) {
            if (autor.getId()==id) {
                autores.remove(autor);
                System.out.println("se ha eliminado el autor "+autor.getNombre()+" "+autor.getApellido());
                return;
            }
        }
    }
}
