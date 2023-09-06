package com.example.turisteando_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.turisteando_v2.moldes.MoldeHotel;
import com.example.turisteando_v2.moldes.MoldeRestaurantes;

public class AmpliandoRestaurante extends AppCompatActivity {

    MoldeRestaurantes moldeRestaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_restaurante);

        moldeRestaurantes=(MoldeRestaurantes) getIntent().getSerializableExtra("datosRestaurante");
        Toast.makeText(this, moldeRestaurantes.getNombre(), Toast.LENGTH_SHORT).show();
    }
}