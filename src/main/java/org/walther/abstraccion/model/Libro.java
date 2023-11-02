package org.walther.abstraccion.model;

public class Libro {
    private int id;
    private String titulo;
    private Autor autor;

    public Libro(int id, String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.id= id;
    }
    public int getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }
    public Autor getAutor() {
        return autor;
    }
}
