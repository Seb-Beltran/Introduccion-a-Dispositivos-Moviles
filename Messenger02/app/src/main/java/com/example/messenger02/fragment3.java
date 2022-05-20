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

public class fragment3 extends Fragment {

    AdapterPersona3 adapterPersona3;
    RecyclerView recyclerViewPersonas3;
    ArrayList<Persona3> listapersona3;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedI){

        View view=inflater.inflate(R.layout.fragment_3,container, false);
        recyclerViewPersonas3 = view.findViewById(R.id.recyclerView3);
        listapersona3 = new ArrayList<>();

        cargarLista3();
        mostrarData3();
        return view;
    }

    public void cargarLista3 () {
        listapersona3.add(new Persona3(R.drawable.historia1));
    }


    public void mostrarData3(){
        recyclerViewPersonas3.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterPersona3= new AdapterPersona3(getContext(),listapersona3);
        recyclerViewPersonas3.setAdapter(adapterPersona3);
    }
}
