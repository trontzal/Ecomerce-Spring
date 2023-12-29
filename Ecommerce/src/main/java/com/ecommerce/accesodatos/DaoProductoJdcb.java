package com.ecommerce.accesodatos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.ecommerce.entidades.Producto;

@Component
class DaoProductoJdcb implements DaoProducto{

	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public Iterable<Producto> obtenerTodos() {
		return jdbc.query("SELECT * FROM productos", new BeanPropertyRowMapper<Producto>(Producto.class));
	}

	@Override
	public Producto obtenerPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto insertar(Producto objeto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto modificar(Producto objeto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrar(Long id) {
		// TODO Auto-generated method stub
		
	}

}
