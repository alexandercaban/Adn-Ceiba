package com.ceiba.articulo.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoRegistrarArticulo {
    private Long idCategoria;
    private String descripcion;
    private BigDecimal precio;
}
