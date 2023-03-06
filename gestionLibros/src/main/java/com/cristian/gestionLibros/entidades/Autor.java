package com.cristian.gestionLibros.entidades;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "/autor")
public class Autor {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;


    private String nombre;

    @ManyToMany(mappedBy = "autores")
    private Set<Libro> libros;


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
        return libros;
    }

    public void setLibros(Set<Libro> libros) {
        this.libros = libros;
    }
}
