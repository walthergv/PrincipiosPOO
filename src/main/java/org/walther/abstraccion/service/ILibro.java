package org.walther.abstraccion.service;

import org.walther.abstraccion.model.Autor;
import org.walther.abstraccion.model.Libro;

public interface ILibro {
    Libro registrar(Libro libro);
    String getAll();
    void eliminarLibro(int id);
}
