package com.example.turisteando_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
                Intent intenthoteles=new Intent(Home.this,HotelesHome.class);
                startActivity(intenthoteles);
            }
        });
        BotonRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentrestaurantes=new Intent(Home.this,RestaurantesHome.class);
                startActivity(intentrestaurantes);
            }
        });
        BotonTurismo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentsitios=new Intent(Home.this,TurismoHome.class);
                startActivity(intentsitios);
            }
        });
    }


    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int itemSeleccionado=item.getItemId();
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

    public void cambiarIdioma(String idioma){

    }
}