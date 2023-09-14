package com.example.turisteando_v2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.turisteando_v2.adaptadores.AdaptadorHoteles;
import com.example.turisteando_v2.adaptadores.AdaptadorRestaurantes;
import com.example.turisteando_v2.moldes.MoldeHotel;
import com.example.turisteando_v2.moldes.MoldeRestaurantes;

import java.util.ArrayList;

public class ListaRestaurantes extends AppCompatActivity {

    ArrayList<MoldeRestaurantes> listaRestaurantes = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);
        recyclerView=findViewById(R.id.listadinamicarestaurantes);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        llenarListaConDatos();
        AdaptadorRestaurantes adaptadorRestaurantes =new AdaptadorRestaurantes(listaRestaurantes);
        recyclerView.setAdapter(adaptadorRestaurantes);

    }

    public void llenarListaConDatos(){

        listaRestaurantes.add(new MoldeRestaurantes("El Migao","10000","3123322323","Waffles",R.drawable.restaurante1,"Precio economico",R.drawable.waffles,"Valoracion: 5"));
        listaRestaurantes.add(new MoldeRestaurantes("Arepepa","15000","3115542333","Arepa Rellena",R.drawable.restaurante2,"Precio economico",R.drawable.arepa,"Valoracion: 3"));
        listaRestaurantes.add(new MoldeRestaurantes("Restaurante El Sancochado","25000","3186272123","Sancocho de Res",R.drawable.restaurante3,"Precio economico",R.drawable.sancocho,"Valoracion: 4"));
        listaRestaurantes.add(new MoldeRestaurantes("El palacio de los dulces","8000","3106642322","Obleas",R.drawable.restaurante4,"Precio economico",R.drawable.fresasconcrema,"Valoracion: 4"));
        listaRestaurantes.add(new MoldeRestaurantes("La chocolera","10000","3154423231","Arepa de Chocolo",R.drawable.restaurante5,"Precio economico",R.drawable.torta,"Valoracion: 5"));
    }
}

