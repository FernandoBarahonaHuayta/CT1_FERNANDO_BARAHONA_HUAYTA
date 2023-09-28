package org.cibertec.edu.pe.examenR.service;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.examenR.model.Carrito;

public interface ICarritoService {
	public int Agegrar(Carrito ObjC);
	public void Eliminar(String Id);
	public Optional<Carrito> buscar(String Id);
	public List<Carrito> listar();


}
