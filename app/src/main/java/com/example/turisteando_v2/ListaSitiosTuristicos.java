package com.example.turisteando_v2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.turisteando_v2.adaptadores.AdaptadorSitios;
import com.example.turisteando_v2.adaptadores.AdaptadorSitios;
import com.example.turisteando_v2.moldes.MoldeTurismo;
import com.example.turisteando_v2.moldes.MoldeTurismo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class ListaSitiosTuristicos extends AppCompatActivity {

    ArrayList<MoldeTurismo> listaSitios = new ArrayList<>();
    RecyclerView recyclerView;
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios_turisticos);
        recyclerView=findViewById(R.id.listadinamicasitios);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        db.collection("sitios")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {

                                String nombreSitio=document.getString("nombre");
                                String precioSitio=document.getString("precio");
                                Toast.makeText(ListaSitiosTuristicos.this, nombreSitio, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaSitiosTuristicos.this, precioSitio, Toast.LENGTH_SHORT).show();

                            }
                        } else {
                            //Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }
                });


        llenarListaConDatos();
        AdaptadorSitios adaptadorSitios =new AdaptadorSitios(listaSitios);
        recyclerView.setAdapter(adaptadorSitios);

    }

    public void llenarListaConDatos(){

        listaSitios.add(new MoldeTurismo("Museo el Castillo","Sara","3123322323","20000", R.drawable.lugar1,"Sitio lindo",R.drawable.castillo,"Valoracion: 5"));
        listaSitios.add(new MoldeTurismo("Pueblito Paisa","Cristian","3113222223","40000" ,R.drawable.lugar2,"Sitio lindo",R.drawable.pueblito,"Valoracion: 3"));
        listaSitios.add(new MoldeTurismo("Comuna 13","Manuela","3185543221","60000", R.drawable.lugar3,"Sitio lindo",R.drawable.comuna,"Valoracion: 4"));
        listaSitios.add(new MoldeTurismo("Cerro de las 3 cruces","Marcos","3153322323","10000", R.drawable.lugar4,"Sitio lindo",R.drawable.cerro,"Valoracion: 5"));
        listaSitios.add(new MoldeTurismo("Casa Barrientos","Samuel","3006689878","50000", R.drawable.lugar5,"Sitio lindo",R.drawable.barrientos,"Valoracion: 4"));
    }
}