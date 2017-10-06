package com.example.a2dam.ejercicio1programacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_2 extends AppCompatActivity implements View.OnClickListener{

    Button btnSiguiente;
    Button btnCancelar;
    TextView txtNombre;
    EditText edad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        btnSiguiente = (Button)findViewById(R.id.btnSiguiente);
        btnCancelar = (Button)findViewById(R.id.btnCancelar);
        txtNombre = (TextView)findViewById(R.id.txtAct2);
        edad = (EditText) findViewById(R.id.Edad);

        Intent i = getIntent();
        txtNombre.setText("Hola"+i.getCharSequenceExtra("nombre")+", introduce los siguientes datos:");



    }

    @Override
    public void onClick(View view) {

        if(view.getId() == btnSiguiente.getId()) {
            if (!edad.getText().toString().replace(" ", "").equals("")) {



            } else {

                Toast.makeText(this, "Introduce la edad", Toast.LENGTH_SHORT).show();
            }

        }
    }
}
