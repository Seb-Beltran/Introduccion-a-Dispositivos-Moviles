package com.example.messenger02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class AdapterPersona2 extends RecyclerView.Adapter<AdapterPersona2.ViewHolder> implements View.OnClickListener{

    LayoutInflater inflater2;
    ArrayList<Persona2> model;

    private View.OnClickListener listener;

    public AdapterPersona2(Context context, ArrayList<Persona2> model){
        this.inflater2=LayoutInflater.from(context);
        this.model=model;
        //listener
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=inflater2.inflate(R.layout.lista_personas2, parent, false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String nombre=model.get(position).getNombre();
        int imagen = model.get(position).getImagenid();
        holder.nombre.setText(nombre);
        holder.imagen.setImageResource(imagen);
    }

    public void setOnClickLister(View.OnClickListener listener ){
        this.listener= listener;
    }


    @Override
    public int getItemCount() {

        return model.size();
    }

    @Override
    public void onClick(View view) {
        if(listener !=null){
            listener.onClick(view);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView nombre;
        ImageView imagen;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.nombre_persona2);
            imagen=itemView.findViewById(R.id.imagen_persona2);
        }
    }

}
