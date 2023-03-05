package com.cristian.gestionLibros.Servicios;

import com.cristian.gestionLibros.entidades.Autor;
import com.cristian.gestionLibros.repositorios.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService {
    @Autowired
    AutorRepository autorRepository;

    public Autor crearAutor(Autor nuevoAutor) {
        return autorRepository.save(nuevoAutor);
    }

    public Autor obtenerAutor(Integer id) {
        return autorRepository.findById(id).orElse(null);
    }
}
