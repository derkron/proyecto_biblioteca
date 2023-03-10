package com.cristian.gestionLibros.Servicios;


import com.cristian.gestionLibros.entidades.Autor;
import com.cristian.gestionLibros.entidades.Editorial;
import com.cristian.gestionLibros.repositorios.EditorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditorialService {
    @Autowired
    EditorialRepository editorialRepository;

    public Editorial crearEditorial(Editorial nuevaEditorial) {

        return editorialRepository.save(nuevaEditorial);

    }

    public List<Editorial> listarEditorial(){
        return editorialRepository.findAll();
    }


    public void eliminarEditorial(Integer id){
        editorialRepository.deleteById(id);
    }

    public Editorial obtenerEditorial(Integer id) {

        return editorialRepository.findById(id).orElse(null);
    }
}

