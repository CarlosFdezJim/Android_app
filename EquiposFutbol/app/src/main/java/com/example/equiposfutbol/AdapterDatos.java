package com.example.equiposfutbol;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos> {

    ArrayList<Equipo> listEquipos;

    public AdapterDatos(ArrayList<Equipo> listEquipos) {
        this.listEquipos = listEquipos;
    }

    @NonNull
    @Override

    //Enlazar el Adaptador con el archivo list.
    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, null, false);

        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos holder, int position) {
        Equipo equipo = listEquipos.get(position);
        holder.asignarDatos(equipo);
    }

    @Override
    //Devuelve el tamaño del ArrayList de Equipos.
    public int getItemCount() {
        return listEquipos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {

        TextView equipo;
        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            equipo = itemView.findViewById(R.id.idEquipos);
        }

        public void asignarDatos(Equipo equipos) {
            equipo.setText((CharSequence) equipos);
        }
    }
}
