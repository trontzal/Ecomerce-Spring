package com.ecommerce.accesodatos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.ecommerce.entidades.Producto;

@Component
class DaoProductoJdcb implements DaoProducto{

	private static final String SQL_SELECT = "SELECT * FROM productos";
	private static final String SQL_SELECT_ID = SQL_SELECT + " WHERE id = ?";
	private static final String SQL_INSERT = "INSERT INTO productos (codigo_barras, nombre, descripcion, precio, fecha_caducidad, unidades)  VALUES (?,?,?,?,?,?)";
	private static final String SQL_DELETE = "DELETE FROM productos WHERE id=?";
	
	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public Iterable<Producto> obtenerTodos() {
		return jdbc.query(SQL_SELECT, new BeanPropertyRowMapper<Producto>(Producto.class)); 
	}

	@Override
	public Producto obtenerPorId(Long id) {
		return jdbc.queryForObject(SQL_SELECT_ID, new BeanPropertyRowMapper<Producto>(Producto.class), id);
	}

	@Override
	public Producto insertar(Producto producto) {
		jdbc.update(SQL_INSERT, producto.getCodigoBarras(), producto.getNombre(), producto.getDescripcion(), producto.getPrecio(), producto.getFechaCaducidad(), producto.getUnidades());
		return producto;
	}

	@Override
	public Producto modificar(Producto objeto) {
		// TODO Auto-generated method stub
		// Para el futuro
		return null;
	}

	@Override
	public void borrar(Long id) {
		jdbc.update(SQL_DELETE, id);
		
	}

}
