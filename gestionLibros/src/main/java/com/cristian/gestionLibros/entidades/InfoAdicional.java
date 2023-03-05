package com.cristian.gestionLibros.entidades;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "infoAdicional")
public class InfoAdicional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_info", nullable = false)
    private Integer id;

    @Column(length = 20)
    private String idioma;

    private Date fechaPublicacion;

    @OneToOne(mappedBy = "InfoAdicional")
    private Libro libro;


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
