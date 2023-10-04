package com.example.turisteando_v2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.turisteando_v2.adaptadores.AdaptadorHoteles;
import com.example.turisteando_v2.adaptadores.AdaptadorRestaurantes;
import com.example.turisteando_v2.moldes.MoldeHotel;
import com.example.turisteando_v2.moldes.MoldeRestaurantes;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class ListaRestaurantes extends AppCompatActivity {

    ArrayList<MoldeRestaurantes> listaRestaurantes = new ArrayList<>();
    RecyclerView recyclerView;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);
        recyclerView=findViewById(R.id.listadinamicarestaurantes);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        db.collection("restaurantes")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {

                                String nombreRestaurante=document.getString("nombre");
                                String precioRestaurante=document.getString("precio");
                                Toast.makeText(ListaRestaurantes.this, nombreRestaurante, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaRestaurantes.this, precioRestaurante, Toast.LENGTH_SHORT).show();

                            }
                        } else {
                            //Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }
                });


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

