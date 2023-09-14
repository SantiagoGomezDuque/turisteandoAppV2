package com.example.turisteando_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turisteando_v2.moldes.MoldeRestaurantes;
import com.example.turisteando_v2.moldes.MoldeTurismo;

public class AmpliandoSitios extends AppCompatActivity {

    MoldeTurismo moldeTurismo;
    ImageView fotoAmpliandoSitios;
    TextView nombreAmpliandoSitios;
    TextView PrecioAmpliandoSitios;
    TextView ContactoAmpliandoSitios;
    TextView ValoracionTurismo;
    TextView DescripcionTurismo;
    ImageView fotoAdicional;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_sitios);
        fotoAmpliandoSitios=findViewById(R.id.fotoSitiodesc);
        nombreAmpliandoSitios=findViewById(R.id.nombreSitiodesc);
        PrecioAmpliandoSitios=findViewById(R.id.precioSitio);
        ContactoAmpliandoSitios=findViewById(R.id.telefonoSitio);
        ValoracionTurismo=findViewById(R.id.ValoracionTurismo);
        DescripcionTurismo=findViewById(R.id.descripcionSitio);
        fotoAdicional=findViewById(R.id.FotoSitioExt);

        moldeTurismo=(MoldeTurismo) getIntent().getSerializableExtra("datosTurismo");

        //Cargando la info en los componentes graficos
        fotoAmpliandoSitios.setImageResource(moldeTurismo.getFoto());
        nombreAmpliandoSitios.setText(moldeTurismo.getNombre());
        PrecioAmpliandoSitios.setText(moldeTurismo.getPrecio());
        ContactoAmpliandoSitios.setText(moldeTurismo.getTelefono());
        ValoracionTurismo.setText(moldeTurismo.getValoracionTurismo());
        DescripcionTurismo.setText(moldeTurismo.getDescripcion());
        fotoAdicional.setImageResource(moldeTurismo.getFotoadicional());

    }
}