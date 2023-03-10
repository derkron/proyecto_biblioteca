package com.cristian.gestionLibros.Servicios;

import com.cristian.gestionLibros.entidades.Autor;
import com.cristian.gestionLibros.entidades.InfoAdicional;
import com.cristian.gestionLibros.repositorios.InfoAdicionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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


    public List<InfoAdicional> listarInfo(){
        return infoAdicionalRepository.findAll();
    }


    public void eliminarInfo(Integer id){
        infoAdicionalRepository.deleteById(id);
    }

}
