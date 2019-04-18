package com.example.ejercicio02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txtNum1) EditText txtNumero1;
    @BindView(R.id.txtNum2) EditText txtNumero2;
    @BindView(R.id.rbtnSuma) RadioButton rSuma;
    @BindView(R.id.rbtnResta) RadioButton rResta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnCalcular) public void hacerCalculo(View v){

        if(rResta.isChecked()==true){
            float r=Float.parseFloat(txtNumero1.getText().toString())+
                    Float.parseFloat(txtNumero2.getText().toString());
            Log.v("Mensaje", "El resultado es: "+r);
            Toast.makeText(this,"Presioné e hice suma",Toast.LENGTH_LONG).show();
        }else if(rSuma.isChecked()==true){
            float r=Float.parseFloat(txtNumero1.getText().toString())-
                    Float.parseFloat(txtNumero2.getText().toString());
            Log.v("Mensaje", "El resultado es: "+r);
            Toast.makeText(this,"Presioné e hice resta",Toast.LENGTH_LONG).show();
        }
    }
}
