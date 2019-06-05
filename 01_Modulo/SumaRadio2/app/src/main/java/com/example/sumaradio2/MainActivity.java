package com.example.sumaradio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText  textNum1;
    EditText  textNum2;
    RadioButton vrbSuma;
    RadioButton vrbResta;
    Button Operacion;
    TextView Resul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textNum1 = (EditText)findViewById(R.id.editText);
        textNum2 = (EditText)findViewById(R.id.editText2);
        vrbResta = (RadioButton)findViewById(R.id.rbResta);
        vrbSuma = (RadioButton)findViewById(R.id.rbSuma);
        Operacion = (Button)findViewById(R.id.button);
        Resul = (TextView)findViewById(R.id.textView);

        Operacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int res = 0;
                int num1 = Integer.parseInt(textNum1.getText().toString());
                int num2 = Integer.parseInt(textNum2.getText().toString());
                if(vrbSuma.isChecked())
                    res = num1 + num2;
                else
                    res = num1 - num2;
                Resul.setText("El resultado es " + res);
            }
        });
    }
}
