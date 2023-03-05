package com.cristian.gestionLibros.controller;

import com.cristian.gestionLibros.Servicios.CategoriaService;
import com.cristian.gestionLibros.entidades.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/categoria")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @PostMapping(value = "/crear")
    public Categoria crearCategoria(@RequestBody Categoria categoria) {
        return categoriaService.crearCategoria(categoria);
    }

    @GetMapping(value = "/consultar")
    public Categoria consultarCategoria(Integer id) {
        return categoriaService.obtenerCategoria(id);
    }
}
