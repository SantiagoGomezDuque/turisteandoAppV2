package com.example.turisteando_v2.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.turisteando_v2.AmpliandoHotel;
import com.example.turisteando_v2.ListaHoteles;
import com.example.turisteando_v2.R;
import com.example.turisteando_v2.moldes.MoldeHotel;

import java.util.ArrayList;

public class AdaptadorHoteles extends RecyclerView.Adapter<AdaptadorHoteles.viewHolder> {

    //TODOS LOS ADAPTADORES TIENEN UNA LISTA DE ELEMENTOS

    public ArrayList<MoldeHotel> listaHoteles;

    //creamos un constructor vacio
    public AdaptadorHoteles() {
    }

    //creamos un constructor lleno
    public AdaptadorHoteles(ArrayList<MoldeHotel> listaHoteles) {
        this.listaHoteles = listaHoteles;
    }

    @NonNull
    @Override
    public AdaptadorHoteles.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //esta porcion de codigo permite crear N copias del molde grafico
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_molde_hotel, null, false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorHoteles.viewHolder holder, int position) {
        holder.actualizarDatos(listaHoteles.get(position));
    }

    @Override
    public int getItemCount() {

        return listaHoteles.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoHotel;
        TextView nombreHotel;
        TextView precioHotel;
        TextView contactoHotel;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoHotel = itemView.findViewById(R.id.fotoListaHotel);
            nombreHotel = itemView.findViewById(R.id.nombreListaHotel);
            precioHotel = itemView.findViewById(R.id.precioListaHotel);
            contactoHotel = itemView.findViewById(R.id.contactoListaHotel);
        }

        public void actualizarDatos(MoldeHotel moldeHotel) {
            fotoHotel.setImageResource(moldeHotel.getFoto());
            nombreHotel.setText(moldeHotel.getNombre());
            precioHotel.setText(moldeHotel.getPrecio());
            contactoHotel.setText(moldeHotel.getTelefono());


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), AmpliandoHotel.class);
                    intent.putExtra("datoshotel",moldeHotel);
                    itemView.getContext().startActivity(intent);
                }
            });

        }
    }
}
