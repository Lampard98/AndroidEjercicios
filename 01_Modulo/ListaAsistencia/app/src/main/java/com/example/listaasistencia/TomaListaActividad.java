package com.example.listaasistencia;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.listaasistencia.modelo.Alumno;

import java.util.ArrayList;
import java.util.List;

public class TomaListaActividad extends AppCompatActivity {

    int actual =0;
    //componentes
    FloatingActionButton faAnterior;
    FloatingActionButton faSiguiente;
    TextView txtAlumno;
    TextView txtEstado;
    ImageView avatar;

    List<Alumno>salon=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toma_lista_actividad);

        //inicializar los componentes
        faAnterior = (FloatingActionButton)findViewById(R.id.faAnterior);
        faSiguiente=(FloatingActionButton)findViewById(R.id.faSiguiente);
        txtAlumno=(TextView)findViewById(R.id.txtNombre);
        txtEstado=(TextView)findViewById(R.id.txtEstado);
        avatar=(ImageView)findViewById(R.id.imgCurso);

        //Dummy de datos
        salon.add(new Alumno("16061114","Edgar Eduardo Perez Huerta"));
        salon.add(new Alumno("16061123","Christian Maldonado"));
        salon.add(new Alumno("16061018","Francisco Rodriguez"));
        salon.add(new Alumno("16061197","Eugenio Juarez"));
        salon.add(new Alumno("16061162","Oswaldo Neva"));
        salon.add(new Alumno("16061257","Elda Lopez"));
        salon.add(new Alumno("16061203","Ismael Illan"));
        salon.add(new Alumno("99298615","Luis Cobian"));
    }

    @Override
    protected void onResume() {
        super.onResume();
        actualizaVista();
    }

    private void actualizaVista(){
        if (actual==0)
            faAnterior.hide();
        else
            faAnterior.show();
        if (actual==salon.size()-1)
            faSiguiente.hide();
        else
            faSiguiente.show();

        Alumno alumno =salon.get(actual);
        txtAlumno.setText(alumno.getNombre());
        if (alumno.getRuta().equals("none"))
            avatar.setImageDrawable(getResources().getDrawable(R.drawable.sinUsuario));
        else
            Toast.makeText(this,"Pendiente", Toast.LENGTH_LONG).show();
    }

    //metodos para las tareas de la ventana
    public void justificar(View v){
        Log.i("Lista","Justificar");
    }
    public void falta(View v){ Log.i("Lista","Falta");}
    public void asistencia(View v){ Log.i("Lista","Asistencia");}
    public void anterior (View v){
        if (actual>=0){
            Log.i("Lista","Anterior");
            actual--;
            actualizaVista();
        }
    }
    public void siguiente (View v) {
        if (actual < salon.size()) {
            Log.i("Lista", "Siguiente");
            actual++;
            actualizaVista();
        }
    }
}
