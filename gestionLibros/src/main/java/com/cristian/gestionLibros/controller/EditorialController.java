package com.cristian.gestionLibros.controller;

import com.cristian.gestionLibros.Servicios.EditorialService;
import com.cristian.gestionLibros.entidades.Autor;
import com.cristian.gestionLibros.entidades.Editorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/api/editorial")

public class EditorialController {
    @Autowired
    EditorialService editorialService;

    @PostMapping(value = "crear_editorial")
    public Editorial guardarEditorial(@RequestBody Editorial editorial) {
        return editorialService.crearEditorial(editorial);
    }

    @GetMapping("/listar/editoriales")
    public List<Editorial> listarEditorial(){
        return editorialService.listarEditorial();
    }
    @GetMapping("/obtener/editorial/{id}")
    public ResponseEntity<Editorial> obtenerEditorial(@PathVariable Integer id){
        try {
            Editorial editorial=editorialService.obtenerEditorial(id) ;
            return new ResponseEntity<Editorial>(editorial, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Editorial>(HttpStatus.NOT_FOUND);
        }

    }
}
