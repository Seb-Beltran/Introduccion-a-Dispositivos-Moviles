package com.example.messenger02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.messenger02.AdapterPersona;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //fragment default
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frameLayout, new fragment1())
                .commit();
    }

    public void mostrarF1(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new fragment1()).commit();

    }
    public void mostrarF2(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new fragment2()).commit();
    }
    public void mostrarF3(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new fragment3()).commit();
    }
}