package com.example.turisteando_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.turisteando_v2.moldes.MoldeRestaurantes;
import com.example.turisteando_v2.moldes.MoldeTurismo;

public class AmpliandoSitios extends AppCompatActivity {

    MoldeTurismo moldeTurismo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_sitios);

        moldeTurismo=(MoldeTurismo) getIntent().getSerializableExtra("datosTurismo");
        Toast.makeText(this, moldeTurismo.getNombre(), Toast.LENGTH_SHORT).show();
    }
}