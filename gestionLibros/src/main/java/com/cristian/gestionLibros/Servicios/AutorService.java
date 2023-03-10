package com.cristian.gestionLibros.Servicios;

import com.cristian.gestionLibros.entidades.Autor;
import com.cristian.gestionLibros.repositorios.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {
    @Autowired
    AutorRepository autorRepository;

    public Autor crearAutor(Autor nuevoAutor) {
        return autorRepository.save(nuevoAutor);
    }

    public List<Autor> listarAutor(){
        return autorRepository.findAll();
    }


    public void eliminarAutor(Integer id){
         autorRepository.deleteById(id);
    }
    public Autor obtenerAutor(Integer id) {
        return autorRepository.findById(id).orElse(null);
    }
}
