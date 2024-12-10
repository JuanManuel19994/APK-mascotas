package com.example.apk2mascotas;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FavoritasActivity extends AppCompatActivity {

    private RecyclerView listaFavoritas;
    private ArrayList<Mascota> mascotasFavoritas;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritas);

        listaFavoritas = findViewById(R.id.rvFavoritas);
        listaFavoritas.setLayoutManager(new LinearLayoutManager(this));

        inicializarListaFavoritas();
        inicializarAdaptador();
    }

    public void inicializarListaFavoritas() {
        mascotasFavoritas = new ArrayList<>();
        mascotasFavoritas.add(new Mascota("Max", 4, R.drawable.dog3));
        mascotasFavoritas.add(new Mascota("Bella", 2, R.drawable.dog4));
        // Añade más mascotas "dummy" si es necesario
    }

    public void inicializarAdaptador() {
        MascotaAdapter adaptador = new MascotaAdapter(mascotasFavoritas);
        listaFavoritas.setAdapter(adaptador);
    }

    public void volver(View view) {
        finish();
    }

}
