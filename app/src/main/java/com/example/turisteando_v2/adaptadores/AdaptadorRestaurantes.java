package com.example.turisteando_v2.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.turisteando_v2.R;
import com.example.turisteando_v2.moldes.MoldeRestaurantes;

import java.util.ArrayList;

public class AdaptadorRestaurantes extends RecyclerView.Adapter<AdaptadorRestaurantes.viewHolder> {

    public ArrayList<MoldeRestaurantes> listaRestaurantes;

    //creamos un constructor vacio


    public AdaptadorRestaurantes() {
    }

    //creamos un constructor lleno

    public AdaptadorRestaurantes(ArrayList<MoldeRestaurantes> listaRestaurantes) {
        this.listaRestaurantes = listaRestaurantes;
    }

    @NonNull
    @Override
    public AdaptadorRestaurantes.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //esta porcion de codigo permite crear N copias del molde grafico
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.molde_restaurantes, null, false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorRestaurantes.viewHolder holder, int position) {
        holder.actualizarDatos(listaRestaurantes.get(position));
    }

    @Override
    public int getItemCount() {

        return listaRestaurantes.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView nombrerestaurantes;
        TextView rangoprecio;
        TextView telefonorestaurante;
        TextView platorecomendado;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            nombrerestaurantes=itemView.findViewById(R.id.nombrerestaurantes);
            rangoprecio=itemView.findViewById(R.id.rangoprecio);
            telefonorestaurante=itemView.findViewById(R.id.telefonorestaurante);
            platorecomendado=itemView.findViewById(R.id.platorecomendado);
        }

        public void actualizarDatos(MoldeRestaurantes moldeRestaurantes) {
            nombrerestaurantes.setText(moldeRestaurantes.getNombre());
            rangoprecio.setText(moldeRestaurantes.getRangoPrecio());
            telefonorestaurante.setText(moldeRestaurantes.getTelefono());
            platorecomendado.setText(moldeRestaurantes.getPlatoRecomendado());
        }
    }
}
