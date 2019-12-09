package com.example.alex.alexadriano_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    TextView recibir;
    Button botton;
    EditText nombre,cuatainicial,cuotafinal;
    //recibe datos
    Bundle datos;
    // variable global
    String datorecibido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        recibir = findViewById(R.id.textView6);
        datos = getIntent().getExtras();
        datorecibido = datos.getString("datoenviado");
        recibir.setText(datorecibido);


        botton = findViewById(R.id.btnGuardar);
        nombre = findViewById(R.id.txtNombre);
        cuatainicial = findViewById(R.id.txtCuotaInicial);
        cuotafinal = findViewById(R.id.txtValorCuotas);
        botton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!nombre.getText().toString().equals("") && !cuatainicial.getText().toString().equals("") && !cuotafinal.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Elemento guardado con exito", Toast.LENGTH_LONG).show();
                    Intent abrir = new Intent( Registro.this, Encuesta.class );
                    abrir.putExtra( "datoenviado",datorecibido);
                    abrir.putExtra( "datonombre",nombre.getText().toString());
                    startActivity(abrir);

                }else{
                    Toast.makeText(getApplicationContext(), "Campos vacios", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
