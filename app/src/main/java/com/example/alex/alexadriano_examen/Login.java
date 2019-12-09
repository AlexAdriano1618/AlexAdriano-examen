package com.example.alex.alexadriano_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button botton;
    EditText usuario,contrasena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        botton = findViewById(R.id.btnIngresar);
        usuario = findViewById(R.id.txtUsuario);
        contrasena = findViewById(R.id.txtContrasena);
        botton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(usuario.getText().toString().equals("estudiante2019") && contrasena.getText().toString().equals("uisrael2019"))
                {
                    Intent abrir = new Intent( Login.this, Registro.class );
                    abrir.putExtra( "datoenviado",usuario.getText().toString());
                    startActivity(abrir);
                }else{
                    Toast.makeText(getApplicationContext(), "Usuario o Contraseña incorrectos", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
