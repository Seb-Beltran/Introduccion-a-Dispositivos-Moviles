package com.example.messenger01;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.messenger01.AdapterPersona;
import com.example.messenger01.Persona;

import java.util.ArrayList;

public class fragment1 extends Fragment {

    AdapterPersona adapterPersona;
    RecyclerView  recyclerViewPersonas;
    ArrayList<Persona> listapersona;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedI){

        View view=inflater.inflate(R.layout.fragment_1,container, false);
        recyclerViewPersonas = view.findViewById(R.id.recyclerView);
        listapersona = new ArrayList<>();

        cargarLista();
        mostrarData();
        return view;
    }
    public void cargarLista (){
        listapersona.add(new Persona("Jose Fuentes","si. 8:19 a.m.",R.drawable.pers1));
        listapersona.add(new Persona("Amairan Martinez","Vale me agrada. 3:49 p.m.",R.drawable.pers2));
        listapersona.add(new Persona("Christian Arias","si me imagino. vie.",R.drawable.pers3));
        listapersona.add(new Persona("Guadalupe Soto","HolA . vie.",R.drawable.pers4));
        listapersona.add(new Persona("Antony Emmanuel","como estas?. jue.",R.drawable.pers5));
        listapersona.add(new Persona("El michi del bigote","TU:muchas gracias. 24 abr.",R.drawable.pers6));
        listapersona.add(new Persona("Lili pequeña","TU: vale deja me apuro. 22 abr.",R.drawable.pers7));
        listapersona.add(new Persona("Uriel Alarcon","Reacciono a tu publicacion. 21 abr.",R.drawable.pers8));
    }
    public void mostrarData(){
        recyclerViewPersonas.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterPersona = new AdapterPersona(getContext(),listapersona);
        recyclerViewPersonas.setAdapter(adapterPersona);
    }
}

