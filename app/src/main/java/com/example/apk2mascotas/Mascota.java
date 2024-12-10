package com.example.apk2mascotas;
public class Mascota {
    private final String nombre;
    private int raiting;
    private final int foto;

    public Mascota(String nombre, int raiting, int foto) {
        this.nombre = nombre;
        this.raiting = raiting;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getRaiting() {
        return raiting;
    }

    public int getFoto() {
        return foto;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }
}

