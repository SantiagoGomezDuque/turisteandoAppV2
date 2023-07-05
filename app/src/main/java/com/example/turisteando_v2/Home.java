package com.example.turisteando_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    //ZONA DE ATRIBUTOS
    Button botonHoteles;
    Button BotonRestaurantes;
    Button BotonTurismo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        botonHoteles=findViewById(R.id.botonhoteles);
        BotonRestaurantes=findViewById(R.id.botonrestaurantes);
        BotonTurismo=findViewById(R.id.botonsitios);

        //DETECTANDO EVENTOS
        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "Hice Clic", Toast.LENGTH_SHORT).show();
            }
        });
        BotonRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "Hice Clic 2", Toast.LENGTH_SHORT).show();
            }
        });
        BotonTurismo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "Hice Clic 3", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public boolean onCreateOptionMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    public boolean onOptionItemSelected(MenuItem item){
        int itemSeleccionado= item.getItemId();
        switch (itemSeleccionado){

            case(R.id.opcion1):
                break;
            case(R.id.opcion2):
                break;
            case(R.id.opcion3):
                break;
            case(R.id.opcion4):
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}