package com.cristian.gestionLibros.entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity

public class Categoria {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;


    private String nombre;

    @OneToMany( mappedBy = "categoria")
    private List<Libro> libro;

    public Categoria() {
    }

    public Categoria(Integer id, String nombre, List<Libro> libro) {
        this.id = id;
        this.nombre = nombre;
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
    public List<Libro> getLibro() {
        return libro;
    }

    public void setLibro(List<Libro> libro) {
        this.libro = libro;
    }


}
