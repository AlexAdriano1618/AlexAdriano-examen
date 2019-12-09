package com.example.alex.alexadriano_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Encuesta extends AppCompatActivity {

    TextView recibir;
    Button botton;
    CheckBox ckcFutbol,ckcTenis,ckcCiclimo;
    EditText observacion;
    //recibe datos
    Bundle datos;
    // variable global
    String datorecibido,futbol,tesis,ciclismo,nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);

        recibir = findViewById(R.id.textView8);
        datos = getIntent().getExtras();
        datorecibido = datos.getString("datoenviado");
        nombre = datos.getString("datonombre");
        recibir.setText(datorecibido);
        observacion = findViewById(R.id.txtObservacion);

        botton = findViewById(R.id.btnEnviar);
        ckcFutbol= findViewById(R.id.checkBox);
        ckcTenis= findViewById(R.id.checkBox2);
        ckcCiclimo= findViewById(R.id.checkBox3);

        botton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(ckcFutbol.isChecked())
                {
                    futbol ="Futbol";
                }
                if(ckcTenis.isChecked())
                {
                    tesis ="Tesis";
                }
                if(ckcCiclimo.isChecked())
                {
                    ciclismo ="Cliclismo";
                }
                //if(!observacion.getText().toString().equals(""))
                //{
                    Intent abrir = new Intent(Encuesta.this, Resumen.class);
                    abrir.putExtra("datoenviado", datorecibido);
                    abrir.putExtra("datoendeporte", String.format(" %1$s, %2$s,%3$s",futbol, tesis, ciclismo));
                    abrir.putExtra("datonombre", nombre);
                    abrir.putExtra("datocentro", observacion.getText().toString());
                    startActivity(abrir);

               // }
            }
        });



    }
}
