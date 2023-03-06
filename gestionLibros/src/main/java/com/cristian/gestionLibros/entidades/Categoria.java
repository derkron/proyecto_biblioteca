package com.cristian.gestionLibros.entidades;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity

public class Categoria {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;


    private String nombre;

    @OneToMany( fetch = FetchType.LAZY, cascade =CascadeType.ALL)
    @JoinColumn(name = "categoria_id")
    private Set<Libro> libro;



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
        this.libro = libros;
    }
}
