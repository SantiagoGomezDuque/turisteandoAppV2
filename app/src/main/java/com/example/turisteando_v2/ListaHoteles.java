package com.example.turisteando_v2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.turisteando_v2.adaptadores.AdaptadorHoteles;
import com.example.turisteando_v2.moldes.MoldeHotel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    ArrayList <MoldeHotel> listaHoteles = new ArrayList<>();
    RecyclerView recyclerView;

    FirebaseFirestore db = FirebaseFirestore.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerView=findViewById(R.id.listadinamicahoteles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        db.collection("hoteles")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {

                                String nombreHotel=document.getString("nombre");
                                String precioHotel=document.getString("precio");
                                Toast.makeText(ListaHoteles.this, nombreHotel, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaHoteles.this, precioHotel, Toast.LENGTH_SHORT).show();

                            }
                        } else {
                            //Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }
                });



        llenarListaConDatos();
        AdaptadorHoteles adaptadorHoteles=new AdaptadorHoteles(listaHoteles);
        recyclerView.setAdapter(adaptadorHoteles);

    }

    public void llenarListaConDatos(){
        listaHoteles.add(new MoldeHotel("Hotel El mirador","150000","3225608780",R.drawable.imagenhotel,"Hotel hermoso y agradable",R.drawable.hotel1,"Valoracion: 5"));
        listaHoteles.add(new MoldeHotel("Hotel la Waira","250000","3205618230",R.drawable.cabana,"hotel sucio y desagradable",R.drawable.hotel2,"Valoracion: 2"));
        listaHoteles.add(new MoldeHotel("Hotel El descanso","160000","3155533444",R.drawable.glamping,"Hotel con excelente atencion al cliente",R.drawable.hotel3,"Valoracion: 3"));
        listaHoteles.add(new MoldeHotel("Hotel El Portal","180000","3123344454",R.drawable.hotelbonito,"Hotel con agua sucia y camas de mala calidad",R.drawable.hotel4,"Valoracion: 5"));
        listaHoteles.add(new MoldeHotel("Hotel El Cielo","200000","3113322323",R.drawable.hotel5,"Hotel con las tres comidas del dia",R.drawable.motel,"Valoracion: 4"));
    }
}