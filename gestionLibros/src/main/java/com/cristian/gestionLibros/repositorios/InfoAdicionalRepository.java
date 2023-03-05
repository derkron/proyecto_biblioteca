package com.cristian.gestionLibros.repositorios;

import com.cristian.gestionLibros.entidades.InfoAdicional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoAdicionalRepository extends JpaRepository<InfoAdicional, Integer> {
}
