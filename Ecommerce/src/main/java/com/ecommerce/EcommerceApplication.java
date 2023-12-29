package com.ecommerce;

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
		
		for(Producto p: dao.obtenerTodos()) {
			System.out.println(p);
		}
	}

}
