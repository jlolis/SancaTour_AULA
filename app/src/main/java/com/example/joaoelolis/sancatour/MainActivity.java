package com.example.joaoelolis.sancatour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.joaoelolis.sancatour.adapter.PontoAdapter;
import com.example.joaoelolis.sancatour.modelos.Ponto;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<Ponto> pontos = new ArrayList<>();
    private ArrayAdapter<Ponto> arrayAdapterPontos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listViewPontos);
        criarPontos();
        arrayAdapterPontos = new PontoAdapter
                (MainActivity.this, (ArrayList<Ponto>) pontos);
        listView.setAdapter(arrayAdapterPontos);

    }

    public void criarPontos(){
        pontos.add(new Ponto("1","Catedral de São Carlos",
                "1,2 km"));
        pontos.add(new Ponto("2","Catedral de São Carlos",
                "1,2 km"));
        pontos.add(new Ponto("3","Catedral de São Carlos",
                "1,2 km"));
        pontos.add(new Ponto("4","Catedral de São Carlos",
                "1,2 km"));
        pontos.add(new Ponto("5","Catedral de São Carlos",
                "1,2 km"));

    }
}
