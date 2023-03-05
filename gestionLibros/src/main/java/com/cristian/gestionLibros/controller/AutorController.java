package com.cristian.gestionLibros.controller;

import com.cristian.gestionLibros.Servicios.AutorService;
import com.cristian.gestionLibros.entidades.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/autor")
public class AutorController {
    @Autowired
    AutorService autorService;

    @PostMapping("/crear")
    public Autor agregarAutor(@RequestBody Autor autor) {
        return autorService.crearAutor(autor);
    }

    @GetMapping("/obtener_autor")
    public Autor obtenerAutor(Integer id) {
        return autorService.obtenerAutor(id);
    }

}
