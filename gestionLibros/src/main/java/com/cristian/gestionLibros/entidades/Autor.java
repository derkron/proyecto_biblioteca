package com.cristian.gestionLibros.entidades;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity

public class Autor {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;


    private String nombre;

    @ManyToMany(mappedBy = "autores")
    private Set<Libro> libro;

    public Autor(Integer id, String nombre, Set<Libro> libros) {
        this.id = id;
        this.nombre = nombre;
        this.libro = libros;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Libro> getLibros() {
        return libro;
    }

    public void setLibros(Set<Libro> libros) {
        this.libro = libro;
    }

    public Autor() {
    }
}
