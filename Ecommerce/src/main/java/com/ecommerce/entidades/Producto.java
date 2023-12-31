package com.ecommerce.entidades;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Producto {

	private Long id;
	
	private String codigoBarras;
	
	private String nombre;
	
	private String descripcion;
	
	private BigDecimal precio;
	
	private LocalDate fechaCaducidad;
	
	private Integer unidades;
}
