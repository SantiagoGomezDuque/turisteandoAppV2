package com.example.turisteando_v2.moldes;

import java.io.Serializable;

public class MoldeTurismo implements Serializable {

    private String nombre;
    private String nombreContacto;
    private String telefono;
    private String precio;
    private Integer foto;
    private String descripcion;
    private Integer fotoadicional;
    private String valoracionTurismo;

    public MoldeTurismo() {
    }

    public MoldeTurismo(String nombre, String nombreContacto, String telefono, String precio, Integer foto, String descripcion, Integer fotoadicional, String valoracionTurismo) {
        this.nombre = nombre;
        this.nombreContacto = nombreContacto;
        this.telefono = telefono;
        this.precio = precio;
        this.foto = foto;
        this.descripcion = descripcion;
        this.fotoadicional = fotoadicional;
        this.valoracionTurismo = valoracionTurismo;
    }

    public String getValoracionTurismo() {
        return valoracionTurismo;
    }

    public void setValoracionTurismo(String valoracionTurismo) {
        this.valoracionTurismo = valoracionTurismo;
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

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }
}
