package com.example.turisteando_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turisteando_v2.moldes.MoldeHotel;

import org.w3c.dom.Text;

public class AmpliandoHotel extends AppCompatActivity {

    MoldeHotel moldeHotel;
    ImageView fotoAmpliandoHotel;
    TextView nombreAmpliandoHotel;
    TextView PrecioAmpliandoHotel;
    TextView ContactoAmpliandoHotel;
    TextView DescripcionHotel;
    TextView ValoracionHotel;
    ImageView fotoAdicional;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_hotel);

        fotoAmpliandoHotel=findViewById(R.id.fotohoteldesc);
        nombreAmpliandoHotel=findViewById(R.id.nombreHotel);
        PrecioAmpliandoHotel=findViewById(R.id.precioHotel);
        ContactoAmpliandoHotel=findViewById(R.id.telefonoHotel);
        DescripcionHotel=findViewById(R.id.descripcionHotel);
        ValoracionHotel=findViewById(R.id.ValoracionHotel);
        fotoAdicional=findViewById(R.id.FotoHotelExt);

        moldeHotel=(MoldeHotel) getIntent().getSerializableExtra("datoshotel");

        //Cargando la info en los componentes graficos
        fotoAmpliandoHotel.setImageResource(moldeHotel.getFoto());
        nombreAmpliandoHotel.setText(moldeHotel.getNombre());
        PrecioAmpliandoHotel.setText(moldeHotel.getPrecio());
        ContactoAmpliandoHotel.setText(moldeHotel.getTelefono());
        DescripcionHotel.setText(moldeHotel.getDescripcion());
        ValoracionHotel.setText(moldeHotel.getValoracionHotel());
        fotoAdicional.setImageResource(moldeHotel.getFotoadicional());

    }
}