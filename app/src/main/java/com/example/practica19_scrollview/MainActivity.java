package com.example.practica19_scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Poner el icono en action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }

    //Metodo Boton Seleccion
    public void Seleccion(View view){
        switch (view.getId()){
            case R.id.banana:
                Toast.makeText(this, "Estas son Bananas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cereza:
                Toast.makeText(this, "Estas son Cerezas", Toast.LENGTH_SHORT).show();;
                break;
            case R.id.frambuesa:
                Toast.makeText(this, "Estas son Frambuesas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.fresa:
                Toast.makeText(this, "Estas son Fresas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.kiwi:
                Toast.makeText(this, "Estos son Kiwis", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mango:
                Toast.makeText(this, "Estos son Mangos", Toast.LENGTH_SHORT).show();
                break;
            case R.id.manzana:
                Toast.makeText(this, "Estas son Manzanas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.melon:
                Toast.makeText(this, "Estos son Melones", Toast.LENGTH_SHORT).show();
                break;
            case R.id.naranja:
                Toast.makeText(this, "Estas son Naranjas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.pera:
                Toast.makeText(this, "Estas son Peras", Toast.LENGTH_SHORT).show();
                break;
            case R.id.pina:    
                Toast.makeText(this, "Estas son Piñas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.sandia:
                Toast.makeText(this, "Estas son Sandias", Toast.LENGTH_SHORT).show();
                break;
            case R.id.uva:
                Toast.makeText(this, "Estas son Uvas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.zarzamora:
                Toast.makeText(this, "Estas son Zarzamoras", Toast.LENGTH_SHORT).show();
        }
    }
}
