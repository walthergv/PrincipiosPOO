package org.walther.abstraccion.model;

public class Autor {
    private int id;
    private String nombre;
    private String apellido;
    private String nacionalidad;

    public Autor(int id, String nombre, String apellido, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
    }

    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
}
