package com.cristian.gestionLibros.controller;

import com.cristian.gestionLibros.Servicios.InfoAdicionalService;
import com.cristian.gestionLibros.entidades.InfoAdicional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/api/info")
public class InfoAdicionalController {
    @Autowired
    InfoAdicionalService infoAdicionalService;

    @PostMapping(value = "/guardar_info")
    public InfoAdicional guardarInfo(@RequestBody InfoAdicional infoAdicional) {
        return infoAdicionalService.crearInfo(infoAdicional);
    }

    @GetMapping(value = "/obtener_info")
    public InfoAdicional obtenerInfo(Integer id) {
        return infoAdicionalService.obtenerInfo(id);
    }

}
