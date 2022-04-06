package com.example.myappbrq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
public class cadastrarProduto extends AppCompatActivity {

    ImageButton BotaoPefil;
    ImageButton BotaoLista;
    ImageButton BotaoHome;
    ImageButton BotaoCarrinho;
    ImageButton BotaoVendedor;

    Button btnCadastrarProduto;
    EditText EdtCodigoBarra;
    EditText EdtCategoriaDoProduto;
    EditText EdtNomeDoProduto;
    EditText EdtQuantidadeNoEstoque;
    EditText EdtDescricaoDoProduto;
    EditText EdtMarcaDoProduto;
    EditText EdtPrecoCusto;
    EditText EdtProcoVenda;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_produto);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Button Botao_Comando = findViewById(R.id.btnCadastrarNovoProduto);
        TextView Txt_display = findViewById(R.id.txt_Display);


        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this,
                R.array.categoria_array, R.layout.spinner_estilo);

        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adaptador);

        Botao_Comando.setOnClickListener(View ->{
            String texto = spinner.getSelectedItem().toString();
            //Txt_display.setText(texto);
        });




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




    }
}