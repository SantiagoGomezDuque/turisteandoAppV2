package com.example.turisteando_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Locale;

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

    public void cambiarIdioma (String idioma){
        Locale lenguaje = new Locale (idioma);
        Locale.setDefault(lenguaje);

        Configuration Caballo = getResources().getConfiguration();
        Caballo.locale = lenguaje;

        getBaseContext().getResources().updateConfiguration(Caballo,getBaseContext().getResources().getDisplayMetrics());
    }


    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int itemSeleccionado=item.getItemId();
        switch (itemSeleccionado){

            case(R.id.opcion1):
                this.cambiarIdioma("en");
                Intent español = new Intent(Home.this,Home.class);
                startActivity(español);
                break;
            case(R.id.opcion2):
                this.cambiarIdioma("es");
                Intent ingles = new Intent(Home.this,Home.class);
                startActivity(ingles);
                break;
            case(R.id.opcion3):
                this.cambiarIdioma("it");
                Intent italiano = new Intent(Home.this,Home.class);
                startActivity(italiano);
                break;
            case(R.id.opcion4): Intent About = new Intent(Home.this,Acerca.class);
                startActivity(About);
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}


