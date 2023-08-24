package com.example.turisteando_v2.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.turisteando_v2.R;
import com.example.turisteando_v2.moldes.MoldeTurismo;

import java.util.ArrayList;

public class AdaptadorSitios extends RecyclerView.Adapter<AdaptadorSitios.viewHolder>{

    //TODOS LOS ADAPTADORES TIENEN UNA LISTA DE ELEMENTOS

    public ArrayList<MoldeTurismo> listaSitios;

    //creamos un constructor vacio


    public AdaptadorSitios() {
    }

    //creamos un constructor lleno
    public AdaptadorSitios(ArrayList<MoldeTurismo> listaSitios) {
        this.listaSitios = listaSitios;
    }

    @NonNull
    @Override
    public AdaptadorSitios.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //esta porcion de codigo permite crear N copias del molde grafico
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.molde_sitios, null, false);
        return new AdaptadorSitios.viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorSitios.viewHolder holder, int position) {
        holder.actualizarDatos(listaSitios.get(position));
    }

    @Override
    public int getItemCount() {

        return listaSitios.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoSitio;
        TextView nombreSitio;
        TextView precioSitio;
        TextView contactoSitio;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoSitio=itemView.findViewById(R.id.Comuna);
            nombreSitio=itemView.findViewById(R.id.NombreSitioTuristico);
            precioSitio=itemView.findViewById(R.id.contactositios);
            contactoSitio=itemView.findViewById(R.id.telefonositios);
        }

        public void actualizarDatos(MoldeTurismo moldeTurismo) {
            fotoSitio.setImageResource(moldeTurismo.getFoto());
            nombreSitio.setText(moldeTurismo.getNombre());
            precioSitio.setText(moldeTurismo.getPrecio());
            contactoSitio.setText(moldeTurismo.getTelefono());
        }
    }
}

