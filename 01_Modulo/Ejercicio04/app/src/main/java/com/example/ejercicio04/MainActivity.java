package com.example.ejercicio04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edTexto;
    CheckBox checkBoxCursiva;
    CheckBox checkBoxNegrita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edTexto=(EditText)findViewById(R.id.edTexto);
        checkBoxCursiva=(CheckBox)findViewById(R.id.checkBoxCursiva);
        checkBoxNegrita=(CheckBox)findViewById(R.id.checkBoxNegrita);

        
    }
}
