package com.ecommerce;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ecommerce.accesodatos.DaoProducto;
import com.ecommerce.entidades.Producto;

@SpringBootApplication
public class EcommerceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

	@Autowired
	private DaoProducto dao;

	@Override
	public void run(String... args) throws Exception {

//		System.out.println(dao.obtenerPorId(1L));

//		Producto productoNuevo = Producto.builder().nombre("Producto insert").descripcion("Prodcuto insertado desde aplication").codigoBarras("1232345678987").precio(new BigDecimal("34.54")).unidades(3).build();

//		dao.insertar(productoNuevo);

//		dao.borrar(2L);
		
		for (Producto p : dao.obtenerTodos()) {
			System.out.println(p);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
