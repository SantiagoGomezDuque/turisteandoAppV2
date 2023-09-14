package com.example.turisteando_v2.moldes;

import java.io.Serializable;

public class MoldeRestaurantes implements Serializable {

    private String nombre;
    private String precio;
    private String telefono;
    private String plato;
    private Integer foto;
    private String descripcion;
    private Integer fotoadicional;
    private String ValoracionRestaurante;

    public MoldeRestaurantes() {
    }

    public MoldeRestaurantes(String nombre, String precio, String telefono, String plato, Integer foto, String descripcion, Integer fotoadicional, String valoracionRestaurante) {
        this.nombre = nombre;
        this.precio = precio;
        this.telefono = telefono;
        this.plato = plato;
        this.foto = foto;
        this.descripcion = descripcion;
        this.fotoadicional = fotoadicional;
        ValoracionRestaurante = valoracionRestaurante;
    }

    public String getValoracionRestaurante() {
        return ValoracionRestaurante;
    }

    public void setValoracionRestaurante(String valoracionRestaurante) {
        ValoracionRestaurante = valoracionRestaurante;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getFotoadicional() {
        return fotoadicional;
    }

    public void setFotoadicional(Integer fotoadicional) {
        this.fotoadicional = fotoadicional;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public Integer getFoto() {
        return foto;
    }


    public void setFoto(Integer foto) {
        this.foto = foto;
    }
}