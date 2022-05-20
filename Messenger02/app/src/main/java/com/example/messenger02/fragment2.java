package com.example.messenger02;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class fragment2 extends Fragment {

    AdapterPersona2 adapterPersona2;
    RecyclerView recyclerViewPersonas2;
    ArrayList<Persona2> listapersona2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedI){

        View view=inflater.inflate(R.layout.fragment_2,container, false);
        recyclerViewPersonas2 = view.findViewById(R.id.recyclerView2);
        listapersona2 = new ArrayList<>();

        cargarLista2();
        mostrarData2();
        return view;
    }
    public void cargarLista2 () {

        listapersona2.add(new Persona2("Alarcon Uriel", R.drawable.per1));
        listapersona2.add(new Persona2("Beltran LIlian", R.drawable.per2));
        listapersona2.add(new Persona2("Luis Mota", R.drawable.per3));
        listapersona2.add(new Persona2(" Vale TB", R.drawable.per4));
        listapersona2.add(new Persona2("Jose Fuentes", R.drawable.per5));
        listapersona2.add(new Persona2("Carlos Gonzalez", R.drawable.per6));
    }
    public void mostrarData2(){
        recyclerViewPersonas2.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterPersona2 = new AdapterPersona2(getContext(),listapersona2);
        recyclerViewPersonas2.setAdapter(adapterPersona2);
    }
}
