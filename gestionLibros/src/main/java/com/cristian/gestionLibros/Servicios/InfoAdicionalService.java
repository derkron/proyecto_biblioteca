package com.cristian.gestionLibros.Servicios;

import com.cristian.gestionLibros.entidades.InfoAdicional;
import com.cristian.gestionLibros.repositorios.InfoAdicionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoAdicionalService {
    @Autowired
    InfoAdicionalRepository infoAdicionalRepository;

    public InfoAdicional crearInfo(InfoAdicional nuevaInfo) {
        return infoAdicionalRepository.save(nuevaInfo);
    }

    public InfoAdicional obtenerInfo(Integer id) {
        return infoAdicionalRepository.findById(id).orElse(null);
    }
}
