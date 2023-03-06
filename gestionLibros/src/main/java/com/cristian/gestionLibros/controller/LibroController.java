package com.cristian.gestionLibros.controller;

import com.cristian.gestionLibros.Servicios.LibroService;
import com.cristian.gestionLibros.entidades.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/api/libro")
public class LibroController {
    @Autowired
    LibroService libroService;

    @PostMapping(value = "/guardar_libro")
    public Libro guardarLibro(@RequestBody Libro libro) {
        return libroService.crearLibro(libro);
    }

    @GetMapping(value = "/obtener_libro")
    public Libro obtenerLibro(Integer id) {
        return libroService.obtenerLibro(id);
    }
}
