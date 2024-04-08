package com.transportesayb.proyectomantenimiento.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transportesayb.proyectomantenimiento.modelos.Repuesto;
import com.transportesayb.proyectomantenimiento.repositorios.RepuestoRepositorio;

@Service
public class RepuestoServicioImpl implements IRepuestoServicio {
	
	@Autowired
	RepuestoRepositorio clienterepositorio;

	@Override
	public List<Repuesto> obtenerTodo() {
		return clienterepositorio.findAll();
	}

	@Override
	public Repuesto guardar(Repuesto cliente) {
		return clienterepositorio.save(cliente);
	}

	@Override
	public Repuesto obtenerPorId(long id) {
		return clienterepositorio.findById(id).orElse(null);
	}

	@Override
	public void eliminar(long id) {
		clienterepositorio.deleteById(id);
		
	}

}
