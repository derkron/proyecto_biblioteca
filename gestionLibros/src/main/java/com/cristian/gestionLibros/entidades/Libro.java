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


    @JsonIgnoreProperties({"Libro","hibernateLazyInitializer","handler"})
    @ManyToOne
    private Categoria categorias;

    @JsonIgnoreProperties({"Libro","hibernateLazyInitializer","handler"})
    @ManyToOne(fetch = FetchType.LAZY)
    private Editorial editorial;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "infoadicional_id")
    private InfoAdicional infoAdicional;



    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "autor_libro",
        joinColumns ={@JoinColumn(name = "libro_id",referencedColumnName = "id")},
        inverseJoinColumns = {@JoinColumn(name = "autor_id",referencedColumnName = "id")})
    private Set<Autor> autores=new HashSet<>();




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

    public Categoria getCategorias() {
        return categorias;
    }

    public void setCategorias(Categoria categorias) {
        this.categorias = categorias;
    }

    public Set<Autor> getAutores() {
        return autores;
    }

    public void setAutores(Set<Autor> autores) {
        this.autores = autores;
    }
}
