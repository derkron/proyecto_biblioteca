package com.cristian.gestionLibros.controller;

import com.cristian.gestionLibros.Servicios.LibroService;
import com.cristian.gestionLibros.entidades.Autor;
import com.cristian.gestionLibros.entidades.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/api/libro")
public class LibroController {
    @Autowired
    LibroService libroService;

    @PostMapping(value = "/guardar_libro")
    public Libro guardarLibro(@RequestBody Libro libro) {
        return libroService.crearLibro(libro);
    }

    @GetMapping("/listar_libro")
    public List<Libro> listarLibro(){
        return libroService.listarLibros();
    }
    @GetMapping("/libro/{id}")
    public ResponseEntity<Libro> obtenerLibro(@PathVariable Integer id){
        try {
            Libro libro=libroService.obtenerLibro(id);
            return new ResponseEntity<Libro>(libro, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Libro>(HttpStatus.NOT_FOUND);
        }
    }
}
