package com.cristian.gestionLibros.Servicios;


import com.cristian.gestionLibros.entidades.Autor;
import com.cristian.gestionLibros.entidades.Libro;
import com.cristian.gestionLibros.repositorios.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {
    @Autowired
    LibroRepository libroRepository;

    public Libro crearLibro(Libro nuevoLibro) {
        return libroRepository.save(nuevoLibro);
    }

    public Libro obtenerLibro(Integer id) {
        return libroRepository.findById(id).orElse(null);
    }


    public List<Libro> listarLibros(){
        return libroRepository.findAll();
    }


    public void eliminarLibro(Integer id){
       libroRepository.deleteById(id);
    }

}
