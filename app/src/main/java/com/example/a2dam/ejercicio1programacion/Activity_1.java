package com.example.a2dam.ejercicio1programacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_1 extends AppCompatActivity implements View.OnClickListener {

    Button btnSiguiente;
    EditText nombre;
    RadioButton rbHombre;
    RadioButton rbMujer;
    TextView fraseSubAct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        btnSiguiente = (Button) findViewById(R.id.btnSiguiente);
        nombre = (EditText) findViewById(R.id.TextNombre);
        rbHombre = (RadioButton) findViewById(R.id.radioButton2);
        rbMujer = (RadioButton) findViewById(R.id.radioButton);
        fraseSubAct = (TextView) findViewById(R.id.fraseSubAct);

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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1){
            if (resultCode == RESULT_OK){

                btnSiguiente.setEnabled(false);
                nombre.setEnabled(false);
                rbHombre.setEnabled(false);
                rbMujer.setEnabled(false);

                fraseSubAct.setText("Tienes "+data.getCharSequenceExtra("edad")+"años.");




            }
        }
    }
}
