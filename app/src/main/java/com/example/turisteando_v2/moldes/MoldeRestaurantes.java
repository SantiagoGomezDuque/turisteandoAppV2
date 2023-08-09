package com.example.turisteando_v2.moldes;

public class MoldeRestaurantes {

    private String nombre;
    private String foto;
    private String telefono;
    private String RangoPrecio;
    private String PlatoRecomendado;

    public MoldeRestaurantes() {
    }

    public MoldeRestaurantes(String nombre, String foto, String telefono, String rangoPrecio, String platoRecomendado) {
        this.nombre = nombre;
        this.foto = foto;
        this.telefono = telefono;
        RangoPrecio = rangoPrecio;
        PlatoRecomendado = platoRecomendado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRangoPrecio() {
        return RangoPrecio;
    }

    public void setRangoPrecio(String rangoPrecio) {
        RangoPrecio = rangoPrecio;
    }

    public String getPlatoRecomendado() {
        return PlatoRecomendado;
    }

    public void setPlatoRecomendado(String platoRecomendado) {
        PlatoRecomendado = platoRecomendado;
    }
}
