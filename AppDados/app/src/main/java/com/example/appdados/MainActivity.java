package com.example.appdados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtNome, edtTelefone, edtEmail, edtEndereco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = (EditText) findViewById(R.id.edtNome);
        edtTelefone = (EditText) findViewById(R.id.edtTelefone);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtEndereco = (EditText) findViewById(R.id.edtEndereco);
    }

            public void cadastrar(View v) {
                Intent tela2 = new Intent(MainActivity.this, TelaDados.class);
                tela2.putExtra("nome",edtNome.getText().toString());
                tela2.putExtra("telefone",edtTelefone.getText().toString());
                tela2.putExtra("email", edtEmail.getText().toString());
                tela2.putExtra("endereco",edtEndereco.getText().toString());
                Toast.makeText(this,"Dados enviados com sucesso!",
                        Toast.LENGTH_LONG).show();
                startActivity(tela2);
            }
    }