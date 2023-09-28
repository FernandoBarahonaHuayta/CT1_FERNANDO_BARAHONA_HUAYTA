package org.cibertec.edu.pe.examenR.service;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.examenR.interfaces.ICarrito;
import org.cibertec.edu.pe.examenR.model.Carrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Carritoserviceimpl implements ICarritoService{
	
	@Autowired
	ICarrito data;
	
	@Override
	public List<Carrito> listar() {
		return (List<Carrito>)data.findAll();
	}
	
	@Override
	public int Agegrar(Carrito ObjC) {
		int rp=0;
		Carrito Obj = data.save(ObjC);
		if(!Obj.equals(null))rp=1;
		return rp;
	}

	@Override
	public void Eliminar(String Id) {
		data.deleteById(Id);
		
	}

	@Override
	public Optional<Carrito> buscar(String Id) {
		return data.findById(Id);
	}

	




	

}
