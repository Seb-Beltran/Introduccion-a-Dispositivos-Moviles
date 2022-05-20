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

public class AdapterPersona3 extends RecyclerView.Adapter<AdapterPersona3.ViewHolder> implements View.OnClickListener{

    LayoutInflater inflater3;
    ArrayList<Persona3> model;

    private View.OnClickListener listener;

    public AdapterPersona3(Context context, ArrayList<Persona3> model){
        this.inflater3=LayoutInflater.from(context);
        this.model=model;
        //listener
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=inflater3.inflate(R.layout.lista_personas3, parent, false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int imagen = model.get(position).getImagenid();
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
        ImageView imagen;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imagen=itemView.findViewById(R.id.imagen_persona3);
        }
    }
}
