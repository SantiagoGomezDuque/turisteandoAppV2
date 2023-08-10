package com.example.turisteando_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TurismoHome extends AppCompatActivity {
        Button botonturismo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turismo_home);

        botonturismo=findViewById(R.id.botonturismo);

        botonturismo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TurismoHome.this,ListaSitiosTuristicos.class);
                startActivity(intent);
            }
        });

    }
}