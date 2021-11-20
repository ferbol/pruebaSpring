package com.example.demo;

public class Producto {

    int idProducto;
    String Nombre;

    public Producto(int idProducto, String nombre) {
        this.idProducto = idProducto;
        this.Nombre = nombre;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
}
