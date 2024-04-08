package com.transportesayb.proyectomantenimiento.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.transportesayb.proyectomantenimiento.modelos.Repuesto;

@Repository
public interface RepuestoRepositorio extends JpaRepository<Repuesto, Long> {
    /*borra por codigo*/
    void deleteByCodigo(String codigo);

}
