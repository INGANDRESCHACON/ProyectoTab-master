package com.transportesayb.proyectomantenimiento.servicios;

import java.util.List;

import com.transportesayb.proyectomantenimiento.modelos.Repuesto;

public interface IRepuestoServicio {

	public List<Repuesto> obtenerTodo();
	
	public Repuesto guardar(Repuesto cliente);
	
	public Repuesto obtenerPorId(long id);
	
	public void eliminar(long id);
}
