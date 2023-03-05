package com.cristian.gestionLibros.entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "/autor")
public class Autor {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(nullable = false, length = 20)
    private String nombre;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Libro> libro;


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
