package org.cibertec.edu.pe.examenR.controller;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.examenR.model.Carrito;
import org.cibertec.edu.pe.examenR.service.ICarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping
public class CarritoController {
	@Autowired
	private ICarritoService service;
	
	
	
	@GetMapping("/eliminar/{Id}")
	public String eliminar(@PathVariable String Id,Model m)
	{
		service.Eliminar(Id);
		return "Eliminar";
	}
	
	@GetMapping("/Tienda")
	public String Listar(Model m)
	{
		List<Carrito> Listar = service.listar();
		m.addAttribute("carrito",Listar);
		
		return "Tienda";
	}
	
	@GetMapping("/add")
	public String agregar(Model m)
	{
		m.addAttribute("carrito", new Carrito());
		return "comprar";
	}
	
	
}
