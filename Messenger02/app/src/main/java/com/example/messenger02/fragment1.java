package com.example.messenger02;
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

import com.example.messenger02.AdapterPersona;
import com.example.messenger02.Persona;

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
        listapersona.add(new Persona("Bona","BROOO. 3 abr.",R.drawable.pers1));
        listapersona.add(new Persona("Beltran Lilian","Te menciono en tu historia. 17 mar.",R.drawable.pers2));
        listapersona.add(new Persona("Luis Mota","Ya esta abierto. 2 feb.",R.drawable.pers3));
        listapersona.add(new Persona("Vale TB","a bueno . 8 nov de 2021.",R.drawable.pers4));
        listapersona.add(new Persona("Jose Fuentes","Tu: ?. 25 sep de 2021.",R.drawable.pers5));
        listapersona.add(new Persona("Carlos Gonzalez","TU:Y eso. 15 sep de 2021.",R.drawable.pers6));
        listapersona.add(new Persona("Diego Carranza","Eres tu en el video?. 9 junio 2021.",R.drawable.pers7));
        listapersona.add(new Persona("Alejandro Tellez","Tu: te lo vendo. 2 de mayo 2021.",R.drawable.pers8));
    }
    public void mostrarData(){
        recyclerViewPersonas.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterPersona = new AdapterPersona(getContext(),listapersona);
        recyclerViewPersonas.setAdapter(adapterPersona);
    }
}

