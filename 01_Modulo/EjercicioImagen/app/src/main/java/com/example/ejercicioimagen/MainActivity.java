package com.example.ejercicioimagen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    ImageView imagen;
    SeekBar barra;
    int iWidth=59;
    int iHeigth=66;
    float densidad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        densidad = displayMetrics.densityDpi;

        imagen=(ImageView)findViewById(R.id.imageView);
        barra=(SeekBar)findViewById(R.id.seekBar);

        //Redimensionar pantalla
        barra.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float ancho=(progress+iWidth)*densidad/160;
                float altura=(progress+iHeigth)*densidad/160;

                imagen.getLayoutParams().height=(int) altura;
                imagen.getLayoutParams().width=(int) ancho;
                imagen.requestLayout();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
