package com.example.turisteando_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    EditText cajaNombreUsuario;
    EditText cajaNombreContrasena;

    Button botonIngreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        cajaNombreUsuario=findViewById(R.id.usuario);
        cajaNombreContrasena=findViewById(R.id.contraseña);
        botonIngreso=findViewById(R.id.botoningreso);

        botonIngreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //capturando datos del type
                String nombreUsuario=cajaNombreUsuario.getText().toString();
                String contrasena=cajaNombreContrasena.getText().toString();



                Intent intent=new Intent(Login.this,Home.class);

                intent.putExtra("nombre",nombreUsuario);
                intent.putExtra("password",contrasena);

                startActivity(intent);
            }
        });


    }


}