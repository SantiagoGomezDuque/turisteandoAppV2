package com.example.turisteando_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HotelesHome extends AppCompatActivity {

    Button botonHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles_home);

        botonHotel=findViewById(R.id.botonHotel);

        botonHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelesHome.this,ListaHoteles.class);
                startActivity(intent);
            }
        });
    }
}