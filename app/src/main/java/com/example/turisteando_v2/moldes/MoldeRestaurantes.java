package com.example.turisteando_v2.moldes;

import java.io.Serializable;

public class MoldeRestaurantes implements Serializable {

    private String nombre;
    private String precio;
    private String telefono;
    private String plato;
    private Integer foto;

    public MoldeRestaurantes() {
    }

    public MoldeRestaurantes(String nombre, String precio, String telefono, String plato, Integer foto) {
        this.nombre = nombre;
        this.precio = precio;
        this.telefono = telefono;
        this.plato = plato;
        this.foto = foto;
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