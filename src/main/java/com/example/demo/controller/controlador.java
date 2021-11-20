package com.example.demo.controller;

import com.example.demo.Producto;
import com.example.demo.aplicacion.ManejarProducto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class controlador {

    private ManejarProducto producto;

    public controlador(ManejarProducto producto) {
        this.producto = producto;
    }

        @GetMapping ("/listarProductos")
        public Producto listar(@PathVariable String idMunicipio ) {
            return this.producto.Listar();
        }
}
