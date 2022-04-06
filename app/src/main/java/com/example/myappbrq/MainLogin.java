package com.example.myappbrq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainLogin extends AppCompatActivity {

    Button AcessarConta;
    Button CadastrarConta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        AcessarConta = findViewById(R.id.btnAcessarContaUsuario);
        AcessarConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent acessar = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(acessar);
            }
        });

        CadastrarConta = findViewById(R.id.btnCadastrarContaUsuario);
        CadastrarConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cadastrar = new Intent(getApplicationContext(), MainCadastro.class);
                startActivity(cadastrar);
            }
        });
    }
}