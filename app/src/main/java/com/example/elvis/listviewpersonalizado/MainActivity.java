package com.example.elvis.listviewpersonalizado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvItems;
    private Adaptador adaptador;
    private ArrayList<Entidad> arrayEntidad = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItems = (ListView) findViewById(R.id.lvItems);

        llenarItems();
    }

    private void llenarItems(){
        arrayEntidad.add(new Entidad(R.drawable.dbs_1, "SS BLUES", "Goku y Vegeta"));
        arrayEntidad.add(new Entidad(R.drawable.dbs_2, "SS BLUE Y SS ROSE", "Goku y Black"));
        arrayEntidad.add(new Entidad(R.drawable.dbs_3, "DB HEROES 1", "Personajes nuevos"));
        arrayEntidad.add(new Entidad(R.drawable.dbs_4, "DB HEROES 2", "Otros personajes, Majin Boo"));
        arrayEntidad.add(new Entidad(R.drawable.dbs_5, "VEGETA", "Sacrificio de Vegeta"));

        adaptador = new Adaptador(this, arrayEntidad);
        lvItems.setAdapter(adaptador);
    }
}
