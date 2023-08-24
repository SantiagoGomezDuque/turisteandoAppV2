package com.example.turisteando_v2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.turisteando_v2.adaptadores.AdaptadorSitios;
import com.example.turisteando_v2.adaptadores.AdaptadorSitios;
import com.example.turisteando_v2.moldes.MoldeTurismo;
import com.example.turisteando_v2.moldes.MoldeTurismo;

import java.util.ArrayList;

public class ListaSitiosTuristicos extends AppCompatActivity {

    ArrayList<MoldeTurismo> listaSitios = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios_turisticos);
        recyclerView=findViewById(R.id.listadinamicasitios);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        llenarListaConDatos();
        AdaptadorSitios adaptadorSitios =new AdaptadorSitios(listaSitios);
        recyclerView.setAdapter(adaptadorSitios);

    }

    public void llenarListaConDatos(){

        listaSitios.add(new MoldeTurismo("Museo el Castillo","Sara","3123322323","20000", R.drawable.lugar1));
        listaSitios.add(new MoldeTurismo("Pueblito Paisa","Cristian","3113222223","40000" ,R.drawable.lugar2));
        listaSitios.add(new MoldeTurismo("Comuna 13","Manuela","3185543221","60000", R.drawable.lugar3));
        listaSitios.add(new MoldeTurismo("Cerro de las 3 cruces","Marcos","3153322323","10000", R.drawable.lugar4));
        listaSitios.add(new MoldeTurismo("Casa Barrientos","Samuel","3006689878","50000", R.drawable.lugar5));
    }
}