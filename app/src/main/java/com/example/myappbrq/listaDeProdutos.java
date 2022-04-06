package com.example.myappbrq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class listaDeProdutos extends AppCompatActivity {

    ImageButton BotaoPefil;
    ImageButton BotaoLista;
    ImageButton BotaoHome;
    ImageButton BotaoCarrinho;
    ImageButton BotaoVendedor;

    Button btnCategoriaCamisas;
    Button btnCategoriaCelular;
    Button btnCategoriaBicicleta;
    Button btnCategoriaCalcas;
    Button btnCategoriaSapatos;
    Button btnCategoriaBrinquedos;
    Button btnCategoriaBijuterias;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_produtos);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);



        BotaoPefil = findViewById(R.id.botaoPefil);

        BotaoPefil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainLogin.class);
                startActivity(it);
            }
        });

        BotaoLista = findViewById(R.id.botaoLista);

        BotaoLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lista = new Intent(getApplicationContext(), listaDeProdutos.class);
                startActivity(lista);
            }
        });

        BotaoVendedor = findViewById(R.id.botaoVendedor);

        BotaoVendedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent CadastroVendedor = new Intent(getApplicationContext(), cadastroVendedor.class);
                startActivity(CadastroVendedor);
            }
        });

        BotaoCarrinho = findViewById(R.id.botaoCarrinho);

        BotaoCarrinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Carrinho = new Intent(getApplicationContext(), MainCarrinho.class);
                startActivity(Carrinho);
            }
        });

        BotaoHome = findViewById(R.id.btnHome);

        BotaoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Home = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(Home);
            }
        });

        btnCategoriaCamisas = findViewById(R.id.btnCategoriaCamisas);

        btnCategoriaCamisas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Home = new Intent(getApplicationContext(), categoriaCamisas.class);
                startActivity(Home);
            }
        });

        btnCategoriaCelular = findViewById(R.id.btnCategoriaCelular);

        btnCategoriaCelular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent celular = new Intent(getApplicationContext(), categoriaCelulares.class);
                startActivity(celular);
            }
        });

        btnCategoriaBicicleta = findViewById(R.id.btnCategoriaBicicleta);
        btnCategoriaBicicleta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent celular = new Intent(getApplicationContext(), categoriaBicicletas.class);
                startActivity(celular);
            }
        });








    }
}