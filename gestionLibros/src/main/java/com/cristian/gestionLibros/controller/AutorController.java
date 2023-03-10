package com.cristian.gestionLibros.controller;

import com.cristian.gestionLibros.Servicios.AutorService;
import com.cristian.gestionLibros.entidades.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/autor")
public class AutorController {
    @Autowired
    AutorService autorService;

    @PostMapping("/crear")
    public Autor agregarAutor(@RequestBody Autor autor) {
        return autorService.crearAutor(autor);
    }


    @GetMapping("/listar/autores")
    public List<Autor> listarAutor(){
        return autorService.listarAutor();
    }
    @GetMapping("/autores/{id}")
    public ResponseEntity<Autor> obtenerAutor(@PathVariable Integer id){
        try {
            Autor autor= autorService.obtenerAutor(id);
            return new ResponseEntity<Autor>(autor,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Autor>(HttpStatus.NOT_FOUND);
        }
    }
}
