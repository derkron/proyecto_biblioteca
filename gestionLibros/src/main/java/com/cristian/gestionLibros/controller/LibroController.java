package com.cristian.gestionLibros.controller;

import com.cristian.gestionLibros.Servicios.LibroService;
import com.cristian.gestionLibros.entidades.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/libro")
public class LibroController {
    @Autowired
    LibroService libroService;

    @RequestMapping(value = "/guardar_libro")
    public Libro guardarLibro(@RequestBody Libro libro) {
        return libroService.crearLibro(libro);
    }

    @GetMapping(value = "/obtener_libro")
    public Libro obtenerLibro(Integer id) {
        return libroService.obtenerLibro(id);
    }
}
