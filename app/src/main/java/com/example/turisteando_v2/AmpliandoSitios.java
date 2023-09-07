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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_sitios);
        fotoAmpliandoSitios=findViewById(R.id.fotoSitiodesc);
        nombreAmpliandoSitios=findViewById(R.id.nombreSitiodesc);
        PrecioAmpliandoSitios=findViewById(R.id.precioSitio);
        ContactoAmpliandoSitios=findViewById(R.id.telefonoSitio);

        moldeTurismo=(MoldeTurismo) getIntent().getSerializableExtra("datosTurismo");

        //Cargando la info en los componentes graficos
        fotoAmpliandoSitios.setImageResource(moldeTurismo.getFoto());
        nombreAmpliandoSitios.setText(moldeTurismo.getNombre());
        PrecioAmpliandoSitios.setText(moldeTurismo.getPrecio());
        ContactoAmpliandoSitios.setText(moldeTurismo.getTelefono());

    }
}