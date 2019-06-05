package com.example.listaasistencia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.listaasistencia.modelo.Cursos;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv=(RecyclerView)findViewById(R.id.rv);
        llenarRecycler();
    }

    private void llenarRecycler(){
        Cursos c1 = new Cursos();
        c1.setNombre("Moviles");
        c1.setPorcentaje(20);
        Cursos c2 = new Cursos();
        c2.setNombre("Base de Datos");
        c2.setPorcentaje(30);
        Cursos c3 = new Cursos();
        c3.setNombre("Paginas Web");
        c3.setPorcentaje(30);
        List<Cursos>lista =new ArrayList<>();
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        AdaptadorCursp adaptador = new AdaptadorCursp(this,lista);
        LinearLayoutManager lim = new LinearLayoutManager(this);
        rv.setLayoutManager(lim);
        rv.setAdapter(adaptador);

    }
}
