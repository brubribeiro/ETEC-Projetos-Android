package com.example.appdados;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TelaDados extends AppCompatActivity {

    TextView txtNome, txtTelefone, txtEmail, txtEndereco;

    Button btLocalizar, btEmail, btLigar;

    String nomerecebido, telefonerecebido, emailrecebido, enderecorecebido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_dados);

        Intent telaatual = getIntent();
        Bundle valores = telaatual.getExtras();


        txtNome = (TextView) findViewById(R.id.txtNome);
        txtTelefone = (TextView) findViewById(R.id.txtTelefone);
        txtEmail = (TextView) findViewById(R.id.txtEmail);
        txtEndereco = (TextView) findViewById(R.id.txtEndereco);

        nomerecebido = valores.getString("nome");
        telefonerecebido = valores.getString("telefone");
        emailrecebido = valores.getString("email");
        enderecorecebido = valores.getString("endereco");

        txtNome.setText(nomerecebido);
        txtTelefone.setText(telefonerecebido);
        txtEmail.setText(emailrecebido);
        txtEndereco.setText(enderecorecebido);

        btLocalizar = (Button) findViewById(R.id.btnLocal);
        btLocalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + txtEndereco.getText().toString());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                startActivity(mapIntent);
            }
        });

        btEmail = (Button)findViewById(R.id.btnEmail);
        btEmail.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("mailto:"+txtEmail.getText().toString()));
                startActivity(intent);
            }
        });

        btLigar = (Button)findViewById(R.id.btnLigar);
        btLigar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+txtTelefone.getText().toString()));
                startActivity(intent);
            }
        });




    }
}
