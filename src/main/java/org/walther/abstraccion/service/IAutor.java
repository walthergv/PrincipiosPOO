package org.walther.abstraccion.service;

import org.walther.abstraccion.model.Autor;

public interface IAutor {
    Autor registrar(Autor autor);

    String getAll();

    void eliminar(int id);
}
