package com.cristian.gestionLibros.controller;

import com.cristian.gestionLibros.Servicios.InfoAdicionalService;
import com.cristian.gestionLibros.entidades.Autor;
import com.cristian.gestionLibros.entidades.InfoAdicional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/api/info")
public class InfoAdicionalController {
    @Autowired
    InfoAdicionalService infoAdicionalService;

    @PostMapping(value = "/guardar_info")
    public InfoAdicional guardarInfo(@RequestBody InfoAdicional infoAdicional) {
        return infoAdicionalService.crearInfo(infoAdicional);
    }


    @GetMapping("/listar_info")
    public List<InfoAdicional> listarInfo(){
        return infoAdicionalService.listarInfo();
    }
    @GetMapping("/ifoadicional/{id}")
    public ResponseEntity<InfoAdicional> obtenerInfo(@PathVariable Integer id){
        try {
            InfoAdicional infoAdicional=infoAdicionalService.obtenerInfo(id);
            return new ResponseEntity<InfoAdicional>(infoAdicional, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<InfoAdicional>(HttpStatus.NOT_FOUND);
        }
    }

}
