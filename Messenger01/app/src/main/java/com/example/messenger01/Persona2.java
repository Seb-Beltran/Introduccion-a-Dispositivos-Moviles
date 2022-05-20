package com.example.messenger01;

public class Persona2 {
    private String nombre;

    private int imagenid;

    public Persona2(){

    }

    public Persona2(String nombre, int imagenid) {
        this.nombre = nombre;
        this.imagenid = imagenid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagenid() {
        return imagenid;
    }

    public void setImagenid(int imagenid) {
        this.imagenid = imagenid;
    }
}
