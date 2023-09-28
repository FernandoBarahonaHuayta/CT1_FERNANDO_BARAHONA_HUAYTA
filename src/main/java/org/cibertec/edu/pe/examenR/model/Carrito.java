package org.cibertec.edu.pe.examenR.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="carrito")
public class Carrito {
	@Id
	private String Id;
	private String producto;
	private double precio;

	
	
	public Carrito() {
	}



	public Carrito(String id, String producto, double precio) {
		Id = id;
		this.producto = producto;
		this.precio = precio;
	}



	public String getId() {
		return Id;
	}



	public void setId(String id) {
		Id = id;
	}



	public String getProducto() {
		return producto;
	}



	public void setProducto(String producto) {
		this.producto = producto;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}


	
	
	
	
}
