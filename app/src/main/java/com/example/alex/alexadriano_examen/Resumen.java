package com.example.alex.alexadriano_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Resumen extends AppCompatActivity {
    TextView recibir,nombre,deportes,centro;
    //recibe datos
    Bundle datos;
    // variable global
    String datorecibido,deportesrecibido,nombrerecibido,centrorecibido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);

        recibir = findViewById(R.id.textView12);
        nombre= findViewById(R.id.textView15);
        deportes = findViewById(R.id.textView16);
        centro= findViewById(R.id.textView18);


        datos = getIntent().getExtras();
        datorecibido = datos.getString("datoenviado");
        recibir.setText(datorecibido);

        deportesrecibido=datos.getString("datoendeporte");
        deportes.setText(deportesrecibido);

        centrorecibido=datos.getString("datocentro");
        centro.setText(centrorecibido);

        nombrerecibido=datos.getString("datonombre");
        nombre.setText(nombrerecibido);
        //datonombre
        Toast.makeText(getApplicationContext(), deportesrecibido, Toast.LENGTH_LONG).show();
    }
}
