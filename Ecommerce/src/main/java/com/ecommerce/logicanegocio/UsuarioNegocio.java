package com.ecommerce.logicanegocio;

import com.ecommerce.entidades.Producto;

public interface UsuarioNegocio {
	Iterable<Producto> listadoProductos();
	
	Producto detalleProducto(long id);
}
