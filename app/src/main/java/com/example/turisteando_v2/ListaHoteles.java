package com.example.turisteando_v2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.turisteando_v2.adaptadores.AdaptadorHoteles;
import com.example.turisteando_v2.moldes.MoldeHotel;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    ArrayList <MoldeHotel> listaHoteles = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerView=findViewById(R.id.listadinamicahoteles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        llenarListaConDatos();
        AdaptadorHoteles adaptadorHoteles=new AdaptadorHoteles(listaHoteles);
        recyclerView.setAdapter(adaptadorHoteles);

    }

    public void llenarListaConDatos(){
        listaHoteles.add(new MoldeHotel("Hotel El mirador","150000","3225608780",R.drawable.hotel1));
        listaHoteles.add(new MoldeHotel("Hotel la Waira","250000","3205618230",R.drawable.hotel2));
        listaHoteles.add(new MoldeHotel("Hotel El descanso","160000","3155533444",R.drawable.hotel3));
        listaHoteles.add(new MoldeHotel("Hotel El Portal","180000","3123344454",R.drawable.hotel4));
        listaHoteles.add(new MoldeHotel("Hotel El Cielo","200000","3113322323",R.drawable.hotel5));
    }
}