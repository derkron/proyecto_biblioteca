package com.cristian.gestionLibros.Servicios;


import com.cristian.gestionLibros.entidades.Editorial;
import com.cristian.gestionLibros.repositorios.EditorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditorialService {
    @Autowired
    EditorialRepository editorialRepository;

    public Editorial crearEditorial(Editorial nuevaEditorial) {

        return editorialRepository.save(nuevaEditorial);
    }

    public Editorial obtenerEditorial(Integer id) {

        return editorialRepository.findById(id).orElse(null);
    }
}

