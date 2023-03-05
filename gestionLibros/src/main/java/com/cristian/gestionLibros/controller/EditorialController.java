package com.cristian.gestionLibros.controller;

import com.cristian.gestionLibros.Servicios.EditorialService;
import com.cristian.gestionLibros.entidades.Editorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/api/editorial")

public class EditorialController {
    @Autowired
    EditorialService editorialService;

    @PostMapping(value = "crear_editorial")
    public Editorial guardarEditorial(@RequestBody Editorial editorial) {
        return editorialService.crearEditorial(editorial);
    }

    @GetMapping(value = "/obtener_editorial")
    public Editorial obtenerEditorial(Integer id) {
        return editorialService.obtenerEditorial(id);
    }
}
