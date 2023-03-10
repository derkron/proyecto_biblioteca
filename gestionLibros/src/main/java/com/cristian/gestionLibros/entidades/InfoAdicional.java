package com.cristian.gestionLibros.entidades;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "infoAdicional")
public class InfoAdicional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String idioma;

    private Date fechaPublicacion;

    @OneToOne(mappedBy = "infoAdicional",cascade = CascadeType.ALL,fetch =FetchType.LAZY )
    @JoinColumn(name ="libro_id")
    private Libro libro;


    public InfoAdicional() {
    }

    public InfoAdicional(Integer id, String idioma, Date fechaPublicacion, Libro libro) {
        this.id = id;
        this.idioma = idioma;
        this.fechaPublicacion = fechaPublicacion;
        this.libro = libro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
}
