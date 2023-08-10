package com.example.turisteando_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RestaurantesHome extends AppCompatActivity {
    Button botonrestaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes_home);

        botonrestaurantes=findViewById(R.id.botonrestaurantes);

        botonrestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RestaurantesHome.this,ListaRestaurantes.class);
                startActivity(intent);
            }
        });
    }
}