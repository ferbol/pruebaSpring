package com.example.demo.aplicacion;

import com.example.demo.Producto;
import org.springframework.stereotype.Component;

@Component
public class ManejarProducto {

    public Producto Listar( ) {
        return new Producto(11,"ÑAME ESPINO");
    }
}
