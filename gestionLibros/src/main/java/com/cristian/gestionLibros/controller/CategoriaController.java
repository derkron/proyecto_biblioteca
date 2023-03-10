package com.cristian.gestionLibros.controller;

import com.cristian.gestionLibros.Servicios.CategoriaService;
import com.cristian.gestionLibros.entidades.Autor;
import com.cristian.gestionLibros.entidades.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/categoria")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @PostMapping(value = "/crear")
    public Categoria crearCategoria(@RequestBody Categoria categoria) {
        return categoriaService.crearCategoria(categoria);
    }

    @GetMapping("/consultar/categoria")
    public List<Categoria> listarCategoria(){
        return categoriaService.listarCategoria();
    }
    @GetMapping("/autores/{id}")
    public ResponseEntity<Categoria> obtenerCategoria(@PathVariable Integer id){
        try {
            Categoria categoria= categoriaService.obtenerCategoria(id);
            return new ResponseEntity<Categoria>(categoria, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Categoria>(HttpStatus.NOT_FOUND);
        }
    }
}
