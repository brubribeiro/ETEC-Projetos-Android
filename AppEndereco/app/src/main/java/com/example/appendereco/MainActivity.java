package com.example.appendereco;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnEnviar;
    EditText edEndereco;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnviar = (Button) findViewById(R.id.btnEnviar);
        edEndereco = (EditText) findViewById(R.id.edEndereco);

        btnEnviar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Uri gmmIntentUri = Uri.parse("geo:0,0?q="
                + edEndereco.getText().toString());
                Intent mapIntent = new
                        Intent (Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
    }
}
