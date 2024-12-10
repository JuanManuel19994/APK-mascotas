package com.example.apk2mascotas;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView listaMascotas;
    private ArrayList<Mascota> mascotas;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaMascotas = findViewById(R.id.rvMascotas);
        listaMascotas.setLayoutManager(new LinearLayoutManager(this));

        inicializarListaMascotas();
        inicializarAdaptador();

        ImageView imgEstrella = findViewById(R.id.imgEstrella);
        imgEstrella.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FavoritasActivity.class);
            startActivity(intent);
        });
    }

    public void inicializarListaMascotas() {
        mascotas = new ArrayList<>();
        mascotas.add(new Mascota("Buddy", 3, R.drawable.dog1));
        mascotas.add(new Mascota("Lucy", 5, R.drawable.dog2));
        // Añade más mascotas según sea necesario
    }

    public void inicializarAdaptador() {
        MascotaAdapter adaptador = new MascotaAdapter(mascotas);
        listaMascotas.setAdapter(adaptador);
    }
}
