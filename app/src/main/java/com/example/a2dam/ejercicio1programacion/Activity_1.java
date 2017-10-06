package com.example.a2dam.ejercicio1programacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_1 extends AppCompatActivity implements View.OnClickListener {

    Button btnSiguiente;
    EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        btnSiguiente = (Button) findViewById(R.id.btnSiguiente);
        nombre = (EditText) findViewById(R.id.TextNombre);

        btnSiguiente.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if(view.getId()==btnSiguiente.getId()){
            if(!nombre.getText().toString().replace(" ", "").equals("")) {

                Intent i = new Intent(getApplicationContext(), Activity_2.class);
                i.putExtra("nombre", nombre.getText());
                startActivityForResult(i, 1);
            } else {

                Toast.makeText(this, "Introduce un nombre", Toast.LENGTH_SHORT).show();
            }

        }

    }
}
