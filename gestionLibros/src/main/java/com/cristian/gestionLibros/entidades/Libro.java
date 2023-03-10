package com.cristian.gestionLibros.entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.HashSet;

import java.util.Set;

@Entity

public class Libro {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String titulo;

    private String descripcion;


    private String favorito;



    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;


    @ManyToOne
    @JoinColumn(name = "editorial_id")
    private Editorial editorial;

    @OneToOne
    @JoinColumn(name = "infoadicional_id")
    private InfoAdicional infoAdicional;



    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "autor_libro",
        joinColumns ={@JoinColumn(name = "libro_id",referencedColumnName = "id")},
        inverseJoinColumns = {@JoinColumn(name = "autor_id",referencedColumnName = "id")})
    private Set<Autor> autores=new HashSet<>();

    public Libro() {
    }

    public Libro(Integer id, String titulo, String descripcion, String favorito, Categoria categoria, Editorial editorial, InfoAdicional infoAdicional, Set<Autor> autores) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.favorito = favorito;
        this.categoria = categoria;
        this.editorial = editorial;
        this.infoAdicional = infoAdicional;
        this.autores = autores;
    }

    public InfoAdicional getInfoAdicional() {
        return infoAdicional;
    }

    public void setInfoAdicional(InfoAdicional infoAdicional) {
        this.infoAdicional = infoAdicional;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFavorito() {
        return favorito;
    }

    public void setFavorito(String favorito) {
        this.favorito = favorito;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Set<Autor> getAutores() {
        return autores;
    }

    public void setAutores(Set<Autor> autores) {
        this.autores = autores;
    }
}
