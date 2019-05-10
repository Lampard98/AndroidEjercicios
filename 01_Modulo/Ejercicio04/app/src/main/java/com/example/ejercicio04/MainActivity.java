package com.example.ejercicio04;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Texto;
    CheckBox checkBoxC;
    CheckBox checkBoxN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Texto=(EditText)findViewById(R.id.edTexto);
        checkBoxC=(CheckBox)findViewById(R.id.checkBoxCursiva);
        checkBoxN=(CheckBox)findViewById(R.id.checkBoxNegrita);

        if (checkBoxN.isChecked()) {
            Texto.setTypeface(null, Typeface.BOLD);
            Toast.makeText(this, "Se marcó", Toast.LENGTH_LONG).show();
        } else if (checkBoxC.isChecked()) {
            Texto.setTypeface(null, Typeface.ITALIC);
        } else if (checkBoxN.isChecked() && checkBoxC.isChecked()) {
            Texto.setTypeface(null, Typeface.BOLD_ITALIC);
        }else
            Texto.setTypeface(null, Typeface.NORMAL);

    }
}
