package com.gato.proyectoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Registrar(View v)
    {
        Intent r = new Intent(MainActivity.this, Registro.class);
        startActivity(r);
    }

    public void Iniciar(View v)
    {
        Intent i = new Intent(MainActivity.this, Principal.class);
        startActivity(i);
    }
}