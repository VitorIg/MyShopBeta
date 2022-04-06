package com.example.myappbrq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

public class categoriaCelulares extends AppCompatActivity {

    ImageButton BotaoPefil;
    ImageButton BotaoLista;
    ImageButton BotaoHome;
    ImageButton BotaoCarrinho;
    ImageButton BotaoVendedor;

    ImageButton BotaoMotoE40;
    ImageButton btnCelularMotoG20;
    ImageButton btnCelularGalaxyA32;

    TextView btnEspecificacaoMotorolaE40;
    TextView btnEspecificacaoMotorolaG20;
    TextView btnEspecificacaoGalaxyA32;

    TextView txtPrecoMotorolaE40;
    TextView txtPrecoMotorolaG20;
    TextView txtPrecoGalaxyA32;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria_celulares);

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
                Intent Home  = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(Home);
            }
        });



        BotaoMotoE40 = findViewById(R.id.btnCategoriaCelularMotoE40);

        BotaoMotoE40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MotoF40 = new Intent(getApplicationContext(), celularMotoF40.class);
                startActivity(MotoF40);
            }
        });






    }
}