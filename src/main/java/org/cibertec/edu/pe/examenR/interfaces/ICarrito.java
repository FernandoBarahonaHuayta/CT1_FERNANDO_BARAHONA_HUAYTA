package org.cibertec.edu.pe.examenR.interfaces;

import org.cibertec.edu.pe.examenR.model.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ICarrito extends JpaRepository<Carrito,String>{

}
