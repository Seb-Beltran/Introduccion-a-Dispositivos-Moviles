package com.example.fragment;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //fragment default
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frameLayout, new FragmentA())
                .commit();
    }

    //metodos para reemplazar fragments
    public void mostrarFA(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new FragmentA()).commit();
    }
    public void mostrarFB(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new FragmentB()).commit();
    }
    public void mostrarFC(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new FragmentC()).commit();
    }
}