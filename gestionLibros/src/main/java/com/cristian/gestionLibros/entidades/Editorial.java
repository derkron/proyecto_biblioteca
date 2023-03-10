package com.cristian.gestionLibros.entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity

public class Editorial {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String nombre;


    @OneToMany( mappedBy = "editorial")
    private List<Libro> libro;

    public Editorial() {
    }

    public Editorial(Integer id, String nombre, List<Libro> libros) {
        this.id = id;
        this.nombre = nombre;
        this.libro = libros;
    }

    public List<Libro> getLibros() {
        return libro;
    }

    public void setLibros(List<Libro> libros) {
        this.libro = libro;
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
}
