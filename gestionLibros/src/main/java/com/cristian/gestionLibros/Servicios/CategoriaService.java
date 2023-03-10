package com.cristian.gestionLibros.Servicios;


import com.cristian.gestionLibros.entidades.Autor;
import com.cristian.gestionLibros.entidades.Categoria;
import com.cristian.gestionLibros.repositorios.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    CategoriaRepository categoriaRepository;

    public Categoria crearCategoria(Categoria nuevaCategoria) {

        return categoriaRepository.save(nuevaCategoria);
    }

    public Categoria obtenerCategoria(Integer id) {
        return categoriaRepository.findById(id).orElse(null);
    }


    public List<Categoria> listarCategoria(){
        return categoriaRepository.findAll();
    }


    public void eliminarCategoria(Integer id){
        categoriaRepository.deleteById(id);
    }

}

