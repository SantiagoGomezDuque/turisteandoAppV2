package com.example.turisteando_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turisteando_v2.moldes.MoldeHotel;

public class AmpliandoHotel extends AppCompatActivity {

    MoldeHotel moldeHotel;
    ImageView fotoAmpliandoHotel;
    TextView nombreAmpliandoHotel;
    TextView PrecioAmpliandoHotel;
    TextView ContactoAmpliandoHotel;
    TextView DescripcionHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_hotel);

        fotoAmpliandoHotel=findViewById(R.id.fotohoteldesc);
        nombreAmpliandoHotel=findViewById(R.id.nombreHotel);
        PrecioAmpliandoHotel=findViewById(R.id.precioHotel);
        ContactoAmpliandoHotel=findViewById(R.id.telefonoHotel);
        DescripcionHotel=findViewById(R.id.descripcionHotel);
        moldeHotel=(MoldeHotel) getIntent().getSerializableExtra("datoshotel");

        //Cargando la info en los componentes graficos
        fotoAmpliandoHotel.setImageResource(moldeHotel.getFoto());
        nombreAmpliandoHotel.setText(moldeHotel.getNombre());
        PrecioAmpliandoHotel.setText(moldeHotel.getPrecio());
        ContactoAmpliandoHotel.setText(moldeHotel.getTelefono());
        DescripcionHotel.setText(moldeHotel.getDescripcion());

    }
}