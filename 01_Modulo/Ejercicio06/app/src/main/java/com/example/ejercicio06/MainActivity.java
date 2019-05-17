package com.example.ejercicio06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView texto;
    ListView lista;

    String productos[]={"Lentes", "Celular", "USB", "Botella de agua", "Desodorante", "Camiseta", "Pelota", "Libreta"};
    String categoria[]={"Accesorios", "Electronico", "Electronico", "Abarrotes", "Sanitario", "Ropa", "Juguetes", "Papeleria"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView) findViewById(R.id.textView);
        lista = (ListView) findViewById(R.id.list);

        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,productos);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                texto.setText("Categoria: "+ categoria[position]);
            }
        });
    }
}
