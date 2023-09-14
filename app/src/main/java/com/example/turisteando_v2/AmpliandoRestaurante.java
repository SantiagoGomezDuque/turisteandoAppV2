package com.example.turisteando_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turisteando_v2.moldes.MoldeHotel;
import com.example.turisteando_v2.moldes.MoldeRestaurantes;

public class AmpliandoRestaurante extends AppCompatActivity {

    MoldeRestaurantes moldeRestaurantes;
    ImageView fotoAmpliandoRestaurante;
    TextView nombreAmpliandoRestaurante;
    TextView PrecioAmpliandoRestaurante;
    TextView ContactoAmpliandoRestaurante;
    TextView DescripcionRestaurante;
    TextView ValoracionRestaurantes;
    ImageView fotoAdicional;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_restaurante);
        fotoAmpliandoRestaurante=findViewById(R.id.fotorestaurantedesc);
        nombreAmpliandoRestaurante=findViewById(R.id.nombreRestaurante);
        PrecioAmpliandoRestaurante=findViewById(R.id.precioRestaurante);
        ContactoAmpliandoRestaurante=findViewById(R.id.telefonoRestaurantedesc);
        DescripcionRestaurante=findViewById(R.id.descripcionRestaurante);
        ValoracionRestaurantes=findViewById(R.id.ValoracionRestaurante);
        fotoAdicional=findViewById(R.id.FotoRestauranteExt);

        moldeRestaurantes=(MoldeRestaurantes) getIntent().getSerializableExtra("datosRestaurante");

        //Cargando la info en los componentes graficos
        fotoAmpliandoRestaurante.setImageResource(moldeRestaurantes.getFoto());
        nombreAmpliandoRestaurante.setText(moldeRestaurantes.getNombre());
        PrecioAmpliandoRestaurante.setText(moldeRestaurantes.getPrecio());
        ContactoAmpliandoRestaurante.setText(moldeRestaurantes.getTelefono());
        DescripcionRestaurante.setText(moldeRestaurantes.getDescripcion());
        ValoracionRestaurantes.setText(moldeRestaurantes.getValoracionRestaurante());
        fotoAdicional.setImageResource(moldeRestaurantes.getFotoadicional());
    }
}